package com.harmellaw.preparation;

import com.harmellaw.Case;
import com.harmellaw.PNCId;
import com.harmellaw.preparation.Defendant;

import java.util.Set;

public class CriminalCase extends Case {

    public Set<Defendant> defendants;

    public CriminalCase(PNCId pncId, Set<Defendant> defendants) {
        super(pncId);
        this.defendants = defendants;
    }

}
