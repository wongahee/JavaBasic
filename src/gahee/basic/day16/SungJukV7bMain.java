package gahee.basic.day16;

import gahee.basic.SungJuk.SungJukServiceV3;
import gahee.basic.SungJuk.SungJukServiceV3Impl;

import java.util.Scanner;

// 성적처리 프로그램 V7b - ArrayList + 텍스트 기반 스트림
// 입력받은 성적 데이터를 csv직렬화를 통해 텍스트 기반 파일에 저장
// csv직렬화 : 각 데이터 항목을 ,로 구분하여 파일에 저장하는 방식
// 따라서, 프로그램 종료 시 입력한 데이터는 그대로 유지됨
// 데이터를 외부로 빼서 공유해서 사용할 수 있음
// SungJukServiceV3
// initSungJuk2, saveSungJuk2 (파일처리/csv직렬화) 추가

public class SungJukV7bMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SungJukServiceV3 sjsrv = SungJukServiceV3Impl.getInstance();
        // alt + enter : 클래스 가져오기

        String menu = " ";
        sjsrv.initSungJuk2();

        while (true) {
            sjsrv.displaymenu();
            menu = sc.next();

            switch (menu) {
                case "1": sjsrv.newSungJuk(); break;
                case "2": sjsrv.showSungJuk(); break;
                case "3": sjsrv.showOneSungJuk(); break;
                case "4": sjsrv.modifySungJuk(); break;
                case "5": sjsrv.removeSungJuk(); break;
                case "0": sjsrv.saveSungJuk2();
                          System.exit(0); break;  // 저장하고 종료
                default: System.out.println("잘못 입력하셨습니다!! ");
            }
        }
        
    } // class
} // main