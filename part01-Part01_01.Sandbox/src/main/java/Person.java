public class Person {
    
    private String name;
    private int age;
    private double weight;
    private double height;

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
        return this.weight / (this.height * this.height);
    }
    
    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }    

    @Override
    public String toString() {
        return this.name + ", age=" + age + ", weight=" + weight + ", height=" + height
                + ", BMI: " + this.bodyMassIndex() + ", MHR: " + maximumHeartRate();
    }   
}
