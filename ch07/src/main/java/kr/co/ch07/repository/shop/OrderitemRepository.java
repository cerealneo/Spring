package kr.co.ch07.repository.shop;

import kr.co.ch07.entity.shop.Orderitem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderitemRepository extends JpaRepository<Orderitem, Integer> {
}
