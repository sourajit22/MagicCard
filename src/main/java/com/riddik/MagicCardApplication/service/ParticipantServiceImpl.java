package com.riddik.MagicCardApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riddik.MagicCardApplication.entity.Participant;
import com.riddik.MagicCardApplication.repository.CardRepository;
import com.riddik.MagicCardApplication.repository.ParticipantRepo;

@Service
public class ParticipantServiceImpl implements ParticipantService {
	
	@Autowired
	private ParticipantRepo repo1;
	
	@Autowired
	private CardRepository repo2;

	@Override
	public List<Participant> getListOfParticipant(int age) {
		return repo1.findAllWithAge(age);
	}

	@Override
	public Participant addParticipant(Participant participant) {
		return repo1.save(participant);
	}

	@Override
	public List<Participant> getAllParticipants() {
		return repo1.findAll();
	}

	@Override
	public Participant findParticipantById(int id) {
		return repo1.findById(id).get();
	}

	@Override
	public String deleteParticipant(int id) {
		repo1.deleteById(id);
		return "Delete Successfull with id" + id;
	}

	@Override
	public Participant upadteParticipant(Participant participant, int id) {
		Participant exsistingParticipant = repo1.findById(id).orElse(null);
		exsistingParticipant.setName(participant.getName());
		exsistingParticipant.setAge(participant.getAge());
		exsistingParticipant.setMailId(participant.getMailId());
		exsistingParticipant.setContactNo(participant.getContactNo());
		exsistingParticipant.setCard(participant.getCard());
		return repo1.save(exsistingParticipant);
	}

	

}
