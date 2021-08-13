package in.codelog.foodbox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

}
