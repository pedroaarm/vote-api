package com.vote.vote.model.voter;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Builder
public class ContactVoter {

    @Id
    private Long idVoter;
    private String phoneNumber;

}
