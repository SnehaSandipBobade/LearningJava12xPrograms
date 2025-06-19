package ex_19_OOPs_Part2.inheritance.singleinheritance;

public class LoginInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("--- Single Inheritance Demo (Login Context) ---");

        // Create an object of the Child class (UserLogin)
        // This will call the UserLogin constructor, which in turn calls the LoginModule constructor.
        Lab171_ChildClassUserLogin userSystem = new Lab171_ChildClassUserLogin("Standard User Login", 3);

        System.out.println("\n--- Testing Login Attempts ---");

        // The 'userSystem' (UserLogin object) can use methods defined in its own class
        // (like 'displayWelcomeMessage' - though called conditionally after auth)

        // It can also use methods inherited from the LoginModule class:
        boolean isAuthenticated1 = userSystem.authenticate("testuser", "password123"); // Inherited from LoginModule
        userSystem.logLoginAttempt("testuser", isAuthenticated1); // Inherited from LoginModule
        if (isAuthenticated1) {
            userSystem.displayWelcomeMessage("testuser"); // Specific to UserLogin
        }

        System.out.println("\n--- Another Login Attempt ---");
        boolean isAuthenticated2 = userSystem.authenticate("wronguser", "badpass"); // Inherited from LoginModule
        userSystem.logLoginAttempt("wronguser", isAuthenticated2); // Inherited from LoginModule

        // Accessing inherited property
        System.out.println("\nLogin module name: " + userSystem.moduleName);
        // Accessing its own specific property
        System.out.println("Max login attempts for this system: " + userSystem.maxLoginAttempts);
    }
}
