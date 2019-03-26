package com.javaweek.enumProject;
public enum TransactionStateEncapsulated {

    COMPLETE {
        @Override
        public boolean isTransactionComplete() {
            return true;
        }
    }, REJECTED {
        @Override
        public boolean isTransactionComplete() {
            return true;
        }
    }, PENDING {
        @Override
        public boolean isTransactionComplete() {
            return false;
        }
    }, AWAITING_APPROVAL {
        @Override
        public boolean isTransactionComplete() {
            return false;
        }
    };

    public abstract boolean isTransactionComplete();
}