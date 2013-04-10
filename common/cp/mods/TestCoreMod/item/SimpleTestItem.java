package cp.mods.TestCoreMod.item;

import net.minecraft.creativetab.CreativeTabs;
import cp.mods.core.item.ItemBase;

public class SimpleTestItem extends ItemBase
{

    public SimpleTestItem(int par1)
    {
        super(par1);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }
}
