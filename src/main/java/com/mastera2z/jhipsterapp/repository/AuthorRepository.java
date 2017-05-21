package com.mastera2z.jhipsterapp.repository;

import com.mastera2z.jhipsterapp.domain.Author;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Author entity.
 */
@SuppressWarnings("unused")
public interface AuthorRepository extends MongoRepository<Author,String> {

}
