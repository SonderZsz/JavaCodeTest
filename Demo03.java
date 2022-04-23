public class Demo03 {
    public static void main(String[] args) {
//  查找
//  线性查找
        String[] name = new String[]{"dsad","ancs","a","f","vn"};
        String dest = "vn";

        boolean isFlag = true;
        for (int i = 0; i < name.length; i++) {
            if(dest.equals(name[i])){
                System.out.println("找到了指定元素，位置于：" + i);
                isFlag = false;
                break;
            }
        }
        if(isFlag){
            System.out.println("NotFound!");
        }
    }
}

