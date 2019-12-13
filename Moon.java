import java.util.Scanner;

class Conversion
{
	int class_value;
	
	Conversion()
	{
		System.out.println("\n");
	}

	void set_value(int value_from_main)
	{
		System.out.println("Value Set for Class");
		class_value = value_from_main;
	}

	int get_value()
	{
		System.out.println("Getting value from Class");
		return (int)(class_value * .10);
	}
}

public class Moon
{
	public static void main(String[] args)
	{
		System.out.println("Want to know how much you weigh on the Moon?");

		Scanner input = new Scanner (System.in);
		Conversion object_construct = new Conversion();

		System.out.println("\nPlease enter your weight in pounds: ");
		int value = input.nextInt();

		if (value < 0)
		{
			System.out.println("Invalid value.");
		}
		else
		{
			object_construct.set_value(value);
			System.out.println("Your weight on the Moon is: " + object_construct.get_value());
		}

	}
}