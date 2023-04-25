package productsService.java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petproducts.Petproducts;

import productsRepository.java.PetproductsRepository;

@Service
public class PetproductsService {

	@Autowired
    PetproductsRepository petproductsRepository; 
	
	public List<Petproducts> getAllPetproducts()
	{
		List<Petproducts> petproductsList=PetproductsRepository.findAll();
		return petproductsList;
	}
	
	public Petproducts savePetproducts(Petproducts m)
	{
		Petproducts obj=PetproductsRepository.save(m);
	     return obj;
	     //return studRepository.save(s);
	}
	
	public Petproducts updatePetproducts(Petproducts m)
	{
		Petproducts obj=PetproductsRepository.save(m);
	     return obj;
	     //return studRepository.save(s);
	}
	
	public void deleteMovies(String name)
	{
		PetproductsRepository.deleteById(name);
	}
	
	public Petproducts get(String name)
	{
		Petproducts m=PetproductsRepository.findById(name).get();
	    return m;
	}
}
