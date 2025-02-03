package com.kpilszak.booksandstuffecommerce.dao;

import com.kpilszak.booksandstuffecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
