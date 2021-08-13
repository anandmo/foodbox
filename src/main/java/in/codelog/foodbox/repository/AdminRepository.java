package in.codelog.foodbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.codelog.foodbox.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
