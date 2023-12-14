public class Main {

    public static void main(String[] args){

        //method=a block of code that is executed whenever it is called upon

       
        String name ="Bro";
                                // these are the arguements
        int age =21;

// calling our static void hello method in main 


        hello(name,age);    //passing a variable called name      


    }

    // created a method hello

    static void hello(String name, int age){      // now passing parameters 
        System.out.println("Hello "+name);
         System.out.println("You are "+age);
    } 


    
}
