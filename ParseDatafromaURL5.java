package Lec7_Strings;
import java.util.Scanner;
public class ParseDatafromaURL5 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a URL: ");
        String url = scanner.nextLine();

        int protocolEnd = url.indexOf("://");
        String protocol = url.substring(0, protocolEnd);

        int domainStart = protocolEnd + 3;
        int domainEnd = url.indexOf("/", domainStart);
        String domain;
        String path;

        if (domainEnd != -1) {
            domain = url.substring(domainStart, domainEnd);
            path = url.substring(domainEnd);
        } else {
            domain = url.substring(domainStart);
            path = "/";
        }

        System.out.println("Protocol: " + protocol);
        System.out.println("Domain: " + domain);
        System.out.println("Path: " + path);
    }
}
    

