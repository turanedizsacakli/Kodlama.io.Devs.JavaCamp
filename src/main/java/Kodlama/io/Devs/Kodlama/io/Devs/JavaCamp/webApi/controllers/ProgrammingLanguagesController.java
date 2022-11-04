package Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		super();
		this.programmingLanguageService = programmingLanguageService;
	}
	
//	@PostMapping("/add")
//	public void add(ProgrammingLanguage programmingLanguage) {
//		programmingLanguageService.add(programmingLanguage);
//	}
//
//	@DeleteMapping("/delete")
//	public void delete(int id) {
//		programmingLanguageService.delete(id);
//	}
//	
//	@PostMapping("update")
//	public void update(ProgrammingLanguage programmingLanguage) {
//		programmingLanguageService.update(programmingLanguage);
//	}


	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageService.getAll();
	}

//	@GetMapping("/getbyid")
//	public ProgrammingLanguage getById(int id) {
//		return programmingLanguageService.getById(id);
//	}
}
