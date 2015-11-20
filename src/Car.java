/**
 * Created by paul on 13/11/15.
 */
public class Car {

    static public String CLASS_IDENTIFICATOR ="Car";

    public String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void filterName(String token){
        if (name.contains(token)){
            String[] result = name.split(token);
            if (result.length>0){
                name = result[0];
            }
        }

    }

    @Override
    public String toString() {
        return name;
    }
}
