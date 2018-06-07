import java.util.Scanner;
import java.util.Stack;
public class stack {
public static void main(String h[]) {
	int tr;
	int b=0;
	Scanner f=new Scanner(System.in);
	Stack<Integer> k=new Stack<Integer>();

	for(int i=0;i<10;i++) {
	int y=f.nextInt();
	if(y%2==0) {
	k.push(y);
	}
	}
	while(!k.isEmpty()) {
		tr=k.pop();
		b=tr+b;
	}
	System.out.print(b);
	f.close();	
}


}
