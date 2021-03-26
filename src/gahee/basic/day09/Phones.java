package gahee.basic.day09;

public class Phones {
    public static void main(String[] args) {
        Phone n = new Phone();
        n.receive();

        Mp3Phone m = new Mp3Phone();
        m.playMusic();

        SmartPhone s = new SmartPhone();
        s.takePic();
    }

}

interface PhoneInterface {
    public void transmit();    // 전화걸기 public 생략가능
    public void receive();     // 전화받기
}

interface MP3Interface {
    void playMusic();
    void viewMovie();
}

interface SmartPhoneInterface {
     void takePic();
     void surfInternet();
     void playGame();
}

class Phone implements PhoneInterface {
    
    @Override
    public void transmit() {
        System.out.println("전화 거는 중...");
    }

    @Override
    public void receive() {
        System.out.println("전화 받는 중...");
    }
}

class Mp3Phone implements PhoneInterface, MP3Interface {

    @Override
    public void transmit() { }

    @Override
    public void receive() { }

    @Override
    public void playMusic() {
        System.out.println("음악을 재생합니다");
    }
    @Override
    public void viewMovie() {
        System.out.println("동영상을 재생합니다");
    }
}

// 상속( extends ) : 부모클래스가 가진 특성과 기능을 그대로 받음
// 인터페이스( implements ): 부모클래스가 정한 틀에 새롭게 작성
// 따라서, 아래 Mp3Phone2 처럼 코딩하는 것은 다소 세련되지 못함
class Mp3Phone2 implements MP3Interface {
    @Override
    public void playMusic() { }

    @Override
    public void viewMovie() { }
}

// interface 다중상속
class SmartPhone extends Phone implements PhoneInterface, SmartPhoneInterface {

    @Override
    public void transmit() { }

    @Override
    public void receive() { }
    
    @Override
    public void takePic() {
        System.out.println("사진을 찍습니다");
    }

    @Override
    public void surfInternet() {
        System.out.println("인터넷 사용 중...");
    }

    @Override
    public void playGame() {
        System.out.println("게임 중...");
    }
}
