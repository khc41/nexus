package hello.example.nexusget;

import hello.example.nexus.util.AddUtils;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.*;

@Slf4j
@SpringBootTest
@Import(AddUtils.class)
public class NexusTest {

    @Autowired
    AddUtils addUtils;

    @Test
    @DisplayName("AddUtils addAll 메소드가 정상 동작하는지 확인하는 테스트")
    public void nexusTest(){
        //given

        //when
        int result = addUtils.addAll(1, 2, 3, 4, 5);

        //then
        log.info("result={}", result);
        assertThat(result).isEqualTo(15);
    }

}
