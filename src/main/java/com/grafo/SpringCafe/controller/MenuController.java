package com.grafo.SpringCafe.controller;

import com.grafo.SpringCafe.dto.MenuDto;
import com.grafo.SpringCafe.dto.global.DataBody;
import com.grafo.SpringCafe.dto.request.RequestMenu;
import com.grafo.SpringCafe.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/menu")
@RequiredArgsConstructor
public class MenuController {
    private final MenuService menuService;
    @PostMapping("/create")
    public ResponseEntity<DataBody<MenuDto>> createMenu(@RequestBody RequestMenu requestMenu) {
        DataBody<MenuDto> menuDtoDataBody = this.menuService.createMenu(requestMenu);
        return new ResponseEntity<>(menuDtoDataBody, HttpStatus.OK);
    }
    @GetMapping("/getAll")
    public ResponseEntity<DataBody<List<MenuDto>>> getAllMenu() {
        DataBody<List<MenuDto>> meListDataBody = this.menuService.getAllMenu();
        return new ResponseEntity<>(meListDataBody, HttpStatus.OK);
    }
}
