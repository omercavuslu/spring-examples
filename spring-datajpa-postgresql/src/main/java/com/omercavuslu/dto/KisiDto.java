package com.omercavuslu.dto;

import java.util.List;
import lombok.Data;

@Data
public class KisiDto {

    private Long id;

    private String adi;

    private String soyadi;

    private List<String> adresler;

}
