package com.demo.springboot.translation.common.domain;

public class EtrExampleExtend extends EtrExample.Criteria {
    public EtrExample.Criteria andEtrWordEqualTo(String value) {
        addCriterion("eWord =", value, "eWord");
        return (EtrExample.Criteria) this;
    }
}
