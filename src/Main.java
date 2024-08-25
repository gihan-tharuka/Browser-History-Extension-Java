import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BrowserHistoryStack historyStack = new BrowserHistoryStack();

        int choice;
        do {
            System.out.println("\n** Browser History Menu **");
            System.out.println("1. Add New Entry");
            System.out.println("2. View All History");
            System.out.println("3. View History in Reverse Order");
            System.out.println("4. View Bookmarked Sites");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter Page Name: ");
                    String pageName = scanner.nextLine();
                    System.out.println("Enter Page ID: ");
                    String pageId = scanner.nextLine();
                    System.out.println("Enter Date (DD.MM.YYYY): ");
                    String date = scanner.nextLine();
                    System.out.println("Enter Site URL: ");
                    String siteURL = scanner.nextLine();
                    System.out.println("Is this a bookmark (Yes/No)? ");
                    String bookmarkInput = scanner.nextLine();
                    boolean isBookmark = bookmarkInput.equalsIgnoreCase("Yes");
                    historyStack.push(pageName, pageId, date, siteURL, isBookmark);
                    break;
                case 2:
                    historyStack.displayAll();
                    break;
                case 3:
                    historyStack.displayReverse();
                    break;
                case 4:
                    historyStack.displayBookmarks();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);

        scanner.close();
    }
}
