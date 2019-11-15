package lab7_8.Entities;

import org.jetbrains.annotations.NotNull;

/**
 * Сущность(entity) одной из таблиц бд
 */
public final class Vuss {
    private int id;
    private String name;
    private String adress;

    public Vuss(int id, String name, String adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public @NotNull String toString() {
        return "\nid = " + id + ", name = " + name + ", adress = " + adress;
    }
}
