package ex03.di;

public class MainEntry {
	public static void main(String[] args) {
		
		IRecordImpl record = new IRecordImpl();
		IRecordViewImpl view = new IRecordViewImpl();
		
		//조립
		view.setRecord(record);
		view.input();
		view.print();
	}
}
