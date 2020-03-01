package com.omercavuslu;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Benim Pet nesnem",description = "Benim Pet")
public class Pet {
    @ApiModelProperty(value = "Pet Nesnesinin tekil Id alanı")
    private int id;

    @ApiModelProperty(value = "Pet Nesnesinin Adi alanı")
    private String name;

    @ApiModelProperty(value = "Pet Nesnesinin Tarih alanı")
    private Date date;
}
