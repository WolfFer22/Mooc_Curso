
class Birds {

    private String name;
    private String latinName;
    private int observations;

    public Birds(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
    
    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }
    
    public int getObservations() {
        return observations;
    }

    public void wasObservated() {
        this.observations++;           
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.getObservations() + " observations";
    }

}
