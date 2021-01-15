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
public class TileModel {
    
    enum TileType {
        cross, tcross, corner, line
    }
    
    //determine where this tile can connect to other tiles
    private boolean CN; //ConnectNorth
    private boolean CE; //ConnectEast
    private boolean CS; //ConnectSouth
    private boolean CW; //ConnectWest
    
    //what kind of tile needs to be loaded
    private TileType tileType;

    //is there an Item on this tile? If yes which one?
    private boolean hasItem;
    private ItemModel item;
    
    //is there a Player on this tile? If yes which one?
    private boolean hasPlayer;
    private PlayerModel player;

    //Constructor
    public TileModel(boolean CN, boolean CE, boolean CW, TileType tileType) {
        this.CN = CN;
        this.CE = CE;
        this.CW = CW;
        this.tileType = tileType;
    }

    //GETTER and SETTER
    public boolean isCN() {
        return CN;
    }

    public void setCN(boolean CN) {
        this.CN = CN;
    }

    public boolean isCE() {
        return CE;
    }

    public void setCE(boolean CE) {
        this.CE = CE;
    }

    public boolean isCS() {
        return CS;
    }

    public void setCS(boolean CS) {
        this.CS = CS;
    }

    public boolean isCW() {
        return CW;
    }

    public void setCW(boolean CW) {
        this.CW = CW;
    }

    public TileType getTileType() {
        return tileType;
    }

    public void setTileType(TileType tileType) {
        this.tileType = tileType;
    }

    public boolean isHasItem() {
        return hasItem;
    }

    public void setHasItem(boolean hasItem) {
        this.hasItem = hasItem;
    }

    public ItemModel getItem() {
        return item;
    }

    public void setItem(ItemModel item) {
        this.item = item;
    }

    public boolean isHasPlayer() {
        return hasPlayer;
    }

    public void setHasPlayer(boolean hasPlayer) {
        this.hasPlayer = hasPlayer;
    }

    public PlayerModel getPlayer() {
        return player;
    }

    public void setPlayer(PlayerModel player) {
        this.player = player;
    }
    
    
    
    
}
