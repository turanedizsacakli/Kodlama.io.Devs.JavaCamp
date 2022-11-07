package Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.requests.programmingLanguageRequests.CraeteProgrammingLanguageRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.requests.programmingLanguageRequests.DeleteProgrammingLanguageRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.requests.programmingLanguageRequests.UpdateProgrammingLanguageRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.responses.programmingLanguageResponses.GetAllProgrammingLanguageResponse;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.responses.programmingLanguageResponses.GetByIdProgrammingLanguageResponse;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{

	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		super();
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	ProgrammingLanguage _programmingLanguage=new ProgrammingLanguage();
	
	@Override
	public List<GetAllProgrammingLanguageResponse> getAll() {
		 
		List<ProgrammingLanguage> programmingLanguages=programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguageResponse> programmingLanguageResponse=new ArrayList<GetAllProgrammingLanguageResponse>();
		
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			GetAllProgrammingLanguageResponse responseItem=new GetAllProgrammingLanguageResponse();
			responseItem.setId(programmingLanguage.getProgrammingLanguageId());
			responseItem.setName(programmingLanguage.getProgrammingLanguageName());
			
		} 
		//return programmingLanguageRepository.getAll();
		return programmingLanguageResponse;
	}


	@Override
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
		//programmingLanguageRepository.update(programmingLanguage);
		_programmingLanguage.setProgrammingLanguageName(updateProgrammingLanguageRequest.getName());
		_programmingLanguage.setProgrammingLanguageId(updateProgrammingLanguageRequest.getId());
		programmingLanguageRepository.save(_programmingLanguage);
	}
//
//
	@Override
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {
		
		programmingLanguageRepository.deleteById(deleteProgrammingLanguageRequest.getId());
		
	}
//
//
	@Override
	public void add(CraeteProgrammingLanguageRequest craeteProgrammingLanguageRequest) {
		
		var languages = programmingLanguageRepository.findAll();
		for (ProgrammingLanguage language: languages ) {
			if (craeteProgrammingLanguageRequest.getName().equals(language.getProgrammingLanguageName())) {
				System.out.println("Name cannot be same : " + craeteProgrammingLanguageRequest.getName());
				return;
			}
		}
		if (craeteProgrammingLanguageRequest.getName() == "" || craeteProgrammingLanguageRequest.getName() == null) {
			System.out.println("You have to write a name...");
			return;
		}
		_programmingLanguage.setProgrammingLanguageName(craeteProgrammingLanguageRequest.getName());
		programmingLanguageRepository.save(_programmingLanguage);	
	}


	@Override
	public GetByIdProgrammingLanguageResponse getById(int id) {
		ProgrammingLanguage programmingLanguage=programmingLanguageRepository.findById(id).get();
		GetByIdProgrammingLanguageResponse getByIdProgrammingLanguageResponse =new GetByIdProgrammingLanguageResponse();
		getByIdProgrammingLanguageResponse.setName(programmingLanguage.getProgrammingLanguageName());
		return getByIdProgrammingLanguageResponse;
	}




}
