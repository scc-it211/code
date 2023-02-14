
class FinalToPreventOverriding {
    final void printMethod() {
        System.out.println(
            "This is a final print method");
    }
}

class FinalToPreventOverridingSubclass 
    extends FinalToPreventOverriding {
    /* 
    // cannot override final print method
    void printMethod() {
       System.out.println(
        "this is a subclass of final print method") 
    }
    */
}

