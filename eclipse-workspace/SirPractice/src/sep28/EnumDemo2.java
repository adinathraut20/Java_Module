package sep28;

enum Day1{
	SUN(1),MON(2),TUE(3),WED(4),THU(5),FRI(6),SAT(7);
	private int dayNo;
	Day1(int dayNo){
		this.dayNo = dayNo;
	}
	int getDayNo() {
		return dayNo;
	}
}

public class EnumDemo2 {

	public static void main(String[] args) {
		Day1 d = Day1.THU;
		System.out.println(d);
		System.out.println(d.getDayNo());
		
	}

}
