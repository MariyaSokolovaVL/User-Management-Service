package com.example.usermanagementservice.repositories;

import com.example.usermanagementservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * Метод для поиска пользователя по его имени пользователя
     */
    User findByUsername(String username);

    /**
     * Метод для поиска всех пользователей
     */
    List<User> findAll();

    /**
     * Метод для сохранения пользователя
     */
    User save(User user);

    /**
     * Метод для обновления пользователя
     */
    User saveAndFlush(User user);

    /**
     * Метод для удаления пользователя по его идентификатору
     */
    void deleteById(Long id);

    /**
     * Метод для удаления пользователя
     */
    void delete(User user);

    /**
     * Метод для проверки существования пользователя по его идентификатору
     */
    boolean existsById(Long id);

}