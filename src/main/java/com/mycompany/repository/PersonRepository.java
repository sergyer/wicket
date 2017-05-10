package com.mycompany.repository;

import com.mycompany.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sergey, created on 5/10/17.
 */

public interface PersonRepository extends JpaRepository<Long,Person> {

}
