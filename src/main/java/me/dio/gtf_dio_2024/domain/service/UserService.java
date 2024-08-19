package me.dio.gtf_dio_2024.domain.service;

import me.dio.gtf_dio_2024.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User user) throws IllegalAccessException;


}
