package com.codebygaurav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codebygaurav.model.Doc;

public interface DocRepository extends JpaRepository<Doc, Integer > {

}
