import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void isPowerOfFourTest1(){
        int n = 16;
        boolean actual = new Solution().isPowerOfFour(n);

        Assert.assertTrue(actual);
    }
    @Test
    public void isPowerOfFourTest2(){
        int n = 5;
        boolean actual = new Solution().isPowerOfFour(n);

        Assert.assertFalse(actual);
    }
    @Test
    public void isPowerOfFourTest3(){
        int n = 1;
        boolean actual = new Solution().isPowerOfFour(n);

        Assert.assertTrue(actual);
    }

}
