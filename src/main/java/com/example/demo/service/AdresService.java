package com.example.demo.service;

import com.example.demo.dto.AdresDto;
import com.example.demo.dto.KisiDto;

import java.util.List;

public interface AdresService {
    AdresDto save(AdresDto adresDto);
    Boolean delete(Long id);
    AdresDto getById(Long id);
    List<AdresDto> getAll();


}
