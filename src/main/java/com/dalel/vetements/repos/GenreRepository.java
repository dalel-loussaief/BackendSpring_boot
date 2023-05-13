package com.dalel.vetements.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dalel.vetements.entities.Genre;
@RepositoryRestResource(path = "ge")
@CrossOrigin("*")
public interface GenreRepository extends JpaRepository<Genre, Long>{

}
