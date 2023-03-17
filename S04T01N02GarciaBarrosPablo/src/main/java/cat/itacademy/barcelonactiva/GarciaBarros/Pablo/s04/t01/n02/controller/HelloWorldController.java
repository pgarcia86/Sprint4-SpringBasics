package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t01.n02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@GetMapping("/HelloWorld")
	public String saluda(@RequestParam(name="name", required=false, defaultValue="UNKNOWN") String name, Model model) {
		model.addAttribute("name", name);
		return "saludo";
	}
	
	@GetMapping(value = "/HelloWorld2/{name}")
	public String saluda2(@PathVariable String name, Model model) {
		model.addAttribute("name", name);
		return "saludo2";
	}

}
