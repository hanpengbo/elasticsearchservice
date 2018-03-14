package com.jx.elasticsearch.vo;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

/**
 * @Author yangyang【yangyang@lvzheng.com】
 * @Date 2018/3/7 10:13
 * @Remark
 */
public class ElasticSearchVo implements Serializable {

    private String indexName;

    private String typeName;

    private String id;

    private JSONObject jsonData;

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JSONObject getJsonData() {
        return jsonData;
    }

    public void setJsonData(JSONObject jsonData) {
        this.jsonData = jsonData;
    }

    @Override
    public String toString() {
        return "ElasticSearchVo{" +
                "indexName='" + indexName + '\'' +
                ", typeName='" + typeName + '\'' +
                ", id='" + id + '\'' +
                ", jsonData=" + jsonData +
                '}';
    }
}
