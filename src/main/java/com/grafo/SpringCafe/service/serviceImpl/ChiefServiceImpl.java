package com.grafo.SpringCafe.service.serviceImpl;

import com.grafo.SpringCafe.dto.ChiefDto;
import com.grafo.SpringCafe.dto.global.DataBody;
import com.grafo.SpringCafe.dto.request.RequestChief;
import com.grafo.SpringCafe.entities.ChiefEntity;
import com.grafo.SpringCafe.mapper.ChiefMapper;
import com.grafo.SpringCafe.repositories.ChiefRepo;
import com.grafo.SpringCafe.service.ChiefService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChiefServiceImpl implements ChiefService {
    private final ChiefMapper chiefMapper;
    private final ChiefRepo chiefRepo;
    @Override
    public DataBody<ChiefDto> createChief(RequestChief requestChief) {
        ChiefEntity chief = this.chiefMapper.requestDtoToEntity(requestChief);
        this.chiefRepo.save(chief);
        ChiefDto chiefDto = this.chiefMapper.entityToDto(chief);
        return new DataBody<>(chiefDto);
    }

    @Override
    public DataBody<List<ChiefDto>> getAllChief() {
        List<ChiefEntity> chiefEntityList = this.chiefRepo.findAll();
        List<ChiefDto> chiefDtoList = this.chiefMapper.entityListToDtoList(chiefEntityList);
        return new DataBody<>(chiefDtoList);
    }
}
