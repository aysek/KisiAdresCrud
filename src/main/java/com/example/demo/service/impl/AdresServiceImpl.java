package com.example.demo.service.impl;

import com.example.demo.dto.AdresDto;
import com.example.demo.dto.KisiDto;
import com.example.demo.entity.Adres;
import com.example.demo.entity.Kisi;
import com.example.demo.repo.AdresRepository;
import com.example.demo.service.AdresService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdresServiceImpl implements AdresService {
    private final AdresRepository adresRepository;
    private final ModelMapper modelMapper;

    public AdresDto getById(Long id){
        Adres adres = adresRepository.getById(id);
        return modelMapper.map(adres, AdresDto.class);
    }

    @Override
    public List<AdresDto> getAll() {
        return null;
    }

    @Override
    public AdresDto save(AdresDto adresDto) {
        return null;
    }

    public Boolean delete(Long id){
        adresRepository.deleteById(id);
        return true;
    }





}
