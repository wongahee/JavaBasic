package gahee.basic.day09;


public class Inheritance2 {
    public static void main(String[] args) {
        // 자바의 최상위(조상)클래스
        // 자바에서 사용하는 모든 클래스는 기본적으로 Object 라는 클래스를
        // 상속받고 있다.
        // 따라서, Object 클래스내에 미리 정의된
        // equals, hashcode, notify, wait, toString 등의
        // 메서드를 사용할 수 있다.

        Student2 s = new Student2();
        s.study();      // 개발자가 추가한 메서드
        s.toString();   // 조상클래스에서 물려받은 메서드 ( s. 입력하면 뜸)

        A a = new A();
        a.toString();  // 조상클래스에서 물려받은 메서드
    } //main

} //class

class A{ }
// 상속 x - 중복되는 내용이 겹쳐 가독성이 떨어짐
class Student{
    public void speak( ){ };
    public void eat( ){ };
    public void walk( ){ };
    public void sleep( ){ };
    public void study ( ){ };
}

class StudentWorker{
    public void speak( ){ };
    public void eat( ){ };
    public void walk( ){ };
    public void sleep( ){ };
    public void study ( ){ };
    public void work ( ){ };
}

class Researcher{
    public void speak( ){ };
    public void eat( ){ };
    public void walk( ){ };
    public void sleep( ){ };
    public void research( ){ };
}

class Professor{
    public void speak( ){ };
    public void eat( ){ };
    public void walk( ){ };
    public void sleep( ){ };
    public void research( ){ };
    public void teach( ){ };
}

// 상속 o
class People {
        public void speak( ){ };
        public void eat( ){ };
        public void walk( ){ };
        public void sleep( ){ };
}

class Student2 extends People {
    public void study ( ){ };
}

class StudentWorker2 extends Student2 {    // sw2 -> s2 -> p
    public void work ( ){ };
}

class Researcher2 extends People {
    public void research( ){ };
}

class Professor2 extends Researcher2 {    // pf2 -> r2 -> p
    public void teach( ){ };
}
