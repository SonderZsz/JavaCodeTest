package CustomerS;

public class CustomerView {
    private CustomerList customerList = new CustomerList(10);
    //  显示客户学习管理软件界面的方法
    public void enterMainMenu(){

        boolean isFlag = true;
        while (isFlag) {
            System.out.println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出\n");
            System.out.print("                   请选择(1-5)：");

            char menu = CMUtility.readMenuSelection();
            switch (menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("确认是否退出(Y/N)：");
                    char isExit = CMUtility.readConfirmSelection();
                    if(isExit == 'Y'){
                        isFlag = false;
                    }
            }
            isFlag = false;
        }
    }
    //  添加客户的操作
    private void addNewCustomer(){
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(4);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(15);
        System.out.print("邮箱：");
        String email = CMUtility.readString(15);
//      将上述数据封装到对象中
        Customer customer = new Customer(name, gender, age, phone, email);
        boolean flag = CustomerList.addCustomer(customer);
        if (flag) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("----------------记录已满,无法添加-----------------");
        }

    }
    //  修改客户的操作
    private void modifyCustomer(){

    }
    //  删除客户的操作
    private void deleteCustomer(){

    }
    //  显示客户列表的操作
    private void listAllCustomers(){
        System.out.println("---------------------------客户列表---------------------------");
        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("没有客户记录！");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t邮箱");
            Customer[] custs = CustomerList.getAllCustomers();
            for (int i = 0; i < custs.length; i++) {
            System.out.println(i + 1 + "\t" + custs[i].getName() + "\t" +
                    custs[i].getGender() + "\t" + custs[i].getAge() + "\t\t" +
                    custs[i].getPhone() + "\t" + custs[i].getEmail());
            }
        }
        System.out.println("-------------------------客户列表完成-------------------------");
    }

    public static void main(String[] args){
        CustomerView cust  = new CustomerView();
        cust.enterMainMenu();

    }

}
