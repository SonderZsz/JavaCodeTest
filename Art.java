class Art {
    public static void main(String[] args) {
//        声明并初始化二维数组
        int[][] num = new int[10][];

//        给数组元素赋值
        for (int i = 0; i < num.length; i++) {
            num[i] = new int[i+1];
//        给首末元素赋值
            num[i][0]=1;
            num[i][i]=1;
//        给非首末元素赋值
            if (i > 1){
                for (int j = 1; j < num[i].length - 1; j++) {
                    num[i][j] = num[i-1][j-1] + num[i-1][j];
                }
            }
        }

//        遍历二维数组
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] +"  ");
            }
            System.out.println();
        }

    }
}
