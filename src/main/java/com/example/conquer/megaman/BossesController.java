package com.example.conquer.megaman;

import com.example.conquer.megaman.models.Bosses;
import com.example.conquer.megaman.repositories.BossesRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/bosses")
public class BossesController {
    @Autowired
    private BossesRepository repository;

    @RequestMapping(value="/", method= RequestMethod.GET)
    public List getAllBosses() {
        return repository.findAll();
    }

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public Bosses getBossById(@PathVariable("id") ObjectId id) {
        return repository.findBy_id(id);
    }
    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public void modifyBossById(@PathVariable("id") ObjectId id, @Valid @RequestBody Bosses bosses) {
        bosses.set_id(id);
        repository.save(bosses);
    }
    @RequestMapping(value="", method= RequestMethod.POST)
    public Bosses createBoss(@Valid @RequestBody Bosses bosses) {
        bosses.set_id(ObjectId.get());
        repository.save(bosses);
        return bosses;
    }
    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void deleteBoss(@PathVariable ObjectId id) {
        repository.delete(repository.findBy_id(id));
    }
}

