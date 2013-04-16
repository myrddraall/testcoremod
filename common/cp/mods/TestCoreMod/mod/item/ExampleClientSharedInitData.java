package cp.mods.TestCoreMod.mod.item;

import java.util.Arrays;
import java.util.List;

import cp.mods.CoreMod.core.type.item.ItemTypeClientInitailizationData;

public enum ExampleClientSharedInitData implements ItemTypeClientInitailizationData
{
    ITEM_ONE(),
    ITEM_TWO(Arrays.asList("ExampleMod:itemTwo.stateA", "ExampleMod:itemTwo.stateB"));

    private List<String> iconList = null;
    ExampleClientSharedInitData(List<String> iconList){
        this.iconList = iconList;
    }
    ExampleClientSharedInitData(){
        
    }
    @Override
    public String[] getIcons()
    {
        return iconList == null ? null : iconList.toArray(new String[0]);
    }

}
