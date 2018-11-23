package main;

import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) {
		new Window();
		System.out.println(calculateID("STEAM_0:0:125314026"));
	}
	
	 //CREATED BY MARKUS (PO-)SCHLITZ
	
	public static String calculateID(String steamid)
	{
		String[] id_split = steamid.split(":");
			   BigInteger steam64id = new BigInteger("76561197960265728").add(new BigInteger("" + (Integer.parseInt(id_split[2]) * 2))) ;
			   steam64id  = steam64id.add(new BigInteger("" + id_split[1]));
			   
			    return steam64id.toString();
	}
	
}

/*
 *  steamID STEAM_0:0:142231653
	steamID3 [U:1:284463306]
		steamID 76561198244729034
		
		API KEY 648011BEFF8552A866AAE3F2D64D3AFD
 */