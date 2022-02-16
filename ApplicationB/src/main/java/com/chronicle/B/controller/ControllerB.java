package com.chronicle.B.controller;

import com.chronicle.B.service.ReceiveService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/")
@RequiredArgsConstructor
public class ControllerB {

    private final ReceiveService receiveService;

    @GetMapping("load")
    public void loadQueue() {
        receiveService.loadFromQueue();
    }
}
