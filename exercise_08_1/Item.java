package exercise_08_1;

public class Item {
    char color;
        
    // Declare and code the setColor method.
    public boolean setColor(char colorCode){
        if (colorCode == 'C'){
            return false;
        }
        else {
            this.color = colorCode;
            return true;
        }   
    }
}