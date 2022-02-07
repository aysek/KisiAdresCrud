package com.example.demo.dto;

import lombok.Data;

import javax.persistence.Column;
import java.util.List;

@Data
public class KisiDto {

    private Long id;

    private String adi;

    private String soyadi;

    private List<String> adresler;

}
