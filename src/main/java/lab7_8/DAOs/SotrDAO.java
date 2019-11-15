package lab7_8.DAOs;

import lab7_8.App;
import lab7_8.Entities.Sotr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public final class SotrDAO implements DAO<Sotr> {


    private static @NotNull Sotr createEntity(@NotNull ResultSet resultSet) throws SQLException {
        final int id = resultSet.getInt(1);
        final int idvuss = resultSet.getInt(2);
        final String name = resultSet.getString(3);
        final String fone = resultSet.getString(4);
        return new Sotr(id, idvuss, name, fone);
    }

    @Override
    public @NotNull List<Sotr> getAll() throws SQLException {
        Connection connection = App.getConnection();
        Statement statement = connection.createStatement();
        List<Sotr> list = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery("select * from sotr");
        while (resultSet.next()) {
            list.add(createEntity(resultSet));
        }
        connection.close();
        return list;
    }

    @Override
    public @Nullable Sotr getById(int id) throws SQLException {
        Connection connection = App.getConnection();
        PreparedStatement preparedStatement =
                connection.prepareStatement("select * from sotr where id = ?");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Sotr sotr = null;
        if (resultSet.next()) {
            sotr = createEntity(resultSet);
        }
        connection.close();
        return sotr;
    }
}
