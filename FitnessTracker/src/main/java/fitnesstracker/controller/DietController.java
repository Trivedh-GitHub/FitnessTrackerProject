package fitnesstracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fitnesstracker.entity.Diet;
import fitnesstracker.service.DietService;

@RestController
@RequestMapping("diet")
public class DietController {
	@Autowired
	DietService dietservice;

	@GetMapping(path = "getdiets")
	public List<Diet> getDiets() {
		List<Diet> lc = dietservice.getDiets();
		return lc;
	}

	@PostMapping("adddiet")
	public String addDiet(@RequestBody Diet diet) throws Throwable {
		dietservice.addDiet(diet);
		return "post";
	}

	@PutMapping("updatediet")
	public String updateDiet(@RequestBody Diet diet) throws Throwable {
		dietservice.updateDiet(diet);
		return "put";
	}

	@DeleteMapping("deletediet")
	public String deleteDiet(@RequestBody Diet diet) {
		dietservice.deleteDiet(diet);
		return "String";
	}

	
	}
