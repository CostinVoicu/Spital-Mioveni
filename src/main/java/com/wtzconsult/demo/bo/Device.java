package com.wtzconsult.demo.bo;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
@Entity
public class Device extends Audit{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String camera;
    String monitor;
    @ManyToOne
    @JoinColumn(name = "bed_Id")
    Paturi paturi;


}