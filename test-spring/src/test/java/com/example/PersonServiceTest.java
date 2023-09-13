package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PersonServiceTest {
    @MockBean
    private PersonRepository personRepository;

    @Autowired
    private PersonService personService;

    @Test
    public void testGetAllPersons() {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);

        when(personRepository.findAll()).thenReturn(Collections.singletonList(person));

        List<Person> persons = personService.getAllPersons();
        assertEquals(1, persons.size());
        assertEquals(person, persons.get(0));
    }

    // D'autres tests pour d'autres méthodes
}
