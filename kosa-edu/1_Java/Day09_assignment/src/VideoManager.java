import java.util.ArrayList;
import java.util.Scanner;

public class VideoManager extends Video {
	
	ArrayList<Video> list = new ArrayList<Video>(); // ArrayList 생성.

	public void VideoAdd (int num, String title, String category, boolean lend) {
		Scanner sc = new Scanner(System.in);
		System.out.println("비디오 번호, 제목, 장르를 입력해주세요.");
		
		num = sc.nextInt();
		title = sc.next();
		category = sc.next();
		lend = false;
		
		Video vid = new Video(num, title, category, lend);
		list.add(vid);	
	}
	
	public void VideoShow () {
		System.out.println("저장된 비디오 개수 : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println("Video 제목 : " + list.get(i).title);
			System.out.println("Video 장르 : " + list.get(i).category);
			if (list.get(i).lend == false) {
				System.out.println("Video 대여여부 : " + "대여가능");
			} 
			else {
				System.out.println("Video 대여여부 : " + "대여불가");
			}		
		}
	} // show end

	public void Videodel() {
		Scanner sc = new Scanner(System.in);

		System.out.print("삭제할 비디오 번호 : ");
		num = sc.nextInt();
		
		if (list.size() == 0) {
			System.out.println("삭제할 비디오가 없습니다.");
		} else {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getNum() == num)
					list.remove(i);
			}
			System.out.println("삭제완료");
		}
	}
	

	public void lend() {
		
		while(true) {
			System.out.println("비디오대여 : 1, 반납 : 2, 메뉴로 나가기 : 3");
			Scanner sc = new Scanner(System.in);
			int lend_check = sc.nextInt();
			
			for (int i = 0; i < list.size(); i++) {
				int num = 0;
				if (lend_check == 1) { // 대여
					System.out.println("대여할 비디오의 번호를 입력해주세요.");
					num = sc.nextInt();
					if (list.get(i).getNum() == num) {
						list.get(i).setLend(true);
					}
					System.out.println("대여완료");
					break;
				} 
				else if ( lend_check == 2){ // 반납
					System.out.println("반납할 비디오의 번호를 입력해주세요.");
					num = sc.nextInt();
					for (int j = 0; j < list.size(); j++) {
						list.get(j).getNum();
						list.get(j).setLend(false);
						
					}
					System.out.println("반납완료");
					break;	
				}
				
				else System.out.println("비디오대여 : 1, 반납 : 2"); break;

			} break;				
			
		}
		
	}

}
