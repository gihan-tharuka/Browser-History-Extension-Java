public class BrowserHistoryStack {
    BrowserHistoryNode top;

    public void push(String pageName, String pageId, String date, String siteURL, boolean isBookmark) {
        BrowserHistoryNode newNode = new BrowserHistoryNode(pageName, pageId, date, siteURL, isBookmark);
        newNode.next = top;
        if (top != null) {
            top.prev = newNode;
        }
        top = newNode;

        System.out.println("The browser entry added successfully...");
    }

    public BrowserHistoryNode pop() {
        if (top == null) {
            System.out.println("History is empty!");
            return null;
        }
        BrowserHistoryNode popped = top;
        top = top.next;
        if (top != null) {
            top.prev = null;
        }
        return popped;
    }

    public void displayAll() {
        BrowserHistoryNode current = top;
        if (current == null) {
            System.out.println("History is empty!");
            return;
        }
        System.out.println("Displaying all browser history...");
        while (current != null) {
            System.out.println("Page name: " + current.pageName + "  | Page id: " + current.pageId + "  | Date: "
                    + current.date + " | URL: "
                    + current.siteURL + "  | Bookmark: " + (current.isBookmark ? "Yes" : "No"));
            current = current.next;
        }
    }

    public void displayReverse() {
        BrowserHistoryNode current = top;
        if (current == null) {
            System.out.println("History is empty!");
            return;
        }
        while (current.next != null) {
            current = current.next;
        }
        System.out.println("Displaying browser history in reverse order...");

        while (current != null) {
            System.out.println("Page name: " + current.pageName + " | Page id: " + current.pageId + " | Date: "
                    + current.date + " | URL: "
                    + current.siteURL + " | Bookmark: " + (current.isBookmark ? "Yes" : "No"));
            current = current.prev;
        }
    }

    public void displayBookmarks() {
        BrowserHistoryNode current = top;
        if (current == null) {
            System.out.println("History is empty!");
            return;
        }
        boolean foundBookmark = false;
        System.out.println("Displaying all bookmarks...");

        while (current != null) {
            if (current.isBookmark) {
                System.out.println("Page name: " + current.pageName + " | Page id: " + current.pageId + " | Date: "
                        + current.date + " | URL: "
                        + current.siteURL + " | Bookmark: " + (current.isBookmark ? "Yes" : "No"));
                foundBookmark = true;
            }
            current = current.next;
        }
        if (!foundBookmark) {
            System.out.println("No bookmarks found in history!");
        }
    }
}
