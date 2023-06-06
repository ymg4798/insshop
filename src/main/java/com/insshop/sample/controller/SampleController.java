package com.insshop.sample.controller;

import com.insshop.sample.dto.Sample;
import com.insshop.sample.dto.SampleSaveRequest;
import com.insshop.sample.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class SampleController {

    private final SampleService sampleService;

    @ResponseBody
    @PostMapping("/sample")
    public String save(@RequestBody SampleSaveRequest request) {
        sampleService.save(request);
        return "success";
    }

    @ResponseBody
    @GetMapping("/samples")
    public List<Sample> findAll() {
        return sampleService.findAll();
    }
}
