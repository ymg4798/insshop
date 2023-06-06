package com.insshop.sample.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class SampleSaveRequest {
    String name;
    Long price;

    public SampleSaveRequest(String name, Long price) {
        this.name = name;
        this.price = price;
    }
}
