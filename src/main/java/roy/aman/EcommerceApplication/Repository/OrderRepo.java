package roy.aman.EcommerceApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import roy.aman.EcommerceApplication.Entity.Order;


public interface OrderRepo extends JpaRepository<Order, Integer>{

}
