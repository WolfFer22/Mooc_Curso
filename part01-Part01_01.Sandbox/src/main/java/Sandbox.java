
import java.time.LocalDate;
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
//        Scanner reader = new Scanner(System.in);
//        System.out.println("What's your name?");
//        String name = reader.nextLine();
//        System.out.println("What's your age?");
//        int age = Integer.valueOf(reader.nextLine());
//        System.out.println("What's your weight?");
//        double weight = Double.valueOf(reader.nextLine());
//        System.out.println("What's your height?");
//        double height = Double.valueOf(reader.nextLine());
//
//        Person person = new Person(name, age, weight, height);
//        System.out.println(person);
        /////////////////////////////////////////////////////////////////
        
        SimpleDate date = new SimpleDate(1, 1, 780);
        Person muhammad = new Person("Muhammad ibn Musa al-Khwarizmi", date);
        Person pascal = new Person("Blaise Pascal", 19, 6, 1623);

        System.out.println(muhammad);
        System.out.println(pascal);
        
        System.out.println("");

        System.out.println(muhammad.getName() + ", is " + muhammad.ageAsYears() + " years old");
        System.out.println(pascal.getName() + ", is " + pascal.ageAsYears() + " years old");
        
        System.out.println("");
        
        if (muhammad.ageAsYears() > pascal.ageAsYears()) {
            System.out.println(muhammad.getName() + " is older than " + pascal.getName());
        }
        
        System.out.println("");
        
        if (muhammad.olderThan(pascal)) {  //  same as muhammad.olderThan(pascal)==true
            System.out.println(muhammad.getName() + " is older than " + pascal.getName());
        } else {
            System.out.println(muhammad.getName() + " is not older than " + pascal.getName());
        }
        
        System.out.println("");
        
        SimpleDate d1 = new SimpleDate(14, 2, 2011);
        SimpleDate d2 = new SimpleDate(21, 2, 2011);
        SimpleDate d3 = new SimpleDate(1, 3, 2011);
        SimpleDate d4 = new SimpleDate(31, 12, 2010);

        System.out.println(d1 + " is earlier than " + d2 + ": " + d1.before(d2));
        System.out.println(d2 + " is earlier than " + d1 + ": " + d2.before(d1));

        System.out.println(d2 + " is earlier than " + d3 + ": " + d2.before(d3));
        System.out.println(d3 + " is earlier than " + d2 + ": " + d3.before(d2));

        System.out.println(d4 + " is earlier than " + d1 + ": " + d4.before(d1));
        System.out.println(d1 + " is earlier than " + d4 + ": " + d1.before(d4));
        
        
        ////////////////////////////////////////////////////////////
        
//        Usa a Data do sistema como uma Class ( LocalDate ):
//        
//        LocalDate now = LocalDate.now();
//        int year = now.getYear();
//        int month = now.getMonthValue();
//        int day = now.getDayOfMonth();
//
//        System.out.println("today is  " + day + "." + month + "." + year);
//
//    }

//        Clock NESTED LOOP (multiplicação for h * for m * for s):
//        
//        while (true){            
//            for (int h = 0; h < 24; h++) {
//
//                for (int m = 0; m < 60; m++) {
//
//                        for (int s = 0; s < 60; s++) {
//
//                             System.out.println( h + ":" + m + ":" + s);
//
//                        }
//                }
//            }
//        }


    }
}
