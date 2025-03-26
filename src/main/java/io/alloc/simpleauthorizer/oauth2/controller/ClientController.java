package io.alloc.simpleauthorizer.oauth2.controller;

import io.alloc.simpleauthorizer.oauth2.dto.request.ClientRequest;
import io.alloc.simpleauthorizer.oauth2.dto.response.ClientResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @PostMapping
    public ResponseEntity<ClientResponse> registerClient(ClientRequest request) {
        return ResponseEntity.ok(null);
    }
}
