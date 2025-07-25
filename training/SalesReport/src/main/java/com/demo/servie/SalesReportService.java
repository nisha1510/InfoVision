package com.demo.servie;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesReportService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Object[]> getHighSellingProducts() {
        String query = """
            SELECT p.id, p.name, SUM(p.price * o.qty) AS total_sales
            FROM Product p JOIN OrderItem o ON p.id = o.product.id
            GROUP BY p.id, p.name
            HAVING SUM(p.price * o.qty) > (
                SELECT AVG(p1.price * o1.qty)
                FROM Product p1 JOIN OrderItem o1 ON p1.id = o1.product.id
            )
        """;

        return entityManager.createQuery(query, Object[].class).getResultList();
    }
}
