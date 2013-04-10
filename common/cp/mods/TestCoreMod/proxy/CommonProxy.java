package cp.mods.TestCoreMod.proxy;

import cp.mods.TestCoreMod.api.item.SimpleTestItems;
import cp.mods.TestCoreMod.item.SimpleTestItemsInit;
import cp.mods.TestCoreMod.network.ItemUpdateChannel;
import cp.mods.core.mod.TypeRegistry;
import cp.mods.core.mod.proxy.ProxyBase;

public class CommonProxy extends ProxyBase
{

    @Override
    public void initializeRegistration()
    {
        TypeRegistry.register(SimpleTestItems.class, SimpleTestItemsInit.class);
        TypeRegistry.registerNetworkChannel(ItemUpdateChannel.class, "iuchan");
    }

    @Override
    public void initializeConfig()
    {
        config().get("mod.options", "enableSomething", true).getBoolean(true);
    }

}
