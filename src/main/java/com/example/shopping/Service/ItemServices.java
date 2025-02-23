package com.example.shopping.Service;

import com.example.shopping.Entity.Customer;
import com.example.shopping.Entity.Item;
import com.example.shopping.Repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServices {

    private final ItemRepository itemRepository;



    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }



    public Item createItem(Item item) {
        return itemRepository.save(item);


    }

}

