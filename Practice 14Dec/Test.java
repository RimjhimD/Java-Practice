public class Test {

     public static void main(String[] args){

          int x = 3;
          int y = 4;

          int z = add(x,y);      // int z is a local variable under main
                                 // our method does not recognize that

             System.out.println(z);  // way 1 
             // System.out.println(add(x,y));     // way 2            
     } 

        static int add(int x,int y){      // normally if we dont return anything we use void
                                 //But as we passsing integers so we used int 

           //   return x+y;    // way 3

             int z = x+y;
              return z; 

        }




    
}
