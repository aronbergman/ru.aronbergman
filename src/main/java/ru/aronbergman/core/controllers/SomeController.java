package ru.aronbergman.core.controllers;

import ru.aronbergman.core.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.aronbergman.core.model.User;

@RestController
@RequiredArgsConstructor
public class SomeController {

    private final UserService userService;

    @GetMapping("/hello/{id}")
    public User sayHello(@PathVariable Long id) {
        System.out.println(id);
        return userService.getUser(id);
    }
}
