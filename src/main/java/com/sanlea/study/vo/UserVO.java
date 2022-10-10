package com.sanlea.study.vo;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@RegisterForReflection
@ToString
@Setter
@Getter
public class UserVO {
    private String id;
    private String name;
    private int age;
}
