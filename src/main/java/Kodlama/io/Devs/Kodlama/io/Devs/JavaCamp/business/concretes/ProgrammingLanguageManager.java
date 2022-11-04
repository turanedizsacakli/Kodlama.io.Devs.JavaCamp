package Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.abstracts.ProgrammingLanguageService;
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


	@Override
	public List<ProgrammingLanguage> getAll() {

		//return programmingLanguageRepository.getAll();
		return programmingLanguageRepository.findAll();
	}


//	@Override
//	public void update(ProgrammingLanguage programmingLanguage) {
//		programmingLanguageRepository.update(programmingLanguage);
//		
//	}
//
//
//	@Override
//	public void delete(int id) {
//		programmingLanguageRepository.delete(id);
//		
//	}
//
//
//	@Override
//	public void add(ProgrammingLanguage programmingLanguage) {
//		var languages = programmingLanguageRepository.getAll();
//		for (ProgrammingLanguage language: languages ) {
//			if (programmingLanguage.getProgrammingName().equals(language.getProgrammingName())) {
//				System.out.println("Name cannot be same : " + programmingLanguage.getProgrammingName());
//				return;
//			}
//		}
//		if (programmingLanguage.getProgrammingName() == "" || programmingLanguage.getProgrammingName() == null) {
//			System.out.println("You have to write a name...");
//			return;
//		}
//		programmingLanguageRepository.add(programmingLanguage);	
//	}
//
//	@Override
//	public ProgrammingLanguage getById(int id) {
//		return programmingLanguageRepository.getById(id);
//	}

}
