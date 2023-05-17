package com.wtzconsult.demo.bo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
@Entity
public class Paturi extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String pat_nr;
    @ManyToOne
    @JoinColumn(name = "sectie_id")
    Sectie sectie;
}