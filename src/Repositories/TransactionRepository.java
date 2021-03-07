import Repositories.interfaces.IItemRepository;
import data.interfaces.IDBManager;
import entities.Customer;
import data.DBManager;
import entities.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class TransactionRepository implements TTransactionRepository {
    private final IDBManager dbManager;

    public TransactionRepository(IDBManager dbManager) {
        this.dbManager = dbManager;
    }

    public ArrayList<> searchItemByCategory(String Category) {
        Connection connection = null;
        try {
            connection = dbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM item WHERE category LIKE '%baby'");
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<Item> items = new ArrayList<>();
            while (resultSet.next()) {
                Item item = new Item(resultSet.getString("name"),
                        resultSet.getInt("id"),
                        resultSet.getString("category"),
                        resultSet.getDouble("price"),
                        resultSet.getDouble("UnitsAvailable"),
                        resultSet.getDouble("DiscountAmount"));
                items.add(item);
            }
            return items;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}

