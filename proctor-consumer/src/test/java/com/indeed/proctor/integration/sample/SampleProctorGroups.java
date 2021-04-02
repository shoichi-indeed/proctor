package com.indeed.proctor.integration.sample;

import com.indeed.proctor.common.ProctorResult;
import com.indeed.proctor.consumer.AbstractGroups;
import com.indeed.proctor.consumer.logging.TestUsageObserver;

/**
 * Simulate autogenerated class
 */
public class SampleProctorGroups extends AbstractGroups {

    public static final String SAMPLE_1_TST = "sample1_tst";
    public static final String DYNAMIC_INCLUDE_TST = "dynamic_include_tst";
    public static final String UNUSED_TST = "unused_tst";

    /**
     * Setup fields based on eagerly computed bucket allocations in ProctorResult.
     */
    protected SampleProctorGroups(final ProctorResult proctorResult, final TestUsageObserver observer) {
        super(proctorResult, observer);
    }

    public boolean isSample1_tstInactive() {
        return isBucketActive(SAMPLE_1_TST, -1, 0);
    }

    public boolean isSample1_tstControl() {
        return isBucketActive(SAMPLE_1_TST, 0, 0);
    }

    public int getSample1_tstValue() {
        return getValue(SAMPLE_1_TST, -1);
    }
}
