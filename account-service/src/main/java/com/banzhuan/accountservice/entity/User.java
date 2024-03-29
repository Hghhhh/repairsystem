package com.banzhuan.accountservice.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_user")
@Data //lomback注解，自动生成setter和getter
public class User {


    private String number;

    @Column(name="name")
    private String name;

    @Id
    @Column(name="telphone",columnDefinition="CHAR")
    private String telphone;

    @Column(name="dormitoryId")
    private Integer dormitoryId;

    private Integer dormitoryNum;

}
