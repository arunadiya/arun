package productController.java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import PetproductdsController.java.PetProducts;
import productsService.java.PetproductsService;

@RestController
public class PetproductsController {

	@Autowired
	PetproductsService PetProductsService;
	
	@GetMapping(value="fetchPetProducts")
	public List<PetProducts> getAllPetProducts()
	{
		List<PetProducts> petproductsList=petproductsService.getAllPetProducts();
		return petproductsList;
	}
	
	@PostMapping(value="/savePetProducts")
	public PetProducts savePetProducts(@RequestBody PetProducts m)
	{
		return petproductsService.savePetProducts(m);
	}
	
	@PutMapping(value="/updatePetProducts")
	public PetProducts updatePetProducts(@RequestBody PetProducts m)
	{
		return PetProductsService.savePetProducts(m);
	}
	
	@DeleteMapping(value="/deletePetProducts/{nme}")
	public void  deletePetProducts(@PathVariable("nme") String name)
	{
		PetproductsService.deletePetProducts(name);
	
	@GetMapping(value="/getPetProducts/{nme}")
	public PetProducts getPetProducts(@PathVariable("nme") String name)
	{
		return PetProductsService.getPetProducts(name);
	}
}
}

