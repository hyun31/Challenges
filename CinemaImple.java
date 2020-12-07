package cinema;

import java.util.Calendar;
import java.util.Scanner;

public class CinemaImple implements Cinema{
	Scanner scanner = new Scanner(System.in);
	private Member member;
	private Member[] members;
	private Movie movie;
	private int count;
	int a,b;
	public CinemaImple() {
		members = new Member[3];
		count = 0;
	}
	/* 회원가입 */
	public void join(Member member) {
		for( Member m : members) {
			if(m != null && m.getId().equals(member.getId())) {
				System.out.println("중복된 아이디 입니다.");
			}
		}
		members[count] = member;
		members[count].set = false;
		count++;
	}
	/* 로그인 */
	public String login(Member member) {
		String result = "로그인 실패";
		for(int i=0; i<count; i++) {
			if(member.getId().equals(members[i].getId())
					&& member.getPassword().equals(members[i].getPassword())) {
				result = "로그인 성공";
				members[i].set=true;
				break;
			}
		}
		return result;
	}
	
	@Override
	public String admin_Login(Admin admin) {
		String result = "로그인 실패";
		if(admin.getId().equals("Admin") && admin.getPassword().equals("admin")) {
			result = "로그인 성공";
		}
		return result;
	}

	@Override
	public void member_reservation_info(Member member) {  //회원 예약정보
		for(int i=0;i<count;i++) {
			if(member.getId().equals(members[i].getId())) {
				System.out.println("이름 : "+members[i].getName());
				System.out.println("폰번호 : "+members[i].getPhone());
				break;
			}
		}
	}
	@Override
	public void screening_manage() {  //상영관리
		
	}

	@Override
	public void popularity_rank() {  //인기순위
		
	}

	@Override
	public void reservation(Movie movie) {

		System.out.println(
				"    ===========================================스크린=============================================");
		System.out.println();	
		System.out.print("A열:");
		for(int j=0;j<6;j++) {
			System.out.print(movie.seat[0][j]+" ");
		}
		System.out.print(" ");
		for(int j=6;j<12;j++) {
			System.out.print(movie.seat[0][j]+" ");
		}
		System.out.print(" ");
		for(int j=12;j<18;j++) { 
			System.out.print(movie.seat[0][j]+" ");
		}
		System.out.println();
		
		System.out.print("B열:");
		for(int j=0;j<6;j++) {
			System.out.print(movie.seat[1][j]+" ");
		}
		System.out.print(" ");
		for(int j=6;j<12;j++) {
			System.out.print(movie.seat[1][j]+" ");
		}
		System.out.print(" ");
		for(int j=12;j<18;j++) { 
			System.out.print(movie.seat[1][j]+" ");
		}
		System.out.println();
		
		System.out.print("C열:");
		for(int j=0;j<6;j++) {
			System.out.print(movie.seat[2][j]+" ");
		}
		System.out.print(" ");
		for(int j=6;j<12;j++) {
			System.out.print(movie.seat[2][j]+" ");
		}
		System.out.print(" ");
		for(int j=12;j<18;j++) { 
			System.out.print(movie.seat[2][j]+" ");
		}
		System.out.println();
		
		System.out.print("D열:");
		for(int j=0;j<6;j++) {
			System.out.print(movie.seat[3][j]+" ");
		}
		System.out.print(" ");
		for(int j=6;j<12;j++) {
			System.out.print(movie.seat[3][j]+" ");
		}
		System.out.print(" ");
		for(int j=12;j<18;j++) { 
			System.out.print(movie.seat[3][j]+" ");
		}
		System.out.println();
		
		System.out.println("좌석 선택");
		System.out.println("1.A열 2.B열 3.C열 4.D열");
		a = scanner.nextInt();
		System.out.println("자리 번호 선택");
		b = scanner.nextInt();
		if(movie.seat[a-1][b-1].equals("[--]")) {
			System.out.println("이미 예매된 좌석입니다");
			return;
		}
		movie.seat[a-1][b-1] = "[--]";
		String c = null;
		if(b<10) {
			c=a+"0"+b;
		}
		else{
			c=a+""+b;
			}
		System.out.println("좌석번호:"+c+"로 예매되었습니다");
		 int sum = 10000;
		 System.out.println("총 금액:" + sum + "원입니다. 카드번호를 입력해주세요.");
               String banknum = scanner.next();
               System.out.printf("%s 카드에서 %s원 결제되었습니다 \r.", banknum, sum); 
	}
	@Override
	   public void screening_manage(Movie movie) {  //상영관리
	      int year, month, date;
	      long result;
	      
	      
	      String name = movie.getName();
	      String m1 = movie.getsDay();
	      String m2 = movie.geteDay();
	      
	      Calendar sDay = Calendar.getInstance();
	      Calendar eDay = Calendar.getInstance();
	      //시작
	      year = Integer.parseInt(m1.substring(0, 4));
	      month = Integer.parseInt(m1.substring(4, 6));
	      date = Integer.parseInt(m1.substring(6, 8));
	      sDay.set(year, month - 1, date);
	      // 끝
	      year = Integer.parseInt(m2.substring(0, 4));
	      month = Integer.parseInt(m2.substring(4, 6));
	      date = Integer.parseInt(m2.substring(6, 8));
	      eDay.set(year, month - 1, date);
	      // 개봉 기간
	      result = (eDay.getTimeInMillis() - sDay.getTimeInMillis()) 
	            / (1000 * 60 * 60 * 24);
	      
	   }
	@Override
	public String myPage(Member member) {
		
		return null;
	}
}
