package com.wtzconsult.demo.restcontroller;

import com.wtzconsult.demo.bo.User;
import com.wtzconsult.demo.models.UserRequestModel;
import com.wtzconsult.demo.models.UserResponseModel;
import com.wtzconsult.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    public final UserService userService;

    @PostMapping("/createWithBody")
    public ResponseEntity<?> createUser(@RequestBody UserRequestModel userRequestModel) {
        try {
            return ResponseEntity.ok(userService.createWithBody(userRequestModel));
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getUserByNumeAndFunctie")
    public ResponseEntity<?>getByNumeAndFunctie(@RequestParam String nume,@RequestParam String functie){
        return ResponseEntity.ok(userService.getByNumeAndFunctie(nume, functie));
    }
    @GetMapping("/getUserByFunctie")
    public ResponseEntity<?>getUserByFunctie(@RequestParam  String functie){
        return ResponseEntity.ok(userService.getByFunctie(functie));
    }
}