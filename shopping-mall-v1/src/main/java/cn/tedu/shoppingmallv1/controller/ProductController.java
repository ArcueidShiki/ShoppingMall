package cn.tedu.shoppingmallv1.controller;

import cn.tedu.shoppingmallv1.entity.Product;
import cn.tedu.shoppingmallv1.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired(required = false)
    ProductMapper mapper;
    //点击进入商品详情页
    @RequestMapping("/product/select")
    public List<Product> ProductSelect(int id){
        return mapper.selectById(id);
    }
    //搜索查询到相关商品列表
    @RequestMapping("/product/search")
    public List<Product> ProductSearch(String wd){
        return mapper.selectByWd(wd);
    }
    //商品搜索结果根据价格升序
    @RequestMapping("/product/sort/price/asc")
    public List<Product> ProductPriceASC(){
        return mapper.selectByPriceASC();
    }
    //商品搜索结果根据价格降序
    @RequestMapping("/product/sort/price/desc")
    public List<Product> ProductPriceDESC(){
        return mapper.selectByPriceDESC();
    }
    //商品搜索结果根据销量升序
    @RequestMapping("/product/sort/saleCount/asc")
    public List<Product> ProductSaleCountASC(){
        return mapper.selectBySaleCountASC();
    }
    //商品搜索结果根据销量降序
    @RequestMapping("/product/sort/saleCount/desc")
    public List<Product> ProductSaleCountDESC(){
        return mapper.selectBySaleCountDESC();
    }
    //商品搜索结果根据评价升序
    @RequestMapping("/product/sort/score/asc")
    public List<Product> ProductScoreASC(){
        return mapper.selectScoreASC();
    }
    //商品搜索结果根据评价降序
    @RequestMapping("/product/sort/score/desc")
    public List<Product> ProductScoreDESC(){
        return mapper.selectScoreDESC();
    }
    //商品搜索结果根据种类筛选
    @RequestMapping("/product/sift/category")
    public List<Product> ProductCategory(String category){
        return mapper.selectCategory(category);
    }
    //商品搜索结果根据品牌筛选
    @RequestMapping("/product/sift/brand")
    public List<Product> ProductBrand(String brand){
        return mapper.selectBrand(brand);
    }
    //商品搜索结果根据价格区间筛选
    @RequestMapping("/product/sift/priceRange")
    public List<Product> ProductPriceRange(Integer low,Integer high){
        return mapper.selectPriceRange(low,high);
    }
}
