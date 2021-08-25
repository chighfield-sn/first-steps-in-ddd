package com.harmellaw;

import com.harmellaw.investigation.PCDCase;
import com.harmellaw.investigation.PoliceInvestigation;
import com.harmellaw.preparation.CriminalCase;
import com.harmellaw.preparation.PoliceCaseFile;

public class PublicProsecutionService {

    public PCDCase receiveRequestForPreChargeDecision(PoliceInvestigation policeInvestigation) {
        return new PCDCase(policeInvestigation.getPncId(), policeInvestigation.getSuspects());
    }

    public CriminalCase acceptCaseFile(PoliceCaseFile policeCaseFile) {
        return new CriminalCase(policeCaseFile.pncId, policeCaseFile.defendants);
    }
}
