
package com.OffersTeam.CrudIt;

import javax.persistence.*;

@Entity
@Table(name= "offers")
public class Offers {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer Id;
    
    @Column(name="Name")
    private String Name;
    
    @Column(name="Description")
    private String Description;
    
    @Column(name="Price")
    private Integer Price;

    public Offers(Integer Id, String Name, String Description, Integer Price) {
        this.Id = Id;
        this.Name = Name;
        this.Description = Description;
        this.Price = Price;
    }
    public Offers() {
        
    }
    
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer Price) {
        this.Price = Price;
    }
    
    
    
    
}
