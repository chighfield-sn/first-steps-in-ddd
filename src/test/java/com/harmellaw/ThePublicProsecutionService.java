package com.harmellaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThePublicProsecutionService {

    private PublicProsecutionService publicProsecutionService;
    private PNCId pncId;
    private Suspect suspect;
    private PoliceInvestigation policeInvestigation;

    @BeforeEach
    public void  setUp() {
        publicProsecutionService = new PublicProsecutionService();
        pncId = new PNCId("AN-ID");
        suspect = new Suspect(CriminalOffence.CUTTING_AWAY_BUOYS_ETC);
        policeInvestigation = new PoliceInvestigation(pncId, suspect);
    }


    @Test
    public void shouldCreateACaseWhenReceivingAPCDRequest() {
        CriminalCase criminalCase = publicProsecutionService.receiveRequestForPreChargeDecision(policeInvestigation);

        assertEquals(pncId, criminalCase.pncId);
        assertEquals(policeInvestigation.suspects, criminalCase.suspects);
    }

}
