package roy.aman.EcommerceApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import roy.aman.EcommerceApplication.Entity.Payment;


public interface PaymentRepo extends JpaRepository<Payment, Integer> {

}
