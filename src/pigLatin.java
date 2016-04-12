import java.util.Scanner;

public class pigLatin {

	public static void main(String[] args) {
		// open scanner
		Scanner input = new Scanner(System.in);

		// app title
		System.out.println("Welcome to Pig Latin Translator" + "\n");

		// sets keepGoing to yes
		String keepGoing = "y";

		// while that checks for keepGoing
		while (keepGoing.equalsIgnoreCase("y")) {
			// prompt user for words
			System.out.print("Enter a line to be translated:");
			String sentence = input.nextLine();
			//check to see if sentence empty
			if (sentence.equals(" ")||sentence.isEmpty()){
				System.out.println("Your sentence can't be blank.");
			}else{
			//separates and puts words in sentence in array
			String[] sentenceSeperated = sentence.split(" ");

			// applies method that convert words to sentence
			getSentenceInPigLatin(input, sentenceSeperated);
			
			// checks for keepGoing
			System.out.print("Continue y/n?: ");
			keepGoing = input.nextLine();
			}
		}
		//print bye when keepGoing is no
		System.out.println("Good Bye!");
		// close scanner
		input.close();
		
		//code removed to work properly
		////String word = getSentenceInPigLatin(input, sentenceSeperated);
		// convert words into pig latin
		////word = getPigLatin(word);
	}

	public static void getSentenceInPigLatin(Scanner input, String[] sentenceSeperated) {
		for (int i = 0; i < sentenceSeperated.length; i++) {
			String name = sentenceSeperated[i];
			System.out.print(getPigLatin(name) + " ");
		}System.out.println();
	}

	public static String getPigLatin(String word) {
		char firstLetter = word.charAt(0);
		if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o'
				|| firstLetter == 'u') {
			word = word + "way";
		} else {
			int i = 0;
			for (; i < word.length(); i++) {
				if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
						|| word.charAt(i) == 'u') {
					word = word.substring(i, word.length()) + word.substring(0, i) + "ay";
					break;
				}
			}
		}
		return word;
	}

}
