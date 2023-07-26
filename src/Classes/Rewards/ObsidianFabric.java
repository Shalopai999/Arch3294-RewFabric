package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class ObsidianFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Obsidian();
    }
    
}
