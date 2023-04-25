package productsRepository.java;

import org.springframework.stereotype.Repository;

@Repository
public interface PetproductsRepository extends JpaRepository<Petproducts,int>
{

}
