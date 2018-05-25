package menu.commands;

import iface.IFace;

public interface CommandController {
	public void setCommand(int commandOption);
	public void optionSelected(IFace iface);
}
