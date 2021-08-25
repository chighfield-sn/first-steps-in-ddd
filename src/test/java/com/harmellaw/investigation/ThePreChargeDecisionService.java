package com.harmellaw.investigation;

import com.harmellaw.PNCId;
import com.harmellaw.investigation.*;
import com.harmellaw.preparation.CriminalCase;
import com.harmellaw.preparation.Defendant;
import com.harmellaw.preparation.PoliceCaseFile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThePreChargeDecisionService {

    private PreChargeDecisionService preChargeDecisionService;
    private PNCId pncId;
    private Suspect suspect;
    private PoliceInvestigation policeInvestigation;

    @BeforeEach
    public void  setUp() {
        preChargeDecisionService = new PreChargeDecisionService();
        pncId = new PNCId("AN-ID");
        suspect = new Suspect(CriminalOffence.CUTTING_AWAY_BUOYS_ETC);
        policeInvestigation = new PoliceInvestigation(pncId, suspect);
    }


    @Test
    public void shouldCreateAPCDCaseWhenReceivingAPCDRequest() {
        PCDCase pcdCase = preChargeDecisionService.receiveRequestForPreChargeDecision(policeInvestigation);

        assertEquals(policeInvestigation.pncId, pcdCase.pncId);
        assertEquals(policeInvestigation.suspects, pcdCase.suspects);
    }

    @Test
    public void shouldCreateACriminalCaseWhenAPoliceCaseFileIsAccepted() {
        Defendant defendant = new Defendant();
        PoliceCaseFile policeCaseFile = new PoliceCaseFile(pncId, defendant);

        CriminalCase criminalCase = preChargeDecisionService.acceptCaseFile(policeCaseFile);

        assertEquals(pncId, criminalCase.pncId);
        assertEquals(policeCaseFile.defendants, criminalCase.defendants);
    }

}
