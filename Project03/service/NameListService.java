package Project03.service;

import Project03.domain.*;

public class NameListService {
    private Employee[] employees;

    public NameListService() {
//  1. 根据项目提供的Data类构建相应大小的employees数组
//  2. 再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，
//     以及相关联的Equipment子类的对象
//  3. 将对象存于数组中
        employees = new Employee[Data.EMPLOYEES.length];

        for (int i = 0; i < employees.length; i++) {
            // 获取员工类型
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);

            // 获取Employee员工四个基本信息
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);

            Equipment equipment;
            double bonus;
            int stock;

            switch (type) {
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case Data.PROGRAMMER:
                    equipment = creatEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary,equipment);
                    break;
                case Data.DESIGNER:
                    equipment = creatEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case Data.ARCHITECT:
                    equipment = creatEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }
    }

    private Equipment creatEquipment(int index) {
        // 获取类型
        int type = Integer.parseInt(Data.EQUIPMENTS[index][0]);

        String model = Data.EQUIPMENTS[index][1];

        switch (type) {
            case Data.PC:// 21
                String display = Data.EQUIPMENTS[index][2];
                return new Pc(model, display);

            case Data.NOTEBOOK:// 22
                double price = Double.parseDouble(Data.EQUIPMENTS[index][2]);
                return new NoteBook(model, price);

            case Data.PRINTER://23
                String type1 = Data.EQUIPMENTS[index][2];
                return new Printer(model, type1);
        }
        return null;
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        throw new TeamException("找不到指定员工！");
    }
}
