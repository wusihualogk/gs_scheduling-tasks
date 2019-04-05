package com.saber.gs_schedulingtasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class GsSchedulingTasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(GsSchedulingTasksApplication.class, args);
    }

}
