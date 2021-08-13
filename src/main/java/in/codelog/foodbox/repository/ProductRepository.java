package in.codelog.foodbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.codelog.foodbox.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
