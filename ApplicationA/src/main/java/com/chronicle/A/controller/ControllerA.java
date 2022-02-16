package com.chronicle.A.controller;

import com.chronicle.A.service.LoadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class ControllerA {

    private final LoadService loadService;

    @PostMapping("load")
    public void loadData(@RequestBody MultipartFile file) {
        loadService.loadByBatch(file);
    }
}
