
package ExcCollectionsW6;

import java.util.Objects;

public class Name {

String firstName;

    public Name(String firstName) {
        this.firstName = firstName;
    }
    
    public String getName(){
        return firstName;
    }
    
@Override
    public boolean equals(Object object){
        if(object instanceof Name){
            Name name = (Name) object;
            return (name.firstName.equals(this.firstName));
                    }else{
            return false;
            
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.firstName);
        return hash;
    }
    
}

