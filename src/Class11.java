/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11 {
	public static Class10 aClass10_321;
	public static JagexString aJagexString_315 = JagexString.getRs2PreparedString(
			"blinken2:");
	public static JagexString aJagexString_316 = JagexString.getRs2PreparedString("<br>"
    );
	public static JagexString aJagexString_317;
	public static JagexString aJagexString_318;
	public static JagexString aJagexString_322;
	public static JagexString aJagexString_323;
	public static JagexString aJagexString_324;
	public static JagexString aJagexString_328;
	public static long aLong319;
	public static int anInt314;
	public static int anInt320 = 0;
	public static int anInt325;
	public static int anInt326;
	public static int anInt327;
	public static int anInt329;
	public static int anInt330;
	public static int anInt331;

	static {
		aJagexString_318 = JagexString.getRs2PreparedString(
				"Enter your username (V password)3");
		aJagexString_317 = JagexString.getRs2PreparedString("(U2");
		anInt326 = 0;
		aJagexString_328 = (JagexString
				.getRs2PreparedString(
						"Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3"
                ));
		anInt329 = 0;
		aJagexString_323 = aJagexString_318;
		aJagexString_324 = JagexString.getRs2PreparedString("sl_stars");
		aJagexString_322 = JagexString.getRs2PreparedString(")1j");
		anInt331 = 0;
	}

	public static void method672(int arg0, int arg1, Class19_Sub1 arg2,
			byte arg3, int arg4, boolean arg5, byte arg6) {
		try {
			anInt325++;
			long l = (arg1 + (arg4 << 1869367312));
			Class4_Sub20_Sub10 class4_sub20_sub10 = ((Class4_Sub20_Sub10) Class4_Sub20_Sub9.aClass16_3038
					.method725((byte) 117, l));
			if (class4_sub20_sub10 == null) {
				class4_sub20_sub10 = ((Class4_Sub20_Sub10) RSCanvas.aClass16_47
						.method725((byte) 117, l));
				if (class4_sub20_sub10 == null) {
					class4_sub20_sub10 = ((Class4_Sub20_Sub10) Class58.aClass16_1171
							.method725((byte) 117, l));
					if (class4_sub20_sub10 != null) {
						if (arg5) {
							class4_sub20_sub10.method320(-1);
							Class4_Sub20_Sub9.aClass16_3038.method720(
									class4_sub20_sub10, l, false);
							Class31.anInt686++;
							Class76.anInt1581--;
						}
					} else {
						if (!arg5) {
							class4_sub20_sub10 = ((Class4_Sub20_Sub10) Class4_Sub10.aClass16_2045
									.method725((byte) 117, l));
							if (class4_sub20_sub10 != null)
								return;
						}
						class4_sub20_sub10 = new Class4_Sub20_Sub10();
						class4_sub20_sub10.anInt3070 = arg0;
						class4_sub20_sub10.aByte3052 = arg3;
						class4_sub20_sub10.aClass19_Sub1_3061 = arg2;
						if (arg5) {
							Class4_Sub20_Sub9.aClass16_3038.method720(
									class4_sub20_sub10, l, false);
							Class31.anInt686++;
						} else {
							Region.aClass1_103.method36(class4_sub20_sub10, 3);
							Class58.aClass16_1171.method720(class4_sub20_sub10,
									l, false);
							Class76.anInt1581++;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("cc.A("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
					+ arg4 + ',' + arg5 + ',' + arg6 + ')'));
		}
	}

	public static void method673(int arg0) {
		try {
			aJagexString_318 = null;
			aJagexString_322 = null;
			aJagexString_323 = null;
			if (arg0 > 83) {
				aJagexString_316 = null;
				aJagexString_315 = null;
				aJagexString_317 = null;
				aClass10_321 = null;
				aJagexString_324 = null;
				aJagexString_328 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "cc.C("
					+ arg0 + ')');
		}
	}

	public static void method674(int arg0) {
		try {
			anInt314++;
			if ((Class78.anInt1599 ^ 0xffffffff) < arg0)
				Class40.method935(arg0 + 1);
			else {
				Region.method50(40, 1);
				Class4_Sub20_Sub3.aClass76_2798 = Class4_Sub20_Sub17.aClass76_3189;
				Class4_Sub20_Sub17.aClass76_3189 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "cc.B("
					+ arg0 + ')');
		}
	}
}
