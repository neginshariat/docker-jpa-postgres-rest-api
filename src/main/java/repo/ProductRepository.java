package repo;

import entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
