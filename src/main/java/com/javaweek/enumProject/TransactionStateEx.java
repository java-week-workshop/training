package com.javaweek.enumProject;

public class TransactionStateEx {
    public static boolean isTransactionComplete(Transaction transaction){
        switch(transaction.getTransactionState()){
            case TransactionState.COMPLETE:
                return true;
            case TransactionState.PENDING:
                return true;
            case TransactionState.REJECTED:
                return false;
            default:
                return true;
        }
    }
    
    public enum TransactionState {
        COMPLETE, REJECTED, PENDING;
    }

}
