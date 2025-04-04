package com.atech.service;



import com.atech.model.Brand;
import java.util.List;

public interface BrandService {

    Brand saveBrand(Brand brand);

    List<Brand> getAllBrands();

    Brand getBrandById(int brandId);

    void deleteBrand(int brandId);
}
