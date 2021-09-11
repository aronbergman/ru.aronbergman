package ru.aronbergman.core.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.aronbergman.core.model.User;
import ru.aronbergman.core.repositories.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow();
    }
}
