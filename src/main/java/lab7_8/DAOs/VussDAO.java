package lab7_8.DAOs;

import lab7_8.App;
import lab7_8.Entities.Vuss;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public final class VussDAO implements DAO<Vuss> {

    private static @NotNull Vuss createEntity(@NotNull ResultSet resultSet) throws SQLException {
        final int id = resultSet.getInt(1);
        final String name = resultSet.getString(2);
        final String adress = resultSet.getString(3);

        return new Vuss(id, name, adress);
    }

    @Override
    public @NotNull List<Vuss> getAll() throws SQLException {
        Connection connection = App.getConnection();
        Statement statement = connection.createStatement();
        List<Vuss> list = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery("select * from vuss");
        while (resultSet.next()) {
            list.add(createEntity(resultSet));
        }
        connection.close();
        return list;
    }

    @Nullable
    @Override
    public Vuss getById(int id) throws SQLException {
        Connection connection = App.getConnection();
        PreparedStatement preparedStatement =
                connection.prepareStatement("select * from vuss where id = ?");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Vuss vuss = null;
        if (resultSet.next()) {
            vuss = createEntity(resultSet);
        }
        connection.close();
        return vuss;
    }
}
