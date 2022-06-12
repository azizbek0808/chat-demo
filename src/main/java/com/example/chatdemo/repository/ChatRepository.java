package com.example.chatdemo.repository;

import com.example.chatdemo.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {

    @Query(value = "select distinct t from Chat t join t.users u where u.id in (:userId)")
    List<Chat> findAllByUserId(@Param(value = "userId") Long userId);

}
