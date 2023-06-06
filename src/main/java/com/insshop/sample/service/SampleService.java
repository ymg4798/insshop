package com.insshop.sample.service;

import com.insshop.sample.dto.Sample;
import com.insshop.sample.dto.SampleSaveRequest;
import com.insshop.sample.mapper.SampleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SampleService {

    private final SampleMapper sampleMapper;

    public void save(SampleSaveRequest request) {
        sampleMapper.save(request);
    }

    public List<Sample> findAll() {
        return sampleMapper.findAll();
    }
}
