package com.api.bigthree.repository;

import com.api.bigthree.models.TennisPlayer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TennisPlayerRepository extends JpaRepository<TennisPlayer, Integer> {
}
