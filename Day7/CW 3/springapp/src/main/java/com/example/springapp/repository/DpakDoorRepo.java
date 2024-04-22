package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.DpakDoor;
import java.util.List;

@Repository
public interface DpakDoorRepo extends JpaRepository<DpakDoor,Integer>{

    List<DpakDoor> findByDoorId(int doorId);
    List<DpakDoor> findByAccessType(String accessType);
    
}
