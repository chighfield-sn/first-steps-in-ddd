package com.harmellaw.investigation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class APreChargeDecision {

    private Suspect suspect;
    private PreChargeDecision preChargeDecision;
    private OffenceAdvice offenceAdvice;

    @BeforeEach
    public void setup() {
        suspect = new Suspect(CriminalOffence.CUTTING_AWAY_BUOYS_ETC);
        preChargeDecision = new PreChargeDecision();
        offenceAdvice = new OffenceAdvice();
    }

    //@Disabled("So the CI build stays green.  Remove this to get coding.")
    @Test
    public void shouldRecordAlternativeOffenceAdviceAgainstSuspects() {
        preChargeDecision.recordAlternativeOffenceAdvice(suspect, offenceAdvice);
        assertEquals(offenceAdvice, preChargeDecision.getOffenceAdviceFor(suspect));
    }

}
