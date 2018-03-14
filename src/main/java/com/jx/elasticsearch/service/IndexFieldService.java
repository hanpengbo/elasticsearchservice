package com.jx.elasticsearch.service;

import com.jx.elasticsearch.domain.IndexField;

import java.util.List;

/**
 * Created by hpb on 2018-03-13.
 */

public interface IndexFieldService {
    List<IndexField> findByIndexName(String indexName);
}
