import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.ItemGenerator;
import Classes.Rewards.EmeraldFabric;
import Classes.Rewards.GemFabric;
import Classes.Rewards.GoldFabric;
import Classes.Rewards.ObsidianFabric;
import Classes.Rewards.PhilosophersStoneFabric;
import Classes.Rewards.SapphireFabric;
import Classes.Rewards.StoneFabric;

public class App {
    public static void main(String[] args) throws Exception {
        ItemGenerator fab1 = new GoldFabric();
        fab1.openReward();
        ItemGenerator fab2 = new GemFabric();
        fab2.openReward();
        ItemGenerator fab3 = new StoneFabric();
        fab3.openReward();
        ItemGenerator fab4 = new EmeraldFabric();
        fab4.openReward();
        ItemGenerator fab5 = new ObsidianFabric();
        fab5.openReward();
        ItemGenerator fab6 = new PhilosophersStoneFabric();
        fab6.openReward();
        ItemGenerator fab7 = new SapphireFabric();
        fab7.openReward();
        Random rmd = ThreadLocalRandom.current();
        List<ItemGenerator> fabricList = new ArrayList<>();
        fabricList.add(fab1);
        fabricList.add(fab2);
        fabricList.add(fab3);
        fabricList.add(fab4);
        fabricList.add(fab5);
        fabricList.add(fab6);
        fabricList.add(fab7);


        for(int i = 0; i < 30; i++){
            int index = Math.abs(rmd.nextInt()%2==0?0:6);
            fabricList.get(index).openReward();
        }
    }
}
