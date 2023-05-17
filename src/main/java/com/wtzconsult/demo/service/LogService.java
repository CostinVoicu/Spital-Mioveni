package com.wtzconsult.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LogService {
    public void createLog(String message){
        System.out.println(message);

    }

}
