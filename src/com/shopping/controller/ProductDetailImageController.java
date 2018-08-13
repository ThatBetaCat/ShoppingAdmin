package com.shopping.controller;

import java.math.BigInteger;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shopping.entity.ProductDetailImage;
import com.shopping.service.ProductDetailImageService;

@Controller
@RequestMapping("/productDetailImage")
public class ProductDetailImageController {
	@Resource
	ProductDetailImageService pdiService;
	
	@RequestMapping("/getProductDetailImagesByProductId")
	@ResponseBody
	public List<ProductDetailImage> getProductDetailImagesByProductId(BigInteger productId) {
			if (productId == null) {
				return null;
			}
			List<ProductDetailImage> imageList = pdiService.getProductDetailImageByProductId(productId);
		return imageList;
	}
	
	@RequestMapping("/deleteProductDetailImage")
	public Integer deleteProductDetailImage(Integer productImageId) {
		return pdiService.delete(productImageId);
	}
}
