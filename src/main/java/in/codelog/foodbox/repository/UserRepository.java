package in.codelog.foodbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.codelog.foodbox.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
