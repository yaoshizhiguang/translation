package com.demo.springboot.translation.common.domain;

public class PteExampleExtend extends PteExample.Criteria{
    public PteExample.Criteria andPteWordEqualTo(String value) {
        addCriterion("PWord =", value, "PWord");
        return (PteExample.Criteria) this;
    }
}
