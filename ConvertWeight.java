import java.util.Scanner;

class ConvertPounds
{
	int convertResult;

	void converter(int pounds)
	{
		convertResult = (int)(pounds * 453.592);
	}

	int get_value()
	{
		return convertResult;
	}
}

class ConvertPlanet //parent
{
	int convertMercury(int userWeight)
	{
		return (int)(userWeight * 0.378);
	}

	int convertVenus(int userWeight)
	{
		return (int)(userWeight * .907);
	}

	int convertMoon(int userWeight)
	{
		return (int)(userWeight * 0.166);
	}

	int convertMars(int userWeight)
	{
		return (int)(userWeight * 0.377);
	}
}

class Conversion
{
	int classValue;
	
	void set_value(int value_from_main)
	{
		classValue = value_from_main;
	}

	int get_value()
	{
		return (classValue);
	}
}

public class ConvertWeight
{
	public static void main(String[] args)
	{
		System.out.println("Want to know how much you weigh on other planets?");

		ConvertPounds weightConvert = new ConvertPounds();
		ConvertPlanet planetConvert = new ConvertPlanet();

		Scanner newScan = new Scanner(System.in);
		Conversion object_construct = new Conversion();

		System.out.println("Please enter your weight in pounds: ");
		int userWeight = newScan.nextInt();

		if (userWeight < 0)
		{
			System.out.println("Invalid value.");
			System.exit(0);
		}

		System.out.println("Do you want to convert to grams?");
		System.out.println("1. Yes.");
		System.out.println("2. No.");

		int convertChoice = newScan.nextInt();
		int userChoice;
		
		switch(convertChoice)
		{
			case 1: 
				weightConvert.converter(userWeight);
				userWeight = weightConvert.get_value();
				break;
			case 2: 
				break;
			default: 
				System.out.println("Invalid choice.");
				System.exit(0);
		}

		do
		{
			System.out.println("~Conversion Menu~");
			System.out.println("  Calculate weight:");
			System.out.println("	1. on Mercury.");
			System.out.println("	2. on Venus.");
			System.out.println("	3. on Earth's Moon.");
			System.out.println("	4. on Mars.");
			System.out.println("	5. could you not?");

			System.out.println("Please enter the choice number: ");
			userChoice = newScan.nextInt();

		} while(userChoice < 1 && userChoice > 5);

        switch(userChoice) 
		{
            	case 1: 
            		object_construct.set_value(planetConvert.convertMercury(userWeight));
					System.out.println("Your weight on Mercury is: " + object_construct.get_value());			
					break;
            	case 2: 
            		object_construct.set_value(planetConvert.convertVenus(userWeight));
					System.out.println("Your weight on Venus is: " + object_construct.get_value());			
					break;
            	case 3: 
            		object_construct.set_value(planetConvert.convertMoon(userWeight));
					System.out.println("Your weight on the Moon is: " + object_construct.get_value());			
					break;
            	case 4: 
            		object_construct.set_value(planetConvert.convertMars(userWeight));
					System.out.println("Your weight on Mars is: " + object_construct.get_value());			
					break;
            	case 5: 
            		System.out.println("Fine, exiting program.");
					break;
            	default: 
            		System.out.println("Invalid choice.");
            		System.exit(0);
		}
    }
}