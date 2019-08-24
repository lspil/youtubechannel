package com.laurentiuspilca.springframeworke15;

import com.laurentiuspilca.springframeworke15.services.ProductService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ProductService.class)
public class PMTests {

    @Before
    public void setUp() {
        PowerMockito.mockStatic(ProductService.class);
    }

    @Test
    public void testPrivateMethod() throws Exception {
        ProductService productService = new ProductService();

        when(ProductService.staticMethod()).thenReturn(7);

        int res = Whitebox.invokeMethod(productService, "privateMethod");

        assertEquals(7, res);
    }
}
