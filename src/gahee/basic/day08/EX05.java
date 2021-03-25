package gahee.basic.day08;
// 자바기초.docx
// 73, 74, 76번 문제
// 답안 풀이
public class EX05 {
    public static void main(String[] args) {

        Fan f1 = new Fan();          // 클래스 객체 생성
        System.out.println(f1.speed);
        System.out.println(f1.on);
        System.out.println(f1.radius);
        System.out.println(f1.color);

        Fan f2 = new Fan();
        System.out.println(f2.speed);
        System.out.println(f2.on);
        System.out.println(f2.radius);
        System.out.println(f2.color);

        //  클래스를 통해 객체 생성 - 객체 멤버변수에 값을 초기화 - 번거로움
        // 시험값 지정
        Fan f3 = new Fan();
        f3.speed = f3.FAST; // OR 3
        f3.radius = 10;
        f3.color = "yellow";
        f3.on = true;

        //  매개변수 생성자를 이용하면 객체의 멤버변수에 값을 초기화하기 편함
        Fan f4 = new Fan(2, false, 5, "blue");


        Account a1 = new Account(1122,20000,4.5,
                                "2014-08-15 14:34:29");

        Student s = new Student();

    } //main

        // 73. 선풍기를 나타내는 Fan 클래스
        static class Fan {
            final int SLOW = 1;     // 상수 (재정의 불가)
            final int MEDIUM = 2;
            final int FAST = 3;

            private int speed;
            private boolean on;
            private double radius;
            private String color;

        public Fan() {        // 생성자 (멤버 변수 초기화)
            speed = SLOW;
            on = false;
            radius = 5.0;
            color = "blue";
            }

            public Fan (int speed, boolean on, double radius, String color) {
                this.speed = speed;
                this.on = on;
                this.radius = radius;
                this.color = color;

            }
        } // Fan

        // 74. 은행 계좌를 나타내는 Account 클래스
        static class Account{
            private int aid;
            private int balance;
            private double interestRate;
            private String dateCreated;

            // 초기값 0이면 거의 안해도됨
            public Account() {
                aid = 0;
                balance = 0;
                interestRate = 0;
            }

            public Account(int aid, int balance, double interestRate, String dateCreated) {
                this.aid = aid;
                this.balance = balance;
                this.interestRate = interestRate;
                this.dateCreated = dateCreated;
            }

        } // Account

        // 76. 대학교 업무 시스템 클래스
        static class Student{
            private int hakbun;
            private String name;
            private String addr;
            private String birth;
            private String dname;  // 전공학과
            private int prof;
         } // Student

        static class Subject{
            private int subno;  // 과목 번호
            private String sname; // 과목명
            private String sdecs;  // 과목개요
            private String ssec;  // 섹션
        } // Subject

        static class Professor{
            private int pno;  // 교수번호
            private String name;  // 교수이름
            private String field; // 전공분야
            private String tech;  // 보유기술
        } // Subject

        static class Major{   // 전공학과
            private String mname;  // 학과명
            private String offpos;  // 사무실위치 officePosition
            private String phone; // 전화번호
            private int chief; // 학과장
        } // Major

} //class
