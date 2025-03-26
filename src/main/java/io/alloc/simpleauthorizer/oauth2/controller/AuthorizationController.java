package io.alloc.simpleauthorizer.oauth2.controller;

import io.alloc.simpleauthorizer.oauth2.dto.request.VerifyRequest;
import io.alloc.simpleauthorizer.oauth2.dto.response.VerifyResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizationController {

    @PostMapping("/verify")
    public ResponseEntity<VerifyResponse> verifyCredential(VerifyRequest request) {
        return ResponseEntity.ok(null);
    }
}
