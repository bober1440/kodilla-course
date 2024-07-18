package com.kodilla.stream.sand;

import java.math.BigDecimal;

public final class Asia implements SandStorage {
    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandBeansQuantity = new BigDecimal("10000000");
        return sandBeansQuantity;
    }
}
