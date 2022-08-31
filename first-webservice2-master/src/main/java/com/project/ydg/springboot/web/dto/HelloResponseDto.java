package com.project.ydg.springboot.web.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;


@Getter
@Setter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
