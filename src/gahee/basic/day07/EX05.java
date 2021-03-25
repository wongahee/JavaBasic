package gahee.basic.day07;
// 자바기초.docx
// 73, 74, 76번 문제
// 풀어보기(답x)
public class EX05 {

    public static void main(String[] args) {
        Fan f = new Fan(5.0, "blue", 1, false);

        FanSpeed fsrv = new FanSpeed();

        fsrv.Fan(f);

        fsrv.printFan(f);


    } //main

    static class Fan {
        private int SLOW = 1;
        private int MEDIUM = 2;
        private int FAST = 3;
        private double radius;
        private String color;
        private int speed;
        private boolean on;

        public Fan(double radius, String color, int speed, boolean on) {
            this.radius = radius;
            this.color = color;
            this.speed = speed;
            this.on = on;
        }

        Fan() {}
    }

    static class FanSpeed {

        public void Fan(Fan f) {
        }

        // 성적처리 결과출력
        public void printFan(Fan f) {
            String fmt = "%.1f %s %d %b \n";
            System.out.printf(fmt, f.radius, f.color, f.speed, f.on);
        }
    }

    static class Account {
        private int aid;
        private int balance;
        private double interestRate;
        private String dateCreated;

        public Account(int aid, int balance, double interestRate, String dateCreated) {
            this.aid = aid;
            this.balance = balance;
            this.interestRate = interestRate;
            this.dateCreated = dateCreated;
        }

        }


} //class