package ru.gb.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.gb.market.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByTitle (String title);

//    List<Product> findProductByPriceBetween(int minPrice, int maxPrice);
//    List<Product> findProductByPriceLessThanEqual (int maxPrice);
//    List<Product> findProductByPriceGreaterThanEqual (int minPrice);
}
