package practice.divya;
import java.util.Scanner;
public class LearnSwitching {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int number=7;
		//switch(number)
		/*String a="div";
				switch(a)
		
		{
		
			case "sat":System.out.println("August");
		break;
		case "div":System.out.println("September");
		break;
		case "sun":System.out.println("January");
		//break;
		default:System.out.println("none");
		}

		System.out.println("div");
	}*/
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value");
		int number=input.nextInt();
		switch(number)
		{
			
		case 7:System.out.println("August");
	break;
	case 8:System.out.println("September");
	break;
	case 9:System.out.println("January");
	//break;
	default:System.out.println("none");
	}
		
		
		
	}
}
