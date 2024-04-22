package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.DpakPerson;
import com.example.springapp.repository.DpakPersonRepo;

@Service
public class DpakPersonService {
    @Autowired
    private DpakPersonRepo rep;

    public boolean post(Person person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<DpakPerson> start(String lastname)
    {
        return rep.findByLastnameNot(lastname);
    }

    public List<DpakPerson> end(List<Integer> ages)
    {
        return rep.findByAgeNotIn(ages);
    }
    
}
