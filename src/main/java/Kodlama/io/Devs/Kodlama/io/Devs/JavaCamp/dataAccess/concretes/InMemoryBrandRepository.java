//package Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.dataAccess.concretes;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Repository;
//
//import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.dataAccess.abstracts.ProgrammingLanguageRepository;
//import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.entities.concretes.ProgrammingLanguage;
//
//@Repository
//public class InMemoryBrandRepository implements ProgrammingLanguageRepository {
//
//	List<ProgrammingLanguage> _programmingLanguages;
//	
//	public InMemoryBrandRepository() {
//		_programmingLanguages=new ArrayList<ProgrammingLanguage>();
//		_programmingLanguages.add(new ProgrammingLanguage( 1, "python"));
//		_programmingLanguages.add(new ProgrammingLanguage( 2, "C#"));
//		_programmingLanguages.add(new ProgrammingLanguage( 3, "java"));
//	}
//
//	
//	@Override
//	public List<ProgrammingLanguage> getAll() {
//		
//		return _programmingLanguages;
//	}
//
//	@Override
//	public void add(ProgrammingLanguage programmingLanguage) {
//		
//		_programmingLanguages.add(programmingLanguage);
//
//	}
//
//	@Override
//	public void update(ProgrammingLanguage programmingLanguage) {
//		
//		for (ProgrammingLanguage _programmingLanguage : _programmingLanguages) {
//			if (_programmingLanguage.getId() == programmingLanguage.getId()) {
//					_programmingLanguage.setProgrammingName(programmingLanguage.getProgrammingName());
//				}
//		}
//	}
//
//	@Override
//	public void delete(int id) {
//		_programmingLanguages.remove(getById(id));
//		
//	}
//
//
//	@Override
//	public ProgrammingLanguage getById(int id) {
//		for (ProgrammingLanguage programmingLanguage : _programmingLanguages) {
//				if (programmingLanguage.getId() == id) {
//						return programmingLanguage;
//					}
//			}
//		return null;
//	}
//	
//}
