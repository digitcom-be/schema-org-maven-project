package be.digitcom.schema.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import be.digitcom.schema.Person;

public class MainPersonTest {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		Person rufin = new Person("Hounkpe", "Rufin", "rufin@hounkpe.be");
		Person ruf = new Person("Hounkpe", "Rufin", "rufin.metogbe@hounkpe.be");
		Person dominique = new Person("Claeys", "Dominique", "dominique@claeys.be");
		Person arno = new Person("Hounkpe Claeys", "Arno", "arno-hounkpe.claeys.be");
		Person constant = new Person("Badet", "Constant", "constant@badet.bj");
		Person metogbe = new Person("Hounkpe", "M�togb� Rufin", "metogbe@rufin.bj");
		
		persons.add(rufin);
		persons.add(dominique);
		persons.add(arno);
		persons.add(rufin);
		persons.add(constant);
		persons.add(metogbe);
		persons.add(ruf);
		
		System.out.println(persons);
		
		boolean resultEq = rufin.equals(ruf);
		
		int resultCompTo = rufin.compareTo(ruf);
		
		System.out.println(resultEq);
		System.out.println(resultCompTo);
		
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				int result = p1.getName().compareTo(p2.getName());
				if(result != 0) {
					return result;
				}
				return p1.getEmail().compareTo(p2.getEmail());
			}
		});
		System.out.println(persons);

	}

}
