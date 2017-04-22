   package models;

   import java.util.*;
   import javax.persistence.*;

   import play.data.format.*;
   import play.data.validation.*;

   import com.avaje.ebean.*;


    // Product Entity managed by the ORM
   @Entity
   public class Product extends Model {


    //Properties

    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String description;

    @Constraints.Required
    private int stock;

    @Constraints.Required
    private double price;


   //Default Constructor

   public Product() {
   }

   // Constructor to initialise object

   public Product(Long id, String name, String description, int stock,double price) {
       this.id = id;
       this.name =name;
       this.description = description;
       this.stock = stock;
       this.price = price;

}

   public Long getId() {
       return id;
   }

   public void setId(Long id) {
       this.id = id;
   }

   public String getName() {
       return name;
   }


   public void setName(String name) {
       this.name = name;
   }

   public String getDescription() {
       return description;
   }

   public void setDescription(String description) {
       this.description = description;
   }

   public int getStock() {
       return stock;
   }

   public void setStock(int stock) {
       this.stock = stock;
   }

   public double getPrice() {
       return price;
   }

   public void setPrice( double price) {
       this.price = price;
   }

}
