/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futsalbookingsystem.model;

/**
 *
 * @author lenovo
 */
public class UserData {
    
    // private attributes
    // public methods
      private String email;
      private String password;
      private String name;
      private String id;
      private String phonenumber;
      public UserData(String name, String email,String phonenumber, String password){
          this.name= name;
          this.email= email;
          this.phonenumber=phonenumber;
          this.password= password;
      }    
      public UserData(String id,String name, String email,String phonenumber,  String password){
          this.id=id;
          this.name=name;
          this.email=email;
          this.phonenumber=phonenumber;
          this.password=password;
      }    
    // setters
      public void setId(String id){
          this.id=id;
      }
      public void setName(String name){
          this.name=name;
        }
      public void setEmail(String email){
          this.email=email;
      }
      public void setPassword(String password){
          this.password=password;
      }
      
   // getters
      public String getId(){
          return id;
      }
      public String getName(){
          return this.name;
      }
      public String getEmail(){
          return this.email;
          
      }
      public String getPassword(){
          return this.password;
      }
      public String getPhonenumber(){
          return this.phonenumber;
      }
  }