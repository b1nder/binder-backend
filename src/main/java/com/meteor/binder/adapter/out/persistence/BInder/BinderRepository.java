package com.meteor.binder.adapter.out.persistence.BInder;

import com.meteor.binder.domain.enums.BinderType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BinderRepository extends JpaRepository<BinderEntity, Long> {
    List<BinderEntity> findByBinderType(BinderType binderType);

    List<BinderEntity> findByStartDateBetween(LocalDate startDate, LocalDate endDate);
}
