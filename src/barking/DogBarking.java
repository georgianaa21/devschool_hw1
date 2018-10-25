package barking;

public class DogBarking {

    public boolean bark(boolean barking, int hour){
        if(hour < 0 || hour > 23)
            return false;
        if(barking == false)
            return false;
        if(barking == true && (hour <= 8 || hour >= 22))
            return true;
        return false;
    }
}
