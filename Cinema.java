package cinema;

public interface Cinema {
	public void reservation(Movie movie);

	public String admin_Login(Admin admin);

	public void member_reservation_info(Member member);

	public void screening_manage();

	public void popularity_rank();
	
	public String login(Member member);
	
	public void join(Member member);
	
	public void screening_manage(Movie movie);
	
	public String myPage(Member member);
	
}
