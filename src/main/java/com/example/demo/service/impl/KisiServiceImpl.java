package com.example.demo.service.impl;

import com.example.demo.dto.KisiDto;
import com.example.demo.entity.Adres;
import com.example.demo.entity.Kisi;
import com.example.demo.repo.AdresRepository;
import com.example.demo.repo.KisiRepository;
import com.example.demo.service.KisiService;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor//constr inj için dolu bir constr oluşturuyor
public class KisiServiceImpl implements KisiService {

    private final KisiRepository kisiRepository;
    private final AdresRepository adresRepository;

    @Override
    public KisiDto save(KisiDto kisiDto) {
        Kisi kisi = new Kisi();
        kisi.setAdi(kisiDto.getAdi());
        kisi.setSoyadi(kisiDto.getSoyadi());
        kisi = kisiRepository.save(kisi);
        kisiDto.getAdresler().forEach(item->{
            Adres adres = new Adres();
            adres.setAdres(item);

        });
        return null;
    }

    @Override
    public void delete() {

    }

    @Override
    public KisiDto getAll(KisiDto kisiDto) {
        return null;
    }

    @Override
    public Page<KisiDto> getAll(Pageable pageable) {
        return null;
    }
}
