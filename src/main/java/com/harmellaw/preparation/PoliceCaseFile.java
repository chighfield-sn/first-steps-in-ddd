package com.harmellaw.preparation;

import com.harmellaw.PNCId;

import java.util.HashSet;
import java.util.Set;

public class PoliceCaseFile {

    public Set<Defendant> defendants = new HashSet<>();
    public PNCId pncId;

    public PoliceCaseFile(PNCId pncId, Defendant defendant) {
        defendants.add(defendant);
        this.pncId = pncId;
    }
}
