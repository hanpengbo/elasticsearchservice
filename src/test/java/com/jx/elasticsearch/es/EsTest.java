package com.jx.elasticsearch.es;

import com.alibaba.fastjson.JSONObject;
import com.jx.elasticsearch.domain.IndexField;
import com.jx.elasticsearch.repository.ServiceOrderRepository;
import com.jx.elasticsearch.service.IndexFieldService;
import com.jx.elasticsearch.utils.ESQueryBuilderConstructor;
import com.jx.elasticsearch.utils.ESQueryBuilders;
import com.jx.elasticsearch.utils.ElasticsearchUtils;
import com.jx.elasticsearch.vo.ServiceOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hpb on 2018-03-13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EsTest {

    @Autowired
    private IndexFieldService indexFieldService;
    //创建索引
    @Test
    public void createIndexTest(){
        ElasticsearchUtils.createIndex("jebe");
    }

    @Test
    public void addDataTest(){
//        for (int i=1;i<=100;i++){
            Map<String, Object> map = new HashMap<>();
            List<IndexField> indexFieldList = indexFieldService.findByIndexName("serviceorder");
            for (IndexField indexField : indexFieldList) {
                map.put(indexField.getIndexFieldName(), 8);
            }
            ElasticsearchUtils.addData(JSONObject.parseObject(JSONObject.toJSONString(map)), "jebe", "serviceorder");
//        }
    }

    @Autowired
    private ServiceOrderRepository serviceOrderRepository;
    @Test
    public void queryDataTest(){
        List<ServiceOrder> serviceOrdersByUserid = serviceOrderRepository.findServiceOrdersByRemarkIsLike("y");
        System.out.println(serviceOrdersByUserid);
    }

    @Test
    public void insertData(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","yangyang");
        jsonObject.put("remark","This is test!");
        ElasticsearchUtils.addData(jsonObject,"jebe","serviceorder");
    }

    /**
     * 精确查询
     */
    @Test
    public void searchByUserId(){
        ESQueryBuilderConstructor constructor = new ESQueryBuilderConstructor();
        constructor.must(new ESQueryBuilders().term("userid","8"));

        List<Map<String, Object>> result = ElasticsearchUtils.search("jebe", "serviceorder", constructor);
        System.out.println(result);
    }

    /**
     * 模糊查询
     */
    @Test
    public void search(){
        ESQueryBuilderConstructor constructor = new ESQueryBuilderConstructor();
        constructor.must(new ESQueryBuilders().fuzzy("remark","is"));

        List<Map<String, Object>> result = ElasticsearchUtils.search("jebe", "serviceorder", constructor);
        System.out.println(result);
    }
}
