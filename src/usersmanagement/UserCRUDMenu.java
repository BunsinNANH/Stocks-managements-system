package usersmanagement;

import java.util.Scanner;

public class UserCRUDMenu {
	Scanner input = new Scanner(System.in);
	public void menu() {
		boolean status = false;
		do {
			System.out.println("\t==============");
			System.out.println("\t\tMenu Users");
			System.out.println("\t==============\n");
			System.out.println("1. Add New User");
			System.out.println("2. Modify User");
			System.out.println("3. Search User");
			System.out.println("4. Show All Users");
			System.out.println("5. Delete User");
			System.out.println("6. Exit");
			int option = input.nextInt();
			switch(option) {
				case 1:
			}
		}while(status != false);
	}
	
}
