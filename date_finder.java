import java.time.LocalDate;
class A
{
	public static void finder()
	{
		LocalDate today = LocalDate.now();
		LocalDate yesterday = today.minusDays(1);
		LocalDate tomorrow = today.plusDays(1);
		System.out.println("Todays Date"+today);
		System.out.println("Yesterdays Date"+yesterday);
		System.out.println("Tomorrows Date"+ tomorrow);
	}
}

class date_finder
{
	public static void main(String args[])
	{
		A.finder();
	}
}