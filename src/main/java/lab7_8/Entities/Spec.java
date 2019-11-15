package lab7_8.Entities;

import org.jetbrains.annotations.NotNull;

/**
 * Сущность(entity) одной из таблиц бд
 */
public final class Spec {
    private int id;
    private int idvuss;
    private String name;
    private String info;

    public Spec(int id, int idvuss, String name, String info) {
        this.id = id;
        this.idvuss = idvuss;
        this.name = name;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdvuss() {
        return idvuss;
    }

    public void setIdvuss(int idvuss) {
        this.idvuss = idvuss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public @NotNull String toString() {
        return "\nid = " + id + ", idvuss = " + idvuss + ", name = " + name + ", info = " + info;
    }
}
