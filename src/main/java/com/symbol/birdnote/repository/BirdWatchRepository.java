package com.symbol.birdnote.repository;

import com.symbol.birdnote.entity.BirdWatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BirdWatchRepository extends JpaRepository<BirdWatch, Long> {
}
