package ru.auction.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.auction.model.BidEntity;

@Repository
public interface BidRepository extends CrudRepository<BidEntity, Integer> {
}