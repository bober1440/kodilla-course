package com.kodilla.stream.invoice.simple;

import java.util.Objects;

public final class SimpleProduct {
    private final String productName;
    private final double productPrice;

    public SimpleProduct(final String productName, final double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleProduct that)) return false;
        SimpleProduct thatProduct = (SimpleProduct) o;
        return productName.equals(that.productName);
    }

    @Override
    public int hashCode() {
        return productName.hashCode();
    }
}
