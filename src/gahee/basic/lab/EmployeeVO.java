package gahee.basic.lab;

public class EmployeeVO {

    protected String empno;     // 사번 - 수식에 사용하지 않으면 문자로 타입지정해도됨
    protected String fname;  // 이름
    protected String lname;  // 성
    protected String email;
    protected String phone;
    protected String hdate;  // 입사일
    protected String jobid;  // 직책
    protected int sal;       // 급여
    protected double comm;   // 수당
    protected String mgrid;     // 상사번호
    protected String deptid;    // 부서번호

    public EmployeeVO() { }

    public EmployeeVO(String empno, String fname, String lname, String email,
                      String phone, String hdate) {
        this.empno = empno;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.hdate = hdate;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHdate() {
        return hdate;
    }

    public void setHdate(String hdate) {
        this.hdate = hdate;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public double getComm() { return comm; }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public String getMgrid() {
        return mgrid;
    }

    public void setMgrid(String mgrid) {
        this.mgrid = mgrid;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    @Override  // Object 클래스 toString
    public String toString() {
        String fmt = "emp { empno: %s, fname: %s, lname: %s, \n"+
                            "email: %s,phone: %s, hdate: %s," +
                           " jobid : $s, sal : %s, comm : %s,\n" +
                           " mgrid : %s, deptid : %s } \n" ;
        String result = String.format (fmt, empno, fname, lname, email, phone, hdate,
                                            jobid, sal, comm, mgrid, deptid);
        return result;
    }
}
