package com.sridhar.factorapps.controller;

import com.sridhar.factorapps.model.Player;
import com.sridhar.factorapps.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

/**
 * Created by sridhar on 26/6/21
 */
@RestController
public class PlayerController {
    @Autowired
    PlayerRepository playerRepository;

    public Player getPlayerDetails(String name){
            Player player=playerRepository.findPlayerByName(name);
            return player;
    }
}
