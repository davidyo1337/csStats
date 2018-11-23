package main;

import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) {
		new Window();
		System.out.println(calculateID("STEAM_0:0:125314026"));
	}
	
	public static String calculateID(String steamid)
	{
		String[] id_split = steamid.split(":");
			   BigInteger steam64id = new BigInteger("76561197960265728").add(new BigInteger("" + (Integer.parseInt(id_split[2]) * 2))) ;
			   steam64id  = steam64id.add(new BigInteger("" + id_split[1]));
			   
			    return steam64id.toString();
	}
	
}
