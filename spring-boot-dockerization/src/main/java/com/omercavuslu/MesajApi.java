package com.omercavuslu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


///  docker run -p 8080:8080 spring-boot-dockerization



@RestController
@RequestMapping("/mesaj")
public class MesajApi {
    @GetMapping
    public String mesajVer(){
        return "Docker Image inin içerisinden merhaba";
    }
}
