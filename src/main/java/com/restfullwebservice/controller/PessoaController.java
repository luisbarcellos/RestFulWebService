package com.restfullwebservice.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restfullwebservice.entity.Pessoa;

@RestController("/")
public class PessoaController {
	@RequestMapping("/listaPessoas")
	public List<Pessoa> listarPessoas(){
		ObjectMapper mapeador = new ObjectMapper();
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		try {
			listaPessoas= mapeador.readValue(new File("C:\\Users\\luisb\\Desktop\\Pessoa.json"), ArrayList.class);
		} catch (JsonParseException e) {
			System.out.println("Erro ao converter o arquivo!\n");
			e.printStackTrace();
		} catch (JsonMappingException e) {
			System.out.println("Erro ao mapear o arquivo!\n");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listaPessoas;
	}
}
