package com.example.day5cw1.service;

import org.springframework.stereotype.Service;

import com.example.day5cw1.model.DpakProduct;
import com.example.day5cw1.repository.DpakProductRepo;

@Service
public class DpakProductService {
    public DpakProductRepo productRepo;
    public DpakProductService(DpakProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(DpakProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,DpakProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public DpakProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
