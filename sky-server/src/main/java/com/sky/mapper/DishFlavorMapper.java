package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * @author shallow dream
 * @create 2025--03--10 18:05
 */
@Mapper
public interface DishFlavorMapper {

    void insertBatch(List<DishFlavor> flavors);
}
