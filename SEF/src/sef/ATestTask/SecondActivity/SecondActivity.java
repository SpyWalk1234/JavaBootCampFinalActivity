package sef.ATestTask.SecondActivity;

// Complete Code
public class SecondActivity {
		public int getSum(int x, int y) {
			return x + y;
		}
		
		public int getSubtract(int x, int y) {
			return x - y;
		}
		
		public int getMultiply(int x, int y) {
			return x * y;
		}
		
		public int getDivide(int x, int y) {
			if (y != 0) {
				return x / y;
			} else {
				throw new ArithmeticException("Impossible to devide by 0");
			}
		}

}
