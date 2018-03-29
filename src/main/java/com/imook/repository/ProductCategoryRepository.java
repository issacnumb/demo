package com.imook.repository;

import com.imook.dataObject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Issac
 * @Description:
 * @Date: Created in 18:05 2018/3/29
 * @Modified By:
 */
//继承JpaRepository<操作的数据库类,主键类型>
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer>{

    /** 查询List. */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);


}
