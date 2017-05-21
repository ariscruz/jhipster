package com.mastera2z.jhipsterapp.repository;

import com.mastera2z.jhipsterapp.domain.Book;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Book entity.
 */
@SuppressWarnings("unused")
public interface BookRepository extends MongoRepository<Book,String> {

}
