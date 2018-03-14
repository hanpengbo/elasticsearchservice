package com.jx.elasticsearch;

import com.jx.elasticsearch.domain.IndexField;
import com.jx.elasticsearch.mapper.IndexFieldMapper;
import com.jx.elasticsearch.service.IndexFieldService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElasticsearchApplicationTests {

	@Autowired
	private IndexFieldService indexFieldService;
    @Autowired
	private IndexFieldMapper indexFieldMapper;

	@Test
	public void contextLoads() {
	}
    @Test
	public void getIndexFieldbyName(){
		List<IndexField> indexFields = indexFieldService.findByIndexName("服务单");
		System.out.println(indexFields);
	}
	@Test
	public void getIndexFieldMapperbyName(){
		List<IndexField> indexFields = indexFieldMapper.getIndexFildeByIndexName("服务单");
		System.out.println(indexFields);
	}
}
