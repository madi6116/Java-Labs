package stacklab;

import java.io.*;
import java.util.Stack;


public class Lister {
	
	private File file;
	private boolean showHidden;
	
	public Lister(File f, boolean showH) {
		file = f;
		showHidden = showH;
	}
	
	public void list() {
		listFilesRecurse(file);
		listFilesStack(file);
	}
    
	private void listFilesRecurse(File f) {
		if(f.isDirectory()) {
			File[] files = f.listFiles();
			for(File file:files) {
				listFilesRecurse(file);	
			}
		}
		else {
			if(showHidden || !f.isHidden()) {
				System.out.println(f.getName());
			}
		}
			
	}
    
 
    private void listFilesStack(File f) {
        Stack<File> F = new Stack<File>();
        F.push(f);
        while(!F.isEmpty()) {
        	File head = F.pop();
        	if(head.isDirectory()) {
        		File [] files = head.listFiles();
        		for (File file:files) {
        			F.push(file);
        		}
        	}
        		else {
        			if(showHidden || !f.isHidden()) {
        				System.out.println(f.getName());
        			}
    }
        	}
        }
	
	public static void main(String[] args) {
       
        String directory = "/Users/Madison/eclipse-workspace/Lab12";
		File dir = new File(directory);
		Lister l = new Lister(dir,true);
		l.list();
	}

}
