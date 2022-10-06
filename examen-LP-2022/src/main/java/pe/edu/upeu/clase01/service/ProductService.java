package pe.edu.upeu.clase01.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.clase01.dao.Operaciones;
import pe.edu.upeu.clase01.entity.Products;
import pe.edu.upeu.clase01.daoImpl.ProductDaoImpl;

@Service
public class ProductService implements Operaciones<Products>{
	
	@Autowired
	private ProductDaoImpl daoIml;

	@Override
	public int create(Products t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Products t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Products read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Products> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoIml.readAll2();
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}

}
