package com.example.message;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findBySenderName(String senderName);
}
