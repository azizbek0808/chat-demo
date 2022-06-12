package com.example.chatdemo.entity;

import com.example.chatdemo.entity.template.AbsLongEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table(name = "chats")
public class Chat extends AbsLongEntity implements Comparable<Chat> {

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "created_at")
    private Date createdAt;

    @ManyToMany(/*fetch = FetchType.LAZY*/ cascade = {CascadeType.ALL})
    @JoinTable(name = "chat_user", joinColumns = {@JoinColumn(name = "chat_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")})
    private Set<User> users = new HashSet<>();

    @Override
    public int compareTo(Chat o) {
        return 0;
    }
}
