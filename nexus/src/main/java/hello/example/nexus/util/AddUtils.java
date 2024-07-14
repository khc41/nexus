package hello.example.nexus.util;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AddUtils {

    public int addAll(int... nums){
        return Arrays.stream(nums).sum();
    }
}
