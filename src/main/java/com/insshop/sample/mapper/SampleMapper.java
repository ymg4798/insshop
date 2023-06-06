package com.insshop.sample.mapper;

import com.insshop.sample.dto.Sample;
import com.insshop.sample.dto.SampleSaveRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SampleMapper {
    void save(SampleSaveRequest request);
    List<Sample> findAll();
}
