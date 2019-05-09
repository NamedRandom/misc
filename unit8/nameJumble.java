public class nameJumble{
	public static void main(String[] args){
		String strings[] = new String[]{"Allan Alda","John Wayne","Gregory Peck","Eve","Au Chu",""};
		for(String s:strings)
			System.out.println(jumble(s));
	}
	public static String jumble(String in){
		if(in.length()<8) return in+" (Too short)";
		return in.substring(2,in.length()-3);
	}
}
