
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
		List<Diet> dietList = dietservice.getDiets();
		return dietList;
	}

	@PostMapping("adddiet")
	public Diet addDiet(@RequestBody Diet d) {
		Diet diet1 = dietservice.addDiet(d);
		return diet1;
	}

	@PutMapping("updatediet")
	public Diet updateDiet(@RequestBody Diet d) {
		Diet diet2 = dietservice.updateDiet(d);
		return diet2;
	}

	@DeleteMapping("deletediet")
	public String deleteDiet(@RequestBody int id) {
		return "String";

	}
}
