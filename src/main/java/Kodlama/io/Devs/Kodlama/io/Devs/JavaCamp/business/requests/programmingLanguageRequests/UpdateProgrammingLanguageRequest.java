package Kodlama.io.Devs.Kodlama.io.Devs.JavaCamp.business.requests.programmingLanguageRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProgrammingLanguageRequest {
	
	private int id;

	private String name;
}
