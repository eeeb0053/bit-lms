package com.example.demo.domains;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Component
public class GradeDTO extends StudentDTO{
    protected String kor, eng, math;
}
