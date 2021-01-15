/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabianzarncke.dasverruecktelabyrinth;

/**
 *
 * @author fabia
 */
class ItemModel {
    
    
    private String name; //e.g. Trophy, Chest, etc.
    
    //Current status
    private boolean found;
    private boolean active;

    //Contructor
    public ItemModel(String name, boolean found) {
        this.name = name;
        this.found = found;
    }

    //GETTER and SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    
    
    
}
