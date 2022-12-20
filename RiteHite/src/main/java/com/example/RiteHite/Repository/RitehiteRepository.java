package com.example.RiteHite.Repository;

import com.example.RiteHite.Model.RiteHite_Crud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RitehiteRepository extends JpaRepository <RiteHite_Crud, Long> {
}
