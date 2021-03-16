/* SKU CoE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 6 , Number 7 */

import java.util.StringTokenizer;

public class StringTokenizerEx
{
	public static void main(String[] args)
	{
		String query = "name=sooyoung&addr=seoul&age=24";
		StringTokenizer st = new StringTokenizer(query, "&");
		
		int n = st.countTokens(); // 분리된 토큰 개수
		System.out.println("토큰 개수 = " + n);
		while(st.hasMoreTokens()) // for(int i=0; i<n; i++)와 동일
		{
			String token = st.nextToken();
			System.out.println(token); // 토큰 출력
		}
	}
}
