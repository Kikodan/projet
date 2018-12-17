package com.project.java.Repository;

import com.project.java.Randonnees;
import com.project.java.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Integer>{
}
