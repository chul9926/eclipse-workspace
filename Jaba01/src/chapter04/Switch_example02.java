package chapter04;

public class Switch_example02 {

	public static void main(String[] args) {

		String medal = "Go";
	     
        switch(medal) {
    	  case "Gold": case "G" : case "g": case "Gol":
    		  System.out.println("금메달입니다.");
    		  break;
    	  
    	  case "Silver": case "S" : case "s": case "Sil":
    		  System.out.println("은메달입니다.");
    		  break;
    		  
    	  case "Bronze": case "B" : case "b": case "Bron":
    		  System.out.println("동메달입니다.");
    		  break;
    		  
    	  default: {
    		  System.out.println("메달이 없습니다.");
    		  break;
    		 
     }
        }
