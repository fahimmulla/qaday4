package qa_day_2;

import java.util.ArrayList;

public class Mainmethod {

	public static void main(String[] args) {

		/* Examples object with class*/

		PersonExcercise Alfred = new PersonExcercise("Alfred", 21, "firefighter");
		PersonExcercise Elvis = new PersonExcercise("Elvis", 25, "SoftwareEngineer");
		PersonExcercise Edward = new PersonExcercise("Edward", 22, "ProGamer");
		PersonExcercise Fahim = new PersonExcercise("Fahim", 24, "Wrestler");
		PersonExcercise Matt = new PersonExcercise("Matt", 25, "Lecturer");
	
//System.out.println(Alfred.toString());

	ArrayList<PersonExcercise> newList = new ArrayList();

	// add elements to the array list
	
	newList.add(Alfred);
	newList.add(Elvis);
	newList.add(Edward);
	newList.add(Fahim);
	newList.add(Matt);
	System.out.println(newList);
	
	//Use an enhanced for loop to output all of your people to the console

	for (PersonExcercise person : newList) {
	System.out.println(person.toString());
	}
	System.out.println(findPerson(" Fahim ",newList));
	
	}
	
	private static String findPerson(String name, ArrayList<PersonExcercise> newList) {
		for (PersonExcercise person : newList) {
			if (person.toString().contains("Name:" + name)) {
				return " I found the person called" + name;
						}
				}
		return "No name found in the system";
		}

	}
