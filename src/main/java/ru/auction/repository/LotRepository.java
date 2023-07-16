package ru.auction.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.auction.model.LotEntity;

@Repository
public interface LotRepository extends CrudRepository<LotEntity, Integer>,
        PagingAndSortingRepository<LotEntity, Integer> {
}