package com.bmsolutions.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bmsolutions.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

}
