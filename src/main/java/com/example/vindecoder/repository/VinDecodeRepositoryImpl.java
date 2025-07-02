package com.example.vindecoder.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class VinDecodeRepositoryImpl implements VinDecodeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Map<String, Object>> decodeVin(String vin) {
        StoredProcedureQuery query = entityManager
            .createStoredProcedureQuery("spVinDecode");

        query.registerStoredProcedureParameter("vin", String.class, jakarta.persistence.ParameterMode.IN);
        query.setParameter("vin", vin);

        List<Object[]> resultList = query.getResultList();
        List<Map<String, Object>> results = new ArrayList<>();

        for (Object[] row : resultList) {
            Map<String, Object> map = new HashMap<>();
            map.put("groupName", row[0]);
            map.put("variable", row[1]);
            map.put("value", row[2]);
            results.add(map);
        }

        return results;
    }
}
