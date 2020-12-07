package cinema;

public class Movie {

	public String time1; // 상영 시간(time[0]오전, time[1]오후)
	public String time2;
	private String name;
	private String sDay;
	private String eDay;
	public String[][] seat= new String[4][18];
	Member member;

	public Movie() {
	}

	public Movie(String name, String sDay, String eDay, String time1, String time2) {
		seat = new String[4][18];
		this.time1 = time1;
		this.time2 = time2;
		this.name = name;
		this.sDay = sDay;
		this.eDay = eDay;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getsDay() {
		return sDay;
	}

	public void setsDay(String sDay) {
		this.sDay = sDay;
	}

	public String geteDay() {
		return eDay;
	}

	public void seteDay(String eDay) {
		this.eDay = eDay;
	}

	public String toString() {
		return String.format("영화: %s 예매번호: %s", this.name, this.member.getReservation_num());
	}

}
