package com.demo.springboot.translation.common.domain;

import java.util.ArrayList;
import java.util.List;

public class RteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RteExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRteidIsNull() {
            addCriterion("rteId is null");
            return (Criteria) this;
        }

        public Criteria andRteidIsNotNull() {
            addCriterion("rteId is not null");
            return (Criteria) this;
        }

        public Criteria andRteidEqualTo(Integer value) {
            addCriterion("rteId =", value, "rteid");
            return (Criteria) this;
        }

        public Criteria andRteidNotEqualTo(Integer value) {
            addCriterion("rteId <>", value, "rteid");
            return (Criteria) this;
        }

        public Criteria andRteidGreaterThan(Integer value) {
            addCriterion("rteId >", value, "rteid");
            return (Criteria) this;
        }

        public Criteria andRteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rteId >=", value, "rteid");
            return (Criteria) this;
        }

        public Criteria andRteidLessThan(Integer value) {
            addCriterion("rteId <", value, "rteid");
            return (Criteria) this;
        }

        public Criteria andRteidLessThanOrEqualTo(Integer value) {
            addCriterion("rteId <=", value, "rteid");
            return (Criteria) this;
        }

        public Criteria andRteidIn(List<Integer> values) {
            addCriterion("rteId in", values, "rteid");
            return (Criteria) this;
        }

        public Criteria andRteidNotIn(List<Integer> values) {
            addCriterion("rteId not in", values, "rteid");
            return (Criteria) this;
        }

        public Criteria andRteidBetween(Integer value1, Integer value2) {
            addCriterion("rteId between", value1, value2, "rteid");
            return (Criteria) this;
        }

        public Criteria andRteidNotBetween(Integer value1, Integer value2) {
            addCriterion("rteId not between", value1, value2, "rteid");
            return (Criteria) this;
        }

        public RteExample.Criteria andRteWordEqualTo(String value) {
            addCriterion("RWord =", value, "RWord");
            return (RteExample.Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}