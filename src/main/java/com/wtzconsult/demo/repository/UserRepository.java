package com.wtzconsult.demo.repository;

import com.wtzconsult.demo.bo.User;
import com.wtzconsult.demo.models.UserRequestModel;
import com.wtzconsult.demo.models.UserResponseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    List<UserRequestModel> findByNumeAndFunctie(String nume, String functie);

    List<User> findByFunctie( String functie);
}
