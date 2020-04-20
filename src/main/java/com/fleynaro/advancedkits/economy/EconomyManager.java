package com.fleynaro.advancedkits.economy;

import cn.nukkit.Player;

import java.math.BigDecimal;

import com.fleynaro.advancedkits.Main;
import xyz.cryptechcraft.cryptoconomyapi.CryptoconomyAPI;

public class EconomyManager {

	private CryptoconomyAPI api;

    public EconomyManager(Main plugin) {
        if (plugin.getServer().getPluginManager().getPlugin("CryptoconomyAPI") != null) {
            api = CryptoconomyAPI.getInstance();
        }
    }

    public boolean grantKit(Player player, BigDecimal money) {
        return this.api != null && this.api.reduceMoney(player, money.toPlainString()) == CryptoconomyAPI.RET_SUCCESS;
    }
}