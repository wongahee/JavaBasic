package gahee.basic.day08;

public class ValueObject {

    public static void main(String[] args) {
        // setter / getter 메서드
        // 기본적으로 클래스 멤버변수의 접근 지정자는 private 선언이 좋음
        // ->  dataHiding(정보은닉) 차원
        // 하지만, private 선언시 외부 클래스에서 멤버변수에 접근 불가능
        // 이때 setter/getter 메서드를 이용하여 접근불가변수를 조작할 수 있다.

         C sj = new C ();
//        sj.name = "지현";     // 멤버변수가 private 으로 선언되어 접근 불가
//        sj.kor = 100;         // 값 대입 실패 -> 오류발생
//        sj.eng = 68;
//        sj.mat = 85;
        // -> OOP 에서는 객체의 변수를 외부에서 직접 접근하는 것을 권장 x
        // 즉 , 데이터는 외부에서의 접근을 막는다는 의미임
        // 만일 접근하려면 객체에서 공개한 메서드를 통해서만 가능하도록 유도 -> setter/getter
        
        // setter를 이용해서 객체의 변수에 값 대입
        sj.setName("지현");
        sj.setKor(46);
        sj.setEng(87);
        sj.setMat(100);

        // getter를 이용
        System.out.println(sj.getName());
        System.out.println(sj.getKor());
        System.out.println(sj.getEng());
        System.out.println(sj.getMat());

    } // main

} //class

class C {
    private String name;
    private int kor;
    private int eng;
    private int mat;
    // -> setter,getter 미사용으로 오류발생!

    // setter 정의 -> 외부에서 객체의 멤버변수에 값을 설정할때 사용
    // public void set 변수명(변수명)
    public void setName(String name) {
        this.name = name;
    }
    
    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    // getter 정의
    // public 반환유형  get변수명()
    public String getName() {
        return name;
    }
    public int getKor() {
        return kor;
    }
    public int getEng() {
        return eng;
    }
    public int getMat() {
        return mat;
    }

}

class D{
    private String userid;
    private String passwd;
    private String email;

    // 매개변수 없는 생성자
    public D() { }

    // 매개변수 있는 생성자
    public D(String userid, String passwd, String email) {
        this.userid = userid;
        this.passwd = passwd;
        this.email = email;
    }

    // alt + insert => getter 및 setter
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
