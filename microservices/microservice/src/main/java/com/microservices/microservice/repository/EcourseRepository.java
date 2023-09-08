package com.microservices.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.microservice.entity.Ecourse;


public interface EcourseRepository extends JpaRepository<Ecourse, Long>{

}
