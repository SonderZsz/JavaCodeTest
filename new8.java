import org.junit.Test;

/**
 *
 *
 *
 *
 */
public class new8 {
    @Test
    public void LambdaTest(){
        Runnable r1 = () -> System.out.println("aaa");
        r1.run();

        System.out.println( );

        Runnable r2 = () -> System.out.println("bbb");
        r2.run();
    }


}
