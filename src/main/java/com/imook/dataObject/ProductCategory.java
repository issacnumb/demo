package com.imook.dataObject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author: Issac
 * @Description:
 * @Date: Created in 17:56 2018/3/29
 * @Modified By:
 */
//@Table(name = "product_category")
@Entity
//该注解意为动态更新 可以忽略数据库类含有的时间数据 做到动态更新updateTime
@DynamicUpdate
@Data
public class ProductCategory {

    /** 类目id. */
    @Id
    @GeneratedValue//这个注解 标记自增
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    /** 创建时间. */
//    private Date createTime;

    /** 更新时间. */
//    private Date updateTime;


    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
