/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Tommy
 */
public class MenuItemCategory {
    private String id;
    private String description;

    public MenuItemCategory(String id, String description) {
        this.id = id;
        this.description = description;
    }   

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
    
    
    
}
