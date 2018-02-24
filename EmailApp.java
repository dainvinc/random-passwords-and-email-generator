public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email();
        email.set

        String newEmail = email.generateEmail().replaceAll("\\s", "");
        
        System.out.println("Your new Email is: "+newEmail);
        System.out.println("Your new Password is: "+email.generatePassword());
        System.out.println("Your new Password is: "+email.getEmail());
    }
}