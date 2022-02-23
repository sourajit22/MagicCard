package com.riddik.MagicCardApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riddik.MagicCardApplication.entity.Participant;
import com.riddik.MagicCardApplication.service.ParticipantService;

@RestController
@RequestMapping("/api")
public class ParticipantController {
	
	@Autowired
	private ParticipantService service;
	
	// add a participant
	@PostMapping
	public Participant addAparticipant(@RequestBody Participant participant) {
		return service.addParticipant(participant);
	}
	
	//get all participant with given age
	@GetMapping("/{age}")
	public List<Participant> getParticipantByAge(@PathVariable(value = "age") int age) {
		
		return service.getListOfParticipant(age);
		
	}
	
	//get all participants
	@GetMapping
	public List<Participant> getAllParticipants(){
		return service.getAllParticipants();
	}
	
	
	//get a participant by id
	@GetMapping("/find/{id}")
	public Participant getParticipantById(@PathVariable("id") int id) {
		return service.findParticipantById(id);
	}
	
	//update a participant
	@PutMapping("/update/{id}")
	public Participant updateParticipant(@RequestBody Participant participant, @PathVariable int id) {
		return service.upadteParticipant(participant, id);
	}
	
	//delete a participant
	@DeleteMapping("/delete/{id}")
	public String deleteParticipant(@PathVariable int id) {
		return service.deleteParticipant(id);
	}

}
