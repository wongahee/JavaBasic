package gahee.basic.SungJuk;

public class SungJukVO {
    
    private String name;
    private int kor;
    private int eng;
    private int mat;
    private int tot;
    private double avg;
    private char grd;

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
} //class
