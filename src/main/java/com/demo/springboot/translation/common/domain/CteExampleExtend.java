package com.demo.springboot.translation.common.domain;

public class CteExampleExtend extends CteExample.Criteria {
    public CteExample.Criteria andCteWordEqualTo(String value) {
        addCriterion("cWord =", value, "cWord");
        return (CteExample.Criteria) this;
    }
}
