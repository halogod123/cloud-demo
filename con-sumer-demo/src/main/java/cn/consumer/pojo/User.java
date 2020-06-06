package cn.consumer.pojo;

import lombok.Data;
import java.util.Date;

@Data
public class User {
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
