public class BrowserHistoryNode {
    String pageName;
    String pageId;
    String date;
    String siteURL;
    boolean isBookmark;
    BrowserHistoryNode prev;
    BrowserHistoryNode next;

    public BrowserHistoryNode(String pageName, String pageId, String date, String siteURL, boolean isBookmark) {
        this.pageName = pageName;
        this.pageId = pageId;
        this.date = date;
        this.siteURL = siteURL;
        this.isBookmark = isBookmark;
    }
}
