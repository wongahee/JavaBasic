package gahee.basic.SungJuk;

// 실행 순서
// initSungJuk(데이터 초기화) -> displaymenu -> newSungJuk -> saveSungJuk(1. 데이터저장)
// -> showSungJuk -> showOneSungJuk -> saveSungJuk(2. 데이터저장)
// 1. 장점- 데이터를 안정성있게 저장할 수 있음. 단점- 빈번한 저장
// 2. 장점- 빈번한 저장이 없어 간편하다. 단점- 데이터가 날아가기쉬움
// 두번 다해서 사용해도 o

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SungJukServiceV3Impl implements SungJukServiceV3 {

    // 멤버 변수 선언
    // 입력받은 모든 성적 데이터를 저장하는 동적배열 변수 선언
    List <SungJukVO> sjdata = new ArrayList<>();
    SungJukVO sj = null;
    
    // 성적 데이터를 저장해둘 파일경로 지정
    String fpath = "c:/java/SungJuk.data";
    String fpath2 = "c:/java/SungJuk.csv";
    String fpath3 = "c:/java/SungJuk.json";

    // csv 직렬화를 위한 문자열 포맷
    String csvfmt = "%s, %d, %d, %d, %d ,%.1f, %s \n";

    // json 직렬화를 위한 문자열 포맷
    String jsonfmt = "{\"name\":\"%s\", \"kor\": %d, \"eng\": %d, \"mat\": %d," +
                        " \"tot\": %d, \"avg\": %.1f, \"grd\": \"%s\"},\n";

    // 싱글톤 패턴 시작
    private static SungJukServiceV3 sjsrv = null;

    private SungJukServiceV3Impl() {
        // 프로그램 시작 시 initSungJuk 메서드 호출
        initSungJuk();
    }

    public static SungJukServiceV3 getInstance() {
        if (sjsrv == null) sjsrv = new SungJukServiceV3Impl();
        return sjsrv;
    }
    // 싱글톤 패턴 끝

    @Override
    public void displaymenu() {
        String displaymenu =
                            "======================= \n" +
                            "   성적 프로그램 V7 \n" +
                            "======================= \n" +
                            "1) 성적데이터 입력 \n" +
                            "2) 성적데이터 조회 \n" +
                            "3) 성적데이터 상세조회 \n" +
                            "4) 성적데이터 수정 \n" +
                            "5) 성적데이터 삭제 \n" +
                            "0) 프로그램 종료 \n" +
                            "======================= \n" +
                            "작업을 선택하세요 : ";
        System.out.print(displaymenu);
    }

    @Override  // alt + enter
    public void newSungJuk() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("이름은? ");
            String name = sc.next();
            System.out.print("국어는? ");
            int kor = sc.nextInt();
            System.out.print("영어는? ");
            int eng = sc.nextInt();
            System.out.print("수학은? ");
            int mat = sc.nextInt();

            SungJukVO sj = new SungJukVO(name, kor, eng, mat); // 입력받은 성적데이터를 객체화함
            computeSungJuk(sj);          // 성적 데이터 처리 - 총점, 평균 ,학점
            sjdata.add(sj);              // 처리된 성적데이터를 동적배열에 저장

            // 방금 입력된 성적 데이터와 기존 입력된 성적 데이터 모두를
            // sungjuk.data 파일에 직렬화해서 저장함.
            // saveSungJuk();
            
        } catch (Exception ex){
            System.out.println("잘못 입력하셨습니다.");
            return;    // 오류 발생 시 실행을 중단하고 main으로 복귀
        }




    }
    // 저장된 성적데이터 중에서 배열인덱스,이름,국어,영어,수학만 뽑아서
    // 목록 list 형태로 출력
    @Override
    public void showSungJuk () {
        String fmt = "번호 : %d, 이름 : %s, 국어 : %d, 영어: %d, 수학 : %d \n";
        int pos = 0 ; // 배열인덱스

        for (SungJukVO sj : sjdata){
            System.out.printf(fmt, pos, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat());
            ++pos;
        }
    }

    @Override
    public void computeSungJuk (SungJukVO sj){
        sj.setTot(sj.getKor() + sj.getEng() + sj.getMat());
        sj.setAvg((double) sj.getTot() / 3);

        switch ((int) sj.getAvg() / 10) {
            case 10:
            case 9:
                sj.setGrd('수');
                break;
            case 8:
                sj.setGrd('우');
                break;
            case 7:
                sj.setGrd('미');
                break;
            case 6:
                sj.setGrd('양');
                break;
            default:
                sj.setGrd('가');
                break;
        }
    }


    @Override
    public void showOneSungJuk () {
        String fmt = "번호: %d, 이름: %s, 국어: %d, 영어: %d, 수학:%d \n" +
                     "총점: %d, 평균: %.1f, 학점: %c \n";

        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 학생의 번호는? ");  // 0부터 시작
        int pos = sc.nextInt();

        try {
            SungJukVO sj = sjdata.get(pos);

            System.out.printf(fmt, pos,
                    sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(),
                    sj.getTot(), sj.getAvg(), sj.getGrd());

        } catch (Exception ex){
            System.out.println("데이터가 존재하지 않습니다!!");
        }

    }

    @Override
    public void modifySungJuk () { }

    @Override
    public void removeSungJuk () { }

    // 기존에 입력된 성적 데이터를
    // 역직렬화로 파일에서 읽어서 메모리에 적재하는 기능 담당
    @Override
    public void initSungJuk() {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(fpath);
            bis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bis);

           sjdata = (ArrayList) ois.readObject();  // 15줄 sjdata 변수에 배열값 넣어줌

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("파일이 없거나 시스템 오류입니다!!");
        } finally {
            if (ois != null)
                try { ois.close(); } catch (IOException e) { }
            if (bis != null)
                try { bis.close(); } catch (IOException e) {  }
            if (fis != null)
                try { fis.close(); } catch (IOException e) {  }
         }
    } //initSungJuk

    // 메모리내에 저장된 모든 성적 데이터를
    // 직렬화를 통해 파일에 저장
    @Override
    public void saveSungJuk () {
            FileOutputStream fos = null;
            BufferedOutputStream bos = null;
            ObjectOutputStream oos = null;

            try {
                fos = new FileOutputStream(fpath);
                bos = new BufferedOutputStream(fos);
                oos = new ObjectOutputStream(bos);

                oos.writeObject(sjdata);

            } catch (Exception ex) {
//                ex.printStackTrace();
                System.out.println("파일이 없거나 시스템 오류입니다!!");
            } finally {
                if (oos != null)
                    try { oos.close(); } catch (IOException e) { }
                if (bos != null)
                    try { bos.close(); } catch (IOException e) {  }
                if (fos != null)
                    try { fos.close(); } catch (IOException e) {  }
            }


            }
    // 기존에 입력된 성적 데이터를
    // CSV 역직렬화로 파일에서 읽어서 메모리에 적재하는 기능 담당
    @Override
    public void initSungJuk2() {
        // try-with-resources 구문 사용
        try( FileReader fr = new FileReader(fpath2);
             BufferedReader br = new BufferedReader(fr);
        ) {
            sjdata = new ArrayList<>();

            while(br.ready()){     // csv 파일에서 문자열 한줄 읽어 ,단위로 분리 후 배열로 생성
                String line = br.readLine();
                String data[] = line.split(",");   // ,로 문장열 구분하여 배열에 넣음
                
                // 생성된 배열을 이용해 성적 객체를 만들어
                // 총점, 평균, 학점을 구한 후, (옵션)
                // ArrayList에 저장함
                SungJukVO sj = new SungJukVO( data[0], Integer.parseInt(data[1]),
                        Integer.parseInt(data[2]), Integer.parseInt(data[3]) );
                // 배열로 나눠졌던 데이터 초기화하고 int로 형변환
                
                computeSungJuk(sj);
                sjdata.add(sj);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    } // initSungJuk2

    // 메모리내에 저장된 모든 성적 데이터를
    // CSV 직렬화를 통해 파일에 저장
    @Override
    public void saveSungJuk2() {
        
        // JDK 7부터는 자원을 쉽게 해제할 수 있도록
        // try-with-resources 라는 구문을 지원함
        try ( FileWriter fw = new FileWriter(fpath2);
              BufferedWriter bw = new BufferedWriter(fw);
              ) {
            String result = "";
            for (SungJukVO sj : sjdata){
                 result = String.format(csvfmt, sj.getName(), sj.getKor(), sj.getEng(),
                                                sj.getMat(), sj.getTot(), sj.getAvg(),
                                                sj.getGrd()); // csv 직렬화
                // 혜교, 54, 76, 98, 265, 99.3, 수
                // SungJukVO에 데이터를 하나씩 빼서 csv형식으로 바꾸어 출력
                 bw.write(result);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    } // saveSungJuk2

    // 기존에 입력된 성적 데이터를
    // JSON 역직렬화로 파일에서 읽어서 메모리에 적재하는 기능 담당
    @Override
    public void initSungJuk3() {
        sjdata = new ArrayList<>();

        // try-with-resources 구문 사용
        try( FileReader fr = new FileReader(fpath3);
             BufferedReader br = new BufferedReader(fr);
        ) {
            // json 파일의 모든 내용을 한번에 읽어 lines 변수에 저장
            String lines = br.lines().collect(Collectors.joining());
           // System.out.println(lines);
            
            // 텍스트 파일에 저장된 반정형 데이터를 JSON 분석기(parser)를 이용해
            // 메모리에 객체형태로 저장함
            JSONParser parser = new JSONParser(); // ctrl + space
            JSONObject obj = (JSONObject) parser.parse(lines);
            
            // 메모리에 저장된 객체에서 sj라는 이름의 배열객체를 가져옴
            JSONArray jsons = (JSONArray) obj.get("sj");

            // 반복문을 이용해서 배열객체의 각 요소를 하나씩 꺼내
            // 성적 객체에 담고 ArrayList에 저장함
            for(int i = 0; i < jsons.size(); ++i){
                JSONObject json = (JSONObject) jsons.get(i);
                SungJukVO sj = new SungJukVO( (String) json.get("name"),
                                            ((Long) json.get("kor")).intValue(),
                                            ((Long) json.get("eng")).intValue(),
                                            ((Long) json.get("mat")).intValue() );
                computeSungJuk(sj);
                sjdata.add(sj);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    } // initSungJuk3

    // 메모리내에 저장된 모든 성적 데이터를
    // JSON 직렬화를 통해 파일에 저장
    @Override
    public void saveSungJuk3() {
        try ( FileWriter fw = new FileWriter(fpath3);
              BufferedWriter bw = new BufferedWriter(fw);
        ) {
            String result = "";

            bw.write("{ \"sj\" : ["); // json 배열 시작
            for (SungJukVO sj : sjdata){
                result = String.format(jsonfmt, sj.getName(), sj.getKor(), sj.getEng(),
                        sj.getMat(), sj.getTot(), sj.getAvg(),
                        sj.getGrd());
                // { 'name':'혜교', 'kor':54, 'eng':76, 'mat':98,
                //      'tot':265, 'avg':99.3, 'grd':'수'},
                bw.write(result);
            }
            bw.write("] }"); // json 배열 끝

        } catch (Exception ex){
            ex.printStackTrace();
        }
    } // saveSungJuk3
}
