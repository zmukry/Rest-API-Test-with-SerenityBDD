package learn.serenitybdd.resttesting.model;

/**
 * Created by zuhair.mukry on 6/30/2016.
 */
public class Pet {
    private String name;
    private String status;
    private int id;

    public Pet(String status, String name) {
        this.status = status;
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
