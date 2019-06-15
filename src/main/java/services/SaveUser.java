package services;

import controller.IPerson;
import controller.Person;

public class SaveUser {

    public static void main(String ... s){
        IPerson person = new Person();

        person.addPerson("1","Rajan1");
        person.addPerson("2","Rajan2");
        person.addPerson("3","Rajan3");
        person.addPerson("4","Rajan4");
        person.addPerson("5","Rajan5");

        String ids[] = {"1","5","3","6"};

        for(String id:ids) {
            if (person.checkPerson(id)) {
                System.out.println(((Person) person).getPersonName(id));
            } else {
                System.out.println("Not id present");
            }
        }

    }
}
