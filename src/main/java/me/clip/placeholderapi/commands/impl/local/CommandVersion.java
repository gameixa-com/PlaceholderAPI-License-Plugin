/*
 * This file is part of PlaceholderAPI
 *
 * PlaceholderAPI
 * Copyright (c) 2015 - 2021 PlaceholderAPI Team
 *
 * PlaceholderAPI free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PlaceholderAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package me.clip.placeholderapi.commands.impl.local;

import java.util.List;
import me.clip.placeholderapi.PlaceholderAPIPlugin;
import me.clip.placeholderapi.commands.PlaceholderCommand;
import me.clip.placeholderapi.util.Msg;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

public final class CommandVersion extends PlaceholderCommand {

  public CommandVersion() {
    super("version");
  }


  @Override
  public void evaluate(@NotNull final PlaceholderAPIPlugin plugin,
      @NotNull final CommandSender sender, @NotNull final String alias,
      @NotNull @Unmodifiable final List<String> params) {
    final PluginDescriptionFile description = plugin.getDescription();

    Msg.msg(sender,
        "&b&lPlaceholderAPI &7(&f" + description.getVersion() + "&7)",
        "&7Author: &f" + description.getAuthors(),
        "&7PAPI Commands: &b/papi &fhelp",
        "&7eCloud Commands&8: &b/papi &fecloud");
  }

}
