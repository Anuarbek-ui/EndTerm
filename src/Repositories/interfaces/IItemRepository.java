package Repositories.interfaces;
import entities.Item;

import java.util.ArrayList;

public interface IItemRepository {
    public ArrayList<Item> searchItemByCategory(String Category);
}
