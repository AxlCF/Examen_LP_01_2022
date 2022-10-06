package pe.edu.upeu.clase01.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clase01.dao.Operaciones;
import pe.edu.upeu.clase01.entity.Products;

@Component
public class ProductDaoImpl implements Operaciones<Products>{
	
	@Autowired
	   private JdbcTemplate jdbcTemplate;

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
		return jdbcTemplate.queryForList("select  p.nombre_Producto,c.nombre_Categoria, p.Stocks  \r\n"
				+ "from  products p  inner join categories c   on p.categoryID = c.CategoryID");
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}

}
