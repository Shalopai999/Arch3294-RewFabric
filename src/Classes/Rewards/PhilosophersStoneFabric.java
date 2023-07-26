package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class PhilosophersStoneFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new PhilosophersStone();
    }
    
}
