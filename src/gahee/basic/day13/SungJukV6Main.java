package gahee.basic.day13;

// 성적처리 프로그램 V6 - ArrayList + CRUD
// 동적배열을 이용해서 대량의 성적데이터를 저장할 수 있게함
// 즉, 입력받은 성적 데이터는 동적배열에 저장하고,
// 저장한 데이터들을 조회/수정/삭제할 수 있도록함.
// SungJukServiceV2
// (1) newSungJuk, (2) showSungJuk, (3) showOneSungJuk, (4) modifySungJuk, (5) removeSungJuk
// +) computeSungJuk, displayMenu                                //수정

import gahee.basic.SungJuk.*;

import java.util.Scanner;

public class SungJukV6Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SungJukServiceV2 sjsrv = SungJukServiceV2Impl.getInstance();
        // alt + enter : 클래스 가져오기

        String menu = " ";

        while (true) {
            sjsrv.displaymenu();
            menu = sc.next();

            switch (menu) {
                case "1": sjsrv.newSungJuk(); break;
                case "2": sjsrv.showSungJuk(); break;
                case "3": sjsrv.showOneSungJuk(); break;
                case "4": sjsrv.modifySungJuk(); break;
                case "5": sjsrv.removeSungJuk(); break;
                case "0": System.exit(0); break;
                default: System.out.println("잘못 입력하셨습니다!! ");
            }
        }


    } // class
} // main
