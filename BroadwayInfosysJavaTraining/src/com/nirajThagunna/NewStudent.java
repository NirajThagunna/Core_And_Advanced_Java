package com.nirajThagunna;

public class NewStudent extends StudentMarks {
    private int total;
    private int percentage;
    private String result;

    public NewStudent(String name, int roll_no, String stream, int math, int FOCP, int OOP, int dbms, int DS) {
        super(name, roll_no, stream, math, FOCP, OOP, dbms, DS);
        this.total = 0;
        this.percentage = 0;
        this.result = null;
    }

    // getter
    public int getTotal() {
        return total;
    }

    public int getPercentage() {
        return percentage;
    }

    public String getResult() {
        return result;
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

    @Override
    public void setMath(int math) {
        super.setMath(math);
    }

    @Override
    public void setFOCP(int FOCP) {
        super.setFOCP(FOCP);
    }

    @Override
    public void setOOP(int OOP) {
        super.setOOP(OOP);
    }

    @Override
    public void setDbms(int dbms) {
        super.setDbms(dbms);
    }

    @Override
    public void setDS(int DS) {
        super.setDS(DS);
    }

    // Method
    public void calcTotal() {
        this.total = super.getMath() + super.getOOP() + super.getDbms() + super.getDS() +
                super.getFOCP();
    }

    public void calcPercentage() {
        this.percentage = getTotal() / 5;
    }

    public void calculateResult() {
        this.result = "FAIL";
        int PM = 40;
        if ((this.getDbms() >= PM) && (this.getDS() >= PM) && (this.getFOCP() >= PM) &&
                (this.getMath() >= PM) && (this.getOOP() >= PM)) {
            this.result = "PASS";
        }
    }

    public void calculate() {
        this.calcTotal();
        this.calcPercentage();
        this.calculateResult();
    }

    public String toString() {
        return (this.getName() + "\n" + this.getRoll_no() + "\n" + this.getStream() +
                "\n" + this.getTotal() + "\n" + this.getPercentage() + "\n" +
                this.getResult());
    }
}
