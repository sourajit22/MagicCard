package com.riddik.MagicCardApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riddik.MagicCardApplication.entity.Card;

public interface CardRepository extends JpaRepository<Card, Integer> {

}
