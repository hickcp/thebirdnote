package com.symbol.birdnote.repository;

import com.symbol.birdnote.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
