/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisioncoding;

/**
 *
 * @author Fernando
 */
public class DivisionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
        CodingTest1 coding= new CodingTest1();
        System.out.println(coding.Divison(17.3, 0.35));
        System.in.read();
        }
        catch(Exception e){}
    }
    
}
