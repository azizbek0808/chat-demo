package com.example.chatdemo.entity;

import com.example.chatdemo.entity.template.AbsLongEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "users")
public class User extends AbsLongEntity {

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "created_at")
    private Date createdAt;

}
