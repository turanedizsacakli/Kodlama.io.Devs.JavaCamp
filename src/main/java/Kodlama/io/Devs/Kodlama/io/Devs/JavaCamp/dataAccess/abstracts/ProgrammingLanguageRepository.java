package Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.entities.concretes.ProgrammingLanguage;


public interface ProgrammingLanguageRepository {

	List<ProgrammingLanguage> getAll();
	void add();
	void update();
	void delete();
	void add(ProgrammingLanguage programmingLanguage);
	
}
