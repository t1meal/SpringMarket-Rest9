package ru.gb.market.services;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ru.gb.market.model.Product;
import ru.gb.market.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Optional<Product> findById (Long id){
        return productRepository.findById(id);
    }
    public Page<Product> findAll(int pageIndex, int pageSize){
        return productRepository.findAll(PageRequest.of(pageIndex, pageSize));
    }
    public Product save (Product product){
        return productRepository.save(product);
    }
    public void deleteById (Long id){
        productRepository.deleteById(id);
    }

    public List<Product> findByPriceBetween (int minPrice, int maxPrice){
        return productRepository.findProductByPriceBetween( minPrice, maxPrice);
    }
}
