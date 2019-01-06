package cool.skipper.first.springmvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cool.skipper.first.springmvc.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
