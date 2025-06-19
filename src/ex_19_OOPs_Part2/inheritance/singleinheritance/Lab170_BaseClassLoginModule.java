package ex_19_OOPs_Part2.inheritance.singleinheritance;

public class Lab170_BaseClassLoginModule {
    protected String moduleName;// Common property, protected so child classes can access it

    public Lab170_BaseClassLoginModule(String name) {
        this.moduleName = name;
        System.out.println("LoginModule created for: " + moduleName);
    }

    // Common behavior: Authenticate a user
    public boolean authenticate(String username, String password) {
        System.out.println(moduleName + ": Attempting to authenticate user: " + username);
        // In a real system, this would connect to a database to check credentials.
        // For this example, let's just do a simple hardcoded check.
        if (username.equals("testuser") && password.equals("password123")) {
            System.out.println(moduleName + ": Authentication successful for " + username + ".");
            return true;
        } else {
            System.out.println(moduleName + ": Authentication failed for " + username + ".");
            return false;
        }
    }
        // Common behavior: Log a login attempt
        public void logLoginAttempt (String username,boolean success)
        {
            System.out.println(moduleName + ": Logged attempt for " + username + ", Success: " + success);
            // In a real system, this would write to a log file or database.
        }

}
