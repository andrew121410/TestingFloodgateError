package com.andrew121410.mc.testingfloodgateerror;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.geysermc.cumulus.form.SimpleForm;
import org.geysermc.floodgate.api.FloodgateApi;
import org.jetbrains.annotations.NotNull;

public class HasFloodgateCMD implements CommandExecutor {

    private final Main plugin;

    public HasFloodgateCMD(Main main) {
        this.plugin = main;

        // Register the command
        this.plugin.getCommand("hasFloodgate").setExecutor(this);
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        // Doesn't do anything
        return true;
    }

    public void shouldCauseAnError(Player player) {
        SimpleForm.Builder simpleFormBuilder = SimpleForm.builder().title("Testing").content("Blah blah blah");

        SimpleForm simpleForm = simpleFormBuilder.build();

        FloodgateApi.getInstance().sendForm(player.getUniqueId(), simpleForm);

        // Doesn't happen if it was
        // FloodgateApi.getInstance().sendForm(player.getUniqueId(), simpleFormBuilder.build());
    }
}
