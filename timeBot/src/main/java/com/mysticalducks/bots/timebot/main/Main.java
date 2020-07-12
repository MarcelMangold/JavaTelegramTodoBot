package com.mysticalducks.bots.timebot.main;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import com.mysticalducks.bots.timebot.bot.Bot;

public class Main {


	public static void main(String[] args) {
		ApiContextInitializer.init();
		TelegramBotsApi botsApi = new TelegramBotsApi();

		try {
			botsApi.registerBot(new Bot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

}