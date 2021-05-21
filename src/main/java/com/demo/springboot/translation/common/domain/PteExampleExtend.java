package com.demo.springboot.translation.common.domain;

public class PteExampleExtend extends PteExample.Criteria{
    public PteExample.Criteria andPteWordEqualTo(String value) {
        addCriterion("pWord =", value, "pWord");
        return (PteExample.Criteria) this;
    }
}
