package com.dscatalogo.dscatalago.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dscatalogo.dscatalago.dto.CategoryDTO;
import com.dscatalogo.dscatalago.entities.Category;
import com.dscatalogo.dscatalago.services.CategoryService;

@RestController
@RequestMapping (value = "/categories")
public class CategoryResource {
	@Autowired
	private CategoryService service;
	
    @GetMapping
	public ResponseEntity<List<CategoryDTO>> findAll() {
		List<CategoryDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
