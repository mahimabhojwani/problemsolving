package controller;

import bean.PersonBean;

import java.util.HashMap;

public class Person implements IPerson {

    HashMap<String, PersonBean> personList = new HashMap();

    public boolean checkPerson(String id) {
        if(personList.containsKey(id))
            return true;
        return false;
    }

    public String getPersonName(String id){
        if(checkPerson(id)){
            return personList.get(id).getName();
        }
        return null;
    }

    public boolean addPerson(String id, String name) {
        PersonBean cperson = new PersonBean();
        cperson.setName(name);

        personList.put(id, cperson);
        return true;
    }
}
