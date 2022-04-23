package service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("amazon")
public class AmazonProductService implements ProductService {
}
