package com.kodilla.stream.sand;

import java.math.BigDecimal;

public final class Africa implements SandStorage {

    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandBeansQuantity = new BigDecimal("10000000");
        return sandBeansQuantity;
    }
}