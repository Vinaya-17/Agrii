package com.atech.service;


import com.atech.model.Brand;
import com.atech.repository.BrandRepository;
import com.atech.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public Brand saveBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    @Override
    public Brand getBrandById(int brandId) {
        Optional<Brand> brand = brandRepository.findById(brandId);
        return brand.orElse(null);  // Return null if not found
    }

    @Override
    public void deleteBrand(int brandId) {
        brandRepository.deleteById(brandId);
    }
}
