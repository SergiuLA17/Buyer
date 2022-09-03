package com.example.buyer.models.product;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class RequiredProduct {

    private  String name;
    private  int quantity;

}

