package com.github.lawrenc.javafxdb;

import com.TestB;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaFXDBApplicationTest {

    @Test
    void contextLoads() {
        new TestB().a();
    }

}
