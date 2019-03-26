package com.javaweek.enumProject;

/*Java enums are very powerful and important part of the Java language.
 *  Even though they can do so much, it is very common to see them either being used incorrectly or not used at all.
 *   In this blog post I want to remind you what Java enums can do and show some of the usage patterns that don�t get enough attention.

What are Java enums?
An enumerated type in Java is a type whose values consist of a fixed set of constants.
 This sounds quite theoretical, so let�s try with an informal way of describing them.
  In Java, enumerated types are kinds of classes which have predefined set of instances.
   This is quite different to C# where enums are a much simpler type.
    In Java enums can have constructors, methods, fields� They really are like classes, with only a few specific differences:

They extend java.lang.Enum
They have fixed set of instances
They can be used in switch statements
They can�t be extended
They have minor differences that won�t be important for the usages mentioned here unless explicitly stated
With this reminder of how similar enums are to classes, it should be clear that they can be used for more than simply enumerating things.

Enums are great as Singletons
Using Enums in Java it is very easy to implement a lazy loading Singleton: */

public enum ScratchPad {
    INSTANCE;
    private ScratchPad() {
        // This is called the first time this enum is initialised
        System.out.println("I am initialised");
    }



    /*
     * As you can see, this provides a very simple and correct implementation of the
     * singleton pattern. Also, since this is an enum, it does not have to be a
     * single instance. There could be precisely two instances etc.
     * 
     * Enums can replace switch statements This is one of my favourite uses of enums
     * and one that is often overlooked. It is often the case that someone uses enum
     * for selecting different behaviour. It is common to see a code like this:
     */

    public static boolean isTransactionComplete(Transaction transaction) {
        switch (transaction.getTransactionState()) {
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
//with a TransactionState enum like this:

    public enum TransactionState {
        COMPLETE, REJECTED, PENDING
    }

    /*
     * This is ok, but what if the same method (with the same business logic) is
     * needed somewhere else? You can always move the method inside the enum and
     * have it constructed like this:
     */

public enum TransactionState {

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
//This at least keeps the logic together with the definition of the enum,
//so it is all in one place (encapsulation).
//However, if the enum gets large and complicated (never through our fault!) it is easy to introduce bugs.
//Let�s add another state- AWAITING_APPROVAL which is not transactionComplete.
//If someone overlooks changing the isTransactionComplete method, a new bug is introduced.
//This can be prevented by introducing some type-safety.
//Java enums can declare abstract methods which have to be implemented by specific instances.
//Let�s introduce isTransactionComplete as an abstract method and refactor this enum as follows:

    public enum TransactionState {

        COMPLETE {
            @Override
            public boolean isTransactionComplete() {
                return true;
            }
        },
        REJECTED {
            @Override
            public boolean isTransactionComplete() {
                return true;
            }
        },
        PENDING {
            @Override
            public boolean isTransactionComplete() {
                return false;
            }
        },
        AWAITING_APPROVAL {
            @Override
            public boolean isTransactionComplete() {
                return false;
            }
        };

        public abstract boolean isTransactionComplete();
}
