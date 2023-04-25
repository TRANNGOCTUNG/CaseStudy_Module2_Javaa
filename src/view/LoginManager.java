package view;

import Storage.ReadWriteFile;
import login.Login;
import login.RegexUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginManager {
    public void logInOut(){;
        boolean check = false;
        ShowManager showManager = new ShowManager();
        do {
            Scanner scanner = new Scanner(System.in);
            RegexUser userName = new RegexUser();
            System.out.println("Enter username login: ");
            String username = scanner.nextLine();
            System.out.println("Enter password login: ");
            String password = scanner.nextLine();
            if (userName.username(username) && userName.password(password)) {
                System.out.println("Logged in successfully");
                List<Login> logins = new ArrayList<>();
                logins.add(new Login(username, password));
                ReadWriteFile<Login> file = ReadWriteFile.getINSTANCE();
                file.writeFile(logins, "src/file/password.dat");
                file.readFile("src/file/password.dat");
                check = true;
                showManager.showManagement();
            } else {
                System.out.println("Please re-enter");
                check = false;
            }
        }while (!check);
    }
}
