package com.example.vindecoder.controller;

import com.example.vindecoder.service.VinDecodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/vin")
public class VinDecodeController {

    private final VinDecodeService vinDecodeService;

    @Autowired
    public VinDecodeController(VinDecodeService vinDecodeService) {
        this.vinDecodeService = vinDecodeService;
    }

    @GetMapping("/decode")
    public List<Map<String, Object>> decodeVin(@RequestParam String vin) {
        return vinDecodeService.decodeVin(vin);
    }
}
