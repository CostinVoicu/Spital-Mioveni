package com.wtzconsult.demo.models;

import com.wtzconsult.demo.bo.User;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponseModel {
    Long id;
    String nume;
    String prenume;
    String functie;
    String mail;
    String parola;
    Long sectieId;
    String numeSectie;

}
