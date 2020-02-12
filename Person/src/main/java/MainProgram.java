

public class MainProgram {


    public static void main(String[] args) {
     Person person = new Person("Ryan",  25, "Male", new String[] {"being a hard arse", "Agile", "SSD Hard Drives."});
     String greet = person.hello();
        System.out.println(greet);
    }
}

