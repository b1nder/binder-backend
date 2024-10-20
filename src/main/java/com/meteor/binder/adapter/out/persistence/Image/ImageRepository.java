package com.meteor.binder.adapter.out.persistence.Image;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<ImageEntity, Long> {
    List<ImageEntity> findByBinderId(Long binderId);
    List<ImageEntity> findByUrl(String url);
}
