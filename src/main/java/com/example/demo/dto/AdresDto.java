package com.example.demo.dto;

import com.example.demo.entity.Adres;
import com.example.demo.entity.Kisi;
import lombok.Data;

@Data
public class AdresDto {

    private Long id;

    private String adres;

    private Adres.AdresTip adresTip;

    private Boolean aktif;

    private Kisi kisi;
}
