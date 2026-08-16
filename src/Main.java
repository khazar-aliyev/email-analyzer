import java.util.Scanner;
public class Khazar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        if(email.contains("@")){
            int c = email.indexOf("@");
            String username = email.substring(0,c);
            String domain = email.substring(c+1);
            System.out.printf("Your username is %s\n",username);
            System.out.printf("Your domain is %s\n ",domain);
        }
        else{
            System.out.println("Emails must contain @");
        }
    }
}
