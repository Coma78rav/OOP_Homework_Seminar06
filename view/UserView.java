package view;

import java.util.Scanner;

import service.PersisterService;
import service.UserService;

public class UserView {
    public void Start(){
        UserService userService = new UserService();
        PersisterService persisterService = new PersisterService();

        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите имя: ");
        persisterService.createPersister(userService.createUser(scanner.nextLine()));
        userService.report();
        persisterService.save();
    }
}