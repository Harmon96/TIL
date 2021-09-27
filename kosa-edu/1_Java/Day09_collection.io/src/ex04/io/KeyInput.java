package ex04.io;

import java.io.IOException;

public class KeyInput {

	public static void main(String[] args) {
		int su1 = 0, su2 = 0;
		System.out.println("데이터 입력을 종료하려면 ctrl + Z 를 누르세요.");
		
		try {
			while( (su1 = System.in.read()) != -1 ) {
				System.out.print((char)su1 + "  ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		
	}

}
