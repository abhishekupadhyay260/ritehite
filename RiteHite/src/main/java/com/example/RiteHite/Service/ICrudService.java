package com.example.RiteHite.Service;


import com.example.RiteHite.Model.RiteHite_Crud;
import org.springframework.stereotype.Service;

@Service
public interface ICrudService {


    public void createCrud(RiteHite_Crud create);
    public String updateName(String name);

}
