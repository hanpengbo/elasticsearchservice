package com.jx.elasticsearch.service.impl;

import com.jx.elasticsearch.domain.IndexField;
import com.jx.elasticsearch.mapper.IndexFieldMapper;
import com.jx.elasticsearch.service.IndexFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hpb on 2018-03-13.
 */
@Service
public class IndexFieldServiceImpl implements IndexFieldService {
    @Autowired
    private IndexFieldMapper indexFieldMapper;

    @Override
    public List<IndexField> findByIndexName(String indexName) {
        List<IndexField> indexFields = indexFieldMapper.getIndexFildeByIndexName(indexName);
        return indexFields;
    }
}
