package com.bot.controller;

import com.bot.service.BotService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DiscordController {

    private final BotService botService;

    public DiscordController(BotService botService) {
        this.botService = botService;
    }

}
