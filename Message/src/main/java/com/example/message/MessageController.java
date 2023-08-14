package com.example.message;


import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class MessageController {
    private final MessageRepository messageRepository;

    @Autowired
    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newMessage", new Message());
        return "index";
    }

    @PostMapping("/add")
    public String addMessage(@ModelAttribute Message message) {
        messageRepository.save(message);
        return "redirect:/";
    }

    @GetMapping("/messages")
    public String messages(@RequestParam(required = false) String senderName, Model model) {
        List<Message> messages;
        if (senderName != null && !senderName.isEmpty()) {
            messages = messageRepository.findBySenderName(senderName);
        } else {
            messages = messageRepository.findAll();
        }
        model.addAttribute("messages", messages);
        return "messages";
    }
}