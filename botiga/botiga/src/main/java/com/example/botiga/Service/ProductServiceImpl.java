package com.example.botiga.Service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.botiga.DTO.ProductDTO;
import com.example.botiga.Mapper.ProductMapper;
import com.example.botiga.Model.Product;
import com.example.botiga.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements BotigaService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Override
    public Set<ProductDTO> findAll() {
        Set<Product> products = productRepository.findAll();
        return productMapper.ProductsToProductsDTO(products);
    }

    @Override
    public Optional<ProductDTO> findById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        return product.map(productMapper::ProductToProducteDTO);
    }

    @Override
    public void save(Object entity) {
        if (!(entity instanceof ProductDTO)) {
            throw new IllegalArgumentException("Entity must be a ProductDTO");
        }
        Product product = productMapper.ProducteDTOToProduct((ProductDTO) entity);
        productRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public Object findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public String findDescripcionById(Long id) {
        Product product = productRepository.findById(id).orElse(null);
        if (product != null) {
            return product.getDescription();
        }
        return null;
    }
}