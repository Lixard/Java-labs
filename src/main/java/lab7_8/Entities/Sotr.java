package lab7_8.Entities;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Сущность(entity) одной из таблиц бд
 */
public final class Sotr {
    private int id;
    private int idvuss;
    private String name;
    private String fone;

    public Sotr(int id, int idvuss, String name, String fone) {
        this.id = id;
        this.idvuss = idvuss;
        this.name = name;
        this.fone = fone;
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

    @Contract(pure = true)
    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public @NotNull String toString() {
        return "\nid = " + id + ", idvuss = " + idvuss + ", name = " + name + ", fone = " + fone;
    }
}
