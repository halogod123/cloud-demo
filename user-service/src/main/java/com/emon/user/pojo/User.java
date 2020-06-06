package com.emon.user.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.FieldResult;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name="user")
@Data
public class User {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;


    private String username;
    private Date birthday;
    private Integer sex;
    private String address;
    private String password;
    private String name;
    private Integer age;
    private Date created;
    private Date updated;
}
