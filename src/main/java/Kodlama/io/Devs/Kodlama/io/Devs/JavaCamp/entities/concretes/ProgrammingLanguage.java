package Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.entities.abstracts.EntityRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="programmingLanguages")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProgrammingLanguage implements EntityRepository{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="programmingName")
	private String programmingName;


//	@OneToMany(mappedBy = "programmingLanguage")
//	private List<ProgrammingLanguageTechnology> programmingLanguageTechnologies;
}
