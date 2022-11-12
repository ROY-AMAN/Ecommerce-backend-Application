package roy.aman.EcommerceApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import roy.aman.EcommerceApplication.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
