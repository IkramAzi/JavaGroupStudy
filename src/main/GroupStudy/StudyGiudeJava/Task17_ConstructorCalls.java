package StudyGiudeJava;

public class Task17_ConstructorCalls {


    public Task17_ConstructorCalls(){
        System.out.println("Default Constructor");
    }

    public Task17_ConstructorCalls(int a){
        this(); // Default Constructor
        System.out.println("Constructor with int argument");
    }


    public Task17_ConstructorCalls(String str){
        this(10); //Default Constructor ,  Constructor with int argument
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {


        Task17_ConstructorCalls obj1 = new  Task17_ConstructorCalls();

        System.out.println("----------------------------");

        Task17_ConstructorCalls obj2 = new  Task17_ConstructorCalls(10);

        System.out.println("----------------------------");

        Task17_ConstructorCalls obj3= new  Task17_ConstructorCalls("Java");


    }





}