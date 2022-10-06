package pe.edu.upeu.clase01.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import pe.edu.upeu.clase01.entity.Products;
import pe.edu.upeu.clase01.service.ProductService;




@RestController
@RequestMapping("/api/productos")
public class ProductsController {

	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll2(){
		return productService.readAll2();
	}
	
}
