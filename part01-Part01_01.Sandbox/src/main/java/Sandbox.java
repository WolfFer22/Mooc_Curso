
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class Sandbox {

    public static void main(String[] args) {

//        Person pekka = new Person("Pekka");
//        Person antti = new Person("Antti");
//
//        int i = 0;
//        while (i < 30) {
//            pekka.growOlder();
//            i = i + 1;
//        }
//
//        antti.growOlder();
//
//        System.out.println("");
//
//        if (antti.isOfLegalAge()) {
//            System.out.println(antti.getName() + " is of legal age");
//        } else {
//            System.out.println(antti.getName() + " is underage");
//        }
//
//        if (pekka.isOfLegalAge()) {
//            System.out.println(pekka.getName() + " is of legal age");
//        } else {
//            System.out.println(pekka.getName() + " is underage ");
//        }
//        
//        System.out.println(antti);        
//        System.out.println(pekka);
//        
//        ////////////////////////////////////////////////////////////////
//        
//        Person matti = new Person("Matti");
//        Person juhana = new Person("Juhana");
//        
//        matti.setHeight(180);
//        matti.setWeight(86);
//        
//        juhana.setHeight(175);
//        juhana.setWeight(64);
//        
//        System.out.println(matti.getName() + ", body mass index is " + matti.bodyMassIndex());
//        System.out.println(juhana.getName() + ", body mass index is " + juhana.bodyMassIndex());
//        
//        
//        ////////////////////////////////////////////////////////////////
//        
//        ArrayList<Person> persons = new ArrayList<>();
//
//        // a person object can be created first
//        Person john = new Person("John");
//        // and then added to the list
//        persons.add(john);
//
//        // person objects can also be created "in the same sentence" that they are added to the list
//        persons.add(new Person("Matthew"));
//        persons.add(new Person("Martin"));
//
//        for (Person person: persons) {
//            System.out.println(person);
//        }
//        
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
//        System.out.println(LocalDateTime.now());   
//        
//        ////////////////////////////////////////////////////////////////
//        
        Scanner reader = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = reader.nextLine();
        System.out.println("What's your age?");
        int age = Integer.valueOf(reader.nextLine());
        System.out.println("What's your weight?");
        double weight = Double.valueOf(reader.nextLine());
        System.out.println("What's your height?");
        double height = Double.valueOf(reader.nextLine());

        Person person = new Person(name, age, weight, height);
        System.out.println(person);
    }    
}
