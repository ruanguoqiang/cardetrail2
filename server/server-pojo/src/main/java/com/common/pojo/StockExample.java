package com.common.pojo;

import java.util.ArrayList;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andStocknoIsNull() {
            addCriterion("StockNO is null");
            return (Criteria) this;
        }

        public Criteria andStocknoIsNotNull() {
            addCriterion("StockNO is not null");
            return (Criteria) this;
        }

        public Criteria andStocknoEqualTo(String value) {
            addCriterion("StockNO =", value, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoNotEqualTo(String value) {
            addCriterion("StockNO <>", value, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoGreaterThan(String value) {
            addCriterion("StockNO >", value, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoGreaterThanOrEqualTo(String value) {
            addCriterion("StockNO >=", value, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoLessThan(String value) {
            addCriterion("StockNO <", value, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoLessThanOrEqualTo(String value) {
            addCriterion("StockNO <=", value, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoLike(String value) {
            addCriterion("StockNO like", value, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoNotLike(String value) {
            addCriterion("StockNO not like", value, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoIn(List<String> values) {
            addCriterion("StockNO in", values, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoNotIn(List<String> values) {
            addCriterion("StockNO not in", values, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoBetween(String value1, String value2) {
            addCriterion("StockNO between", value1, value2, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoNotBetween(String value1, String value2) {
            addCriterion("StockNO not between", value1, value2, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknameIsNull() {
            addCriterion("StockName is null");
            return (Criteria) this;
        }

        public Criteria andStocknameIsNotNull() {
            addCriterion("StockName is not null");
            return (Criteria) this;
        }

        public Criteria andStocknameEqualTo(String value) {
            addCriterion("StockName =", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameNotEqualTo(String value) {
            addCriterion("StockName <>", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameGreaterThan(String value) {
            addCriterion("StockName >", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameGreaterThanOrEqualTo(String value) {
            addCriterion("StockName >=", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameLessThan(String value) {
            addCriterion("StockName <", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameLessThanOrEqualTo(String value) {
            addCriterion("StockName <=", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameLike(String value) {
            addCriterion("StockName like", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameNotLike(String value) {
            addCriterion("StockName not like", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameIn(List<String> values) {
            addCriterion("StockName in", values, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameNotIn(List<String> values) {
            addCriterion("StockName not in", values, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameBetween(String value1, String value2) {
            addCriterion("StockName between", value1, value2, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameNotBetween(String value1, String value2) {
            addCriterion("StockName not between", value1, value2, "stockname");
            return (Criteria) this;
        }

        public Criteria andGoodnoIsNull() {
            addCriterion("Goodno is null");
            return (Criteria) this;
        }

        public Criteria andGoodnoIsNotNull() {
            addCriterion("Goodno is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnoEqualTo(String value) {
            addCriterion("Goodno =", value, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoNotEqualTo(String value) {
            addCriterion("Goodno <>", value, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoGreaterThan(String value) {
            addCriterion("Goodno >", value, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoGreaterThanOrEqualTo(String value) {
            addCriterion("Goodno >=", value, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoLessThan(String value) {
            addCriterion("Goodno <", value, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoLessThanOrEqualTo(String value) {
            addCriterion("Goodno <=", value, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoLike(String value) {
            addCriterion("Goodno like", value, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoNotLike(String value) {
            addCriterion("Goodno not like", value, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoIn(List<String> values) {
            addCriterion("Goodno in", values, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoNotIn(List<String> values) {
            addCriterion("Goodno not in", values, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoBetween(String value1, String value2) {
            addCriterion("Goodno between", value1, value2, "goodno");
            return (Criteria) this;
        }

        public Criteria andGoodnoNotBetween(String value1, String value2) {
            addCriterion("Goodno not between", value1, value2, "goodno");
            return (Criteria) this;
        }

        public Criteria andStoragesnoIsNull() {
            addCriterion("StoragesNo is null");
            return (Criteria) this;
        }

        public Criteria andStoragesnoIsNotNull() {
            addCriterion("StoragesNo is not null");
            return (Criteria) this;
        }

        public Criteria andStoragesnoEqualTo(String value) {
            addCriterion("StoragesNo =", value, "storagesno");
            return (Criteria) this;
        }

        public Criteria andStoragesnoNotEqualTo(String value) {
            addCriterion("StoragesNo <>", value, "storagesno");
            return (Criteria) this;
        }

        public Criteria andStoragesnoGreaterThan(String value) {
            addCriterion("StoragesNo >", value, "storagesno");
            return (Criteria) this;
        }

        public Criteria andStoragesnoGreaterThanOrEqualTo(String value) {
            addCriterion("StoragesNo >=", value, "storagesno");
            return (Criteria) this;
        }

        public Criteria andStoragesnoLessThan(String value) {
            addCriterion("StoragesNo <", value, "storagesno");
            return (Criteria) this;
        }

        public Criteria andStoragesnoLessThanOrEqualTo(String value) {
            addCriterion("StoragesNo <=", value, "storagesno");
            return (Criteria) this;
        }

        public Criteria andStoragesnoLike(String value) {
            addCriterion("StoragesNo like", value, "storagesno");
            return (Criteria) this;
        }

        public Criteria andStoragesnoNotLike(String value) {
            addCriterion("StoragesNo not like", value, "storagesno");
            return (Criteria) this;
        }

        public Criteria andStoragesnoIn(List<String> values) {
            addCriterion("StoragesNo in", values, "storagesno");
            return (Criteria) this;
        }

        public Criteria andStoragesnoNotIn(List<String> values) {
            addCriterion("StoragesNo not in", values, "storagesno");
            return (Criteria) this;
        }

        public Criteria andStoragesnoBetween(String value1, String value2) {
            addCriterion("StoragesNo between", value1, value2, "storagesno");
            return (Criteria) this;
        }

        public Criteria andStoragesnoNotBetween(String value1, String value2) {
            addCriterion("StoragesNo not between", value1, value2, "storagesno");
            return (Criteria) this;
        }

        public Criteria andRemainIsNull() {
            addCriterion("remain is null");
            return (Criteria) this;
        }

        public Criteria andRemainIsNotNull() {
            addCriterion("remain is not null");
            return (Criteria) this;
        }

        public Criteria andRemainEqualTo(Integer value) {
            addCriterion("remain =", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotEqualTo(Integer value) {
            addCriterion("remain <>", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainGreaterThan(Integer value) {
            addCriterion("remain >", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainGreaterThanOrEqualTo(Integer value) {
            addCriterion("remain >=", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainLessThan(Integer value) {
            addCriterion("remain <", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainLessThanOrEqualTo(Integer value) {
            addCriterion("remain <=", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainIn(List<Integer> values) {
            addCriterion("remain in", values, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotIn(List<Integer> values) {
            addCriterion("remain not in", values, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainBetween(Integer value1, Integer value2) {
            addCriterion("remain between", value1, value2, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotBetween(Integer value1, Integer value2) {
            addCriterion("remain not between", value1, value2, "remain");
            return (Criteria) this;
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