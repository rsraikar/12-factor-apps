package com.sridhar.factorapps.repository;


import com.sridhar.factorapps.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sridhar on 26/6/21
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer> {
        Player findPlayerByName(String name);

        Player findPlayerById(Integer id);
}
