package me.examples.cloudstorage;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import scala.Array;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CloudStorageApplicationTests {

    @Test
    void contextLoads() {
        CloudStorageApplication.main(new String[] {});
    }

}
