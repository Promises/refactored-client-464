package com.jagex.runescape;
import com.jagex.runescape.util.Signlink;

import java.awt.Component;

public class Class43_Sub1 extends Class43 {
	public static Interface1 anInterface1_2542;

	public static void method967() {
		anInterface1_2542 = null;
	}

	public int anInt2541;

	public Class43_Sub1(Signlink arg0, int arg1) {
		anInterface1_2542 = null;
		anInt2541 = arg1;
	}

	@Override
	public void method950() {
		anInterface1_2542.method2(-29957, anInt2541);
	}

	@Override
	public void method956(Component arg0) throws Exception {
		anInterface1_2542.method4(68, Class67.anInt1354,
				Actor.aBoolean3218, arg0);
	}

	@Override
	public int method959() {
		return anInterface1_2542.method5(-263, anInt2541);
	}

	@Override
	public void method960() {
		anInterface1_2542.method1(anInt2541, 5669);
	}

	@Override
	public void method963(int arg0) throws Exception {
		if (arg0 > 32768)
			throw new IllegalArgumentException();
		anInterface1_2542.method3(anInt2541, arg0, 13857);
	}

	@Override
	public void method965() {
		anInterface1_2542.method6(anInt2541, anIntArray877);
	}
}
