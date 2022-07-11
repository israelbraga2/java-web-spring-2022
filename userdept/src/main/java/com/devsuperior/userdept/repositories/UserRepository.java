package com.devsuperior.userdept.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.devsuperior.userdept.entities.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Long>{

}
