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
public class Block {
    private int previousHash;
    private String[] transactions;
    
    private int blockHash;

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;
        
        Object[] contents = {Arrays.hashCode(transactions),previousHash};
        
        this.blockHash=Arrays.hashCode(contents);
    }

//    Block() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
    
    
     
}
