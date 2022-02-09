package com.example.demo.service;

import com.example.demo.dto.KisiDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface KisiService {
    KisiDto save(KisiDto kisiDto);
    void delete();
    KisiDto getById(Long id);
    List<KisiDto> getAll();
    Page<KisiDto> getAll(Pageable pageable);
}
