package com.vote.vote.model.voter;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AddressVoter {

    private String idVoter;
    private String street;
    private Long number;
    private String postalCode;
    private String city;
    private String state;
    private String coutry;
}
