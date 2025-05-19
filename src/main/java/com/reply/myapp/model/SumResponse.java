package com.reply.myapp.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SumResponse {

    private Integer a;
    private Integer b;
    private Integer sum;
}
