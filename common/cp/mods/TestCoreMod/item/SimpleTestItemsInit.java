package cp.mods.TestCoreMod.item;

import net.minecraft.item.ItemStack;
import cp.mods.TestCoreMod.ModInfo;
import cp.mods.TestCoreMod.api.item.SimpleTestItems;
import cp.mods.core.api.type.IEnumerableType;
import cp.mods.core.api.type.ITypeInitializer;
import cpw.mods.fml.common.registry.GameRegistry;

public class SimpleTestItemsInit implements ITypeInitializer
{
    @Override
    public void initialize(Class<? extends IEnumerableType> typeClass)
    {
        SimpleTestItem item;
        ItemStack stack;

        item = new SimpleTestItem(SimpleTestItems.TEST_ITEM.getItemId());
        
        item.setName(ModInfo.MOD_ID + ":testitem");
        GameRegistry.registerItem(item, item.getUnlocalizedName());
        stack = new ItemStack(item);
        SimpleTestItems.TEST_ITEM.setItem(item);
        SimpleTestItems.TEST_ITEM.setItemStack(stack);
    }

}
