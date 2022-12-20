package com.ritehite.crus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ritehite.crus.Model.Mod;

@Repository
public interface ModJpa extends JpaRepository<Mod,Integer>{

}
