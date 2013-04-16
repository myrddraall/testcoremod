package cp.mods.TestCoreMod.mod.item;

import cp.mods.CoreMod.core.item.ItemBase;
import cp.mods.CoreMod.core.type.item.ItemTypeInitializationData;

public enum ExampleSharedInitData implements ItemTypeInitializationData
{
    REFERENCE("ExampleMod:sharedItem"),
    ITEM_ONE("ExampleMod:sharedItemOne"),
    ITEM_TWO("ExampleMod:sharedItemTwo");

    ExampleSharedInitData(String itemName)
    {
        this.itemName = itemName;
    }

    private String itemName;

    @Override
    public int getID()
    {
        return 4446;
    }

    @Override
    public int getDamage()
    {
        return ordinal();
    }

    @Override
    public String getName()
    {
        return itemName;
    }

    @Override
    public Class<? extends ItemBase> getItem()
    {
        return ExampleItem.class;
    }

}
