package com.example.demo.resources;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Procedimento;

@RestController
@RequestMapping(value = "/procedimento")
public class ProcedimentoResource {
	
	@PostMapping
	@CrossOrigin(origins = "http://localhost:4200")
	@ResponseStatus(HttpStatus.CREATED)
	public Procedimento insert (@RequestBody Procedimento p) {
		return p;
	}

}
