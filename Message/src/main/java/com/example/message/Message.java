package com.example.message;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String text;
    private String senderName;

    public Message(){
    }

    public Message(String text, String senderName) {
        this.text = text;
        this.senderName = senderName;
    }
}
