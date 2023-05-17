package com.wtzconsult.demo.restcontroller;

import com.wtzconsult.demo.bo.Paturi;
import com.wtzconsult.demo.bo.User;
import com.wtzconsult.demo.models.PatRequestModel;
import com.wtzconsult.demo.service.PaturiService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RequiredArgsConstructor
@RestController
@RequestMapping("paturi")
public class PaturiController {

    public final PaturiService paturiService;
    @PostMapping("createWithBody")
    public ResponseEntity<?> createBad(@RequestBody PatRequestModel patRequestModel) {
        try {
            return ResponseEntity.ok(paturiService.createWithBody(patRequestModel));
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);

        }
    }
}
