package me.dio.gtf_dio_2024.domain.service.impl;

import me.dio.gtf_dio_2024.domain.model.User;
import me.dio.gtf_dio_2024.domain.repository.UserRepository;
import me.dio.gtf_dio_2024.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) throws IllegalAccessException {
        if(userRepository.existsByAccountNumber(user.getAccount().getNumber())){
            throw new IllegalAccessException("this account number already exists.");
        }
        return userRepository.save(user);
    }
}
