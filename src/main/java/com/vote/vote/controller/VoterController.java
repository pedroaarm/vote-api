package com.vote.vote.controller;

import com.vote.vote.model.voter.Voter;
import com.vote.vote.service.voter.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/voter")
public class VoterController {

    @Autowired
    private VoterService voterService;

    @PostMapping
    public static void newVoter(@RequestBody Voter voter){
        voterService.newVoter(voter);
    }

}
