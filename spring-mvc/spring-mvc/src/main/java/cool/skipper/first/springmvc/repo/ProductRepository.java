package cool.skipper.first.springmvc.repo;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;

import cool.skipper.first.springmvc.entity.Product;

@Entity
public interface ProductRepository extends JpaRepository<Product,Long> {

}
