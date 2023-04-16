package co.develhope.firstapi3.controllers;

import co.develhope.firstapi3.services.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
	@Autowired
	StringService stringService;

	@GetMapping("/strings")
	public String getMapping(@RequestParam String str1, @RequestParam(required = false) String str2) {
		return stringService.returnString(str1, str2);
	}
}