package Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.abstracts.ProgrammingLanguageTechnologyService;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.requests.programmingLanguageTechnologyRequests.CreateProgrammingLanguageTechnologyRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.requests.programmingLanguageTechnologyRequests.DeleteProgrammingLanguageTechnologyRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.requests.programmingLanguageTechnologyRequests.UpdateProgrammingLanguageTechnologyRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.responses.programmingLanguageTechnologyResponses.GetAllProgrammingLanguageTechnologyResponse;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.responses.programmingLanguageTechnologyResponses.GetByIdProgrammingLanguageTechnologyResponse;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.dataAccess.abstracts.ProgrammingLanguageTechnologyRepository;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.entities.concretes.ProgrammingLanguageTechnology;

@Service
public class ProgrammingLanguageTechnologyManager implements ProgrammingLanguageTechnologyService {

	private ProgrammingLanguageTechnologyRepository programmingLanguageTechnologyRepository;
	public ProgrammingLanguageTechnologyManager(
			ProgrammingLanguageTechnologyRepository programmingLanguageTechnologyRepository) {
		super();
		this.programmingLanguageTechnologyRepository = programmingLanguageTechnologyRepository;
	}
	
	ProgrammingLanguageTechnology _programmingLanguageTechnology=new ProgrammingLanguageTechnology();
	
	@Override
	public List<GetAllProgrammingLanguageTechnologyResponse> getAll() {
		
		List<ProgrammingLanguageTechnology> programmingLanguageTechnologies= programmingLanguageTechnologyRepository.findAll();
		List<GetAllProgrammingLanguageTechnologyResponse> programmingLanguageTechnologyResponse=new ArrayList<GetAllProgrammingLanguageTechnologyResponse>();
		for (ProgrammingLanguageTechnology programmingLanguageTechnology : programmingLanguageTechnologies) {
			GetAllProgrammingLanguageTechnologyResponse technologyResponseItem = new GetAllProgrammingLanguageTechnologyResponse() ;
			technologyResponseItem.setId(programmingLanguageTechnology.getTechnologyId());
			technologyResponseItem.setName(programmingLanguageTechnology.getTechnologyName());
		}
		return programmingLanguageTechnologyResponse;
	}

	@Override
	public void update(UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguageTechnologyRequest) {
		_programmingLanguageTechnology.setTechnologyId(updateProgrammingLanguageTechnologyRequest.getId());
		_programmingLanguageTechnology.setTechnologyName(updateProgrammingLanguageTechnologyRequest.getName());
		programmingLanguageTechnologyRepository.save(_programmingLanguageTechnology);
	}

//	@Override
//	public void delete(DeleteProgrammingLanguageTechnologyRequest deleteProgrammingLanguageTechnologyRequest) {
//		programmingLanguageTechnologyRepository.deleteById(deleteProgrammingLanguageTechnologyRequest.getId());
//		
//	}

	@Override
	public void add(CreateProgrammingLanguageTechnologyRequest craeteProgrammingLanguageTechnologyRequest) {
		var technologies = programmingLanguageTechnologyRepository.findAll();
		for (ProgrammingLanguageTechnology technology: technologies ) {
			if (craeteProgrammingLanguageTechnologyRequest.getName().equals(technology.getTechnologyName())) {
				System.out.println("Name cannot be same : " + craeteProgrammingLanguageTechnologyRequest.getName());
				return;
			}
		}
		if (craeteProgrammingLanguageTechnologyRequest.getName() == "" || craeteProgrammingLanguageTechnologyRequest.getName() == null) {
			System.out.println("You have to write a name...");
			return;
		}
		_programmingLanguageTechnology.setTechnologyName(craeteProgrammingLanguageTechnologyRequest.getName());
		programmingLanguageTechnologyRepository.save(_programmingLanguageTechnology);
	}

	@Override
	public GetByIdProgrammingLanguageTechnologyResponse getById(int id) {			
		_programmingLanguageTechnology=programmingLanguageTechnologyRepository.findById(id).get();
		GetByIdProgrammingLanguageTechnologyResponse getByIdProgrammingLanguageTechnologyResponse= new GetByIdProgrammingLanguageTechnologyResponse();
		getByIdProgrammingLanguageTechnologyResponse.setName(_programmingLanguageTechnology.getTechnologyName());
		return null;
	}

}
