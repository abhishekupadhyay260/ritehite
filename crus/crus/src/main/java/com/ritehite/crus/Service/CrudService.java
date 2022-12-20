package com.ritehite.crus.Service;

import org.springframework.stereotype.Service;

import com.ritehite.crus.Model.Mod;


@Service
public interface CrudService {
	public void createCrud(Mod create);
	public String updateCrud(Mod update);
	public String deleteCrud(int id);
	
}
