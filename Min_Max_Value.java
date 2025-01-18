import java.util.Scanner;
public class Min_Max_Value{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 numbers of 3-digit:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int max = a;
		int min = a;
		if(max<b){
			max=b;
		}
		if(max<c){
                        max=c;
                }
		if(max<d){
                        max=d;
                }
		if(max<e){
                        max=e;
                }
		if(min>b){
			min=b;
		}
		if(min>c){
                        min=c;
                }
		if(min>d){
                        min=d;
                }
		if(min>e){
                        min=e;
                }		
		System.out.println("Maximum: "+max);
		System.out.println("Minimum: "+min);

	}
}
