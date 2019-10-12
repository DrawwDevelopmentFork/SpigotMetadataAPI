package fr.il_totore.entitymetadata.api.v1_9_R1.nbt;

import net.minecraft.server.v1_9_R1.NBTBase;

public abstract class NBTNumber<T extends NBTBase.NBTNumber, V extends Number> extends NBTSingleValue<T, V> implements fr.il_totore.entitymetadata.api.nbt.NBTNumber<V> {

    public NBTNumber(T handle) {
        super(handle);
    }

    @Override
    public byte byteValue() {
        return getHandle().f();
    }

    @Override
    public short shortValue() {
        return getHandle().e();
    }

    @Override
    public int intValue() {
        return getHandle().d();
    }

    @Override
    public long longValue() {
        return getHandle().c();
    }

    @Override
    public float floatValue() {
        return getHandle().h();
    }

    @Override
    public double doubleValue() {
        return getHandle().g();
    }
}
