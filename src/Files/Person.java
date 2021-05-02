package Files;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -2519153690548418759L;
    private int id;
    private String personName;
    private int age;
    private byte type;

    @Override
    public String toString() {
        return "id: " + id +
                ", name: " + personName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return personName;
    }

    public Person(int id, String name) {
        this.id = id;
        this.personName = name;
    }
}
