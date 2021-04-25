package usersmanagement;

import java.sql.SQLException;
import java.util.Scanner;

public class UserMenu {
	Scanner input = new Scanner(System.in);
	int menuOption =0;
	boolean status = false;
	
	// admin menu after login
	public void adminMenu() throws SQLException {
		do {
			System.out.println("\t=========================");
			System.out.println("\t\tMain Menu");
			System.out.println("\t=========================\n");
			System.out.println("1.Users");
			System.out.println("2.Categories");
			System.out.println("3.Products");
			System.out.println("4.Logout");
			System.out.print("\nEnter Menu Option < 1 - 4 >:");
			menuOption = input.nextInt();
			switch(menuOption) {
				case 1:
					System.out.println("Users Managements");
				break;
				case 2:
					System.out.println("Categories Managements");
				break;
				case 3:
					System.out.println("Products Managements");
				break;
				case 4:
					UserLogout logout = new UserLogout();
					logout.logout();
				break;
				default:
					System.out.println("Invalid Input!");
					status = true;
			}
		}while(status == true);
	}
	
	// manager menu after login
	public void managerMenu() throws SQLException {
		do {
			System.out.println("\t=========================");
			System.out.println("\t\tMain Menu");
			System.out.println("\t=========================\n");
			System.out.println("1.Users");
			System.out.println("2.Categories");
			System.out.println("3.Products");
			System.out.println("4.Logout");
			System.out.print("\nEnter Menu Option < 1 - 4 >:");
			menuOption = input.nextInt();
			switch(menuOption) {
				case 1:
					System.out.println("Users Managements");
				break;
				case 2:
					System.out.println("Categories Managements");
				break;
				case 3:
					System.out.println("Products Managements");
				break;
				case 4:
					UserLogout logout = new UserLogout();
					logout.logout();
				break;
				default:
					System.out.println("Invalid Input!");
					status = true;
			}
		}while(status == true);
	}
}
