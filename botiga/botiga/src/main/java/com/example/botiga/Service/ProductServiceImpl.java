package com.example.botiga.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.botiga.DTO.ProductDTO;
import com.example.botiga.Mapper.CategoriaMapper;
import com.example.botiga.Mapper.ProductMapper;
import com.example.botiga.Mapper.SubcategoriaMapper;
import com.example.botiga.Model.Product;
import com.example.botiga.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements BotigaService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final CategoriaServiceImpl categoriaService;
    private final SubCategoriaServiceImpl subCategoriaService;
    private final CategoriaMapper categoriaMapper;
    private final SubcategoriaMapper subcategoriaMapper;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, 
                               ProductMapper productMapper,
                               CategoriaServiceImpl categoriaService,
                               SubCategoriaServiceImpl subCategoriaService,
                               CategoriaMapper categoriaMapper,
                               SubcategoriaMapper subcategoriaMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
        this.categoriaService = categoriaService;
        this.subCategoriaService = subCategoriaService;
        this.categoriaMapper = categoriaMapper;
        this.subcategoriaMapper = subcategoriaMapper;
    }

    @Override
    public List<ProductDTO> findAll() {
        List<Product> products = productRepository.findAll();
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

    public Product findByName(String name) {
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