import java.util.*;

public class MainEntry {
	static 	int num; // 비디오 넘버링
	static String title = null; // 비디오 제목
	static String category = null; // 장르
	static boolean lend = false; // 1 : 대여가능, 0 : 대여불가
	static String lendName; // 대여자(고객명)
	static String lendDate; // 대여일자(오늘날짜)
	static int check = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VideoManager vid = new VideoManager();
		
		while(true) {
			menu();
			
			switch (check = sc.nextInt()) {
			case 1: // 추가
				vid.VideoAdd(num, title, category, lend);
				break;
			case 2: // 삭제
				vid.Videodel();				
				break;
			case 3: // 출력
				vid.VideoShow();
				break;
			case 4: // 수정
				vid.lend();
				break;
			case 5: // 종료
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);					
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
		} // while end
	}
		
	public static void menu() {
		System.out.println("=================");
		System.out.println("1. Video 추가");
		System.out.println("2. Video 삭제");
		System.out.println("3. Video 출력");
		System.out.println("4. Video 대여");
		System.out.println("5. 프로그램 종료");
		System.out.println("=================");
		System.out.print("숫자 입력 : ");
	}

	

}
