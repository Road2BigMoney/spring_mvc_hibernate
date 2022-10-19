package models;

//import jakarta.persistence.*;

//@Entity
//@Table(name = "users")
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column
    private long id;
//    @Column
    private String name;
//    @Column
    private int value;

    public User(long id, String name, int value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public User() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
