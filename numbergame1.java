package harish;
import java.util.Random;

import javax.swing.*;
public class numbergame1 {

	public static void main(String[] args) {
	   Random r=new Random()  ;
	   int random=r.nextInt(100)+1;
	   int attempts=0;
	   int score=0;
     while(true) {
    	String str= JOptionPane.showInputDialog(null, "Enter a Number from 1 to 100");
    	 int guess = 0;
    	 try {
    		 guess=Integer.parseInt(str);
    	 }
    	 catch(Exception e) {
    		 JOptionPane.showConfirmDialog(null, "please enter a number ");
    	 }
    	 attempts++;
    	 if(guess<random) {
    		 JOptionPane.showMessageDialog(null,"please try again number is low");
    	 }
    	 else if(guess>random) {
    		 JOptionPane.showMessageDialog(null,"please try again number is high");
    	 }
    	 
    	 else {
    		 if(attempts<5) {
    			 score=100;
    		 }
    		 else if(attempts <15) {
    			 score=80;
    		 }
    		 else {
    			 score=65;
    		 }
    		 JOptionPane.showMessageDialog(null,"Congratulations, you won the game " +attempts+" attempts for number  " +random+" Your score is "+score);
            break;
    	 }
     }
	}

}
