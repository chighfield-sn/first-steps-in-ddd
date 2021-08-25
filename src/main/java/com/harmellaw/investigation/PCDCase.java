package com.harmellaw.investigation;

import com.harmellaw.Case;
import com.harmellaw.PNCId;
import com.harmellaw.investigation.Suspect;

import java.util.Set;

public class PCDCase extends Case {

    public Set<Suspect> suspects;

    public PCDCase(PNCId pncId, Set<Suspect> suspects) {
        super(pncId);
        this.suspects = suspects;
    }

}
