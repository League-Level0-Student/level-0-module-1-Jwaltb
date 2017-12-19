
public class MyAges {
	public static void main(String[] args) {

		for (int i = 2000; i <= 2017; i++) {
			if(i-2000==1) {
				System.out.println("In " +i+ " I was " +(i-2000)+ " year old");
			}
			else if(i==2017) {
				System.out.println("In " +i+ " I am " +(i-2000)+ " years old");
			}
			else {
				System.out.println("In " +i+ " I was " +(i-2000)+ " years old");
			}
			for (int x = 2018;x<= 2101; x++) {
				if(x-2000==101) {
				System.out.println("In " +x+ " I will be " +(x-2000)+ " dead");
				}
				else {
					System.out.println("In " +x+ " I will be " +(x-2000)+ " years old");
				}
			}
		}
	}
}
