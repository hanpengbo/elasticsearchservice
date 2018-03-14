package com.jx.elasticsearch.domain;

import java.io.Serializable;

/**
 * Created by hpb on 2018-03-13.
 */
public class Index implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private String indexName;
    private String remark;
    private String url;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Index{" +
                "id=" + id +
                ", indexName='" + indexName + '\'' +
                ", remark='" + remark + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
