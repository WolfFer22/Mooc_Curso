
import java.time.LocalDate;

public class Person {
    
    private String name;
    private int age;
    private double weight;
    private double height;
    private SimpleDate birthday;

    
    public Person(String name, SimpleDate date) {
    this.name = name;
    this.birthday = date;
    }
    
    public Person(String name, int day, int month, int year) {
    this.name = name;
    this.birthday = new SimpleDate(day, month, year);
    }

    public Person(String initialName, int age) {
        this.name = initialName;
        this.age = age;
    }       

    public Person(String initialName, int age, double weight, double height) {        
        this.name = initialName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
    }
    
    public void growOlder(int years) {
        this.age = this.age + years;
    }
    
    public int returnAge() {
        return this.age;
    }
    
    public boolean isOfLegalAge() {
        return this.age >= 18;
    }
    
    public String getName() {
        return this.name;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {        
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }
    
    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }    


    public int ageAsYears(){
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        
        return (year - birthday.getYear());
    }
    
    public boolean olderThan(Person compared) {
        // 1. First compare years
        int ownYear = this.birthday.getYear();
        int comparedYear = compared.birthday.getYear();
        
        int ownMonth = this.birthday.getMonth();
        int comparedMonth = compared.birthday.getMonth();
        
        int ownDay = this.birthday.getDay();
        int comparedDay = compared.birthday.getDay();

        return (ownYear < comparedYear && ownMonth < comparedMonth && ownDay < comparedDay);
        
        /* other way to do it with SimpleDate class:
        
        return this.birthday.before(compared.getBirthday());       
                
        ----  in SimpleDate class: ----
        
        public boolean before(SimpleDate compared){
            if (this.year < compared.year) {
            return true;
            }

            if (this.year > compared.year) {
                return false;
            }

            // years are same, compare months
            if (this.month < compared.month) {
                return true;
            }

            if (this.month > compared.month) {
                return false;
            }

            // years and months are same, compare days
            if (this.day < compared.day) {
                return true;
            }

            return false;
        
        }        
        */

    }

    public String toString() {
        
    return this.name + ", born on " + this.birthday;
    }

}
