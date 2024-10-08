package com.kodilla.good.patterns.productOrderService;

public class ApplicationRunner {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderService(), new ProductOrderRepository());

        OrderDto orderDto = orderProcessor.process(orderRequest);
    }
}
