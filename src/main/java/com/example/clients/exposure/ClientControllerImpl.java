package com.example.clients.exposure;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clients.business.ClientBusiness;
import com.example.clients.business.dtos.ClientDtoInt;
import com.example.clients.exposure.dtos.ClientDto;

@RestController
@RequestMapping(path="/ramosvji/api/clients")
public class ClientControllerImpl implements ClientController {
	
	@Autowired
	private ClientBusiness business;
	
	private ModelMapper mapper = new ModelMapper();

	@Override
	@PostMapping(path="/v01/clients")
	public ResponseEntity<ClientDto> save(final @RequestBody ClientDto request) {
		
		ClientDto clientDto = null;	
		HttpStatus httpStatus  = HttpStatus.INTERNAL_SERVER_ERROR;
		
		ClientDtoInt clientDtoInt = mapper.map(request, ClientDtoInt.class);		
		ClientDtoInt response = business.save(clientDtoInt);
		
		if(response != null) {
			httpStatus = HttpStatus.CREATED;
			clientDto = mapper.map(response, ClientDto.class);
		}
		
		return new ResponseEntity<ClientDto>(clientDto, new HttpHeaders(), httpStatus);
	}

	@Override
	@GetMapping(path="/v01/clients/{id}")
	public ResponseEntity<ClientDto> get(final @PathVariable String id) {
		System.out.println("get");
		ClientDto clientDto = null;
		HttpStatus httpStatus  = HttpStatus.BAD_REQUEST;
		
		if(id != null) {
			httpStatus = HttpStatus.NOT_FOUND;
			ClientDtoInt response = business.find(id);
			
			if(response != null) {
				httpStatus = HttpStatus.OK;
				clientDto = mapper.map(response, ClientDto.class);
			}	
			
		}
		
		return new ResponseEntity<ClientDto>(clientDto, new HttpHeaders(), httpStatus);
	}

	@Override
	@PutMapping(path="/v01/clients/{id}")
	public ResponseEntity<ClientDto> update(final @RequestBody ClientDto request,
			final @PathVariable String id) {
		ClientDto clientDto = null;
		HttpStatus httpStatus  = HttpStatus.BAD_REQUEST;
		
		if(id != null) {
			httpStatus = HttpStatus.NOT_FOUND;
			ClientDtoInt clientDtoInt = mapper.map(request, ClientDtoInt.class);	
			ClientDtoInt response = business.update(clientDtoInt, id);
			
			if(response != null) {
				httpStatus = HttpStatus.OK;
				clientDto = mapper.map(response, ClientDto.class);
			}		
			
		}
		
		return new ResponseEntity<ClientDto>(clientDto, new HttpHeaders(), httpStatus);
	}

	@Override
	@DeleteMapping(path="/v01/clients/{id}")
	public ResponseEntity<Void> delete(final @PathVariable String id) {
		HttpStatus httpStatus  = HttpStatus.BAD_REQUEST;
		
		if(id != null) {
			httpStatus = HttpStatus.OK;
			business.delete(id);
		}
		
		return new ResponseEntity<Void>(new HttpHeaders(), httpStatus);
	}

}
