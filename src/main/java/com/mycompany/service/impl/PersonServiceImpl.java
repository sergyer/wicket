package com.mycompany.service.impl;

import com.mycompany.model.Person;
import com.mycompany.service.PersonService;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sergy on 06-May-17.
 */
@Service
public class PersonServiceImpl implements PersonService{

    @Override
    public List<Person> getPersons(@NotNull final Integer startFrom,@NotNull final Integer maxCount) {
        return Arrays.asList(new Person("Sergey", "Yan"), new Person("Serjh", "Yan"));
    }
}
