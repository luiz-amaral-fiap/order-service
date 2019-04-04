package br.com.fiap.orderservice;

import br.com.fiap.orderservice.model.OrderDTO;
import br.com.fiap.orderservice.service.OrderService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.ArgumentMatchers.any;

@RunWith(SpringJUnit4ClassRunner.class )
@SpringBootTest(classes = OrderServiceApplication.class)
public class OrderServiceTest {
    @Mock
    private OrderService orderService;

    @Before
    public void setUpMock() {
        MockitoAnnotations.initMocks(this);
        Mockito.when(orderService.save(any(OrderDTO.class))).thenReturn(new OrderDTO());
    }

    @Test
    public void lancamentoContabilServiceTest() {
        Assert.assertNotNull(orderService.save(new OrderDTO()));
    }
}
