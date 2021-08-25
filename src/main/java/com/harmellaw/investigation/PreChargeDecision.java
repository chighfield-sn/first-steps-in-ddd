package com.harmellaw.investigation;

import java.util.HashMap;
import java.util.Map;

public class PreChargeDecision {

    private final Map<Suspect, OffenceAdvice> offenceAdvice = new HashMap<>();

    public void recordAlternativeOffenceAdvice(Suspect suspect, OffenceAdvice offenceAdvice) {
        this.offenceAdvice.put(suspect, offenceAdvice);
    }

    public Object getOffenceAdviceFor(Suspect suspect) {
        return offenceAdvice.get(suspect);
    }
}
