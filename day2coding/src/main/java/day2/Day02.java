package day2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Day02 {
	public String name="Iamneo";
	@GetMapping("/setName")
	public String getName()
	{
		return "Welcome "+name;
	}

}
