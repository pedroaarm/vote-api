package com.vote.vote.service.voter.impl;

import com.vote.vote.service.voter.VoterService;
import org.springframework.stereotype.Service;

@Service
public class VoterServiceImpl implements VoterService {



    @Override
    public void newVoter(com.vote.vote.model.voter.Voter voter) {
        System.err.println(voter.getDocumentNumber());
    }
}
