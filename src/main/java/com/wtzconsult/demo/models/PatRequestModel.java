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
public class PatRequestModel  extends Audit {
    Long sectieId;
    String pat_nr;
    String numeSectie;
}
