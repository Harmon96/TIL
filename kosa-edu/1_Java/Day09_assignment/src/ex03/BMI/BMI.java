package ex03.BMI;

public class BMI {
	String name;
	double weight;
	double height;
	double bmi_score;
	String bmi_result;

	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBmi_score() {
		return bmi_score;
	}
	public void setBmi_score(double bmi_score) {
		this.bmi_score = weight / ((height / 100.0) * (height/100.0));
	}
	public String getBmi_result() {
		return bmi_result;
	}
	public void setBmi_result(String bmi_result) {
		this.bmi_result = result();
	}
	// 생성자

	public BMI() {}
	
	public BMI(String name, double weight, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	public BMI(String name, double weight, double height, double bmi_score, String bmi_result) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.bmi_score = weight / ((height / 100.0) * (height/100.0));
		this.bmi_result = result();
	}
	@Override
	public String toString() {
		return "BMI정보 :  이름=" + name + ", 키=" + weight + ", 몸무게=" + height + ", bmi지수=" + bmi_score + ", 결과="
				+ bmi_result + "]";
	}
	public String result() {
		this.bmi_score = weight / ((height / 100.0) * (height/100.0));
		if (bmi_score < 18.5)	bmi_result = "체중부족";
		else if (bmi_score <= 22.9)	bmi_result = "정상";
		else if (bmi_score <= 24.9)	bmi_result = "과체중";
		else	bmi_result = "비만";
		return bmi_result;
	}
}
