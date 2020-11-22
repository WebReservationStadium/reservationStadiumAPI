package th.ac.ku.reserved.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.ac.ku.reserved.data.userRepository;
import th.ac.ku.reserved.model.User;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private userRepository userrepository;

    public UserController(userRepository repository) {
        this.userrepository = repository;
    }
    @GetMapping
    public List<User> getAll(){
        return userrepository.findAll();
    }
    @GetMapping("/{id}")
    public User getOne(@PathVariable int id){
        try {
            return userrepository.findById(id).get();
        }catch (NoSuchElementException e){
            return null;
        }
    }

}
