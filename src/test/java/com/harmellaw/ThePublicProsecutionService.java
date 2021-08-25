package com.harmellaw;

import com.harmellaw.investigation.CriminalOffence;
import com.harmellaw.investigation.PCDCase;
import com.harmellaw.investigation.PoliceInvestigation;
import com.harmellaw.investigation.Suspect;
import com.harmellaw.preparation.CriminalCase;
import com.harmellaw.preparation.Defendant;
import com.harmellaw.preparation.PoliceCaseFile;
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
    public void shouldCreateAPCDCaseWhenReceivingAPCDRequest() {
        PCDCase pcdCase = publicProsecutionService.receiveRequestForPreChargeDecision(policeInvestigation);

        assertEquals(policeInvestigation.getPncId(), pcdCase.pncId);
        assertEquals(policeInvestigation.getSuspects(), pcdCase.suspects);
    }

    @Test
    public void shouldCreateACriminalCaseWhenAPoliceCaseFileIsAccepted() {
        Defendant defendant = new Defendant();
        PoliceCaseFile policeCaseFile = new PoliceCaseFile(pncId, defendant);

        CriminalCase criminalCase = publicProsecutionService.acceptCaseFile(policeCaseFile);

        assertEquals(pncId, criminalCase.pncId);
        assertEquals(policeCaseFile.defendants, criminalCase.defendants);
    }

}
