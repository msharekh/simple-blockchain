/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msh.blockchain;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author msharekh
 */
public class SimpleBlockchain {

    /**
     * @param args the command line arguments
     */
    
    ArrayList<Block> blockchain=new ArrayList<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
//        String[] list1 = {"a","b","c"};
//        String[] list2 = {"a","b","c"};
//
//        System.out.println(Arrays.hashCode(list1)); //digital signature of list1
//        System.out.println(Arrays.hashCode(list2));

        String[] genesisTransactions = {"Mishal send 100$ to Nabeel","Nabeel send 10$ to Ahmed"};
        Block genesisBlock = new Block(0,genesisTransactions);
        
        
        String[] block2Transactions = {"Nabeel send 50$ to Mishal","Ahmed send 10$ to Nabeel"};
        Block block2 = new Block(genesisBlock.getBlockHash(),block2Transactions);
        
        
        String[] block3Transactions = {"Nabeel send 10$ to Mishal","Ahmed send 10$ to Nabeel"};
        Block block3 = new Block(block2.getBlockHash(),block3Transactions);
        
        
        System.out.println("Hash of genesisBlock");
        System.out.println(genesisBlock.getBlockHash());
        
        System.out.println("Hash of block 2");
        System.out.println(block2.getBlockHash());
        
        System.out.println("Hash of block 3");
        System.out.println(block3.getBlockHash());
        
        //first result
        // Hash of genesisBlock
        //830358503
        //Hash of block 2
        //1209585458
        //Hash of block 3
        //-146427527

        //after changing 50$ to 100$, all other blocks are changed
        //Hash of genesisBlock
        //1784197561
        //Hash of block 2
        //-2131542780
        //Hash of block 3
        //807411531
    }
    
}
