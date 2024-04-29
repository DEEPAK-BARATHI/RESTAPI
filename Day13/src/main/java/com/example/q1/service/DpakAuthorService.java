package com.example.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.DpakAuthor;
import com.example.q1.repository.DpakAuthorRepository;

@Service
public class DpakAuthorService {
    @Autowired
    private DpakAuthorRepository authorRepository;

    public DpakAuthor saveAuthor(DpakAuthor author) {
        return authorRepository.save(author);
    }

    public DpakAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<DpakAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public DpakAuthor updateAuthor(Long id, DpakAuthor author) {
        DpakAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
