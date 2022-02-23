package com.riddik.MagicCardApplication.service;

import java.util.List;

import com.riddik.MagicCardApplication.entity.Participant;

public interface ParticipantService {
	
	List<Participant> getListOfParticipant(int age);
	
	Participant addParticipant(Participant participant);

	List<Participant> getAllParticipants();
	
	Participant findParticipantById(int id);
	
	String deleteParticipant(int id);
	
	Participant upadteParticipant(Participant participant, int id);
	
	

}
