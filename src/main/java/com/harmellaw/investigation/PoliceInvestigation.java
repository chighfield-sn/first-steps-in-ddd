package com.harmellaw.investigation;

import com.harmellaw.PNCId;

import java.util.HashSet;
import java.util.Set;

public class PoliceInvestigation {

    public final PNCId pncId;
    public final Set<Suspect> suspects = new HashSet<>();

    public PoliceInvestigation(PNCId pncId, Suspect suspect) {
        if (pncId == null) throw new IllegalArgumentException("You must provide a PNC Id");
        if (suspect == null) throw new IllegalArgumentException("You must provide a suspect");

        this.pncId = pncId;
        this.suspects.add(suspect);
    }

}
