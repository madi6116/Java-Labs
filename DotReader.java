package dotlab;

import java.io.*;


public class DotReader 
{
	private BufferedReader			br;
	
	public DotReader(BufferedReader br)
	{
		this.br = br;
	}
	Dot readDot() throws IOException, DotException {
	
		 
		String line = br.readLine();
		String[] Line = line.split(",");
		String ColorName = Line[0];
		int X = Integer.parseInt(Line[1]);
		int Y = Integer.parseInt(Line[2]);
		int radius = Integer.parseInt(Line[3]);
		if (Line.length != 4) {
			DotException de = new DotException ("Invalid Size");
			throw de;
		}
		return null;
	
			
}
	public static void main(String[] args){
		
	}
}

