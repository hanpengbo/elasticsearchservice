package com.jx.elasticsearch.mapper;

import com.jx.elasticsearch.domain.IndexField;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by hpb on 2018-03-13.
 */
@Mapper
public interface IndexFieldMapper {

    /**
     * 查询全部索引字段
     * @return
     */
    @Select("select * from t_index_field")
    List<IndexField> getAllIndexFilde();


    /**
     * 根据索引名称查询所有字段
     * @param indexName
     * @return
     */
    @Select("SELECT t2.* FROM t_index as t1,t_index_field as t2 WHERE t1.id = t2.parent_id AND t1.index_name = #{indexName}")
    List<IndexField> getIndexFildeByIndexName(@Param("indexName") String indexName);
}
