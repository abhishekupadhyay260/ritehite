package com.ritehite.crus.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ritehite.crus.Model.Mod;
import com.ritehite.crus.Service.CrudService;
import com.ritehite.crus.Service.ServiceImpl;

@RestController
@RequestMapping("/v")
public class CrudControl {
	
	@Autowired
	private CrudService serv;
	
	@PostMapping("/create")
	private void create(@RequestBody Mod model) {
		serv.createCrud(model);
	}
	@PostMapping("/update")
	private String update(@RequestBody Mod model) {
		return serv.updateCrud(model);
	}
	@DeleteMapping("/delete/{id}")
	private String delete(@PathVariable("id") int id) {
		return serv.deleteCrud(id);
	}

}
