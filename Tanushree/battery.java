package Tanushree;

public class battery {
	public static void main(String args[])
    
	{
		
		int battery=50;
		
	switch (battery/10) {
	    case 0:
		case 1:
	    case 2:
	    case 3:
	    	System.out.println("battery is very low");
		break;
		case 4:
	    case 5:
	    	System.out.println("battery is  low");
		break;
		case 6:
		case 7:
			System.out.println("battery is good");
		break;
		case 8:
		case 9:
		case 10:
			System.out.println("battery is full");
		break;
		default :
			System.out.println("invalid");
			
			
		}
	}
	}