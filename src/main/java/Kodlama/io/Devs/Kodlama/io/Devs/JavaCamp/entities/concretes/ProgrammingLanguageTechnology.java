package Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.entities.concretes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.entities.abstracts.EntityRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="programmingLanguageTechnologies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProgrammingLanguageTechnology implements EntityRepository{

	private int programmingLanguageId;
	
	@ManyToOne
	@JoinColumn(name="programming_language_id")
	private ProgrammingLanguage programmingLanguage;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="technologyName")
	private String technologyName;
	
}




