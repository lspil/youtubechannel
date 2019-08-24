package com.laurentiuspilca.springframeworke15;

import com.laurentiuspilca.springframeworke15.repositories.ProductRepository;
import com.laurentiuspilca.springframeworke15.services.ProductService;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringframeworkE15ApplicationTests {

    @MockBean
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    /*
    @Before   --->  @BeforeEach
    @BeforeClass  ---> @BeforeAll
    @After
    @AfterClass
     */

    @BeforeClass
    public static void beforeClass() {
        System.out.println(":|");
    }

    @Before
    public void before() {
        System.out.println(":)");
    }

    @Test
    public void noProductsReturnedTest() {
        given(productRepository.getProductNames()).willReturn(Collections.emptyList());

        List<String> res = productService.getProductNamesWithEvenNoOfChar();

        assertTrue(res.isEmpty());
    }

    @Test
    public void moreProductsAreFoundTest() {
        List<String> input = Arrays.asList("aa", "bbbb", "ccc");

        given(productRepository.getProductNames()).willReturn(input);

        List<String> res = productService.getProductNamesWithEvenNoOfChar();

        assertEquals(2, res.size());
        //verify(productRepository, times(2)).addProduct(any());
    }



}
