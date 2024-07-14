package hello.example.nexus.util;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AddUtilsTest {

    @Autowired
    AddUtils addUtils;

    @Test
    void addAll() {
        System.out.println(addUtils.addAll(1,2,3,4,5));
    }
}