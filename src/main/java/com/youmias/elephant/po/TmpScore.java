package com.youmias.elephant.po;

public class TmpScore {
    private String sId;

    private String cId;

    private Integer sScore;

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId == null ? null : sId.trim();
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public Integer getsScore() {
        return sScore;
    }

    public void setsScore(Integer sScore) {
        this.sScore = sScore;
    }
}