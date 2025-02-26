package com.ttknp.understandlog4jnewversion.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private int id;
    private String fullname;
    private short age;
}
