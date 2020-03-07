package com.omercavuslu.aop.service;

import org.springframework.stereotype.Service;

@Service
public class IkinciMesajService {
    public void mesaj( String param){
        System.out.println(param);
    }
}
