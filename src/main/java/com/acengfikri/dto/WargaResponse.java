package com.acengfikri.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WargaResponse<T> {

    private String message;
    private boolean status;
    private T data;

}
