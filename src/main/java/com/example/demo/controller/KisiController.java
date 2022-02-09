package com.example.demo.controller;

import com.example.demo.dto.KisiDto;
import com.example.demo.service.KisiService;
import com.example.demo.service.impl.KisiServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kisi")
@RequiredArgsConstructor
public class KisiController {
    private final KisiService kisiService;
    private final KisiServiceImpl kisiServiceImpl;

    @PostMapping()
    public ResponseEntity<KisiDto> kaydet(@RequestBody KisiDto kisiDto) {
        return ResponseEntity.ok(kisiService.save(kisiDto));
    }

    @GetMapping
    public ResponseEntity<List<KisiDto>> tumunuListele() {
        return ResponseEntity.ok(kisiService.getAll());
    }

    @GetMapping("/{id}")

    public ResponseEntity<KisiDto> getir(@PathVariable(value = "id", required = true) Long id) {
        KisiDto kisi = kisiServiceImpl.getById(id);
        return ResponseEntity.ok(kisi);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id) {
        return ResponseEntity.ok(kisiServiceImpl.delete(id));

    }
}
