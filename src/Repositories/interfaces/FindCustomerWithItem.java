package Repositories.interfaces;

import data.interfaces.IDBManager;
import entities.Customer;
import entities.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FindCustomerWithItem {
    private final IDBManager dbManager;
    public FindCustomerWithItem(IDBManager dbManager) {
        this.dbManager = dbManager;
    }


    public ArrayList<Customer> FindCustomerWithItem(String Name, String Item) {
        Connection connection = null;
        try {
            connection = dbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT customer.customer_name,customer.country,item.item_name\n" +
                    "FROM customer\n" +
                    "FULL JOIN item ON item.item_id=customer.customer_id\n" +
                    "GROUP BY  customer.customer_name,customer.country, item.item_name;");
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<Customer> customers = new ArrayList<>();
            while (resultSet.next()) {
                Customer customer = new Customer(resultSet.getString("customer_number"),
                        resultSet.getString("country"),
                        resultSet.getString("item_name")));
                customers.add(customer);
            }
            return customer;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
