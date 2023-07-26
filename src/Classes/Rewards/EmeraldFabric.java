package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class EmeraldFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Emerald();
    }
    
}
