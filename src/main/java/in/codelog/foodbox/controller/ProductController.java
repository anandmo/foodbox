package in.codelog.foodbox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.codelog.foodbox.model.Product;
import in.codelog.foodbox.repository.ProductRepository;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class ProductController {

	@Autowired
	ProductRepository productRepository;

	@GetMapping("/product")
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}

	@DeleteMapping("/product/{id}")
	public void removeProduct(@PathVariable(value = "id") int id) {
		productRepository.deleteById(id);
	}

}
