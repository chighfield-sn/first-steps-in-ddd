package com.harmellaw.investigation;

import com.harmellaw.investigation.PCDCase;
import com.harmellaw.investigation.PoliceInvestigation;
import com.harmellaw.preparation.CriminalCase;
import com.harmellaw.preparation.PoliceCaseFile;

public class PreChargeDecisionService {

    public PCDCase receiveRequestForPreChargeDecision(PoliceInvestigation policeInvestigation) {
        return new PCDCase(policeInvestigation.pncId, policeInvestigation.suspects);
    }

    public CriminalCase acceptCaseFile(PoliceCaseFile policeCaseFile) {
        return new CriminalCase(policeCaseFile.pncId, policeCaseFile.defendants);
    }
}
