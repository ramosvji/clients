package com.example.clients.exposure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clients.exposure.dtos.ClientDto;

@RestController
@RequestMapping(path="/ramosvji/api/clients")
public interface ClientController {
	
	@PostMapping(path="/v01/clients")
	public ResponseEntity<ClientDto> save(final @RequestBody ClientDto request);
	
	@GetMapping(path="/v01/clients/{id}")
	public ResponseEntity<ClientDto> get(final @PathVariable String id);
	
	@PutMapping(path="/v01/clients/{id}")
	public ResponseEntity<ClientDto> update(final @RequestBody ClientDto request,
			final @PathVariable String id); 
		
	@DeleteMapping(path="/v01/clients/{id}")
	public ResponseEntity<Void> delete(final  @PathVariable String id); 
}
