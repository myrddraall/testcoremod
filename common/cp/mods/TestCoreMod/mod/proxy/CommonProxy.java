package cp.mods.TestCoreMod.mod.proxy;

import cp.mods.CoreMod.core.item.ItemInitailizer;
import cp.mods.CoreMod.core.item.SharedItemInitializer;
import cp.mods.CoreMod.core.mod.proxy.ProxyBase;
import cp.mods.TestCoreMod.mod.api.item.ExampleItems;
import cp.mods.TestCoreMod.mod.api.item.ExampleSharedItems;
import cp.mods.TestCoreMod.mod.item.ExampleInitData;
import cp.mods.TestCoreMod.mod.item.ExampleSharedInitData;

public class CommonProxy extends ProxyBase
{

    @Override
    public void initializeRegistration()
    {
        typeRegistry.register(new ItemInitailizer(ExampleItems.class, ExampleInitData.class));
        typeRegistry.register(new SharedItemInitializer(ExampleSharedItems.class, ExampleSharedInitData.class));
        //typeRegistry.register(SimpleTestItems.class, SimpleTestItemsInit.class);
        //typeRegistry.registerNetworkChannel(ItemUpdateChannel.class, "iuchan");
    }

    @Override
    public void initializeConfig()
    {
       // config().get("mod.options", "enableSomething", true).getBoolean(true);
    }

}
