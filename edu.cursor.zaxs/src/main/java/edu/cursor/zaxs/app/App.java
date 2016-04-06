/*
 * This program helps people to schedule date of wedding and change surname for women
 * 
 * @author Oleksandr Semochko
 * @version 0.0.1
 * 
 * */
package edu.cursor.zaxs.app;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import edu.cursor.zaxs.pojo.Person;


public class App {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person p1 = new Person("Stepan", "Petrenko", 33, "male", "04.06.2016", false);
		Person p2 = new Person("Ira", "Gladko", 21, "female", "04.06.2016", true);
		Person p3 = new Person("Yura", "Vispa", 93, "male", "09.08.2016", false);
		Person p4 = new Person("Daryna", "Ivanova", 18, "female", "09.08.2016", true);
		Person p5 = new Person("Taras", "Pasternak", 28, "male", "22.05.2016", false);
		Person p6 = new Person("Oxana", "Wasylyshyn", 25, "female", "22.05.2016", true);
		Person p7 = new Person("Serhiy", "Budny", 33, "male", "13.07.2016", false);
		Person p8 = new Person("Lyubov", "Wasylyk", 33, "female", "13.07.2016", true);
		Person p9 = new Person("Maksim", "Chownyk", 44, "male", "01.11.2016", false);
		Person p10 = new Person("Svitlana", "Golyak", 19, "female", "01.11.2016", false);
		Person p11 = new Person("Kyrylo", "Wolanski", 26, "male", "29.08.2016", false);
		Person p12 = new Person("Liliya", "Shwetz", 21, "female", "29.08.2016", false);
		Person p13 = new Person("Roman", "Kedzierski", 45, "male", "24.07.2016", false);
		Person p14 = new Person("Nataliya", "Kostiv", 24, "female", "24.07.2016", true);
		Person p15 = new Person("Dmytro", "Vasylyev", 23, "male", "12.09.2016", false);
		Person p16 = new Person("Olena", "Sprytna", 22, "female", "12.09.2016", true);
		Person p17 = new Person("Sasha", "Kolodiy", 29, "male", "17.08.2016", false);
		Person p18 = new Person("Kvitka", "Zapashna", 21, "female", "17.08.2016", true);
		Person p19 = new Person("Volodya", "Grizli", 38, "male", "01.08.2016", false);
		Person p20 = new Person("Kateryna", "Samoylyuk", 36, "female", "01.08.2016", false);

		List<Person> listCouples = new ArrayList<Person>();
		listCouples.add(p1);
		listCouples.add(p2);
		listCouples.add(p3);
		listCouples.add(p4);
		listCouples.add(p5);
		listCouples.add(p6);
		listCouples.add(p7);
		listCouples.add(p8);
		listCouples.add(p9);
		listCouples.add(p10);
		listCouples.add(p11);
		listCouples.add(p12);
		listCouples.add(p13);
		listCouples.add(p14);
		listCouples.add(p15);
		listCouples.add(p16);
		listCouples.add(p17);
		listCouples.add(p18);
		listCouples.add(p19);
		listCouples.add(p20);

		OutputStream os = new FileOutputStream("listCouples.txt");
		ObjectOutputStream oos = new ObjectOutputStream(os);

		for (Person person : listCouples) {
			oos.writeObject(person);
		}
		oos.close();
		os.close();

	}
}
