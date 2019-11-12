/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cylindert;
import java.util.*;

class Formula{
    //volume = pi * (r*r) *  h
    double raduis,height,result;
    void insert(double r, double h){
        raduis = r;
        height = h;
        result = 3.14159*(r*r)*height;
    }
    void calculate(){System.out.println("The Volume of Cylinder is "+(result));}
}
/*
 * @author lolito
 */
public class Cylinder {
    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double a = scanner.nextDouble();
        System.out.print("Enter Height: ");
        double b = scanner.nextDouble();
        
        Formula f = new Formula();
        f.insert(a, b);
        f.calculate();   
    }  
}
