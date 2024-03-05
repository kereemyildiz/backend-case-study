package com.dreamgames.casestudy.demo.controller;

import com.dreamgames.casestudy.demo.exceptions.UserAlreadyInTournamentException;
import com.dreamgames.casestudy.demo.service.ITournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tournament")
public class TournamentController {

    @Autowired
    private ITournamentService tournamentService;

    @PostMapping("/join/{userId}")
    public ResponseEntity<Object> enterTournament(@PathVariable Long userId) {

            tournamentService.enterTournament(userId);
            return new ResponseEntity<Object>("as", HttpStatus.OK);


        }
        // check user exists
        // check user already joined
        // check user claimed
        // check if tournament time



    @PostMapping("/claim-rewards/{userId}")
    public ResponseEntity<Object> claimRewards(@PathVariable Long userId) {
        return null;
    }


}
