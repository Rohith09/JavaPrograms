import java.util.*;
class TestCollection
{
	public static void main(String Atgs[])
	{
		ArrayList <String> list = new ArrayList<String>();
		list.add("Rohith");
		list.add("KAus");
		list.add("Rex");
		ArrayList <String> list2 = new ArrayList<String>();
		list2.add("Rai");
		list2.add("Nag");
		list2.add("Rex");
		//list.addAll(list2);
		//list.removeAll(list2);
		list.retainAll(list2);
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}