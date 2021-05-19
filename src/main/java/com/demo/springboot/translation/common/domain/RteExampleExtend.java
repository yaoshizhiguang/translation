package com.demo.springboot.translation.common.domain;

public class RteExampleExtend extends RteExample.Criteria{
    public RteExample.Criteria andRteWordEqualTo(String value) {
        addCriterion("RWord =", value, "RWord");
        return (RteExample.Criteria) this;
    }
}
