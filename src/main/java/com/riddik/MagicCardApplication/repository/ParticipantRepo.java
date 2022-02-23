package com.riddik.MagicCardApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.riddik.MagicCardApplication.entity.Participant;

@Repository
public interface ParticipantRepo extends JpaRepository<Participant, Integer> {
	
	@Query("SELECT p from Participant p where p.age=:age")//write the querry for getting participants with age
	List<Participant> findAllWithAge(@Param("age") int age);

}
