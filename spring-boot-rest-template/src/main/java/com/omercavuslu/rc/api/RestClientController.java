package com.omercavuslu.rc.api;

import com.omercavuslu.rc.model.KisiDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("/test")
public class RestClientController {

    /*    PROXY API

        GET : http://localhost:8080/test
        POST : http://localhost:8080/test
            body: {
	                "adi":"Test33",
	                "soyadi":"Test Soyad",
	                "adresler":["test adtes 11","test adres 22"]
                    }
        Bunlar bizim metodlarımıza yaptığımız istekler



        spring-datajps-postgresql projesini 8081 portundan ayağa kaldırarak
        oradaki
        GET olarak "tumunuListele" metodunu kullandık
        POST olarak "kaydet" metodunu kullandık

        yani proxy bir api oluştururak oradaki metodları buradan kullanış gibi olduk

        bunları ise restTemplate ile gerçekleştridik

        bunları gerçekleştirirken dockerdan postgresql li ayağa kaldırmamız gerekiyor

        docker-compose -f D:\spring\spring-examples\spring-datajpa-postgresql\src\main\resources\docker-compose.yml up -d
    */

    private static final String webUrl = "http://localhost:8081/kisi";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<List<KisiDto>> getKisiList(){
        ResponseEntity<List> result = restTemplate.getForEntity(webUrl,List.class);
        List<KisiDto>  responseBody = result.getBody();

        return ResponseEntity.ok(responseBody);
    }

    @PostMapping
    public ResponseEntity<KisiDto> kaydet(@RequestBody KisiDto kisiDto){
        ResponseEntity<KisiDto> result = restTemplate.postForEntity(webUrl,kisiDto, KisiDto.class);
        KisiDto responseBody = result.getBody();

        return ResponseEntity.ok(responseBody);
    }

}
