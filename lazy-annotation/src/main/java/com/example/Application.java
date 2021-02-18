package com.example;

import com.example.bean.FirstBean;
import com.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        FirstBean firstBean = (FirstBean) applicationContext.getBean("firstBean");

    }
}
