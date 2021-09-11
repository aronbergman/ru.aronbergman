package ru.aronbergman.core.services;

import ru.aronbergman.core.model.User;

public interface UserService {
    User getUser(Long id);
}
