
import java.util.Objects;

public class Archives {
    private String idenfifier, name;

    public Archives(String idenfifier, String name) {
        this.idenfifier = idenfifier;
        this.name = name;
    }

    public String getIdenfifier() {
        return idenfifier;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Archives other = (Archives) obj;
        return (Objects.equals(this.idenfifier, other.idenfifier));
    }
    

    @Override
    public String toString() {
        return this.idenfifier + ": " + this.name;
    }    
    
}
