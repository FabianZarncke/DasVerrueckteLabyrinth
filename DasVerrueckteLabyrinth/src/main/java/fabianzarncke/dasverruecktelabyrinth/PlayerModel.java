/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabianzarncke.dasverruecktelabyrinth;

import java.util.ArrayList;

/**
 *
 * @author fabia
 */
class PlayerModel {
    
    private String name; //Name of the player
    
    //List of items linked to this player
    private ArrayList<ItemModel> itemsToFind; //List of items to be found
    private ArrayList<ItemModel> itemsFound; //List of items already found
    
    private ItemModel currentItem; //Current item to find

    //Constructor
    public PlayerModel(String name) {
        this.name = name;
    }

    //GETTER and SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ItemModel> getItemsToFind() {
        return itemsToFind;
    }

    public void setItemsToFind(ArrayList<ItemModel> itemsToFind) {
        this.itemsToFind = itemsToFind;
    }

    public ArrayList<ItemModel> getItemsFound() {
        return itemsFound;
    }

    public void setItemsFound(ArrayList<ItemModel> itemsFound) {
        this.itemsFound = itemsFound;
    }

    public ItemModel getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem(ItemModel currentItem) {
        this.currentItem = currentItem;
    }
    
}
