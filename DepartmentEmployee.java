public class DepartmentEmployee extends TenureEmployee {
    String department;
    void setDepartment(String department)
    {

    }
    void getDepartment()
    {
        System.out.println(department);
    }

    {
        DepartmentEmployee ameer = new DepartmentEmployee();
        ameer.setDepartment("Marketing");
        System.out.println(ameer.department);
    }
}
