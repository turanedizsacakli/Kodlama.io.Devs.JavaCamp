package Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryBrandRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> _programmingLanguage;
	
	public InMemoryBrandRepository() {
		_programmingLanguage=new ArrayList<ProgrammingLanguage>();
		_programmingLanguage.add(new ProgrammingLanguage( 1, "python"));
		_programmingLanguage.add(new ProgrammingLanguage( 2, "C#"));
		_programmingLanguage.add(new ProgrammingLanguage( 3, "java"));
	}

	
	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return _programmingLanguage;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		
		_programmingLanguage.add(programmingLanguage);

	}

	@Override
	public void update() {
		
		
	}

	@Override
	public void delete() {
		
		
	}


	@Override
	public void add() {
		
		
	}

}
