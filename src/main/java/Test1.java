
interface UserData{
    final String name = null;
    void save(Object obj);
    String get();
}

class UserInXml implements UserData{

    String name;

    public void save(Object s) {
        name = (String) s;
    }

    public String get() {
        return name;
    }

    public String toString(){
        return name;
    }

}

class UserInDatabase implements UserData{

    String name;

    public void save(Object s) {
        name = (String) s;
    }

    public String get() {
        return name;
    }

    public String toString(){
        return name;
    }
}

public class Test1 {

    public static void main(String ... s){
        UserData database = new UserInDatabase();
        UserData xml = new UserInXml();

        database.save("Rajan");
        xml.save("Parmar");

        System.out.println(database + " " + xml);

    }

}

