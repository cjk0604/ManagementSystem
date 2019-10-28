package com.example.fastcamp.repository;

import com.example.fastcamp.FastcallApplicationTests;
import com.example.fastcamp.controller.repository.ItemRepository;
import com.example.fastcamp.model.entity.Item;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ItemRepositoryTest extends FastcallApplicationTests {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void create() {

        Item item = new Item();
        item.setName("Laptop");
        item.setPrice(1000);
        item.setContent("Apple Mac Pro");

        Item newItem = itemRepository.save(item);

        Assert.assertNotNull(newItem);
    }


    @Test
    public void read(){
        Long id = 1L;
        Optional<Item> item = itemRepository.findById(id);

        Assert.assertTrue(item.isPresent());


    }
}
