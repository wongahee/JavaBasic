package gahee.basic.day10;

// 스타크래프트 테란 캐릭터 - Interface
// 풀이

public class StarCraft2 {
    public static void main(String[] args) {
        // 인터페이스 기반으로 스타크래프트의 유닛을 정의해봄

        SCV2 s = new SCV2();      // 객체 생성

        System.out.println( "SCV의 체력 " + s.hp );  // 출력
        s.attack();
        s.move();
        s.specialAbility();

        Marine2 m = new Marine2();
        m.attack();
        m.move();
        m.specialAbility();

        Firebat2 f = new Firebat2();
        f.attack();
        f.move();
        f.specialAbility();

        Medic2 md = new Medic2();
        md.attack();
        md.move();
        md.specialAbility();

    }
}

// 추상클래스에서 정의했던 추상메서드를
// 독립적인 코드로 분리함 -> 인터페이스
interface terranInterface {
    abstract public void attack();         // abstract public 생략 가능
    void move();
    void specialAbility();
}

 class Unit2 {
    // 캐릭터 특성
    protected String name;
    protected int hp;              // 체력
    protected int power;           // 공격력
    protected double movingSpeed;  // 이동속도
    protected int mineral;      // 광물
    protected int gas;          // 가스

    // 매개변수없는 생성자
    public Unit2() { }
}

// 테란(Unit)이라는 부모클래스에 포함되는 자식클래스(나머지 : 캐릭터명)
class SCV2 extends Unit2 implements terranInterface {

    // 출력 변수
    final String fmtattack =  "융합절단기로 공격중... 피해량은 %d 입니다. \n";
    final String fmtmove =  "지정한 위치로 %.2f 속도로 이동중입니다. \n"; // 소수점2째자리
    final String fmtspecialAbility =  "대상을 수리하는 중입니다.\n ";

    public SCV2() {
        name = "건설로봇";
        hp = 45;
        power = 0;
        movingSpeed = 2.81;
        mineral = 50;
        gas = 0;
    }
    
    // 재정의 두가지 방법 printf, 변수쓰기
    @Override
    public void attack() { // sout ("융합절단기를 이용해서...")
        // 추상메서드를 이용해서 부모클래스에 정의된 attack 메서드를 유닛에 맞게 재정의함
        System.out.printf(fmtattack, power);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, movingSpeed);
    }

    @Override
    public void specialAbility() {
        System.out.printf(fmtspecialAbility);
    }
}

class Marine2 extends Unit2 implements terranInterface {
    // 출력 변수
    final String fmtattack = "가우스소총으로 공격중... 피해량은 %d입니다.\n ";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다.\n ";
    final String fmtspecialAbility = "전투자극제를 사용합니다. 이동속도 +50%%, 공격속도 +33%%\n ";

    public Marine2() {
        name = "해병대";
        hp = 50;
        power = 30;
        movingSpeed = 2.95;
        mineral = 50;
        gas = 0;
    }

    @Override
    public void attack() {
        System.out.printf(fmtattack, power);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, movingSpeed);
    }

    @Override
    public void specialAbility() {
        System.out.printf(fmtspecialAbility);
    }
}

class Firebat2 extends Unit2 implements terranInterface {

    // 출력 변수
    final String fmtattack = "화염방사기로 공격중... 피해량은 %d입니다.\n ";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다.\n ";
    final String fmtspecialAbility = "전투자극제를 사용합니다.\n ";

    public Firebat2() {      // class에서 alt + insert
        name = "화염방사병";
        hp = 50;
        power = 8 * 2;
        movingSpeed = 1.875;
        mineral = 50;
        gas = 25;
    }

    @Override  // class에서 alt + enter
    public void attack() {
        System.out.printf(fmtattack, power);
    }

    @Override   // printf 사용 시, %f 사용
    public void move() {
        System.out.printf(fmtmove, movingSpeed);
    }

    @Override
    public void specialAbility() {
        System.out.printf(fmtspecialAbility);
    }
}

class Medic2 extends Unit2 implements terranInterface {

    final String fmtattack = "화염방사기로 공격중... 피해량은 %d입니다.\n ";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다.\n ";;
    final String fmtspecialAbility = "치료합니다. \n";


    public Medic2() {
        name = "의무관";
        hp = 50;
        power = 0;
        movingSpeed = 1.875;
        mineral = 50 ;
        gas = 25 ;
    }

    @Override
    public void attack() {
        System.out.printf(fmtattack, power);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, movingSpeed);
    }

    @Override
    public void specialAbility() {
        System.out.printf(fmtspecialAbility);
    }
}