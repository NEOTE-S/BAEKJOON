import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = (int)Math.pow(2,N) + 1;
        ans = ans * ans;
        System.out.print(ans);
	}
}