import data.interfaces.IDBManager;
import entities.Customer;
import data.DBManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CustomerRepository {
    private final IDBManager dbManager;

    public CustomerRepository(IDBManager dbManager) {
        this.dbManager = dbManager;
    }

    public ArrayList<Customer> CustomerAgeGroup(String ageGroup) {
        Connection connection = null;
        try {
            ArrayList<Customer> customers = new ArrayList<>();
            connection = dbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select agegroup from customer\n" +
                    "group by agegroup\n" +
                    "order by count(agegroup) desc limit 1;");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Customer customer = new Customer(resultSet.getString("ageGroup"));
                resultSet.getString("ageGroup");

                customers.add(customer);
            }
            return customers;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
