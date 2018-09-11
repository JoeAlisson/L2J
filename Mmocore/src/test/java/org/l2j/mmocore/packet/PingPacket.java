package org.l2j.mmocore.packet;

import java.nio.ByteBuffer;

public class PingPacket  {

    public void write(ByteBuffer buffer) {
        buffer.putShort((short)9);
        buffer.put((byte)0x01);
        buffer.putLong(System.currentTimeMillis());
    }
}
