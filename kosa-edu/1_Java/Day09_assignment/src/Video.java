
public class Video {
	int num; // 비디오 넘버링
	String title; // 비디오 제목
	String category; // 장르
	boolean lend; // 1 : 대여가능, 0 : 대여불가
	String lendName; // 대여자(고객명)
	String lendDate; // 대여일자(오늘날짜)
	
	// setter, getter
	public String getTitle() {
		return title;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isLend() {
		return lend;
	}
	public void setLend(boolean lend) {
		this.lend = lend;
	}
	public String getLendName() {
		return lendName;
	}
	public void setLendName(String lendName) {
		this.lendName = lendName;
	}
	public String getLendDate() {
		return lendDate;
	}
	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}
	
	@Override
	public String toString() {
		return "Video [title=" + title + ", category=" + category + ", lend=" + lend + ", lendName=" + lendName
				+ ", lendDate=" + lendDate + "]";
	}
	// 생성자
	
	
	
	public Video(int num, String title, String category, boolean lend) {
		super();
		this.num = num;
		this.title = title;
		this.category = category;
		this.lend = lend;
	}
	public Video(int num, String title, String category, boolean lend, String lendName, String lendDate) {
		super();
		this.num = num;
		this.title = title;
		this.category = category;
		this.lend = lend;
		this.lendName = lendName;
		this.lendDate = lendDate;
	}
	public Video() {
		super();
	}
	
}
