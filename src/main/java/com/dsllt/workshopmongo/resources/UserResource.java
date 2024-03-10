package com.dsllt.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsllt.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
  
  @GetMapping
  public ResponseEntity<List<User>> findAll(){
    User john = new User("1", "John Doe", "john.doe@gmail.com");
    User jane = new User("2", "Jane Doe", "jane.doe@gmail.com");
    List<User> list = new ArrayList<>();
    list.addAll(Arrays.asList(john, jane));
    return  ResponseEntity.ok().body(list);
  }
}
