/*
 * Copyright 2016 Johannes Boczek
 */

package de.sogomn.rat.gui.swing;

import de.sogomn.rat.gui.IBuilderGui;
import de.sogomn.rat.gui.IFileBrowserGui;
import de.sogomn.rat.gui.IRattyGui;
import de.sogomn.rat.gui.IRattyGuiFactory;
import de.sogomn.rat.gui.IServerListGui;


public final class RattySwingGuiFactory implements IRattyGuiFactory {
	
	public RattySwingGuiFactory() {
		//...
	}
	
	@Override
	public IRattyGui createRattyGui() {
		return new RattySwingGui();
	}
	
	@Override
	public IBuilderGui createBuilderGui() {
		return new BuilderSwingGui();
	}
	
	@Override
	public IServerListGui createServerListGui() {
		return new ServerListSwingGui();
	}
	
	@Override
	public IFileBrowserGui createFileBrowserGui() {
		return new FileBrowserSwingGui();
	}
	
}