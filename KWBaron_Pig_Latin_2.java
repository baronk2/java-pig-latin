/*
Kevin Baron
12/4/12
Pig Latin 2
*/

import java.util.Scanner;

public class KWBaron_Pig_Latin_2 {
	
	/*
	Give an intro,
	receive a message from the user,
	and display the translated message.
	*/
	public static void main(String[] args) {
		giveIntro();
		String originalMessage = getMessage();
		translateMessage(originalMessage);
	}//eo main
	
	public static void giveIntro() {
		System.out.println("This program translates a message you type into Pig Latin.\n");
	}//eo giveIntro
	
	public static String getMessage() {
		System.out.println("Type a message without punctuation.");
		Scanner console = new Scanner(System.in);
		return console.nextLine();
	}//eo getMessage
	
	/*
	Once the message has been received,
	it will be scanned and translated one word at a time.
	Start with the first word,
	then print a space before every word.
	*/ 
	public static void translateMessage(String message) {
		Scanner messageScanner = new Scanner(message);
		String word = messageScanner.next();
		translateWord(word);
		while (messageScanner.hasNext()) {
			System.out.print(" ");
			word = messageScanner.next();
			translateWord(word);
		}//eo while
	}//eo translate
	
	/*
	If the word begins with a vowel,
	just print a "way" after.
	Otherwise, find where the first vowel occurs,
	then print from that vowel to the end of the word,
	then from the beginning of the word up to the vowel,
	and then "ay".
	*/
	public static void translateWord(String word) {
		String vowels = "aeiouAEIOU";
		if (vowels.contains(word.substring(0,1))) {
			System.out.print(word + "way");
		} else {
			int i = 0;
			while (i < word.length() && !vowels.contains(word.substring(i, i + 1))) {
				i++;
			}//eo while
			System.out.print(word.substring(i) + word.substring(0,i) + "ay");
		}//eo if else
	}//eo translateWord
	
}//eo class