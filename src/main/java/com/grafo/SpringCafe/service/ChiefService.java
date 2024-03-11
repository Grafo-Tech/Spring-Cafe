package com.grafo.SpringCafe.service;

import com.grafo.SpringCafe.dto.ChiefDto;
import com.grafo.SpringCafe.dto.global.DataBody;
import com.grafo.SpringCafe.dto.request.RequestChief;
import com.grafo.SpringCafe.entities.ChiefEntity;

public interface ChiefService {
    DataBody<ChiefDto> createChief (RequestChief requestChief);
}
