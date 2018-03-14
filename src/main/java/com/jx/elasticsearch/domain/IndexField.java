package com.jx.elasticsearch.domain;

import java.io.Serializable;

/**
 * Created by hpb on 2018-03-13.
 */
public class IndexField implements Serializable{
    private static final long serialVersionUID = 1L;

    private long id;
    private String indexFieldName;
    private String fieldType;
    private long parentId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIndexFieldName() {
        return indexFieldName;
    }

    public void setIndexFieldName(String indexFieldName) {
        this.indexFieldName = indexFieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "IndexField{" +
                "id=" + id +
                ", indexFieldName='" + indexFieldName + '\'' +
                ", fieldType='" + fieldType + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}
