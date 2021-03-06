package li.cil.tis3d.common.network.message;

import io.netty.buffer.ByteBuf;
import li.cil.tis3d.api.machine.Casing;

public final class CasingLockedStateMessage extends AbstractMessageWithLocation {
    private boolean isLocked;

    public CasingLockedStateMessage(final Casing casing, final boolean isLocked) {
        super(casing.getCasingWorld(), casing.getPosition());
        this.isLocked = isLocked;
    }

    @SuppressWarnings("unused") // For deserialization.
    public CasingLockedStateMessage() {
    }

    // --------------------------------------------------------------------- //

    public boolean isLocked() {
        return isLocked;
    }

    // --------------------------------------------------------------------- //
    // AbstractMessage

    @Override
    public void fromBytes(final ByteBuf buf) {
        super.fromBytes(buf);

        isLocked = buf.readBoolean();
    }

    @Override
    public void toBytes(final ByteBuf buf) {
        super.toBytes(buf);

        buf.writeBoolean(isLocked);
    }
}
