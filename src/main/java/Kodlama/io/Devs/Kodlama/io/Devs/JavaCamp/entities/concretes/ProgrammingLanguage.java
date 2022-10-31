package Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.entities.concretes;

import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.entities.abstracts.EntityRepository;

public class ProgrammingLanguage implements EntityRepository{
	
	private int id;
	private String programmingName;
	
	public ProgrammingLanguage() {
		
	}

	public ProgrammingLanguage(int id, String programmingName) {
		
		this.id = id;
		this.programmingName = programmingName;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProgrammingName() {
		return programmingName;
	}

	public void setProgrammingName(String programmingName) {
		this.programmingName = programmingName;
	}

	
	
	

}
