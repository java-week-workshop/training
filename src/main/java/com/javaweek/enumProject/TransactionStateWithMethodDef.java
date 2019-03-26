package com.javaweek.enumProject;
public enum TransactionStateWithMethodDef {

    COMPLETE, REJECTED, PENDING;

    public boolean isTransactionComplete(){
        switch(this){
            case COMPLETE:
                return true;
            case PENDING:
                return true;
            case REJECTED:
                return false;
            default:
                return true;
        }
    }
}