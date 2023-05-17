package com.wtzconsult.demo.bo;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Audit {
    Date createDate;
    Date updateData;

}
