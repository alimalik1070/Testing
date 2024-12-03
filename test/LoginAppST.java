public class LoginAppST {

    public static void main(String[] args) {
        // Test 1: Valid email
        testValidEmail();

        // Test 2: Invalid email
        testInvalidEmail();

        // Test 3: Empty email
        testEmptyEmail();

        // Test 4: SQL Injection attempt
        testSQLInjection();

        // Test 5: Database connection
        testDatabaseConnection();

        System.out.println("All tests completed");
    }

    private static void testValidEmail() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("johndoe@example.com");
        System.out.println("Test Valid Email: " + (result == null ? "PASS" : "FAIL"));
    }

    private static void testInvalidEmail() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("nonexistent@example.com");
        System.out.println("Test Invalid Email: " + (result == null ? "PASS" : "FAIL"));
    }

    private static void testEmptyEmail() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("");
        System.out.println("Test Empty Email: " + (result == null ? "PASS" : "FAIL"));
    }

    private static void testSQLInjection() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("' OR '1'='1");
        System.out.println("Test SQL Injection: " + (result == null ? "PASS" : "FAIL"));
    }

    private static void testDatabaseConnection() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("johndoe@example.com");
        System.out.println("Test Database Connection: " + (result == null ? "PASS" : "FAIL"));
    }

}



