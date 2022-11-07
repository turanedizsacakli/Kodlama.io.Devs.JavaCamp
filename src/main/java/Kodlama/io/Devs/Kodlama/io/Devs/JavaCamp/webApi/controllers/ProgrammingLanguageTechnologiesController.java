package Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.abstracts.ProgrammingLanguageTechnologyService;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.requests.programmingLanguageTechnologyRequests.CreateProgrammingLanguageTechnologyRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.requests.programmingLanguageTechnologyRequests.UpdateProgrammingLanguageTechnologyRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.responses.programmingLanguageTechnologyResponses.GetAllProgrammingLanguageTechnologyResponse;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.responses.programmingLanguageTechnologyResponses.GetByIdProgrammingLanguageTechnologyResponse;

@RestController
@RequestMapping("/api/programminglanguagetechnologies")
public class ProgrammingLanguageTechnologiesController {
	
	private ProgrammingLanguageTechnologyService programmingLanguageTechnologyService;
	@Autowired
	public ProgrammingLanguageTechnologiesController(
			ProgrammingLanguageTechnologyService programmingLanguageTechnologyService) {
		super();
		this.programmingLanguageTechnologyService = programmingLanguageTechnologyService;
	}
	
	@PostMapping("/add")
	public void add(CreateProgrammingLanguageTechnologyRequest createProgrammingLanguageTechnologyRequest) {
		programmingLanguageTechnologyService.add(createProgrammingLanguageTechnologyRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguageTechnologyRequest) {
		programmingLanguageTechnologyService.update(updateProgrammingLanguageTechnologyRequest);
	}
	
//	@DeleteMapping("/delete")
//	public void delete(DeleteProgrammingLanguageTechnologyRequest deleteProgrammingLanguageTechnologyRequest) {
//		programmingLanguageTechnologyService.delete(deleteProgrammingLanguageTechnologyRequest);
//	}
	
	@GetMapping("/getalltechnologies")
	public List<GetAllProgrammingLanguageTechnologyResponse> getAll(){
		return programmingLanguageTechnologyService.getAll();
	}
	
	@GetMapping("/getbyid")
	public GetByIdProgrammingLanguageTechnologyResponse getById(int id){
		return programmingLanguageTechnologyService.getById(id);
	}
	
	
}
