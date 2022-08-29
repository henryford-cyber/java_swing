/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iteam;

/**
 *
 * @author Tai
 */
public class set_so_cuatextfile {
    public static char[] sb = {'$','#','@'};
    public static char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    
    public static Boolean checkNum(String s)  {
    
   
        boolean b = false;
        char a[] = s.toCharArray();

        for(int i =0; i < a.length; i++) 
        {
            for(int j=0; j<num.length; j++)
            {
                if(a[i] == num[j]) 
                b = true;
            }
        }
        return b ;
    }
}
