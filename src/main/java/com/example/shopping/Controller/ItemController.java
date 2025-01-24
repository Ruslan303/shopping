package com.example.shopping.Controller;

import com.example.shopping.Entity.Customer;
import com.example.shopping.Entity.Item;
import com.example.shopping.Service.ItemServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private ItemServices itemService;

    @GetMapping
    public List<Item> getAllItems() {return itemService.getAllItems();
    }

    @PostMapping("cerateItem")
    public Item createItem(@RequestBody Item item) {
        return itemService.createItem(item);

    }

}
