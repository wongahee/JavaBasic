package gahee.basic.day18;

import gahee.basic.SungJuk.SungJukServiceV4;
import gahee.basic.SungJuk.SungJukServiceV4Impl;

import java.util.Scanner;

public class SungJukV8Main {
    public static void main(String[] args) {
        // 성적처리프로그램 V8 - JDBC 프로그래밍
        // 입력한 성적데이터를 DBMS를 이용해서 관리함
        // 따라서, 프로그램 종료 시 입력했던 데이터는 그대로 유지됨

        // 새로운 프로그래밍 패턴 도입 : 3 layer architecture
        // 프리젠테이션 - 비지니스 로직 - 데이터 액세스
        //                  ~Service         ~DAO       (클래스명이 ~로 끝남)
        // 비지니스 로직 -> DAO : VO 사용
        // DAO -> 비지니스 로직 : List 사용

        // SungJukServiceV4
        // JDBCUtil (JDBC 관련정보 및 객체생성)
        // SungJukDAO (insertSungJuk, selectSungJuk, selectOneSungJuk,
        //             updateSungJuk, deleteSungJuk)

        Scanner sc = new Scanner(System.in);

        SungJukServiceV4 sjsrv = SungJukServiceV4Impl.getInstance();
        // alt + enter : 클래스 가져오기

        String menu = "";

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

    }
}