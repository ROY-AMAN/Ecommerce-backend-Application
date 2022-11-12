package roy.aman.EcommerceApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import roy.aman.EcommerceApplication.Entity.Category;


public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
