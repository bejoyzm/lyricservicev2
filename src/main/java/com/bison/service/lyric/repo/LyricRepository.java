package com.bison.service.lyric.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bison.service.lyric.entity.Lyric;

@RepositoryRestResource(collectionResourceRel = "lyric", path = "lyric")
public interface LyricRepository extends PagingAndSortingRepository<Lyric, Long> {

	List<Lyric> findBySongName(@Param("name") String name);

}
