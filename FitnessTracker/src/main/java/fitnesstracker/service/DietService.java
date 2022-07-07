package fitnesstracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fitnesstracker.advices.ActivityNotFoundException;
import fitnesstracker.advices.DietNotFoundException;
import fitnesstracker.entity.Activity;
import fitnesstracker.entity.Diet;
import fitnesstracker.repository.DietRepository;

@Service
public class DietService {

	@Autowired
	DietRepository dietrepo;

	public List<Diet> getDiets() {
		List<Diet> dietList = dietrepo.findAll();
		return dietList;
	}

	public Diet addDiet(Diet d) {
		Diet d1 = dietrepo.save(d);

		return d1;

	}

	public Diet updateDiet(Diet a) {

		Diet d2 = dietrepo.save(a);

		return d2;

	}

	public Diet updateDiets(Diet diet) throws Exception  {
		if (diet == null) {
			throw new DietNotFoundException("diet does not exist");
		} else {
			dietrepo.save(diet);
			return diet;
		}
	}

	public String deleteDiet(Diet diet) {
		dietrepo.delete(diet);

		return "string";

	}

	
		}

