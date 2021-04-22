package gahee.basic.SungJuk;

import java.io.Serializable;

// 직렬화를 지원하기 위해 Serializable 구현해서 정의해야함!
public class SungJukVO implements Serializable {

    protected String sjno;
    protected String name;
    protected int kor;
    protected int eng;
    protected int mat;
    protected int tot;
    protected double avg;
    protected char grd;
    protected String regdate;

    public String getSjno() {
        return sjno;
    }

    public void setSjno(String sjno) {
        this.sjno = sjno;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    // 생성자
    public SungJukVO(String name, int kor, int eng, int mat) {     // 4가지 변수만 생성자에 기재
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    // setter/getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }

    @Override  // Object 클래스 toString
    public String toString() {
        String fmt = "{name: '%s', kor: %d, eng: %d, mat:%d,"+
                        "tot: %d, avg: .1f, grd: '%s'}";
        String result = String.format (fmt, name, kor,eng, mat, tot, avg, grd);
        return result;
    }
} //class


