package gahee.basic.lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    // 멤버변수 선언
    List<EmployeeVO> empdata = new ArrayList<>();
    EmployeeVO ep = null;

    // 단일 상수 선언
    static final String[] JOBID = {"FI_MGR", "AC_MGR", "SA_MAN", "IT_PROG", "ST_CLERK"};
    static int MINSAL = 2000;   // 최소 급여
    static int MAXSAL = 40000;  // 최대 급여
    static int MAXDEPT = 270;   // 최대 부서번호
    static int MAXMGRID = 206;  // 최대 상사번호

    // 싱글톤 블럭 시작
    private static EmployeeService emsrv = null;

    private EmployeeServiceImpl() {
    }

    public static EmployeeService getInstance() {
        if (emsrv == null) emsrv = new EmployeeServiceImpl();
        return emsrv;
    }
    // 싱글톤 블럭 끝

    // 화면에 프로그램 메뉴를 출력
    @Override
    public void displayMenu() {
        String displaymenu =
                       "======================= \n" +
                        " 사원관리 프로그램 V1 \n" +
                        "======================= \n" +
                        " 1) 사원정보 입력 \n" +
                        " 2) 사원정보 조회 \n" +
                        " 3) 사원정보 상세조회 \n" +
                        " 4) 사원정보 수정 \n" +
                        " 5) 사원정보 삭제 \n" +
                        " 0) 프로그램 종료 \n" +
                        "======================= \n" +
                        "  작업을 선택하세요 : ";
        System.out.print(displaymenu);
    }

    // 새로운 사원정보를 입력받음
    @Override
    public void newEmpInfo() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("사번을 입력하세요.");
            String empno = sc.next();
            System.out.print("이름을 입력하세요.");
            String fname = sc.next();
            System.out.print("성을 입력하세요.");
            String lname = sc.next();
            System.out.print("이메일을 입력하세요.");
            String email = sc.next();
            System.out.print("전화번호를 입력하세요.");
            String phone = sc.next();
            System.out.print("입사일을 입력하세요.");
            String hdate = sc.next();
// 중요부분 3줄
            EmployeeVO ep = new EmployeeVO(empno, fname, lname, email, phone, hdate);
            // 입력받은 정보에 대한 객체 생성

            emsrv.makeExtInfo(ep);   // 사원 추가정보를 생성해서 사원정보로 저장
            empdata.add(ep);

        } catch (Exception ex) {
            System.out.println("잘못 입력하셨습니다.");
            return;    // 오류 발생 시 실행을 중단하고 main으로 복귀
        }

    }

    // 사원 기본정보 (사번, 이름, 성, 이메일, 전화번호, 입사일)등을
    // 리스트 형태로 출력함
    @Override
    public void showEmpInfo() {
        String fmt = "사원번호: %s, 이름: %s, 성: %s, \n" +
                "이메일: %s, 전화번호: %s, 입사일: %s \n";
        for (EmployeeVO ep : empdata) {
            System.out.printf(fmt, ep.getEmpno(), ep.getFname(), ep.getLname(),
                    ep.getEmail(), ep.getPhone(), ep.getHdate());
        }
    }

    @Override
    public void showOneEmpInfo() {
        String fmt = "사원번호: %s, 이름: %s, 성: %s,  \n" +
                "이메일: %s, 전화번호:%s, 입사일: %s,\n" +
                "직책: %s, 급여: %s, 수당 : %s, \n" +
                "상사번호 : %s, 부서번호 : %s \n";

        Scanner sc = new Scanner(System.in);

        System.out.print("조회할 사원번호는? ");  // 0부터 시작
        String empno = sc.next();

        EmployeeVO ep = null;

        for (EmployeeVO e : empdata) {            // 찾는 데이터가 동적배열에 존재한다면
            if (e.getEmpno().equals(empno)) {     // ep 변수에 저장하고 반복문을 종료함
                ep = e;
                break;
            }
        } //for

        System.out.printf(fmt, ep.getEmpno(), ep.getFname(), ep.getLname(),
                ep.getEmail(), ep.getPhone(), ep.getHdate(),
                ep.getJobid(), ep.getSal(), ep.getComm(),
                ep.getComm(), ep.getDeptid());

    } //showOneEmpInfo

    @Override
    public void modifyEmpInfo() {
    }

    @Override
    public void removeEmpInfo() {
    }

    @Override
    public void makeExtInfo(EmployeeVO ep) {
        Random rnd = new Random();

        int key = rnd.nextInt(JOBID.length);
        String jobid = JOBID[key];

        int sal = rnd.nextInt(MAXSAL) + MINSAL;   // 급여 범위 : 2천 ~ 4억
        int mgrid = rnd.nextInt(MAXMGRID) + 100;  // 상사번호 범위 : 100 ~ 205
        int deptid = (rnd.nextInt(MAXDEPT) % 100) * 10;  // 사원번호 범위: 10 ~ 110

        DecimalFormat df = new DecimalFormat("#.#");
        double comm = Double.parseDouble(df.format(rnd.nextDouble() / 2));
        // 수당 범위 : 0.1 ~ 0.4
//        System.out.println(jobid);
//        System.out.println(sal);
//        System.out.println(mgrid);
//        System.out.println(deptid);
//        System.out.println(comm);

        ep.setJobid(jobid);
        ep.setSal(sal);
        ep.setComm(comm);
        ep.setMgrid(mgrid + "");
        ep.setDeptid(deptid + "");
    }

}