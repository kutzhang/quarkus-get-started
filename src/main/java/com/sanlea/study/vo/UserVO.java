package com.sanlea.study.vo;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RegisterForReflection
@ToString
public class UserVO {
    private String id;
    private String name;
    private int age;
}
