package com.mycompany.service;

import com.mycompany.model.Person;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by sergy on 10-May-17.
 */

public interface PersonService {

    @NotNull
    List<Person> getPersons(@NotNull final Integer startFrom, @NotNull final Integer maxCount);
}
