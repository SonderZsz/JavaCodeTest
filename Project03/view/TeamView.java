package Project03.view;

import Project03.domain.Employee;
import Project03.domain.Programmer;
import Project03.service.NameListService;
import Project03.service.TeamException;
import Project03.service.TeamService;

import java.time.Year;

public class TeamView {
    private NameListService listSvc = new NameListService();
    private TeamService teamSvc = new TeamService();

    public void enterMainMenu(){
        boolean loopFlag = true;
        while (loopFlag){
            listAllEmployees();

            System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");

            char menu = TSUtility.readMenuSelection();
            switch (menu){
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.print("确认是否退出(Y/N)：");
                    char isExit = TSUtility.readConfirmSelection();
                    if(isExit == 'Y'){
                        loopFlag = false;
                    }
                    break;
            }
        }
    }

    private void listAllEmployees(){
        System.out.println("\n-------------------------------开发团队调度软件--------------------------------\n");
        Employee[] employees = listSvc.getAllEmployees();

        if (employees == null || employees.length == 0){
            System.out.println("公司没有员工！");
        }else {
            System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票\t领用设备");
        }

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        System.out.println("-------------------------------------------------------------------------------");
    }

    private void getTeam(){
        System.out.println("\n--------------------团队成员列表---------------------\n");

        Programmer[] team = teamSvc.getTeam();
        if (team == null || team.length == 0){
            System.out.println("公司没有员工！");
        }else{
            System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
            for (int i = 0; i < team.length; i++) {
                System.out.println(team[i].getDetailsForTeam());
            }
        }

        System.out.println("-----------------------------------------------------");
    }

    private void addMember(){
        System.out.println("---------------------添加成员---------------------");
        System.out.print("请输入要添加的员工ID：");
        int id = TSUtility.readInt();

        Employee emp = null;
        try {
            emp = listSvc.getEmployee(id);
            teamSvc.addMember(emp);
            System.out.println("添加成功！");
            TSUtility.readReturn();
        } catch (TeamException e) {
            System.out.println("添加失败"+e.getMessage());
        }
    }

    private void deleteMember(){
        System.out.println("---------------------删除成员---------------------");
        System.out.print("请输入要删除员工的TID：");
        int tid = TSUtility.readInt();
        System.out.print("确认是否删除(Y/N)：");
        char yn = TSUtility.readConfirmSelection();
        if (yn == 'N')
            return;
        try {
            teamSvc.removeMember(tid);
            System.out.println("删除成功");
        } catch (TeamException e) {
            System.out.println("删除失败，原因：" + e.getMessage());
        }
        // 按回车键继续...
        TSUtility.readReturn();
    }

    public static void main(String[] args) {
        TeamView view = new TeamView();
        view.enterMainMenu();
    }
}
