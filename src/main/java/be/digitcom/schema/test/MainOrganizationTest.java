package be.digitcom.schema.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import be.digitcom.schema.Organization;

public class MainOrganizationTest {

	public static void main(String[] args) {
		List<Organization> organizations = new ArrayList<>();
		
		Organization o1 = new Organization("Salsa Bruxelles", "salsa@brussles");
		Organization o2 = new Organization("Jos� Bachata Amor & Team", "jbateam@yahoo.be");
		Organization o3 = new Organization("Salsa la Brisa", "brisa@be");
		Organization o4 = new Organization("La Cueva de P�p�", "cueva@pepe.be");
		Organization o5 = new Organization("Jos� Bachata Amor & Team", "jbateam@gmail.com");
		Organization o6 = new Organization("Salsa la Brisa", "la-brisa@salsa.paris");
		
		organizations.add(o2);
		organizations.add(o3);
		organizations.add(o1);
		organizations.add(o4);
		organizations.add(o2);
		organizations.add(o3);
		organizations.add(o4);
		organizations.add(o5);
		organizations.add(o6);		
		
		System.out.println(organizations);
		
		Collections.sort(organizations);
		System.out.println(organizations);
		/*
		Collections.sort(organizations, new Comparator<Organization>() {
			@Override
			public int compare(Organization o1, Organization o2) {
				int result = o1.getName().compareTo(o2.getName());
				
				if(result != 0) {
					return result;
				}
				return o1.getEmail().compareTo(o2.getEmail());
			}
		});
		*/
		System.out.println(organizations);

	}

}
