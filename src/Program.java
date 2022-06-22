import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Insira uma String para fazer a inversão de caracteres: ");
		String str = sc.nextLine();
		System.out.println(str);
		String invertStr = invertString(str, str.length()-1);
		System.out.println(invertStr);
		sc.close();
				
	}
	static String invertString(String str, int index){
		if(index == 0){
			return str.charAt(0) + "";
		}
		char letter = str.charAt(index);
		return letter + invertString(str, index-1);
	}

}
