package Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.requests.programmingLanguageTechnologyRequests.CreateProgrammingLanguageTechnologyRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.requests.programmingLanguageTechnologyRequests.DeleteProgrammingLanguageTechnologyRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.requests.programmingLanguageTechnologyRequests.UpdateProgrammingLanguageTechnologyRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.responses.programmingLanguageTechnologyResponses.GetAllProgrammingLanguageTechnologyResponse;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.responses.programmingLanguageTechnologyResponses.GetByIdProgrammingLanguageTechnologyResponse;

public interface ProgrammingLanguageTechnologyService {

	List<GetAllProgrammingLanguageTechnologyResponse> getAll();
	void update(UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguageTechnologyRequest);
	//void delete(DeleteProgrammingLanguageTechnologyRequest deleteProgrammingLanguageTechnologyRequest);
	void add(CreateProgrammingLanguageTechnologyRequest craeteProgrammingLanguageTechnologyRequest );
	GetByIdProgrammingLanguageTechnologyResponse getById(int id);
}
