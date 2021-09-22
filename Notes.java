package com.greatlearning.currency;

public class Notes{
	public int number_of_notes(int notes[],int amount){
		int notes_counter[] = new int[notes.length];
		try{		
			for(int i=0;i<notes.length;i++){
				if(amount>=notes[i]){
					notes_counter[i] = amount/notes[i];
					amount -= notes_counter[i]*notes[i];
				}
			}
			if(amount>0){
				System.out.println("Exact Amount Can't Be Given For Highest Notes!");
			}
			else{
				System.out.println("Your Payment Approach Inorder To Give Minimum Number Of Notes Will Be:");
				for(int i=0;i<notes.length;i++){
					if(notes_counter[i] !=0){
						System.out.println(notes[i] + ":" + notes_counter[i]);
						
					}
				}
			}
		}
		catch(ArithmeticException e){
			System.out.println(e + "Notes of Notes 0 Is Invalid!");
		}
		return amount;
	}
	
}		