package net.JessHilario;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DeathScreenEvent extends Event implements Cancellable{
	private static final HandlerList handlers = new HandlerList();
	private Player player;
	private String message;
	private Location from;
	private Location to;
	private GameMode gamemode;
	private boolean cancelled;
	
	public DeathScreenEvent(Player p, String m, Location f, Location t, GameMode g){
		player = p;
		setMessage(m);
		from = f;
		setTo(t);
		setGamemode(g);
	}
	
	public Player getPlayer() {
		return player;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Location getFrom() {
		return from;
	}

	public Location getTo() {
		return to;
	}

	public void setTo(Location to) {
		this.to = to;
	}

	public GameMode getGamemode() {
		return gamemode;
	}

	public void setGamemode(GameMode gamemode) {
		this.gamemode = gamemode;
	}
	
	public boolean isCancelled() {
        return cancelled;
    }
 
    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }

	public HandlerList getHandlers() {
        return handlers;
    }
 
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
