package cinema;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CinemaApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cinema cinema = new CinemaImple();
		Member member = null;
		Movie movie1 = new Movie("#살아있다", "20200706", "20200708", "오전 11:00", "오후 6:00");
		Movie movie2 = new Movie("결백", "20200706", "20200708", "오전 10:00", "오후 4:00");
		// Movie(String name, String sDay, String eDay,String time1,String time2)
		Movie movie3 = new Movie("온워드: 단 하루의 기적", "20200706", "20200708", "오전 09:00", "오후 8:00");
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format_time1 = format1.format(System.currentTimeMillis());
		for (int i = 0; i < movie2.
				seat.length; i++) {
			for (int j = 0; j < movie2.seat[i].length; j++) {
				if (j < 9) {
					movie2.seat[i][j] = "[ " + (j+1) + "]";
				} else {
					movie2.seat[i][j] = "[" + (j+1) + "]";
				}
			}
		}

		while (true) {
			System.out.println("============비트시네마============");
			System.out.println(
					"현재 상영작: '" + movie1.getName() + "', '" + movie2.getName() + "', '" + movie3.getName() + "'");
			System.out.println();
			System.out.println("메뉴 : 1.영화예매 2.상영시간표 3.마이페이지 4.로그인 5.회원가입 0.종료");
			switch (scanner.nextInt()) {
			case 0:
				return;
			case 1: // 예매
				System.out.println("[상영시간표]");
				System.out.println("현재시간:" + format_time1);
				System.out.println();
				System.out.println("1.7월 6일(오늘) 2.7월 7일(화) 3.7월 8일(수)");
				switch (scanner.nextInt()) {
				case 0:
					return;
				case 1:
					System.out.println("[7월 6일 월요일]");
					System.out.printf("%s\t", movie1.getName());
					System.out.printf("| %s,%s", movie1.time1, movie1.time2);
					System.out.println();
					System.out.printf("%s\t", movie2.getName());
					System.out.printf("| %s,%s", movie2.time1, movie2.time2);
					System.out.println();
					System.out.printf("%s\t", movie3.getName());
					System.out.printf("| %s,%s", movie3.time1, movie3.time2);
					System.out.println();
					
					System.out.println("영화 선택");
					System.out.println("1. "+movie1.getName());
					System.out.println("2. "+movie2.getName());
					System.out.println("3. "+movie3.getName());
					switch (scanner.nextInt()) {
					case 1: {
						System.out.println("시간 선택");
						System.out.println("1."+movie1.time1);
						System.out.println("2."+movie1.time2);
						switch (scanner.nextInt()) {
						case 1: {
							cinema.
							reservation(movie1);
							break;
						}
						case 2: {
							break;
						}
						default:
							throw new IllegalArgumentException("Unexpected value: " + scanner.nextInt());
						}
						break;
					}
					case 2: {
						System.out.println("시간 선택");
						System.out.println("1."+movie2.time1);
						System.out.println("2."+movie2.time2);
						switch (scanner.nextInt()) {
						case 1: {
							cinema.
							reservation(movie2);
							break;
						}
						case 2: {
							break;
						}
						default:
							throw new IllegalArgumentException("Unexpected value: " + scanner.nextInt());
						}
						break;
					}
					case 3: {
						System.out.println("시간 선택");
						System.out.println("1."+movie3.time1);
						System.out.println("2."+movie3.time2);
						break;
					}
					default:
						break;
					}
					
				}
					break;
			case 2: // 2.상영시간표
				System.out.println("[상영시간표]");
				System.out.println("현재시간:" + format_time1);
				System.out.println();
				System.out.println("1.7월 6일(오늘) 2.7월 7일(화) 3.7월 8일(수)");
				switch (scanner.nextInt()) {
				case 0:
					return;
				case 1:
					System.out.println("[7월 6일 월요일]");
					System.out.printf("%s\t", movie1.getName());
					System.out.printf("| %s,%s", movie1.time1, movie1.time2);
					System.out.println();
					System.out.printf("%s\t", movie2.getName());
					System.out.printf("| %s,%s", movie2.time1, movie2.time2);
					System.out.println();
					System.out.printf("%s\t", movie3.getName());
					System.out.printf("| %s,%s", movie3.time1, movie3.time2);
					System.out.println();
					break;
				case 2:
					System.out.println("[7월 7일 화요일]");
					System.out.printf("%s\t", movie1.getName());
					System.out.printf("| %s,%s", movie1.time1, movie1.time2);
					System.out.println();
					System.out.printf("%s\t", movie2.getName());
					System.out.printf("| %s,%s", movie2.time1, movie2.time2);
					System.out.println();
					System.out.printf("%s\t", movie3.getName());
					System.out.printf("| %s,%s", movie3.time1, movie3.time2);
					System.out.println();
					break;
				case 3:
					System.out.println("[7월 8일 수요일]");
					System.out.printf("%s\t", movie1.getName());
					System.out.printf("| %s,%s", movie1.time1, movie1.time2);
					System.out.println();
					System.out.printf("%s\t", movie2.getName());
					System.out.printf("| %s,%s", movie2.time1, movie2.time2);
					System.out.println();
					System.out.printf("%s\t", movie3.getName());
					System.out.printf("| %s,%s", movie3.time1, movie3.time2);
					System.out.println();
					break;
				}
				break;
			case 3: /* 마이페이지 */
				System.out.println("[마이페이지]");
				while (true) {
					System.out.printf("아이디: %s\n이름: %s\n전화번호: %s\n", member.getId(), member.getName(),
							member.getPhone());
					System.out.println();
					System.out.println("0.나가기 1.예매내역");
					break;
				}
				switch (scanner.nextInt()) {
				case 0:
					break;
				case 1:
					System.out.println("예매번호: "+member.getReservation_num());
					break;
				}
				break;
			case 4: /* 로그인 */
				member = new Member();
				System.out.println("회원 로그인 서비스 입니다.");
				System.out.println("아이디를 입력하세요: ");
				member.setId(scanner.next());
				System.out.println("비밀번호를 입력하세요: ");
				member.setPassword(scanner.next());
				String result = cinema.login(member);
				System.out.println(result);
				break;
			case 5: /* 회원가입 */
				member = new Member();
				System.out.println("회원가입 서비스 입니다.");
				System.out.println("아이디 입력: ");
				member.setId(scanner.next());
				System.out.println("비밀번호 입력: ");
				member.setPassword(scanner.next());
				System.out.println("이름 입력: ");
				member.setName(scanner.next());
				System.out.println("전화번호 입력: ");
				member.setPhone(scanner.next());
				cinema.join(member);
				break;
			default: // 메인메뉴에서 디폴트
				break;
			}
		}
	}
}