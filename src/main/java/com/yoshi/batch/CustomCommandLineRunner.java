package com.yoshi.batch;

import org.springframework.boot.*;
import org.springframework.stereotype.*;

@Component
public class CustomCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("処理開始");
        System.out.println("処理.....");
        System.out.println("処理終了");
    }
}
