package com.product.prototype.dao;

import com.product.prototype.entity.PoductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "Product-category")
interface ProductCategoryRepository extends JpaRepository<PoductCategory, Long> {
}
