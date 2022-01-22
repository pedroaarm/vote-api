package com.vote.vote.model.voter;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Builder
public class Voter {

    @Id
    @NonNull
    private Long documentNumber;
    private String name;
    private AddressVoter address;
    private PersonalInformationVoter personalInformation;

}
