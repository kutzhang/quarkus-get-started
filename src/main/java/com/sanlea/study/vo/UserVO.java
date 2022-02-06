package com.sanlea.study.vo;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RegisterForReflection
public class UserVO {
    private String id;
    private String name;
    private int age;
}
