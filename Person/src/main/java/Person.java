
public class Person {

    int age ;
    private String name;
    private String gender;
    private String[] interests;
   
    public Person(String name, int age, String gender, String[] interests ){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests= interests;


        }



    public String hello(){
        String str = String.join(", " , interests);
        str = str.substring(0, str.lastIndexOf(',')) +  " & " +str.substring(str.lastIndexOf(",") + 1) ;
        return "Hello, My name is " + name + "\nI am " + gender + " and I am "+ age+ " years old."+ "\nMy interests are " + str ;}
    }