package chapter04;

public class Switch_example02 {

	public static void main(String[] args) {

		String medal = "Go";
	     
        switch(medal) {
    	  case "Gold": case "G" : case "g": case "Gol":
    		  System.out.println("�ݸ޴��Դϴ�.");
    		  break;
    	  
    	  case "Silver": case "S" : case "s": case "Sil":
    		  System.out.println("���޴��Դϴ�.");
    		  break;
    		  
    	  case "Bronze": case "B" : case "b": case "Bron":
    		  System.out.println("���޴��Դϴ�.");
    		  break;
    		  
    	  default: {
    		  System.out.println("�޴��� �����ϴ�.");
    		  break;
    		 
     }
        }
