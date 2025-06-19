package ex_19_OOPs_Part2.inheritance.singleinheritance;

public class Lab171_ChildClassUserLogin extends Lab170_BaseClassLoginModule{
    // Specific property for UserLogin
    protected int maxLoginAttempts;

    // Constructor for UserLogin
    // It calls the parent's constructor using 'super()' to set up the basic login module part
    public Lab171_ChildClassUserLogin(String name, int maxAttempts) {
        super(name); // Call the constructor of the LoginModule class
        this.maxLoginAttempts = maxAttempts;
        System.out.println("UserLogin system initialized with max attempts: " + maxLoginAttempts);
    }
    public void displayWelcomeMessage(String username) {
        System.out.println("Welcome, " + username + "! You have successfully logged in to the " + moduleName + " system.");
    }
    // --- Main Class to run the example ---
}


