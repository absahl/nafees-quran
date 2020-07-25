package ubaidiyah.nafees.demo.model;

public class ListItem {
    private int itemNumber;
    private String itemTitle;
    private int itemStartingPage;

    public ListItem(int itemNumber, String itemTitle, int itemStartingPage){
        this.itemNumber = itemNumber;
        this.itemTitle = itemTitle;
        this.itemStartingPage = itemStartingPage;
    }

    public int getItemNumber(){ return itemNumber; }

    //public void setItemNumber(int itemNumber){ this.itemNumber = itemNumber; }

    public String getItemTitle(){ return itemTitle; }

    //public void setItemTitle(String itemTitle){ this.itemTitle = itemTitle; }

    public int getItemStartingPage(){ return itemStartingPage; }

    //public void setItemStartingPage(int itemStartingPage){ this.itemStartingPage = itemStartingPage; }

}
