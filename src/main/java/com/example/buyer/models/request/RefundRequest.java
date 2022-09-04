package com.example.buyer.models.request;

import com.example.buyer.models.product.RefundProduct;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.UUID;

@Data
@Builder
@Jacksonized
public class RefundRequest
{
    private UUID requestUUID;
    private RefundProduct refundProduct;

}
