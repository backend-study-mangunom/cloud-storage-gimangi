package me.examples.cloudstorage;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import scala.Array;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
class CloudStorageApplicationTests {

    @LocalServerPort
    private String port;

    @Test
    void contextLoads() {
        log.info("port is {}", port);
    }

}
