package Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@Column(name="programmingLanguageId")
	private int programmingLanguageId;
	
	@Column(name="programmingLanguageName")
	private String programmingLanguageName;

	@JsonIgnore
	//@OneToMany(mappedBy = "programmingLanguage")
	@OneToMany(mappedBy="programmingLanguage", cascade = CascadeType.DETACH)
	private List<ProgrammingLanguageTechnology> programmingLanguageTechnologies;
}
