package me.dio.gtf_dio_2024.domain.repository;

import me.dio.gtf_dio_2024.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
