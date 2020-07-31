package jp.co.junit4.sample;

public class FizzBuzz {
	public static void main(String[] args) {
		for(int i = 1;i <=100;i++) {
			System.out.println(checkFizzBuzz(i));
		}
	}

	public static String checkFizzBuzz(int num) {

		if(num%3 == 0 && num%5 == 0){
			return "FizzBuzz";
		}else if(num%3 == 0) {
			return "Fizz";
		}else if(num%5 == 0) {
			return "Buzz";
		}else {
			String resultNum;
			Integer numI = new Integer(num);
			resultNum = numI.toString();
			return resultNum;
		}

	}
}
