package com.example.RiteHite.Controller;


import com.example.RiteHite.Model.RiteHite_Crud;
import com.example.RiteHite.Service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/v")
public class CrudController {

    @Autowired
    ICrudService serviceCrud;

    @PostMapping ("/create")
    private void create (@RequestBody RiteHite_Crud crud) {
        serviceCrud.createCrud(crud);
    }

}
