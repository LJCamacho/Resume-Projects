package simpleArrays;

public class WarmUpFilledArrays {
	public static void main(String[] args) {
		char [] alph = new char[30];
		int count = 0;
		
		//Alphabet 
		for(int i = 0 ; i < 26; i++){
			alph[i] = (char)(i+97);
			
			System.out.print(alph[i]+" ");
		}
		
		//Determine if you can add the '&' element;  value 38
		if(count < alph.length) {
			alph[count] = (char)(38);
			count++;
		}
		
		//print the array alph
		System.out.println("\n*******************\n");
		for(int i = 0; i < count; i++) {
			System.out.print(alph[i]+" ");
		}
		System.out.println("\n*******************\n");
		
		//remove the last element 
		count--;
		System.out.println("\n*******************\n");
		for(int i = 0; i < count; i++) {
			System.out.print(alph[i]+" ");
		}
		System.out.println("\n*******************\n");
		
	}

}