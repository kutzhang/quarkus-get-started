package com.sanlea.study;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
class UserResourceTest {
    private UserResource userResource;

    @BeforeEach
    void setup() {
        this.userResource = new UserResource();
    }

    @Test
    void testFetchDetail() {
        var user = this.userResource.fetchDetail(UUID.randomUUID().toString());
        assertNotNull(user);
        assertNotNull(user.toString());
    }

    @Test
    void testMagic() {
        var result  = this.userResource.magic();
        assertEquals("magic", result);
    }
}
