package com.symbol.birdnote.repository;

import com.symbol.birdnote.entity.Bird;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidRepository extends JpaRepository<Bird, Long> {
}
