package com.jx.elasticsearch.vo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * Created by hpb on 2018-03-14.
 */
@Document(indexName = "jebe",type = "serviceorder")
public class ServiceOrder implements Serializable {
    @Id
    private String id;
    private String serviceorderid;
    private String userid;
    private String name;
    private String remark;

    public String getServiceorderid() {
        return serviceorderid;
    }

    public void setServiceorderid(String serviceorderid) {
        this.serviceorderid = serviceorderid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "ServiceOrder{" +
                "id='" + id + '\'' +
                ", serviceorderid='" + serviceorderid + '\'' +
                ", userid='" + userid + '\'' +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
