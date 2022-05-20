import javax.swing.JOptionPane;
import java.lang.Math;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
	
	public static String currentTask = "";
	
	
	public static void main(String[] args) 
	{
		menu();
	}
	
	public static void menu()
	{
		//String number;
		
		//System.out.println("Welcome, " + name + ". What would you like to choose?");
		
		String number = JOptionPane.showInputDialog
				(
				"Welcome, What would you like to choose? \n \n" +
				"1.Addition,subtraction, multiplication, and division of two numbers \n" +
				"2.Power, modulo,and square/cube roots \n" + 
				"3.Convertions between temperature units \n" + 
				"4.Convertions between Metric and Imperial units for mass(g/oz) and length(cm/inches) \n" +
				"5.Convertion of a decimal number to binary \n" +
				"6.Convertion of a binary number to decimal \n" +
				"7.Convertion of a decimal number to hexadecimal \n" +
				"8.Convertion of a hexadecimal number to decimal \n" +
				"If you want to exit the program, input 'exit'. \n \n" + 
				"Enter a number between 1 - 8: ");

		//These lines display what tasks the user can choose to do in the calculator
		// \n displays a space between the certain lines
		

	    switch(number) //calls a class based on user input
	    {
		
		 	case "1": 
		 		num1(); //if user inputs 1, class Task_1() is called.
		 		break; 
		 	case "2": 
		 		num2(); //if user inputs 2, class Task_2() is called.
		 		break; 
		 	case "3": 
		 		num3(); //if user inputs 3, class Task_3() is called.
		 		//BacktoMenu(); 
		 		break; 
		 	case "4": 
		 		num4(); //if user inputs 4, class Task_4()is called. 
		 		break; 
		 	case "5": 
		 		num5(); //if user inputs 5, class Task_5() is called. 
		 		break; 
		 	case "6": 
		 		num6(); //if user inputs 6, class Task_6() is called. 
		 		break;
	    		case "7":
	    			num7(); //if user inputs 7, class Task_7() is called.
		    		break;
		    	case "8":
		    		num8(); //if user inputs 8, class Task_8() is called.
		    		break;
		    	case "exit":
		    	case "Exit":
		    	case "EXIT":
		    		JOptionPane.showMessageDialog(null, "Goodbye", "Menu", JOptionPane.PLAIN_MESSAGE);
				System.exit(0);
		    	break;
		    	default: //if the user chose the wrong number, a message will tell them to input numbers 1 to 8, and then call back to the main function
		    		JOptionPane.showMessageDialog(null, "Please choose a number between 1 to 8", "Menu", JOptionPane.PLAIN_MESSAGE);
		    		menu();
		    		break;
	    }
	}
	
	public static void num1() 
	{
		currentTask = "task1";
		
		try 
		{			
			double answer_one = 0;
			
			double first_num = Double.parseDouble(JOptionPane.showInputDialog("First Number: ")); //User inputs 1st number
			
			double second_num = Double.parseDouble(JOptionPane.showInputDialog("Second Number: ")); //User inputs 2nd number
			
			String operator = JOptionPane.showInputDialog("Pick Operator(+, -, *, /): "); //User inputs an operation of their choice
			
			switch(operator) 
			{
				case "+":
					answer_one = first_num + second_num;
					break;
				case "-":
					answer_one = first_num - second_num;		
					break;
				case "*":
					answer_one = first_num * second_num;
					break;
				case "/":
					answer_one = first_num - second_num;					
					break;
				default:
					JOptionPane.showMessageDialog(null, "Please input 1 or 2", "Basic Math Operations", JOptionPane.PLAIN_MESSAGE); //Displays answer to user
					break;
			}
			
			JOptionPane.showMessageDialog(null, "Answer = " + answer_one, "Basic Math Operations", JOptionPane.PLAIN_MESSAGE);
			BackToMenu(); // Called the method from it self again so that the code repeats
		}
		catch (Exception e0) 
		{
			JOptionPane.showMessageDialog(null, "Please input 1 or 2", "Basic Math Operations", JOptionPane.PLAIN_MESSAGE);
			num1();
		} 
	}
	
	public static void num2() 
	{
		currentTask = "task2";
		
		try 
		{
			double a_num = 0;
			double answer_two = 0;
			
			String operator = JOptionPane.showInputDialog("1: Power \n 2: Mod \n 3: Sqaure Root \n 4: Cube Root \n \n Choose Operator");
			
			switch(operator) 
			{
				case "1":
					a_num = Double.parseDouble(JOptionPane.showInputDialog("First Number: "));
					double power_num = Double.parseDouble(JOptionPane.showInputDialog("Second Number: "));
					answer_two = Math.pow(a_num, power_num);
					break;
				case "2":
					a_num = Double.parseDouble(JOptionPane.showInputDialog("First Number: "));
					double mod_num = Double.parseDouble(JOptionPane.showInputDialog("Second Number: "));
					answer_two = a_num % mod_num;		
					break;
				case "3":
					a_num = Double.parseDouble(JOptionPane.showInputDialog("First Number: "));
					answer_two = Math.sqrt(a_num);
					break;
				case "4":
					a_num = Double.parseDouble(JOptionPane.showInputDialog("First Number: "));
					answer_two = Math.cbrt(a_num);					
					break;
				default:
					JOptionPane.showMessageDialog(null, "Invalid operator selected", "Advanced Math Operations", JOptionPane.PLAIN_MESSAGE);
					break;
			}
			
			JOptionPane.showMessageDialog(null, "Answer = " + answer_two, "Advanced Math Operations", JOptionPane.PLAIN_MESSAGE);
			BackToMenu();
		}
		catch (Exception e1) 
		{
			JOptionPane.showMessageDialog(null, "Invalid input", "Advanced Math Operations", JOptionPane.PLAIN_MESSAGE);
		}
	}
	
	public static void num3() 
	{
		currentTask = "task3";
		
		try 
		{
			double celsius = 0;
			double fahrenheit = 0;
			
			String f_or_c = JOptionPane.showInputDialog("1.Fahrenheit to Celsius \n 2.Celsius to Fahrenheit \n \n Pick 1 or 2");
			
			switch(f_or_c) 
			{
				case "1":
					fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Fahrenheit"));
					celsius = ((5 *(fahrenheit - 32.0)) / 9.0);;
					JOptionPane.showMessageDialog(null, "Answer = " + celsius, "Temperature Convertion", JOptionPane.PLAIN_MESSAGE);
					BackToMenu();
					break;
				case "2":
					celsius = Double.parseDouble(JOptionPane.showInputDialog("Celsius"));
					fahrenheit = (((9.0 * celsius) / 5) + 32.0);
					JOptionPane.showMessageDialog(null, "Answer = " + fahrenheit, "Temperature Convertion", JOptionPane.PLAIN_MESSAGE);
					BackToMenu();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Invalid", "Temperature Convertion", JOptionPane.PLAIN_MESSAGE);
					num3();
					break;
			}
		}
		catch (Exception e2) 
		{
			JOptionPane.showMessageDialog(null, "Invalid", "Temperature Convertion", JOptionPane.PLAIN_MESSAGE);
			num3();
		}		
	}
	
	public static void num4() 
	{		
		currentTask = "task4";
		String choice = JOptionPane.showInputDialog("Do you want to convert 1.length units(inches/cm) or 2.masses(g/oz)? ");
		
		switch (choice) 
		{
			case "1":
				lengths();
				break; 
			case "2":
				mass();
				break; 
			default:
				JOptionPane.showMessageDialog(null, "Please input either 1 or 2", "Length/Mass Convertion", JOptionPane.PLAIN_MESSAGE);
				num4();
				break; 
		}
	}
	
	public static void lengths() 
	{		
		String number = JOptionPane.showInputDialog("Do you want to convert to 1.inches or 2.centimetres? ");

		switch(number) 
		{
			case "1":
				inches();
				break;
			case "2":
				centimetres();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Please input either 1 or 2", "Length/Mass Convertion", JOptionPane.PLAIN_MESSAGE);
				num4();
				break; 
		}
	}
	
	public static void mass() 
	{
		String number = JOptionPane.showInputDialog("Do you want to convert to 1.inches or 2.centimetres? ");

		switch(number) 
		{
			case "1":
				grams();
				break;
			case "2":
				ounces();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Please input either 1 or 2", "Length/Mass Convertion", JOptionPane.PLAIN_MESSAGE);
				num4();
				break; 
		}
	}
	
	public static void inches() 
	{
		try 
		{
			double centimetres = Double.parseDouble(JOptionPane.showInputDialog("How many centimetres do you want to convert to inches? "));
			
			double answer = centimetres / 2.54;
			JOptionPane.showMessageDialog(null, centimetres + " = " + answer + " inches", "Length/Mass Convertion", JOptionPane.PLAIN_MESSAGE);
			BackToMenu();
			//break;
			
		}
		catch (Exception e4)
		{
			JOptionPane.showMessageDialog(null, "Please enter a valid number", "Length/Mass Convertion", JOptionPane.PLAIN_MESSAGE);
			inches();
		}	
	}		
			
	public static void centimetres()
	{		
		try	
		{	
			double inches = Double.parseDouble(JOptionPane.showInputDialog("How many inches do you want to convert to centimetres? "));
			double answer2 = inches * 2.54;
			System.out.println();
			JOptionPane.showMessageDialog(null, inches + " = " + answer2 + " centimetres", "Length/Mass Convertion", JOptionPane.PLAIN_MESSAGE);
			BackToMenu();
			
		}
		catch(Exception e5) 
		{
			JOptionPane.showMessageDialog(null, "Please enter a valid number", "Length/Mass Convertion", JOptionPane.PLAIN_MESSAGE);
			centimetres();
		}
	}
	
	public static void grams() 
	{
		try 
		{
			double ounces = Double.parseDouble(JOptionPane.showInputDialog("How many ounces do you want to convert to grams? "));
			
			double answer = ounces * 28.34952;
			JOptionPane.showMessageDialog(null, ounces + " = " + answer + " grams", "Length/Mass Convertion", JOptionPane.PLAIN_MESSAGE);
			BackToMenu();
		}
		catch(Exception e6) 
		{
			JOptionPane.showMessageDialog(null, "Please enter a valid number", "Length/Mass Convertion", JOptionPane.PLAIN_MESSAGE);
			grams();
		}
	}

	public static void ounces() 
	{
		try 
		{
			double grams= Double.parseDouble(JOptionPane.showInputDialog("How many grams do you want to convert to ounces? "));
			
			double answer2 = grams / 28.34952;
			JOptionPane.showMessageDialog(null, grams + " = " + answer2 + " ounces", "Length/Mass Convertion", JOptionPane.PLAIN_MESSAGE);
			BackToMenu();
		}
		catch(Exception e7) 
		{
			JOptionPane.showMessageDialog(null, "Please enter a valid number", "Length/Mass Convertion", JOptionPane.PLAIN_MESSAGE);
			ounces();
		}
	}
	
	public static void num5() // In this method, the user will input a positive integer
	{	
		// Created some variables
		int decimalNum = 0;
		currentTask = "task5";

		try // the try statements checks for any errors while the program is running
		{
			 // This will output the message
			decimalNum = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive integer: "));// The input is assigned to the decimalNum variable. nextInt() means that it will take in the next integer number as a input
			
			if (decimalNum >= 0) // If the input is greater than or equal to 0, then decimalNum will be passed to decimalToBinary() method as a parameter and will end while loop
			{
				decimalToBinary(decimalNum);
				// check5_1 = true;
			}
			else // If the input was not a positive integer but a negative integer, then it will output a message saying that the input was wrong and will loop again instead of getting an error
			{
				JOptionPane.showMessageDialog(null, "Please enter a valid number", "Decimal To Binary", JOptionPane.PLAIN_MESSAGE);
				num5();
			}
		}
		catch(Exception e8) // If the input was not a positive integer but a letter, decimal number (e.g. 0.5) or something else that is not a positive integer then it will loop again 
		{
			JOptionPane.showMessageDialog(null, "Please enter a valid number", "Decimal To Binary", JOptionPane.PLAIN_MESSAGE);
			num5();
		}
	}
	
	public static void decimalToBinary(int decNum) // a function
	{
        int remainder; // Created some variables
        String binaryNum = "";
        
		if (decNum == 0) // If the input is 0 then it will just output Binary number: 0
        {
        	JOptionPane.showMessageDialog(null, "Please enter a valid number", "Decimal To Binary", JOptionPane.PLAIN_MESSAGE);
        }
        else // If the input is not 0 then it will do the following block of code
        {
            while(decNum > 0) // The while loop will continue until it becomes 0
            {
                remainder = decNum % 2; // This will calculate the remainder. Either 0 or 1
                binaryNum = remainder + "" + binaryNum; // The binaryNum is getting updated
                decNum = decNum / 2; // decNum halves
            }
            JOptionPane.showMessageDialog(null, "Binary number: "+ binaryNum, "Decimal To Binary", JOptionPane.PLAIN_MESSAGE); // Output the result of binaryNum
            
        }
		
		BackToMenu(); // // Calling the continueTask5() method
	}
	
	public static void num6() 
	{
		boolean check6_1 = false, result; // Created some variables
		int binaryNum;
		String strBinaryNum, regex = "\\b[01]+\\b"; // regex is a shorthand for regular expressions. In this expression, it will only allow a series of 0s and 1s to be a valid input
		currentTask = "task6";
	
		
		JOptionPane.showMessageDialog(null, "This program will only accept the first sequence of binary numbers, any binary numbers after the whitespace will be ignored", "Binary To Decimal", JOptionPane.PLAIN_MESSAGE); // This will output the message
		while (check6_1 == false) // As long as check6_1 is false the while loop will keep on running
		{
			try // the try statements checks for any errors while the program is running
			{
				//System.out.print("Enter a binary number: "); // This will output the message
				//binaryNum  = scan6_1.nextInt(); // The input is assigned to the decimalNum variable. nextInt() means that it will take in the next integer number as a input
				binaryNum = Integer.parseInt(JOptionPane.showInputDialog("Enter a binary number: "));
				
				strBinaryNum = Integer.toString(binaryNum); // This variable will convert the input for binaryNum to a string so that it can check if the input matches the regex
				Pattern checkRegex = Pattern.compile(regex);
		        Matcher regexMatcher = checkRegex.matcher(strBinaryNum);
		        result = regexMatcher.matches();
				
				if (result == true) // If the result is true, then decimalNum will be passed to binaryToDecimal() method as a parameter and will end while loop
				{
					binaryToDecimal(binaryNum);
					check6_1 = true;
					BackToMenu();
				}
				else // If  the result is false, then it will output a message saying that the input was wrong and will loop again
				{
					JOptionPane.showMessageDialog(null, "Please enter a valid number", "Binary To Decimal", JOptionPane.PLAIN_MESSAGE);
					num6();
				}
			}
			catch(Exception e9) // If the input was not a binary number, then it will loop again instead of getting an error
			{
				JOptionPane.showMessageDialog(null, "Please enter a valid number", "Binary To Decimal", JOptionPane.PLAIN_MESSAGE);
				num6();
			}
		}
	}
	
	public static void binaryToDecimal(int binNum)
	{
		int decimalNum = 0, base = 1, lastDigit, temp; // Created some variables
		temp = binNum; 
		
        while (temp > 0) // it will loop until temp > 0
        {
            lastDigit = temp % 10; // this will make the input read from the end. E.g. 1110 it will read 0 first
            temp /= 10; // temp = temp / 10, it will divide temp by 10 and it will always round down which doesn't matter because it is only 0s and 1s      
            decimalNum += lastDigit * base; // decimalNum = decimalNum + (lastDigit * base), it will increment decimalNum by its current decimalNum value and the multiplication between lastDigit and base     
            base *= 2; // base = base * 2 // it will double the current base
        }
        JOptionPane.showMessageDialog(null, "Decimal number: " + decimalNum, "Binary To Decimal", JOptionPane.PLAIN_MESSAGE); // Output the result of decimalNum
		System.out.println(); // Prints empty line
		BackToMenu(); // // Calling the continueTask5() method
	}
	
	public static void num7() 
	{
		currentTask = "task7";
		
		try 
		{
			String[] hex_array = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
			//This array stores all the hexadecimal characters
			
			JOptionPane.showMessageDialog(null, "This program can only allow whole numbers.", "Decimal To Hexadecimal", JOptionPane.PLAIN_MESSAGE);
			
			double decimal; //declares the decimal variable that will be inputed.
			int remainder; //declares the remainder variable, which stores the remainder
			String hexadecimal = ""; //declares the hexadecimal variable that will be the output.
			
			decimal = Double.parseDouble(JOptionPane.showInputDialog("Input Decimal")); //This is where the user can input a number 
			
			
			while (decimal > 0) //the code below will run, until the value of decimal is zero
			
			{
				remainder = (int) (decimal % 16); //the value of the user input mod 16 will be stored in remainder.
				hexadecimal = hex_array[remainder] + hexadecimal; //based on the remainder, the character stored in hex_array at a certain position will be. 
				decimal = decimal/16; //the new value of decimal is equal to the old value of decimal divided by 16 
			} //In order for this block to work, the information that the user inputs need to be an integer, otherwise our 
			
			JOptionPane.showMessageDialog(null, "Hexadecimal: " + hexadecimal, "Decimal To Hexadecimal", JOptionPane.PLAIN_MESSAGE); //The result of this section will be output in this line.
			BackToMenu();
		}
		catch(Exception e10) 
		{
			JOptionPane.showMessageDialog(null, "Please enter a valid number", "Decimal To Hexadecimal", JOptionPane.PLAIN_MESSAGE);
			num7();
			
			//break;
		}
	}
	
	public static void num8() 
	{
		currentTask = "task8";
		try 
		{
			String hstring = "0123456789ABCDEF"; //This string contains all the hexadecimal characters
			
			String hexnum; //A string variable is declared, where the user input will be stored.
			
			hexnum = JOptionPane.showInputDialog("Input Hexadecimal: ");
			//This is where the user inputs a hexadecimal string
			
			int dec_num = 0;  // integer num is declared and is set to zero. This is where the solution will be stored
			for (int i = 0; i < hexnum.length(); i++) // 
			{  
				char ch = hexnum.charAt(i);  //this searches for the current position of the input string and stores as a character
				int n = hstring.indexOf(ch); //this searches for numerical value of the hexadecimal character, by finding the index of it on hexstring
				dec_num = 16*dec_num + n; //the decimal equivalent of the hexadecimal input is calculated here by multiplying the current value of hexnum by 16, then adding by itself
			}
			
			if (dec_num > -1) 
			{
				JOptionPane.showMessageDialog(null, "Decimal:" + dec_num, "Hexadecimal To Decimal  ", JOptionPane.PLAIN_MESSAGE);
				System.out.println("Decimal:" + dec_num); //This is where the result will be output.
				BackToMenu();
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Please enter a valid number", "Hexadecimal To Decimal  ", JOptionPane.PLAIN_MESSAGE);
				num8();
			}
		} 
		catch (Exception e11)
		{
			JOptionPane.showMessageDialog(null, "Please enter a valid number", "Hexadecimal To Decimal  ", JOptionPane.PLAIN_MESSAGE);
			num8();
		}
	}
	
	public static void BackToMenu() 
	{
		String yesOrNo;
		
		yesOrNo = JOptionPane.showInputDialog("Do you want to continue this task(Y) or go back to menu(N)? \n (Input 'exit' to leave the program):");
		
		
		switch(yesOrNo)
		{
			case "yes":
			case "y":
			case "Y":
				switch(currentTask) 
				{
					case "task1":
						num1();
						break;
					case "task2":
						num2();
						break;
					case "task3":
						num3();
						break;
					case "task4":
						num4();
						break;
					case "task5":
						num5();
						break;
					case "task6":
						num6();
						break;
					case "task7":
						num7();
						break;
					case "task8":
						num8();
						break;
					default: 
						JOptionPane.showMessageDialog(null, "That is not a valid input!", "Back To Menu", JOptionPane.PLAIN_MESSAGE); // This message will output when an invalid value is entered
						System.out.println(); // Prints empty line
						BackToMenu(); // Called the method from it self again so that the code repeats			
				}
			case "no":
			case "n":
			case "N":
				menu();
				break;
			case "exit":
		    case "Exit":
		    case "EXIT":
		    	JOptionPane.showMessageDialog(null, "Goodbye", "Back To Menu", JOptionPane.PLAIN_MESSAGE);
				System.exit(0);
			default:  
				JOptionPane.showMessageDialog(null, "That is not a valid input!", "Back To Menu", JOptionPane.PLAIN_MESSAGE); // This message will output when an invalid value is entered
				BackToMenu(); // Called the method from it self again so that the code repeats
		}
	}
}

