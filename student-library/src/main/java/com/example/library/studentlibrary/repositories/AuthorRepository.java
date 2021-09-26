package com.example.library.studentlibrary.repositories;

import com.example.library.studentlibrary.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
