public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("Vishal", "Koosuri");

        String newEmail = email.generateEmail().replaceAll("\\s", "");
        
        System.out.println("Your new Email is: "+newEmail);
        System.out.println("Your new Password is: "+email.getPassword());
    }
}