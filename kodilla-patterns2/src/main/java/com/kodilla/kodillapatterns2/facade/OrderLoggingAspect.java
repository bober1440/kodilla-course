package com.kodilla.kodillapatterns2.facade;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderLoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderLoggingAspect.class);

    @Before("execution(* com.kodilla.kodillapatterns2.facade.api.OrderFacade.processOrder(..))")
    public void logBeforeProcessOrder() {
        LOGGER.info("Method processOrder() is being called");
    }
}
