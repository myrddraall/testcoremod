package cp.mods.TestCoreMod.mod.proxy;

import cp.mods.CoreMod.core.item.ItemClientInitializer;
import cp.mods.TestCoreMod.mod.api.item.ExampleItems;
import cp.mods.TestCoreMod.mod.item.ExampleClientInitData;

public class ClientProxy extends CommonProxy
{
    @Override
    public void initializeRegistration()
    {
        super.initializeRegistration();
        typeRegistry.register(new ItemClientInitializer(ExampleItems.class, ExampleClientInitData.class));
    }
}
