package roy.aman.EcommerceApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import roy.aman.EcommerceApplication.Entity.Cart;


public interface CartRepo extends JpaRepository<Cart, Integer>{

}
