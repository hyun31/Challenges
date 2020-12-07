package cinema;

public class Member {
	private String id;
	private String name;
	private String password;
	private String phone;
	private String num;
	private String reservation_num;
	boolean set;
	public Member() {
	}
	
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	public String getPhone() {return phone;}
	public void setPhone(String phone) {this.phone = phone;}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getReservation_num() {
		return reservation_num;
	}

	public void setReservation_num(String reservation_num) {
		this.reservation_num = reservation_num;
	}
	
	public String toString() {
		return "[아이디: "+id+", 비번: "+password+", 이름: "+name+", 전화번호: "+phone+"]";
	}
}
	
