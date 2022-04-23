package Project03.Test;

import Project03.domain.Employee;
import Project03.service.*;

public class NameListServiceTest {
    public static void main(String[] args) {
        NameListService service =new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

//        try {
//            Employee employee = service.getEmployee(1);
//            System.out.println(employee);
//        } catch (TeamException e) {
//            e.printStackTrace();
//        }
    }
}
