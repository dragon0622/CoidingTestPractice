import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
	
		bw.write(Integer.toString(get_zeros(n)));
		bw.flush();
		bw.close();
	}
	
	public static int get_zeros(int number) {
		int cnt = 0;
		
		while(number >= 5) {
			cnt = cnt + number / 5;
			number = number / 5;
		}
		
		return cnt;
	}
}