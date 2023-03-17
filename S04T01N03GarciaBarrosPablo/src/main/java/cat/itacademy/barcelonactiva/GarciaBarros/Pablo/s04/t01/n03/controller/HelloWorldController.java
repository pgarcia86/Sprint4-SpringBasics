package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t01.n03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@GetMapping("/HelloWorld")
	public String saludo(@RequestParam(name = "name", required = false, defaultValue = "UNKNOWN") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping(value = "/HelloWorld2/{name}")
	public String saludo2(@PathVariable("name") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting2";
	}
}
