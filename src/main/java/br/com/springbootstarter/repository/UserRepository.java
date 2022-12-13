package br.com.springbootstarter.repository;

import br.com.springbootstarter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
