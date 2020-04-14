package Generics;

public class GenericBox <T>{

    private T value;

    public GenericBox(T value){
        this.value=value;
    }

    @Override
    public String toString(){
        return this.value
                .getClass()
                .getName()
                + ": " + value;
    }
}
