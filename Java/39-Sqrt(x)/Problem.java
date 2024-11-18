// Time Limit Exceeded
public class Problem {
    static int mySqrt(int x) {
        double i = 1;
        long y = 0;
        
        while (i <= x) {
            double result = (i + x/i) / 2;
            if ((int) result * result == result) return (int) (y = result);
            i++;
        }
        return (int) y;
    }
    
    public static void main(String[] args) {
		System.out.println(mySqrt(9));
	}
}
