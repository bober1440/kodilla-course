package com.kodilla.kodillapatterns2.facade;

import com.kodilla.kodillapatterns2.facade.api.OrderFacade;
import com.kodilla.kodillapatterns2.facade.api.OrderDto;
import com.kodilla.kodillapatterns2.facade.api.ItemDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderFacadeTestSuite {

    @Autowired
    private OrderFacade orderFacade;

    @Test
    public void testProcessOrderLogging() throws Exception {
        // Given
        OrderDto orderDto = new OrderDto();

        orderDto.addItem(new ItemDto(1L, 2));

        Long userId = 1L;

        // When
        orderFacade.processOrder(orderDto, userId);

        // Then
        // check logs
    }
}