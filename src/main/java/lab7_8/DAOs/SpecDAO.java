package lab7_8.DAOs;

import lab7_8.App;
import lab7_8.Entities.Spec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public final class SpecDAO implements DAO<Spec> {

    private static @NotNull Spec createEntity(@NotNull ResultSet resultSet) throws SQLException {
        final int id = resultSet.getInt(1);
        final int idvuss = resultSet.getInt(2);
        final String name = resultSet.getString(3);
        final String info = resultSet.getString(4);

        return new Spec(id, idvuss, name, info);
    }

    @Override
    public @NotNull List<Spec> getAll() throws SQLException {
        Connection connection = App.getConnection();
        Statement statement = connection.createStatement();
        List<Spec> list = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery("select * from spec");
        while (resultSet.next()) {
            list.add(createEntity(resultSet));
        }
        connection.close();
        return list;
    }

    @Nullable
    @Override
    public Spec getById(int id) throws SQLException {
        Connection connection = App.getConnection();
        PreparedStatement preparedStatement =
                connection.prepareStatement("select * from spec where id = ?");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Spec spec = null;
        if (resultSet.next()) {
            spec = createEntity(resultSet);
        }
        connection.close();
        return spec;
    }
}
