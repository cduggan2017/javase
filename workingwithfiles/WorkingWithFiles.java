package workingwithfiles;

import java.io.*;
import java.util.ArrayList;

public class WorkingWithFiles {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Person> peopleList = new ArrayList<Person>();
		
		Person p1 = new Person("Billy Bob","Trainer",22);
		Person p2 = new Person("Sally Sue","Cleaner",22);
		Person p3 = new Person("Ben Frazer","Socialite",18);
		Person p4 = new Person("Ted Nugent","Singer",72);
		Person p5 = new Person("Chris De Burgh","Singer",62);

		peopleList.add(p1);
		peopleList.add(p2);
		peopleList.add(p3);
		peopleList.add(p4);
		peopleList.add(p5);
		
		
		for (Person person : peopleList) {
			System.out.println(person.toString());
		}
		String inFile = "";
		String outFile = "";
		BufferedReader bufIn = new BufferedReader(new FileReader(inFile));
		BufferedWriter bufOut = new BufferedWriter(new FileWriter(outFile));
		String line = "";
		while((line = bufIn.readLine()) != null){
			bufOut.write(line + "\n");
		}
		bufIn.close();
		bufOut.close();
		
	}

}


/*
 Working with Files
 

Create a loop to iterate through the ArrayList, writing each object to one file
(Think about how you format this)

Separately, create another ArrayList and populate it with the data in the file
you just wrote too. (You’re going to have to parse it back In the format you
wrote it in)
*/