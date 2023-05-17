package com.wtzconsult.demo.restcontroller;

import com.wtzconsult.demo.bo.Sectie;
import com.wtzconsult.demo.service.SectieService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;

@RequiredArgsConstructor
@RestController
@RequestMapping("/sectie")
public class SectieController {

    public final SectieService sectieService;

    @PostMapping("/createWithBody")
    public ResponseEntity<?> createSectie(@RequestBody Sectie sectie) {

        return ResponseEntity.ok(sectieService.createWithBody(sectie));


    }
    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(sectieService.getAllSectie());
    }
@GetMapping("/getById")
    public ResponseEntity<?>getById(@RequestParam Long id){

    return ResponseEntity.ok(sectieService.getById(id));
}
    @GetMapping("/getByName")
    public ResponseEntity<?>getById(@RequestParam String nume){

        return ResponseEntity.ok(sectieService.getByNume(nume));
    }
}
