package com.grafo.SpringCafe.controller;

import com.grafo.SpringCafe.dto.ChiefDto;
import com.grafo.SpringCafe.dto.global.DataBody;
import com.grafo.SpringCafe.dto.request.RequestChief;
import com.grafo.SpringCafe.service.ChiefService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/chief")
@RequiredArgsConstructor
public class ChiefController {
    private final ChiefService chiefService;
    @PostMapping("/create")
    public ResponseEntity<DataBody<ChiefDto>> createChief(@RequestBody RequestChief requestChief) {
        DataBody<ChiefDto> chiefDtoDataBody = this.chiefService.createChief(requestChief);
        return new ResponseEntity<>(chiefDtoDataBody, HttpStatus.OK);
    }
    @GetMapping("/getAll")
    public ResponseEntity<DataBody<List<ChiefDto>>> getAllChief() {
        DataBody<List<ChiefDto>> chiefDtoDataBody = this.chiefService.getAllChief();
        return new ResponseEntity<>(chiefDtoDataBody, HttpStatus.OK);
    }
}
