package com.example.usermanagementservice.services;

import com.example.usermanagementservice.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUsers();

    /**
     * Регистрирует нового пользователя.
     *
     * @param user объект пользователя для регистрации
     * @return сохраненный пользователь
     */
//    User registerUser(User user);
//
//    /**
//     * Аутентифицирует пользователя по имени пользователя и паролю.
//     *
//     * @param username имя пользователя
//     * @param password пароль пользователя
//     * @return объект Optional<User>, содержащий аутентифицированного пользователя, если такой найден
//     */
//    Optional<User> authenticateUser(String username, String password);
//
//    /**
//     * Изменяет пароль пользователя.
//     *
//     * @param userId идентификатор пользователя
//     * @param newPassword новый пароль
//     * @return true, если пароль успешно изменен, в противном случае - false
//     */
//    boolean changePassword(Long userId, String newPassword);
//
//    /**
//     * Удаляет аккаунт пользователя.
//     *
//     * @param userId идентификатор пользователя
//     */
//    void deleteAccount(Long userId);
}