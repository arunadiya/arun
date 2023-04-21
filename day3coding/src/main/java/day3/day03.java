package day3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class day03 {
public String car;
@GetMapping("/Mycar")
@ResponseBody
public String displayCar()
 {
	return "My fav car "+car;
 }
}
