package Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.entities.concretes.ProgrammingLanguage;


public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer>{

}
