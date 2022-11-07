package Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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

@Table(name="programminglanguagetechnologies")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProgrammingLanguageTechnology implements EntityRepository{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="technologyId")
	private int technologyId;
	
	@Column(name="technologyName")
	private String technologyName;
	
	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name="programmingLanguageId")
	private ProgrammingLanguage programmingLanguage;
}




