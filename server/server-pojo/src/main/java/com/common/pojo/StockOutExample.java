package com.common.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StockOutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockOutExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andGnoIsNull() {
            addCriterion("Gno is null");
            return (Criteria) this;
        }

        public Criteria andGnoIsNotNull() {
            addCriterion("Gno is not null");
            return (Criteria) this;
        }

        public Criteria andGnoEqualTo(String value) {
            addCriterion("Gno =", value, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoNotEqualTo(String value) {
            addCriterion("Gno <>", value, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoGreaterThan(String value) {
            addCriterion("Gno >", value, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoGreaterThanOrEqualTo(String value) {
            addCriterion("Gno >=", value, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoLessThan(String value) {
            addCriterion("Gno <", value, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoLessThanOrEqualTo(String value) {
            addCriterion("Gno <=", value, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoLike(String value) {
            addCriterion("Gno like", value, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoNotLike(String value) {
            addCriterion("Gno not like", value, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoIn(List<String> values) {
            addCriterion("Gno in", values, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoNotIn(List<String> values) {
            addCriterion("Gno not in", values, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoBetween(String value1, String value2) {
            addCriterion("Gno between", value1, value2, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoNotBetween(String value1, String value2) {
            addCriterion("Gno not between", value1, value2, "gno");
            return (Criteria) this;
        }

        public Criteria andPnoIsNull() {
            addCriterion("Pno is null");
            return (Criteria) this;
        }

        public Criteria andPnoIsNotNull() {
            addCriterion("Pno is not null");
            return (Criteria) this;
        }

        public Criteria andPnoEqualTo(String value) {
            addCriterion("Pno =", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotEqualTo(String value) {
            addCriterion("Pno <>", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoGreaterThan(String value) {
            addCriterion("Pno >", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoGreaterThanOrEqualTo(String value) {
            addCriterion("Pno >=", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoLessThan(String value) {
            addCriterion("Pno <", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoLessThanOrEqualTo(String value) {
            addCriterion("Pno <=", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoLike(String value) {
            addCriterion("Pno like", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotLike(String value) {
            addCriterion("Pno not like", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoIn(List<String> values) {
            addCriterion("Pno in", values, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotIn(List<String> values) {
            addCriterion("Pno not in", values, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoBetween(String value1, String value2) {
            addCriterion("Pno between", value1, value2, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotBetween(String value1, String value2) {
            addCriterion("Pno not between", value1, value2, "pno");
            return (Criteria) this;
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

        public Criteria andStockouttimeIsNull() {
            addCriterion("StockOutTime is null");
            return (Criteria) this;
        }

        public Criteria andStockouttimeIsNotNull() {
            addCriterion("StockOutTime is not null");
            return (Criteria) this;
        }

        public Criteria andStockouttimeEqualTo(Date value) {
            addCriterionForJDBCDate("StockOutTime =", value, "stockouttime");
            return (Criteria) this;
        }

        public Criteria andStockouttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("StockOutTime <>", value, "stockouttime");
            return (Criteria) this;
        }

        public Criteria andStockouttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("StockOutTime >", value, "stockouttime");
            return (Criteria) this;
        }

        public Criteria andStockouttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("StockOutTime >=", value, "stockouttime");
            return (Criteria) this;
        }

        public Criteria andStockouttimeLessThan(Date value) {
            addCriterionForJDBCDate("StockOutTime <", value, "stockouttime");
            return (Criteria) this;
        }

        public Criteria andStockouttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("StockOutTime <=", value, "stockouttime");
            return (Criteria) this;
        }

        public Criteria andStockouttimeIn(List<Date> values) {
            addCriterionForJDBCDate("StockOutTime in", values, "stockouttime");
            return (Criteria) this;
        }

        public Criteria andStockouttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("StockOutTime not in", values, "stockouttime");
            return (Criteria) this;
        }

        public Criteria andStockouttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("StockOutTime between", value1, value2, "stockouttime");
            return (Criteria) this;
        }

        public Criteria andStockouttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("StockOutTime not between", value1, value2, "stockouttime");
            return (Criteria) this;
        }

        public Criteria andStockoutnumberIsNull() {
            addCriterion("StockOutNumber is null");
            return (Criteria) this;
        }

        public Criteria andStockoutnumberIsNotNull() {
            addCriterion("StockOutNumber is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutnumberEqualTo(Integer value) {
            addCriterion("StockOutNumber =", value, "stockoutnumber");
            return (Criteria) this;
        }

        public Criteria andStockoutnumberNotEqualTo(Integer value) {
            addCriterion("StockOutNumber <>", value, "stockoutnumber");
            return (Criteria) this;
        }

        public Criteria andStockoutnumberGreaterThan(Integer value) {
            addCriterion("StockOutNumber >", value, "stockoutnumber");
            return (Criteria) this;
        }

        public Criteria andStockoutnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("StockOutNumber >=", value, "stockoutnumber");
            return (Criteria) this;
        }

        public Criteria andStockoutnumberLessThan(Integer value) {
            addCriterion("StockOutNumber <", value, "stockoutnumber");
            return (Criteria) this;
        }

        public Criteria andStockoutnumberLessThanOrEqualTo(Integer value) {
            addCriterion("StockOutNumber <=", value, "stockoutnumber");
            return (Criteria) this;
        }

        public Criteria andStockoutnumberIn(List<Integer> values) {
            addCriterion("StockOutNumber in", values, "stockoutnumber");
            return (Criteria) this;
        }

        public Criteria andStockoutnumberNotIn(List<Integer> values) {
            addCriterion("StockOutNumber not in", values, "stockoutnumber");
            return (Criteria) this;
        }

        public Criteria andStockoutnumberBetween(Integer value1, Integer value2) {
            addCriterion("StockOutNumber between", value1, value2, "stockoutnumber");
            return (Criteria) this;
        }

        public Criteria andStockoutnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("StockOutNumber not between", value1, value2, "stockoutnumber");
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