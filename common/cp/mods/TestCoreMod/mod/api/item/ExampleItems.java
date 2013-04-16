package cp.mods.TestCoreMod.mod.api.item;

import net.minecraft.item.ItemStack;
import cp.mods.CoreMod.core.api.type.item.ItemTypeDescriptor;
import cp.mods.CoreMod.core.item.ItemBase;

public enum ExampleItems implements ItemTypeDescriptor
{
    ITEM_ONE,
    ITEM_TWO;
    
    private ItemBase itm;
    private ItemStack istack;
    
    @Override
    public ItemBase item()
    {
        return itm;
    }

    @Override
    public void setItem(ItemBase item)
    {
        itm = item;
    }

    @Override
    public ItemStack stack()
    {
        return istack;
    }

    @Override
    public void setItemStack(ItemStack stack)
    {
        istack = stack;
    }
}
