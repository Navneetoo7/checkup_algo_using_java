package Oopchallenge;

public class Stomach extends organ{
    private boolean isEmpty;


    public boolean isEmpty() {
        return isEmpty;
    }
    public void digest(){
        System.out.println("Digesting begin");
    }

    @Override
    public void getDetails() {
        super.getDetails();

        if(this.isEmpty()){
            System.out.println("Need to be fed");
        }else {
            System.out.println("Stomach is full");
        }
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;

    }
}
