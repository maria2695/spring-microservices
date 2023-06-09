package com.softserve.itacademy.todolist.messaging;

import com.softserve.itacademy.todolist.dto.AuthDTO;
import com.softserve.itacademy.todolist.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ProducerController {

    private final ProducerService producerService;
    private static final Logger logger = LoggerFactory.getLogger(ProducerController.class);

    @Autowired
    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @Value("${app.message}")
    private String response;

    @PostMapping("/produce")
    public ResponseEntity<String> sendMessage(@RequestBody UserDTO user) {
        producerService.sendMessage(user);
        logger.info("user sent: " + user);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticate(@RequestBody AuthDTO user) {
        producerService.sendMessage(user);
        logger.info("User Details sent: " + user);
        return ResponseEntity.ok(response);
    }
}