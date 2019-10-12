package fr.il_totore.entitymetadata.api.v1_13_R2.nbt;

public abstract class NBTNumber<T extends net.minecraft.server.v1_13_R2.NBTNumber, V extends Number> extends NBTSingleValue<T, V> implements fr.il_totore.entitymetadata.api.nbt.NBTNumber<V> {

    public NBTNumber(T handle) {
        super(handle);
    }

    @Override
    public byte byteValue() {
        return getHandle().asByte();
    }

    @Override
    public short shortValue() {
        return getHandle().asShort();
    }

    @Override
    public int intValue() {
        return getHandle().asInt();
    }

    @Override
    public long longValue() {
        return getHandle().asLong();
    }

    @Override
    public float floatValue() {
        return getHandle().asFloat();
    }

    @Override
    public double doubleValue() {
        return getHandle().asDouble();
    }

    @Override
    public boolean isEmpty() {
        return getHandle().j() == null;
    }
}
