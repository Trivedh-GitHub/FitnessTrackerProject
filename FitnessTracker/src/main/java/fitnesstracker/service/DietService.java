package fitnesstracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fitnesstracker.entity.Diet;
import fitnesstracker.repository.DietRepository;



@Service
public class DietService {

@Autowired
DietRepository dietrepo;

public List<Diet> getDiets() {
    List<Diet> lc = dietrepo.findAll();
    return lc;
}

public Diet addDiet(Diet d) {
    Diet d1 = dietrepo.save(d);

    return d1;

}

public Diet updateDiet(Diet a) {

 Diet d2 =dietrepo.save(a);

    return d2;

}

public String deleteDiet(Diet d) {
    dietrepo.delete(d);

    return "string";

}
}