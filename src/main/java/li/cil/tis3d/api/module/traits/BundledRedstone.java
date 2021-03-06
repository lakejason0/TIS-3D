package li.cil.tis3d.api.module.traits;

import li.cil.tis3d.api.module.Module;

/**
 * Modules implementing this will be queried for bundled redstone output when
 * necessary, and notified of bundled input changes.
 */
public interface BundledRedstone extends Module {
    /**
     * Get the current bundled redstone output on the specified channel.
     *
     * @param channel the bundle channel to get the value of.
     * @return the current redstone output on the channel.
     */
    int getBundledRedstoneOutput(final int channel);

    /**
     * Set the new bundled input value on the specified channel.
     *
     * @param channel the bundled channel to set the value of.
     * @param value   the new input value on the channel.
     */
    void setBundledRedstoneInput(final int channel, final short value);

    /**
     * Get the current bundled input value on the specified channel.
     *
     * @param channel the bundled channel to get the input value of.
     * @return the current input value on the channel
     */
    short getBundledRedstoneInput(final int channel);
}
