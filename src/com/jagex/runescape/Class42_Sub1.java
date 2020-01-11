package com.jagex.runescape;
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class42_Sub1 extends Class42 implements MouseWheelListener {
	public int anInt2540 = 0;

	@Override
	public void method943(int arg0, Component arg1) {
		arg1.addMouseWheelListener(this);
		if (arg0 < 111)
			method943(-111, null);
	}

	@Override
	public synchronized int method944(int arg0) {
		int i;
		try {
			int i_1_ = anInt2540;
			anInt2540 = 0;
			i = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i;
	}

	@Override
	public void method947(int arg0, Component arg1) {
		if (arg0 != 3294)
			method947(-107, null);
		arg1.removeMouseWheelListener(this);
	}

	@Override
	public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
		anInt2540 += arg0.getWheelRotation();
	}
}
