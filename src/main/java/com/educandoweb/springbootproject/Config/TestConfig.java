package com.educandoweb.springbootproject.Config;

import com.educandoweb.springbootproject.Entities.Category;
import com.educandoweb.springbootproject.Entities.Enums.OrderStatus;
import com.educandoweb.springbootproject.Entities.Orders;
import com.educandoweb.springbootproject.Entities.Product;
import com.educandoweb.springbootproject.Entities.User;
import com.educandoweb.springbootproject.Repositories.CategoryRepository;
import com.educandoweb.springbootproject.Repositories.OrderRepository;
import com.educandoweb.springbootproject.Repositories.ProductRepository;
import com.educandoweb.springbootproject.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        Product p1 = new Product(null, "The Lord of the Rings", "Legendary best Sellers", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Samnsung smart Tv 4k", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "The more potent Apple notebooks", 8540.0, "");
        Product p4 = new Product(null, "PC Gamer", "Because you NEED one", 3200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Dummies can also learn!", 100.99, "");

        User u1 = new User(null, "Carlinhos Brown", "carlos@gmail.com", "988888889", "123456");
        User u2 = new User(null, "Bono Vox", "bono@gmail.com", "977777779", "123456");

        Orders o1 = new Orders(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Orders o2 = new Orders(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Orders o3 = new Orders(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
        productRepository.saveAll((Arrays.asList(p1,p2,p3,p4,p5)));
        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        p2.getCategories().add(cat3);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat3);
        p5.getCategories().add(cat2);
        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
