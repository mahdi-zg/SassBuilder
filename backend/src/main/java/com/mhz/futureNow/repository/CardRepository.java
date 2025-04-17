package com.mhz.futureNow.repository;

import com.mhz.futureNow.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
    List<Card> findByProjectId(Long projectId);
}
