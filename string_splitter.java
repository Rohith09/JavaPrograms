class A
{
	public static String splitter(String s)
	{
		String words[]=s.split("\\s");
		String final_word=" ";
		for(int i=0;i<=words.length-1;i++)
		{
			String first_word=words[i].substring(0,1);
			String rest_word=words[i].substring(1);
			final_word+=first_word.toUpperCase()+rest_word+" ";
		}
		return final_word.trim();
	}
}
class string_splitter
{
	public static void main(String []args)
	{
		System.out.println(A.splitter("i study in galgotias university."));
	}
}