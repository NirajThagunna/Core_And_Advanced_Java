package com.nirajThagunna;

public class StudentMarks extends Student {
    private int math;
    private int FOCP;
    private int OOP;
    private int dbms;
    private int DS;

    public StudentMarks(String name, int roll_no, String stream, int math, int FOCP, int OOP, int dbms, int DS) {
        super(name, roll_no, stream);
        this.math = math;
        this.FOCP = FOCP;
        this.OOP = OOP;
        this.dbms = dbms;
        this.DS = DS;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getRoll_no() {
        return super.getRoll_no();
    }

    @Override
    public String getStream() {
        return super.getStream();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setRoll_no(int roll_no) {
        super.setRoll_no(roll_no);
    }

    @Override
    public void setStream(String stream) {
        super.setStream(stream);
    }

    // getter
    public int getMath() {
        return math;
    }

    public int getFOCP() {
        return FOCP;
    }

    public int getOOP() {
        return OOP;
    }

    public int getDbms() {
        return dbms;
    }

    public int getDS() {
        return DS;
    }

    // setter
    public void setMath(int math) {
        this.math = math;
    }

    public void setFOCP(int FOCP) {
        this.FOCP = FOCP;
    }

    public void setOOP(int OOP) {
        this.OOP = OOP;
    }

    public void setDbms(int dbms) {
        this.dbms = dbms;
    }

    public void setDS(int DS) {
        this.DS = DS;
    }
}
