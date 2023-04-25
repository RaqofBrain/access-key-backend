package com.example.accesskeybackend.template.controller;

import com.example.accesskeybackend.template.service.AccessKeyWebService;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/web")
@AllArgsConstructor
public class AccessKeyWebController {
    private final AccessKeyWebService accessKeyWebService;

    @GetMapping("/checkIpv6Support")
    public ResponseEntity<Map<String, Boolean>> checkIpv6Support(@RequestParam @NotBlank String siteUrl) {
        boolean success = accessKeyWebService.checkSiteIpv6Support(siteUrl);
        Map<String, Boolean> response = new HashMap<>();
        response.put("success", success);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

