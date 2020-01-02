package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pessoa;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/teste")
public class TestController {
	
	@RequestMapping("/")
    public String index() {
        return "Teste success Spring boot!";
    }
	
	@ApiOperation("Retorna lista de pessoas")
	@RequestMapping(value = "/pessoa")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
							@ApiResponse(code = 400, message = "Bad Request"),
							 @ApiResponse(code = 500, message = "Failure")
	           			  }) 
	public List<Pessoa> getPessoa(){
		List<Pessoa> pessoas= new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Pedro", "Henrique"));
		pessoas.add(new Pessoa("Felipe", "Marquez"));
		
		return pessoas;
	}
}
