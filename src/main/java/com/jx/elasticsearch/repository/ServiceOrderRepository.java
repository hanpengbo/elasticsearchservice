package com.jx.elasticsearch.repository;

import com.jx.elasticsearch.vo.ServiceOrder;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by hpb on 2018-03-14.
 */
public interface ServiceOrderRepository extends ElasticsearchRepository<ServiceOrder,String>{
    List<ServiceOrder> findServiceOrdersByUserid(String userid);
    List<ServiceOrder> findServiceOrdersByUseridIsLike(String userid);
    List<ServiceOrder> findServiceOrdersByRemarkIsLike(String remark);
    List<ServiceOrder> findServiceOrdersByNameIsLike(String name);
}
