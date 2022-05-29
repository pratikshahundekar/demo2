package Tutorial3;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Pratiksha Vyankatrao Hundekar";
		
	/*	for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		} */
		
		
		//Second Way
		
	/*	String [] a = str.split("");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		} */
		
		//third way
		
		String [] b = str.split(" ");
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.print(b[i]+" ");
		}
	}

}
