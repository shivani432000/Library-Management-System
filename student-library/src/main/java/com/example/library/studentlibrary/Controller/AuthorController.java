package com.example.library.studentlibrary.Controller;

import com.example.library.studentlibrary.Models.Author;
import com.example.library.studentlibrary.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/createAuthor")
    public ResponseEntity createAuthor(@RequestBody Author author)
    {
        authorService.createAuthor(author);
        return new ResponseEntity<>("the author is successfully added to the system", HttpStatus.CREATED);
    }
}
