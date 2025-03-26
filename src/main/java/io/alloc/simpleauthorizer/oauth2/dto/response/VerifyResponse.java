package io.alloc.simpleauthorizer.oauth2.dto.response;

public record VerifyResponse (
        String accessToken,
        String refreshToken
) {
}
