package bean;

public class SearchBean {

    static String category = "";
    static String place = "";

    public SearchBean(String category, String place){
        this.category = category;
        this.place = place;
    }

    public static String getCategory () {
        return category;
    }

    public static void setCategory(String category){
        SearchBean.category = category;
    }

    public static String getPlace () {
        return place;
    }

    public static void setPlace(String place){
        SearchBean.place = place;
    }
}
