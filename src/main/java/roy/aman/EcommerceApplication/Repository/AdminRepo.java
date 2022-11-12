package roy.aman.EcommerceApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import roy.aman.EcommerceApplication.Entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{

}