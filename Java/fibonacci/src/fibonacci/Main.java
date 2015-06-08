package fibonacci;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class Main {

   
    public static void main(String[] args) {
       double pri=1;
       double sec=1;
       double ret=0;
       System.out.printf("%.2f\n %.2f\n",pri, sec);
       for(int i=0;i<10000;i++)
       {
           ret=pri+sec;
           pri=sec;
           sec=ret;
           
           System.out.printf("%.2f\n", ret);
    }
    
       

}
}
