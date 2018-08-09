/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msh.blockchain;

import java.util.Arrays;

/**
 *
 * @author msharekh
 */
public class SimpleBlockchain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] list1 = {"a","b","c"};
        String[] list2 = {"a","b","c"};

        System.out.println(Arrays.hashCode(list1)); //digital signature of list1
        System.out.println(Arrays.hashCode(list2));
        
    }
    
}
