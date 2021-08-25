package com.harmellaw.preparation;

import com.harmellaw.PNCId;

import java.util.HashSet;
import java.util.Set;

public class PoliceCaseFile {

    public final Set<Defendant> defendants = new HashSet<>();
    public final PNCId pncId;

    public PoliceCaseFile(PNCId pncId, Defendant defendant) {
        defendants.add(defendant);
        this.pncId = pncId;
    }
}
