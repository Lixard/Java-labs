package lab7_8.DAOs;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.sql.SQLException;
import java.util.List;

/**
 * Data Access Object - если вкратце, это некоторая прослойка между бд и программой,
 * которая позволяет взаимодействовать с бд
 *
 * @param <E> Любая entity
 */
public interface DAO<E> {
    /**
     * Позволяет получить список объектов из бд
     *
     * @return Список объектов
     * @throws SQLException Ошибка бд
     */
    @NotNull
    List<E> getAll() throws SQLException;

    /**
     * Позволяет получить отдельную entity по id
     *
     * @param id id у сущности
     * @return Объект
     * @throws SQLException Ошибка бд
     */
    @Nullable
    E getById(int id) throws SQLException;
}
