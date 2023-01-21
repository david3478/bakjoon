import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> sentences = new ArrayList<String>();
		
		int i = 0;
		while(true) {
			sentences.add(sc.nextLine());
			String sharpCheck = sentences.get(i);
			if(sharpCheck.equals("#")) {
				sentences.remove(i);
				break;
			} 
			
			i++;
		}
		
		for(int j = 0; j<sentences.size(); j++) {
			int count = 0;
			String[] strArray = sentences.get(j).split("");
			for(int k = 0; k < strArray.length; k++) {
				if(strArray[k].equalsIgnoreCase("a") || strArray[k].equalsIgnoreCase("e") ||
					strArray[k].equalsIgnoreCase("i") || strArray[k].equalsIgnoreCase("o") ||
					strArray[k].equalsIgnoreCase("u")) {
					count++;
				}
			}
			System.out.println(count);
		}
		
		
	}
}
