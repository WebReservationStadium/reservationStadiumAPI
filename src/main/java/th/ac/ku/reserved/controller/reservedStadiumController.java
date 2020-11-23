package th.ac.ku.reserved.controller;


import org.springframework.web.bind.annotation.*;
import th.ac.ku.reserved.data.reservedRepository;
import th.ac.ku.reserved.model.User;
import th.ac.ku.reserved.model.reservedStadium;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/reservedstadium")
public class   reservedStadiumController {
    private reservedRepository repository;

    public reservedStadiumController(reservedRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/user/{userId}")
    public List<reservedStadium> getUserReserved(@PathVariable int userId){
        return repository.findByUserId(userId);
    }
    @GetMapping
    public List<reservedStadium> getAll(){
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public reservedStadium getOne(@PathVariable int id){
        try{
            return repository.findById(id).get();
        }catch (NoSuchElementException e) {
            return null;
        }
    }
    @PostMapping
    public reservedStadium create(@RequestBody reservedStadium reservedstadium){
        repository.save(reservedstadium);
        return reservedstadium;
    }
    @PutMapping("/{id}")
    public reservedStadium update(@PathVariable int id ,@RequestBody reservedStadium reservedstadium){
        reservedStadium record = repository.findById(id).get();
        record.setUserId(reservedstadium.getUserId());
        record.setDay(reservedstadium.getDay());
        record.setStart(reservedstadium.getStart());
        record.setEnd(reservedstadium.getEnd());
        record.setStatus(true);
        repository.save(record);
        return record;
    }
    @DeleteMapping("/{id}")
    public reservedStadium delete(@PathVariable int id){
        reservedStadium record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }

}
