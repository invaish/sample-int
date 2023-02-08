package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum=0, secNum=1, sum = 0;
		for(int i =1; i<11; i++)
		{
			firstNum = secNum;
				secNum = sum;
				sum = firstNum+secNum;
				System.out.println(sum);
	}
}
}