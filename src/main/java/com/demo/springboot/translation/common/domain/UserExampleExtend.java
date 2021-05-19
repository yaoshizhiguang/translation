package com.demo.springboot.translation.common.domain;

public class UserExampleExtend extends UserExample.Criteria{
    public UserExample.Criteria andPassEqualTo(String value) {
        addCriterion("password =", value, "password");
        return (UserExample.Criteria) this;
    }
}
