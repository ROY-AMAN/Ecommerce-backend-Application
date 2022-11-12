package roy.aman.EcommerceApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import roy.aman.EcommerceApplication.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
