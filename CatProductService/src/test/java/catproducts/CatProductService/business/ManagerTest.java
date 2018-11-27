package catproducts.CatProductService.business;

import static org.mockito.Mockito.when;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import catproducts.productService.business.ProductService;
import catproducts.productService.data.ProductDbClient;
import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagerTest{
    @Autowired
    ProductService manager;
    
    @MockBean
    ProductDbClient productDb;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void getProductListReturnsEmptyWhenNullProductsInDb(){
        when(productDb.getProductData()).thenReturn(null);
        Assert.assertEquals(null, manager.getProductList());
    }

}