package com.scsj.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 2616986576255042364L;
    private String id;
    private String createUser;
    private Date createTime;
    private String updateUser;
    private Date updateTime;
    private Byte isValid;

}
