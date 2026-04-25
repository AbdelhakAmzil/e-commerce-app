package com.abdo.ecommerce.handler;

import java.util.Map;

public record ExceptionResponse(
        Map<String, String> errors
) {

}
