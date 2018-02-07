package br.com.api.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.dto.EmpresaDto;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {
	
	@PostMapping
	public ResponseEntity<EmpresaDto> cadastra(@RequestBody EmpresaDto empresaDto){
		
		empresaDto.setId(1l);
		
		return ResponseEntity.ok(empresaDto);
		
	}
	
	@GetMapping(value="/{nome}")
	public String exemplo(@PathVariable String nome) {
		
		return "Olá " + nome;
	}

}
