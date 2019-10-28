package com.example.fastcamp.repository;

import com.example.fastcamp.FastcallApplicationTests;
import com.example.fastcamp.controller.repository.UserRepository;
import com.example.fastcamp.model.entity.Item;
import com.example.fastcamp.model.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends FastcallApplicationTests {


    // Dependency Injection (DI)
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){

        User user = new User();
        user.setAccount("TestUser3");
        user.setEmail("TestUser3@gmail.com");
        user.setPhoneNumber("010-3333-3333");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("TestUser3");

        User newUser = userRepository.save(user);

        System.out.println("newUser: " + newUser);
    }

    @Test
    @Transactional
    public void read(){

        // select * from user where id = ?
        Optional<User> user = userRepository.findById(7L);

        user.ifPresent(selectedUser ->{
            selectedUser.getOrderDetailList().stream().forEach(detail ->{

                Item item = detail.getItem();
                System.out.println(item);
                //System.out.println(detail.getItemId());

            });
        });
    }

    @Test
    public void update(){

        Optional<User> user = userRepository.findById(2L);

        user.ifPresent(selectedUser ->{
            selectedUser.setAccount("pppp");
            selectedUser.setUpdatedAt(LocalDateTime.now());
            selectedUser.setUpdatedBy("Update method()");

            userRepository.save(selectedUser);
        });
    }

    @Test
    @Transactional
    public void delete(){

        Optional<User> user = userRepository.findById(3L);

        Assert.assertTrue(user.isPresent());

        user.ifPresent(selectedUser ->{
            userRepository.delete(selectedUser);
        });

        Optional<User> deletedUser = userRepository.findById(3L);

        if(deletedUser.isPresent()){
            System.out.println("Still Exists");
        }else{
            System.out.println("Doesn't exist");
        }

        Assert.assertFalse(deletedUser.isPresent());

    }
}
