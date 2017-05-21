package com.mastera2z.jhipsterapp.service.impl;

import com.mastera2z.jhipsterapp.service.AuthorService;
import com.mastera2z.jhipsterapp.domain.Author;
import com.mastera2z.jhipsterapp.repository.AuthorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Service Implementation for managing Author.
 */
@Service
public class AuthorServiceImpl implements AuthorService{

    private final Logger log = LoggerFactory.getLogger(AuthorServiceImpl.class);
    
    @Inject
    private AuthorRepository authorRepository;

    /**
     * Save a author.
     *
     * @param author the entity to save
     * @return the persisted entity
     */
    public Author save(Author author) {
        log.debug("Request to save Author : {}", author);
        Author result = authorRepository.save(author);
        return result;
    }

    /**
     *  Get all the authors.
     *  
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    public Page<Author> findAll(Pageable pageable) {
        log.debug("Request to get all Authors");
        Page<Author> result = authorRepository.findAll(pageable);
        return result;
    }

    /**
     *  Get one author by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    public Author findOne(String id) {
        log.debug("Request to get Author : {}", id);
        Author author = authorRepository.findOne(id);
        return author;
    }

    /**
     *  Delete the  author by id.
     *
     *  @param id the id of the entity
     */
    public void delete(String id) {
        log.debug("Request to delete Author : {}", id);
        authorRepository.delete(id);
    }
}
