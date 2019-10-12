package fr.il_totore.entitymetadata.api.v1_9_R1.nbt;

public class NBTTagLong extends NBTNumber<net.minecraft.server.v1_9_R1.NBTTagLong, Long> {

    public NBTTagLong(net.minecraft.server.v1_9_R1.NBTTagLong handle) {
        super(handle);
    }

    @Override
    public Long get() {
        return longValue();
    }
}
