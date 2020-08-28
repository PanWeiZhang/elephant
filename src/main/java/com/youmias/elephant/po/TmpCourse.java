package com.youmias.elephant.po;

public class TmpCourse {
    private String cId;

    private String cName;

    private String tId;

    private TmpScore score;

    private TmpStudent student;

    public TmpStudent getStudent() {
        return student;
    }

    public void setStudent(TmpStudent student) {
        this.student = student;
    }

    public TmpScore getScore() {
        return score;
    }

    public void setScore(TmpScore score) {
        this.score = score;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }
}