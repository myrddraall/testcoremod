package cp.mods.TestCoreMod.mod.network;

import cp.mods.CoreMod.core.network.packet.IPacket;
import cp.mods.CoreMod.core.network.packet.IPacketType;

public enum ItemUpdateChannel implements IPacketType
{
    TEST_PACKET;

    @Override
    public Class<IPacket> getPacketClass()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IPacket create()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setChannel(String channel)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getChannel()
    {
        // TODO Auto-generated method stub
        return null;
    }

}
