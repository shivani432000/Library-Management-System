package com.example.library.studentlibrary.service;

import com.example.library.studentlibrary.Models.Author;
import com.example.library.studentlibrary.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public void createAuthor(Author author)
    {
        authorRepository.save(author);
    }
}
