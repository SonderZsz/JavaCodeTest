package CustomerS;

public class CustomerList {
    private static Customer[] customers;// 用来保存用户对象的数组
    private static int total;// 记录以保存客户对象的数量

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }
//  将指定的客户添加到customers数组中
    public static boolean addCustomer(Customer customer) {
        if(total >= customers.length){
            return false;
        }
        customers[total] = customer;
        total++;
        return true;
    }
//  修改指定索引位置的客户信息
    public boolean replaceCustomer(int index, Customer cust){
        if(index < 0 || index >= total){
            return false;
        }
        customers[index] = cust;
        return true;
    }
//  删除指定索引位置上的客户
    public boolean deleteCustomer(int index){
        if(index < 0 || index >= total){
            return false;
        }
        for (int i = index; i < index - 1; i++) {
            customers[i] = customers[i + 1];
        }
//        最后一个数组元素置空
        customers[total - 1] = null;
        total--;
        return true;
    }
//  获取所有客户信息
    public static Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i]  = customers[i];
        }
        return custs;
    }
//  获取指定索引位置上的客户
    public Customer getCustomer(int index){
        if(index < 0 || index >= total){
            return null;
        }
        return customers[index];
    }
//  获取客户的数量
    public int getTotal(){
        return total;
    }
}
