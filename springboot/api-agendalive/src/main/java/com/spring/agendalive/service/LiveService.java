package com.spring.agendalive.service;

import com.spring.agendalive.model.Live;
import com.spring.agendalive.repository.LiveRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LiveService {

    @Autowired
    LiveRepository liveRepository;

    public Page<Live> findAll(Pageable pageable, String flag){
        if(flag != null && flag.equals("next")){
            return liveRepository.findByLiveDateAfterOrderByLiveDateAsc(LocalDateTime.now(), pageable);
        }else if(flag != null && flag.equals("previous")){
            return liveRepository.findByLiveDateBeforeOrderByLiveDateDesc(LocalDateTime.now(), pageable);
        }else{
            return liveRepository.findAll(pageable);
        }
    }

    public Live buscarLivePeloCodigo(Long id) {
        return this.liveRepository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
    }

    public Live atualizar(Long id, Live pessoa){
        final Live liveSalva = buscarLivePeloCodigo(id);
        BeanUtils.copyProperties(pessoa, liveSalva, "id");

        return this.liveRepository.save(liveSalva);
    }


}
