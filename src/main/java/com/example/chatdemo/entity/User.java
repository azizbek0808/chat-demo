package com.example.chatdemo.entity;

import com.example.chatdemo.entity.template.AbsLongEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User extends AbsLongEntity {

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "created_at")
    private Date createdAt;

    /*@ManyToMany(mappedBy = "users")
    private Set<Chat> chats = new HashSet<>();*/

}
