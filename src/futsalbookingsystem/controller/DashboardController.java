/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futsalbookingsystem.controller;

import futsalbookingsystem.model.UserData;
import futsalbookingsystem.view.DashboardView;

/**
 *
 * @author lenovo
 */
public class DashboardController {
        DashboardView view;
    UserData user;
    public DashboardController(DashboardView view, UserData user){
        this.view = view;
        this.user = user;
        String name= user.getName();
    }
    public void open(){
        view.setVisible(true);
        
    }
    public void close(){
        view.dispose();
    }
}
