


import com.example.demo.dto.AdresDto;
import com.example.demo.service.AdresService;
import com.example.demo.service.impl.AdresServiceImpl;
import com.example.demo.service.impl.KisiServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adres")
@RequiredArgsConstructor
public class AdresController {
    private final AdresService adresService;
    private final AdresServiceImpl adresServiceImpl;

    @PostMapping()
    public ResponseEntity<AdresDto> kaydet(@RequestBody AdresDto kisiDto) {
        return ResponseEntity.ok(adresService.save(kisiDto));
    }

    @GetMapping
    public ResponseEntity<List<AdresDto>> tumunuListele() {
        return ResponseEntity.ok(adresService.getAll());
    }

    @GetMapping("/{id}")

    public ResponseEntity<AdresDto> getir(@PathVariable(value = "id", required = true) Long id) {
        AdresDto kisi = adresServiceImpl.getById(id);
        return ResponseEntity.ok(kisi);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id) {
        return ResponseEntity.ok(adresServiceImpl.delete(id));

    }
}
