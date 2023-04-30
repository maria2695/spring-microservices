package com.softserve.itacademy.todolist;

import com.softserve.itacademy.todolist.model.User;
import com.softserve.itacademy.todolist.repository.RoleRepository;
import com.softserve.itacademy.todolist.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ToDoListApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(ToDoListApplication.class, args);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/form-login");
    }

    @Bean
    public CommandLineRunner dataLoader(UserRepository userRepo, RoleRepository roleRepo, PasswordEncoder encoder) {
        return args -> {

            User user = new User();
            user.setEmail("user@gmail.com");
            user.setPassword(encoder.encode("password"));
            user.setRole(roleRepo.getReferenceById(2L));
            userRepo.save(user);

            User admin = new User();
            admin.setEmail("admin@gmail.com");
            admin.setPassword(encoder.encode("password"));
            admin.setRole(roleRepo.getReferenceById(1L));
            userRepo.save(user);
        };
    }

}
