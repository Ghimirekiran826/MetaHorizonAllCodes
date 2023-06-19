package com.Week3ControlStatement;

import com.mylibrary.BasicIO;

public class DetermineVowel {
	public static void main(String[] args) {
		char inputFirstCharatcter;
		BasicIO.printMessage("Enter any letter");
		BasicIO.newLine();
		inputFirstCharatcter = BasicIO.readCharacter();

		switch (inputFirstCharatcter) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			BasicIO.printMessage(inputFirstCharatcter, "is Vowel Letter");
			break;
		default:
			BasicIO.printMessage(inputFirstCharatcter, "is Consonent Letter");
		}
	}
}
