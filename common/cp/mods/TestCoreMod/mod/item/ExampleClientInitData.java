package cp.mods.TestCoreMod.mod.item;

import java.util.Arrays;
import java.util.List;

import cp.mods.CoreMod.core.type.item.ItemTypeClientInitailizationData;

public enum ExampleClientInitData implements ItemTypeClientInitailizationData
{
    REFERENCE(),
    ITEM_ONE(),
    ITEM_TWO(Arrays.asList("ExampleMod:itemTwo.stateA", "ExampleMod:itemTwo.stateB"));
    
    private List<String> iconList = null;
    ExampleClientInitData(List<String> iconList){
        this.iconList = iconList;
    }
    ExampleClientInitData(){
        
    }
    @Override
    public String[] getIcons()
    {
        return iconList == null ? null : iconList.toArray(new String[0]);
    }

}
