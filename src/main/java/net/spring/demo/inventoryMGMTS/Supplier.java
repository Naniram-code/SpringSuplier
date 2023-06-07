package net.spring.demo.inventoryMGMTS;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Supplier {
    
  
    private List<Items> itemslList=new ArrayList<>();
    @PostMapping("/additems")
    public String addItems(@RequestBody Items items)
    {
        itemslList.add(items);
    return "Item addd sucessfully";}
      
    @GetMapping("/getItems")
    public List<Items>getItems()
    {
    return itemslList;
     }
     @PutMapping("/updatItemsByID/{itemID}")
     public String updateemp(@PathVariable int itemID, @RequestBody Items item) {
       
         for (Items it : itemslList) {
             if (it.getIID() == itemID) {
                 //remove
                 
                 itemslList.remove(it);
                 // add updated
                 itemslList.add(item);
                
             }
         }
     
         return "Item updated successfully";
     }
     
 
     @DeleteMapping("/deleteItemByID/{id}")
     public String deleteemp(@PathVariable int id) {
       
         for(Items it:itemslList) {
            if(it.getIID() ==id)
                 // delete
                 itemslList.remove(it);
               
             }
         
 
         return "Deleted Employee Successfully";
     }

}



