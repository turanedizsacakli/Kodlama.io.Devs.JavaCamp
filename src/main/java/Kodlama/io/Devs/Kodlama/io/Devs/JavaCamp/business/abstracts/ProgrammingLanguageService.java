package Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.requests.programmingLanguageRequests.CraeteProgrammingLanguageRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.requests.programmingLanguageRequests.DeleteProgrammingLanguageRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.requests.programmingLanguageRequests.UpdateProgrammingLanguageRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.responses.programmingLanguageResponses.GetAllProgrammingLanguageResponse;
import Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.responses.programmingLanguageResponses.GetByIdProgrammingLanguageResponse;

public interface ProgrammingLanguageService {

	List<GetAllProgrammingLanguageResponse> getAll();
	void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);
	void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest);
	void add(CraeteProgrammingLanguageRequest craeteProgrammingLanguageRequest );
	GetByIdProgrammingLanguageResponse getById(int id);
}
