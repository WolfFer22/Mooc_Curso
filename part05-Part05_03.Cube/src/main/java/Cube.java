
public class Cube {
    
    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int getEdgeLength() {
        return this.edgeLength;
    }
    
    public int volume(){
        return this.edgeLength * this.edgeLength * this.edgeLength;        
    }

    public String toString() {
        return ("The length of the edge is " +  this.edgeLength + " and the volume " + volume());  
    }
}
