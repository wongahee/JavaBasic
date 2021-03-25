package gahee.basic.day08.hr;

public class Departments {
    
    // 멤버변수
    private int department_id;  // 다른 클래스에서 사용시 타입형을 동일시해야 사용하기좋음
    private String department_name;
    private int manager_id;
    private int location_id;

    // 생성자
    public Departments(int department_id, String department_name,
                   int manager_id, int location_id) {
    this.department_id = department_id;
    this.department_name = department_name;
    this.manager_id = manager_id;
    this.location_id = location_id;
    }

    // setter/getter
    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }
}
