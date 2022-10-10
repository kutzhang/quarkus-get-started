package com.sanlea.study;

import com.sanlea.study.vo.UserVO;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
class UserVOTest {
    @Test
    void all() {
        var user = new UserVO();
        user.setId(UUID.randomUUID().toString());
        user.setName("kut");
        user.setAge(42);
        assertNotNull(user.toString());
    }
}
