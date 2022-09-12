package com.bot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DiscordServiceImpl implements BotService {

    private final String token;

    public DiscordServiceImpl(@Value("${cmdLineArgument}") String token) {
        this.token = token;
    }


}
