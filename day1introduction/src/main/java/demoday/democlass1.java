package demoday;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class democlass1 {
@GetMapping("/hi")
@ResponseBody
public String hi()
{
	return "Welcome to all";
}
}
