package alex;

public class App {

	static char cipher[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
			'W', 'X', 'Y', 'Z'}; 
	int shift = 3;
	
	public static void main(String[] args) {
		
		encode();
		
	}
	
	public static String encode(){
		String str = "Test String";
		String[] ar = str.split("(?!^)");
		for (int i = 0;i<cipher.length;i++){
			System.out.println(i + " " + ar[i]);
		}
		
		return str;
	}

}
