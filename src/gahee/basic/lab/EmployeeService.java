package gahee.basic.lab;

public interface EmployeeService {

    void displayMenu();     // 보기화면 보여주기

    void newEmpInfo();      // 등록
    void showEmpInfo();     // 보여주기
    void showOneEmpInfo();  // 사용자가 선택한 것 보여주기
    void modifyEmpInfo();   // 수정
    void removeEmpInfo();   // 삭제

    void makeExtInfo(EmployeeVO ep); // 사원정보 만들기
}
