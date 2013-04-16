package cp.mods.TestCoreMod.mod.item;

import cp.mods.CoreMod.core.item.ItemBase;
import cp.mods.CoreMod.core.type.item.ItemTypeInitializationData;

public enum ExampleInitData implements ItemTypeInitializationData
{
    ITEM_ONE(4444, "ExampleMod:itemOne", ExampleItem.class),
    ITEM_TWO(4445, "ExampleMod:itemTwo", ExampleItem.class);
    
    ExampleInitData(int defaultId, String itemName, Class<? extends ExampleItem> itemClass){
        itemId = defaultId;
        this.itemName = itemName;
        this.itemClass = itemClass;
    }
    private int itemId;
    private String itemName;
    private Class<? extends ItemBase> itemClass;
    
    @Override
    public int getID()
    {
        return itemId;
    }

    @Override
    public int getDamage()
    {
        return 0;
    }

    @Override
    public String getName()
    {
        return itemName;
    }

    @Override
    public Class<? extends ItemBase> getItem()
    {
        return itemClass;
    }
    
}
