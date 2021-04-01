package gahee.basic.lab;

// Employees 데이터에 대한 CRUD 코드 작성

// 사원 정보를 입력받아 동적배열에 저장하고,
// 조회 및 수정/삭제하는 프로그램 작성

// 사원 : 사번, 이름, 성, 이메일, 전화번호, 입사일
//        직책, 급여, 수당, 상사번호, 부서번호
//        empno, fname, lname, email, phone, hdate
//        jobid, sal ,comm, mgrid, deptid  (해당 범위안에서 생성하도록 코딩하기)
// 기본정보 : 사번, 이름, 성, 이메일, 전화번호, 입사일(오늘날짜)  -> 키보드로 입력받음
// 추가정보는 난수를 이용해서 자동으로 생성되도록 코드화함 (메서드 - makeExtInfo)
// EmployeeV1Main, EmployeeService, EmployeeServiceImpl, EmployeeVO

import gahee.basic.SungJuk.SungJukServiceV2;
import gahee.basic.SungJuk.SungJukServiceV2Impl;
import gahee.basic.lab.EmployeeService;
import gahee.basic.lab.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeV1Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService empsrv = EmployeeServiceImpl.getInstance();
        // alt + enter/insert : 클래스 가져오기

        String menu = " ";

        while (true) {
            empsrv.displayMenu();
            menu = sc.next();

            switch (menu) {
                case "1": empsrv.newEmpInfo(); break;
                case "2": empsrv.showEmpInfo(); break;
                case "3": empsrv.showOneEmpInfo(); break;
                case "4": empsrv.modifyEmpInfo(); break;
                case "5": empsrv.removeEmpInfo(); break;
                case "0": System.exit(0); break;
                default: System.out.println("잘못 입력하셨습니다!! ");
            } //switch
        } //while

        //empsrv.makeExtInfo(null);

    } //main
} //class