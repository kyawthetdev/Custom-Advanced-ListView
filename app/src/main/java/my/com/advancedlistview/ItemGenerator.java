package my.com.advancedlistview;


public class ItemGenerator {
    private String title;
    private String pCount;
    private int icon;
    private Boolean bol;

//    public  ItemGenerator(String title,int icon){
//        this.title=title;
//        this.icon=icon;
//    }

    public ItemGenerator(String title, int icon, Boolean bol, String pCount) {
        this.title = title;
        this.bol = bol;
        this.icon = icon;
        this.pCount = pCount;
    }

    public Boolean getBol() {
        return bol;
    }

    public void setBol(Boolean bol) {
        this.bol = bol;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }


    public String getpCount() {
        return pCount;
    }


    public void setpCount(String num) {
        this.pCount = pCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
