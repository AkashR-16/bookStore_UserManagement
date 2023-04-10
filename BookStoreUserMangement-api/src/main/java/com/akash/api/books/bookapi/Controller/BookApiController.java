package com.akash.api.books.bookapi.Controller;

import com.akash.api.books.bookapi.Models.User;
import com.akash.api.books.bookapi.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookApiController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping(value= "/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value= "/users")
    public List<User> getUsers(){
        return userRepo.findAll();
    }
    @PostMapping(value= "/save")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "saved"+user.toString();
    }
    @PutMapping(value= "/update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user){
        User updateUser = userRepo.findById(id).get();
        updateUser.DeepCopy(user);
        userRepo.save(updateUser);
        return "updated"+updateUser.toString();
    }
    @DeleteMapping(value= "/delete/{id}")
    public String deleteUser(@PathVariable long id){
        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "deleted"+deleteUser.toString();
    }
}
