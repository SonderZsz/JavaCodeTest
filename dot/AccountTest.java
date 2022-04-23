package dot;

public class AccountTest {
    public static void main(String[] args) {
         Account mhy = new Account(1122,20000,0.045);
         mhy.withdraw(30000);
         System.out.println(mhy.getBalance());
    }
}
