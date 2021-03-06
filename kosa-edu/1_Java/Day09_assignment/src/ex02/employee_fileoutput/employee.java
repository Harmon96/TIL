package ex02.employee_fileoutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/* 문제2] employee.txt ( file 이용 )
 *
 * 이름, 직급, 부서 입력해서 저장하기
 */
public class employee {

	public static void main(String[] args) {
		
		int num = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("사원의 정보를 저장합니다.");
		try {
			OutputStream os = new FileOutputStream("employee.txt", true);
			System.out.print("이름 : ");
			String name = br.readLine() + '.';
			System.out.print("부서 : ");
			String dept = br.readLine() + '.';
			System.out.print("직급 : ");
			String posi = br.readLine() + '.';
			
			os.write(name.getBytes());
			os.write(dept.getBytes());
			os.write(posi.getBytes());

			os.close();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
		System.out.println("저장완료");
		

	}

}
