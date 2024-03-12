package com.grafo.SpringCafe.service;

import com.grafo.SpringCafe.dto.ChiefDto;
import com.grafo.SpringCafe.dto.global.DataBody;
import com.grafo.SpringCafe.dto.request.RequestChief;

import java.util.List;

public interface ChiefService {
    DataBody<ChiefDto> createChief (RequestChief requestChief);
    DataBody<List<ChiefDto>> getAllChief ();
}
