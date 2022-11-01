package Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.entities.concretes.ProgrammingLanguage;


public interface ProgrammingLanguageRepository {

	List<ProgrammingLanguage> getAll();
	void update(ProgrammingLanguage programmingLanguage);
	void delete(int id);
	void add(ProgrammingLanguage programmingLanguage);
	ProgrammingLanguage getById(int id);
}
