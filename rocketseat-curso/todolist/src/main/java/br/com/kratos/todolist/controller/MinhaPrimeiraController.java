package br.com.kratos.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
// http://localhost:8080/primeiraRota
public class MinhaPrimeiraController {

	/*
	* Metodos de acessos do HTTP
	GET - Buscar uma informação
	* POST - Adicionar um dado/informação
	* DELETE - Remover um dado
	* PUT - Alterar um dado/info
	* PATCH - Alterar somente uma parte da informação/dado
	* */

   //Metodo (Funcionalidade) de uma classe
	@GetMapping("/primeiroMetodo")
	public String primeiraMensagem(){
		return "Funcionou";
	}

}
