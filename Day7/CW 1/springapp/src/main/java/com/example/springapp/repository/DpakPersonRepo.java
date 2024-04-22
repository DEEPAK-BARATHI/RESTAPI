package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.DpakPerson;
import java.util.List;


@Repository
public interface DpakPersonRepo extends JpaRepository<DpakPerson,Integer>{

    List<DpakPerson> findByAge(int age);
    
}
