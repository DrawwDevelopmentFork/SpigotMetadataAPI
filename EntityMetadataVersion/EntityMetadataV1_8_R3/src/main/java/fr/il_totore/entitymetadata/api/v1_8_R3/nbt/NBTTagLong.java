package fr.il_totore.entitymetadata.api.v1_8_R3.nbt;

public class NBTTagLong extends NBTNumber<net.minecraft.server.v1_8_R3.NBTTagLong, Long> {

    public NBTTagLong(net.minecraft.server.v1_8_R3.NBTTagLong handle){
        super(handle);
    }

    @Override
    public Long get(){
        return longValue();
    }
}
