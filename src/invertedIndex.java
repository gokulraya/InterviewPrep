import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class invertedIndex {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String[] words=readFile("sample.txt");
		HashMap<String,ArrayList<Integer>> hash=createInvertedIndex(words);
		System.out.println(hash);
		/*for(int i=0;i<words.length;i++)
			System.out.println(words[i]);*/

	}

	private static HashMap<String, ArrayList<Integer>> createInvertedIndex(String[] words) {
		// TODO Auto-generated method stub
		HashMap<String,ArrayList<Integer>> hash=new HashMap<String,ArrayList<Integer>>();
		ArrayList<Integer> arr=null;
		for(int i=0;i<words.length;i++)
		{
			ArrayList<Integer> arr1=null;
			if(!hash.containsKey(words[i]))
			{
				arr=new ArrayList<Integer>();
				arr.add(i);
				hash.put(words[i], arr);
				//arr=null;
			}
			else
			{
				arr1=new ArrayList<Integer>();
				arr1=hash.get(words[i]);
				//arr.add(i);
				arr1.add(i);
				hash.put(words[i], arr1);
			}
			//arr=null;
		}
		return hash;
		
	}

	private static String[] readFile(String string) throws IOException {
		// TODO Auto-generated method stub
		/*Scanner scanner = new Scanner(new File(string));
		scanner.useDelimiter("\r\n");
		String parts[]=null;
		while (scanner.hasNext()) {
		    String line = scanner.next();
		    parts = line.split("\\s");  
		    
		   // System.out.println(cells.length);
		   // System.out.println(line);
		}*/
		BufferedReader br=new BufferedReader(new FileReader(string));
		
		String[] parts = null;
		String line=null;
		while((line=br.readLine())!=null)
		{
			
			parts=line.split("\\s");
		}
		
		return parts;
		
	}

}
