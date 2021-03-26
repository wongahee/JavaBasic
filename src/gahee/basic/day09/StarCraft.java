package gahee.basic.day09;

// 스타크래프트 테란 캐릭터 - 상속 , 추상화, overriding

public class StarCraft {
    public static void main(String[] args) {
        // 객체 생성하여 초기화
        // scv 유닛을 만들 때마다 초기값을 지정하는 것은 다소 번거로움
        // SCV s = new SCV("SCV" , 45, 5, 2.81, 50, 0); 를 계속 초기값지정하면 코드가 많아짐
        // 즉, 동일한 속성을 가진 유닛을 만들 때마다 매개변수를 통해 객체를 만드는 것은 비효율적 
        // 이런 경우 생성자 내에서 초기값을 지정하는 것이 나음
       
        SCV s = new SCV();      // 객체 생성

        System.out.println( "SCV의 체력 " + s.hp );  // 출력
        s.attack();
        s.move();
        s.specialAbility();

        Marine m = new Marine();
        m.attack();
        m.move();
        m.specialAbility();

        Firebat f = new Firebat();
        f.attack();
        f.move();
        f.specialAbility();

        Medic md = new Medic();
        md.attack();
        md.move();
        md.specialAbility();

    }
}

abstract class Unit{
    // 캐릭터 특성
    protected String name;
    protected int hp;              // 체력
    protected int power;           // 공격력
    protected double movingSpeed;  // 이동속도
    protected int mineral;         // 광물
    protected int gas;             // 가스

    // 매개변수없는 생성자
    public Unit() { }

    // 생성자
   /* public Unit(String name, int hp, int power, double movingSpeed, int mineral, int gas) {
        this.name = name;
        this.hp = hp;
        this.power = power;
        this.movingSpeed = movingSpeed;
        this.mineral = mineral;
        this.gas = gas;
    } */

    // 추상 메서드 - 몸체x
     abstract public void attack();         // public 생략 가능
     abstract public void move();
     abstract public void specialAbility();
     
}

// 테란(Unit)이라는 부모클래스에 포함되는 자식클래스(나머지 : 캐릭터명)
class SCV extends Unit {

    // 출력 변수
    final String fmtattack =  "융합절단기로 공격중... 피해량은 %d 입니다. \n";
    final String fmtmove =  "지정한 위치로 %.2f 속도로 이동중입니다. \n"; // 소수점2째자리
    final String fmtspecialAbility =  "대상을 수리하는 중입니다.\n ";

    public SCV() {
        name = "건설로봇";
        hp = 45;
        power = 0;
        movingSpeed = 2.81;
        mineral = 50;
        gas = 0;
    }
    
    // 재정의 두가지 방법 printf, 변수쓰기
    @Override
    public void attack() {
        // sout ("융합절단기를 이용해서...")
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

class Marine extends Unit {

    // 출력 변수
    final String fmtattack = "가우스소총으로 공격중... 피해량은 %d입니다.\n ";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다.\n ";
    final String fmtspecialAbility = "전투자극제를 사용합니다. 이동속도 +50%%, 공격속도 +33%%\n ";

    public Marine() {
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

class Firebat extends Unit {

    // 출력 변수
    final String fmtattack = "화염방사기로 공격중... 피해량은 %d입니다.\n ";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다.\n ";
    final String fmtspecialAbility = "전투자극제를 사용합니다.\n ";

    public Firebat() {      // class에서 alt + insert
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

class Medic extends Unit {

    final String fmtattack = "화염방사기로 공격중... 피해량은 %d입니다.\n ";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다.\n ";;
    final String fmtspecialAbility = "치료합니다. \n";


    public Medic() {
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