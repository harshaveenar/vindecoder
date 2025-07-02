package com.example.vindecoder.service;

import com.example.vindecoder.repository.VinDecodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class VinDecodeService {

    private final VinDecodeRepository vinDecodeRepository;

    @Autowired
    public VinDecodeService(VinDecodeRepository vinDecodeRepository) {
        this.vinDecodeRepository = vinDecodeRepository;
    }

    public List<Map<String, Object>> decodeVin(String vin) {
        return vinDecodeRepository.decodeVin(vin);
    }
}
