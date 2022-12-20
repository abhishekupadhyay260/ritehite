package com.ritehite.crus.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ritehite.crus.Model.Mod;
import com.ritehite.crus.Repository.ModJpa;

@Component
public class ServiceImpl implements CrudService{

	@Autowired
	ModJpa repo;
	
	@Override
	public void createCrud(Mod model) {
		repo.save(model);
	}

	@Override
	public String updateCrud(Mod update) {
		// TODO Auto-generated method stub
		repo.save(update);
		return "Updated";
	}

	@Override
	public String deleteCrud(int id) {
		repo.deleteById(id);
		return "Deleted";
	}

	
	
}
