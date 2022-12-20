package com.example.RiteHite.Service;


import com.example.RiteHite.Model.RiteHite_Crud;
import com.example.RiteHite.Repository.RitehiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CrudServiceImpl implements ICrudService {

    @Autowired
    RitehiteRepository repo;

    @Override


    public void createCrud (RiteHite_Crud create) {

        repo.save(create);

    }

    @Override
    public String updateName(String name) {
        return null;
    }
}
