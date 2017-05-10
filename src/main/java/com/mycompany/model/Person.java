package com.mycompany.model;

import lombok.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by sergy on 06-May-17.
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Person implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String firtsName;
    private String lastName;


    public Person(final String firtsName, final String lastName) {
        this.firtsName = firtsName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Person rhs = (Person) obj;
        return new EqualsBuilder()
                .append(this.firtsName, rhs.firtsName)
                .append(this.lastName, rhs.lastName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(firtsName)
                .append(lastName)
                .toHashCode();
    }
}
