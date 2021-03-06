package ex01.collection.map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx01 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("kosa", "123");
		map.put("kingsmile", "1004");
		map.put("sbs", "hi");
		map.put("bit", "123");
		
		// key 값이 같으면 안들어감. value값은 같아도 들어감
	
		System.out.println("요쇼 개수 : " + map.size());
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력하세요. ");
			System.out.println("id : ");
			String id = sc.nextLine().trim();
			System.out.println("password : ");
			String pwd = sc.nextLine().trim();
			System.out.println();
			
			if( !map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
				continue;
			} else {
				if( !map.get(id).equals(pwd)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println(id + "와 " + pwd + "가 일치합니다.");
					break;
				}
			} // out if end
			
		} // while end
		
		
		
		
		
		
	}

}
