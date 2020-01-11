package com.jagex.runescape;
import java.nio.ByteBuffer;

public class Class45_Sub1 extends Class45 {

	public ByteBuffer buffer;

	@Override
	public void method970(int arg0, byte[] buffer) {
		this.buffer = ByteBuffer.wrap(buffer);
	}

	@Override
	public byte[] method971(boolean arg0) {
		return (byte[]) buffer.array();
	}
}
