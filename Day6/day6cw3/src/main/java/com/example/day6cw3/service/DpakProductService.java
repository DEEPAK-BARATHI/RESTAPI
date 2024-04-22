package com.example.day6cw3.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.model.DpakProduct;
import com.example.day6cw3.repository.DpakProductRepo;

@Service
public class DpakProductService {
    public DpakProductRepo productRepo;
    public DpakProductService(DpakProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(DpakProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DpakProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<DpakProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public DpakProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
