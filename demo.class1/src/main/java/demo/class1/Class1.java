package demo.class1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Class1 {
	@GetMapping("/hi")
	@ResponseBody
	public String Data() {
		return"Hi Aruna";
	}

}
