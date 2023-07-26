package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class StoneFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Stone();
    }
    
}
