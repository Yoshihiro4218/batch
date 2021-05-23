package com.yoshi.batch;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.*;

@SpringBootApplication
public class BatchApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BatchApplication.class)
                .web(WebApplicationType.NONE)
                .run(args)
                .close();
    }
}
