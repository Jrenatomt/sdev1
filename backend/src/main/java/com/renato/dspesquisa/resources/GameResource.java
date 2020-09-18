package com.renato.dspesquisa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renato.dspesquisa.dto.GameDTO;
import com.renato.dspesquisa.services.GameService;

@RestController
@RequestMapping(value ="/games")
public class GameResource {
	
	@Autowired
	private GameService service;
	
	@GetMapping
	public ResponseEntity<List<GameDTO>> findAll(){
		List<GameDTO> games = service.findAll();
		return ResponseEntity.ok().body(games); 
	}

}
