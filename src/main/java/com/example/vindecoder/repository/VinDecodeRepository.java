package com.example.vindecoder.repository;

import java.util.List;
import java.util.Map;

public interface VinDecodeRepository {
    List<Map<String, Object>> decodeVin(String vin);
}
