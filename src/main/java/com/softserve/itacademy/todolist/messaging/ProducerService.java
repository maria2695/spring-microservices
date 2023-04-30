package com.softserve.itacademy.todolist.messaging;

import com.softserve.itacademy.todolist.dto.AuthDTO;
import com.softserve.itacademy.todolist.dto.UserDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public ProducerService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Value("${spring.rabbitmq.exchange}")
    private String exchange;

    @Value("${spring.rabbitmq.routingkey}")
    private String routingkey;

    @Value("${spring.rabbitmq.authroutingkey}")
    private String authroutingkey;

    public void sendMessage(UserDTO user) {
        System.out.println("User sent: " + user);
        rabbitTemplate.convertAndSend(exchange,routingkey, user);
    }

    public void sendMessage(AuthDTO user) {
        rabbitTemplate.convertAndSend(exchange,authroutingkey, user);
    }

}