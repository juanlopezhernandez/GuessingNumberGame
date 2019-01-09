import java.util.Scanner;

public class GuessingNumberGame {


//public class HelloWorld {
    
    public static void main(String []args){
        Scanner input = new Scanner(System.in);               
        System.out.println("Guess the number: ");
        //int userInput = input.nextInt();
       //do {
        int count = 0;
    int numeroSecreto = -100 + (int) (Math.random() * 999);
    int userInput = 0;

       
        while (userInput != numeroSecreto) {
        userInput = input.nextInt();
        count++;{
        	
//        if (userInput !=a){
//       System.out.println("And you are....");
//       System.out.println("Correct!!!.");
//         }  
        if (userInput < numeroSecreto) {
        	System.out.println("Too low..");}
        else if (userInput >numeroSecreto){
        	System.out.println("Too high..");
        } else if (userInput==numeroSecreto) {
        System.out.println("You are correct!!\n" + 
        "Although it took you " + count + " tries.\n"
        + "Want to have another go?");
         }
        } 
        }
       }
      // System.out.println("Play again y/n");
   
} 
	
	
	//System.out.println("y/n");


