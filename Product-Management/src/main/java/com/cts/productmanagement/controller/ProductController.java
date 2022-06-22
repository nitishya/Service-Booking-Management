package com.cts.productmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.productmanagement.feign.AuthClient;
import com.cts.productmanagement.model.AppProduct;
import com.cts.productmanagement.model.JwtResponse;
import com.cts.productmanagement.service.ProductService;


@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private AuthClient authClient;
		
	
    @PostMapping("/product")
	public AppProduct addProduct(@RequestBody AppProduct appProduct) {    	
    	return productService.addProduct(appProduct);
	}
    
    @PutMapping("/product")
	public AppProduct updateProduct(@RequestHeader(name="authorization",required = true)String token,@RequestBody AppProduct appProduct) {
		JwtResponse jwtResponse = authClient.verifyToken(token);
		return  productService.updateProduct(appProduct);
	}
       
    @GetMapping("/product/{id}")
	public AppProduct getProductById(@PathVariable("id") int id) {		
		return productService.getProductById(id);
	}
    
    @GetMapping("/awsProduct")
	public String welcome() {
    	return "Product Deployed to Cloud";
	}
    
    @DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
	}
	
	@GetMapping("/product")
	public List<AppProduct> getProducts(){
		return productService.getProduct();		
	}	
	
}
