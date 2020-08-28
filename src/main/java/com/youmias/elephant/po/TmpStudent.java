package com.youmias.elephant.po;

import java.util.List;

public class TmpStudent {
    private String sId;

    private String sName;

    private String sBirth;

    private String sSex;

    private List<TmpScore> scoreList;

    public List<TmpScore> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<TmpScore> scoreList) {
        this.scoreList = scoreList;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId == null ? null : sId.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsBirth() {
        return sBirth;
    }

    public void setsBirth(String sBirth) {
        this.sBirth = sBirth == null ? null : sBirth.trim();
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex == null ? null : sSex.trim();
    }
}