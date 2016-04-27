package hello;

public class Item {
    private Integer id;
    private String url;

    public Item(Integer id) {
        this.id = id;
        this.url = "http://test.com/" + id;
    }

    public Integer getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }
}
