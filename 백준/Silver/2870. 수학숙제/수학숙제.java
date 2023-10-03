import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int i, j, n = Integer.parseInt(in.readLine());
		StringBuilder res = new StringBuilder();
		ArrayList<BigInteger> paper = new ArrayList<>();
		String line[];
		for(i=0;i<n;i++){
			line = in.readLine().split("\\D");
			for(j=0;j<line.length;j++)
				if(!line[j].equals("")) paper.add(new BigInteger(line[j]));
		}
		paper.sort(null);
		n = paper.size();
		for(i=0;i<n;i++) res.append(paper.get(i)+"\n");
		out.write(res.toString());
		out.close();
		in.close();
	}
}