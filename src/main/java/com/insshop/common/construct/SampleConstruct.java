package com.insshop.common.construct;

import com.insshop.sample.dto.SampleSaveRequest;
import com.insshop.sample.mapper.SampleMapper;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Profile("test")
@RequiredArgsConstructor
@Component
public class SampleConstruct {

    private final SampleMapper sampleMapper;

    @Transactional
    @PostConstruct
    public void initSample() {
        SampleSaveRequest request1 = new SampleSaveRequest("테스트", 50000L);
        sampleMapper.save(request1);
        SampleSaveRequest request2 = new SampleSaveRequest("테스트2", 10000L);
        sampleMapper.save(request2);
        SampleSaveRequest request3 = new SampleSaveRequest("테스트3", 20000L);
        sampleMapper.save(request3);
    }
}
