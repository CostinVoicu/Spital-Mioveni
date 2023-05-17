package com.wtzconsult.demo.models;

import com.wtzconsult.demo.bo.Audit;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DeviceResponseModel extends Audit {
    Long id;
    String camera;
    String  monitor;
    Long patId;
    String patNr;
    Long sectieId;
    String numeSectie;


}
