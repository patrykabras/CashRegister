package main;

/**
 * helper
 */
public class Helper {

    public static String padEnd(String s, Integer desired,char c){
		int l=s.length();
		for(int i=0;i<desired-l;i++) s+=c;
		return s;
	}
	public static String padEnd(String s, Integer desired){
		return padEnd(s, desired,' ');
	}
}