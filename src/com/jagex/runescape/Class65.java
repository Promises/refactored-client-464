package com.jagex.runescape;

public class Class65 {
	public static Class19 aClass19_1291;
	public static Class19 aClass19_1312;
	public static JagexString aJagexString_1285;
	public static JagexString aJagexString_1293;
	public static JagexString aJagexString_1294 = JagexString.getRs2PreparedString(
			"Schrifts-=tze geladen)3");
	public static JagexString aJagexString_1306;
	public static JagexString aJagexString_1308;
	public static JagexString aJagexString_1309;
	public static ImageRGB[] aImageRGBArray1290;
	public static int anInt1287;
	public static int anInt1288;
	public static int anInt1292;
	public static int anInt1295;
	public static int anInt1296;
	public static int anInt1298;
	public static int anInt1299;
	public static int anInt1300;
	public static int anInt1301;
	public static int anInt1302;
	public static int anInt1303;
	public static int anInt1310;
	public static int anInt1311;
	public static int[] anIntArray1284;
	public static int[] anIntArray1289 = { 1, 1, 1, 1 };
	public static int[] anIntArray1297;
	public static int[] anIntArray1304;
	public static int[] anIntArray1307;
	static {
		anInt1292 = 7759444;
		aJagexString_1293 = JagexString.getRs2PreparedString(
				"Ein kostenloses Spielkonto erstellen)3");
		aJagexString_1285 = JagexString.getRs2PreparedString(" more options");
		aJagexString_1306 = JagexString.getRs2PreparedString("(U4");
		aJagexString_1309 = JagexString.getRs2PreparedString(
				"Ihr Spielkonto wurde deaktiviert)3");
		aJagexString_1308 = aJagexString_1285;
	}

	public static void method1073(boolean arg0) {
		try {
			anIntArray1307 = null;
			aJagexString_1294 = null;
			if (arg0 != false)
				anIntArray1284 = null;
			aJagexString_1309 = null;
			aJagexString_1306 = null;
			anIntArray1289 = null;
			anIntArray1284 = null;
			aJagexString_1308 = null;
			aJagexString_1285 = null;
			aClass19_1312 = null;
			aImageRGBArray1290 = null;
			anIntArray1304 = null;
			aClass19_1291 = null;
			aJagexString_1293 = null;
			anIntArray1297 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "se.A("
					+ arg0 + ')');
		}
	}

	public static JagexString method1076(JagexString arg0, RSInterface arg1,
										 boolean arg2) {
		try {
			if (arg0.method803(Npc.aJagexString_3627,
					(byte) 126) != -1) {
				for (;;) {
					int i = arg0.method803(JagexString.aJagexString_1801, (byte) -95);
					if (i == -1)
						break;
					arg0 = (Class4_Sub24.method639(
							(new JagexString[] {
									arg0.method829((byte) -123, 0, i),
									(Class4_Sub16.method304(Class4_Sub20_Sub13
											.method589((byte) 87, 0, arg1),
											!arg2)),
									arg0.method805(i - -2, -72) }), -842));
				}
				for (;;) {
					int i = arg0.method803(StringUtilities.aJagexString_317, (byte) -52);
					if (i == -1)
						break;
					arg0 = (Class4_Sub24
							.method639(
									(new JagexString[] {
											arg0.method829((byte) -112, 0, i),
											(Class4_Sub16.method304(
													Class4_Sub20_Sub13
															.method589(
																	(byte) 106,
																	1, arg1),
													true)),
											arg0.method805(i - -2, 113) }),
									-842));
				}
				for (;;) {
					int i = arg0.method803(Class64.aJagexString_1258, (byte) -22);
					if ((i ^ 0xffffffff) == 0)
						break;
					arg0 = (Class4_Sub24
							.method639(
									(new JagexString[] {
											arg0.method829((byte) 3, 0, i),
											(Class4_Sub16.method304(
													Class4_Sub20_Sub13
															.method589(
																	(byte) 81,
																	2, arg1),
													true)),
											arg0.method805(i - -2, -74) }),
									-842));
				}
				for (;;) {
					int i = arg0.method803(aJagexString_1306, (byte) -75);
					if ((i ^ 0xffffffff) == 0)
						break;
					arg0 = (Class4_Sub24
							.method639(
									(new JagexString[] {
											arg0.method829((byte) -3, 0, i),
											(Class4_Sub16.method304(
													Class4_Sub20_Sub13
															.method589(
																	(byte) 44,
																	3, arg1),
													true)),
											arg0.method805(2 + i, -107) }),
									-842));
				}
				for (;;) {
					int i = arg0.method803(StringUtilities.aJagexString_3197,
							(byte) 120);
					if ((i ^ 0xffffffff) == 0)
						break;
					arg0 = (Class4_Sub24
							.method639(
									(new JagexString[] {
											arg0.method829((byte) 85, 0, i),
											(Class4_Sub16.method304(
													Class4_Sub20_Sub13
															.method589(
																	(byte) 63,
																	4, arg1),
													true)),
											arg0.method805(2 + i, 115) }), -842));
				}
				for (;;) {
					int i = arg0.method803(StringUtilities.aJagexString_402, (byte) -108);
					if ((i ^ 0xffffffff) == 0)
						break;
					JagexString jagexString = Class4_Sub3.aJagexString_1895;
					if (Class59.aClass22_1185 != null) {
						jagexString = Class80.method1203(
								(Class59.aClass22_1185.anInt541), -60);
						try {
							if (Class59.aClass22_1185.anObject543 != null) {
								byte[] is = ((String) Class59.aClass22_1185.anObject543)
										.getBytes("ISO-8859-1");
								jagexString = Class61.method1046(is.length,
										(byte) 73, 0, is);
							}
						} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
							/* empty */
						}
					}
					arg0 = Class4_Sub24
							.method639(
									(new JagexString[] {
											arg0.method829((byte) 10, 0, i),
											jagexString, arg0.method805(4 + i, 88) }),
									-842);
				}
			}
			if (arg2 != false)
				method1076(null, null, true);
			anInt1287++;
			return arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("se.B("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public RSFont aClass4_1286 = new RSFont();

	public RSFont aClass4_1305;

	public Class65() {
		try {
			aClass4_1286.prev = aClass4_1286;
			aClass4_1286.next = aClass4_1286;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"se.<init>(" + ')');
		}
	}

	public RSFont method1067(boolean arg0) {
		try {
			anInt1299++;
			RSFont class4 = aClass4_1305;
			if (aClass4_1286 == class4) {
				aClass4_1305 = null;
				return null;
			}
			aClass4_1305 = class4.prev;
			if (arg0 != false)
				method1077(false, null);
			return class4;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "se.E("
					+ arg0 + ')');
		}
	}

	public void method1068(RSFont arg0, byte arg1) {
		try {
			anInt1288++;
			if (arg0.prev != null)
				arg0.clear();
			if (arg1 <= -114) {
				arg0.next = aClass4_1286;
				arg0.prev = aClass4_1286.prev;
				arg0.prev.next = arg0;
				arg0.next.prev = arg0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("se.D("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public RSFont method1069(int arg0) {
		try {
			if (arg0 != 2)
				aJagexString_1308 = null;
			anInt1302++;
			RSFont class4 = aClass4_1286.prev;
			if (class4 == aClass4_1286)
				return null;
			class4.clear();
			return class4;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "se.G("
					+ arg0 + ')');
		}
	}

	public void method1070(byte arg0) {
		try {
			anInt1311++;
			for (;;) {
				RSFont class4 = aClass4_1286.next;
				if (aClass4_1286 == class4)
					break;
				class4.clear();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "se.C("
					+ arg0 + ')');
		}
	}

	public RSFont method1071(int arg0) {
		try {
			if (arg0 >= -119)
				method1078(-10);
			anInt1300++;
			RSFont class4 = aClass4_1286.next;
			if (class4 == aClass4_1286) {
				aClass4_1305 = null;
				return null;
			}
			aClass4_1305 = class4.next;
			return class4;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "se.F("
					+ arg0 + ')');
		}
	}

	public RSFont method1072(int arg0) {
		try {
			anInt1303++;
			RSFont class4 = aClass4_1286.next;
			if (aClass4_1286 == class4)
				return null;
			class4.clear();
			if (arg0 != -2)
				method1073(false);
			return class4;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "se.J("
					+ arg0 + ')');
		}
	}

	public void method1074(RSFont arg0, byte arg1, RSFont arg2) {
		try {
			if (arg0.prev != null)
				arg0.clear();
			if (arg1 > -46)
				anIntArray1307 = null;
			arg0.prev = arg2.prev;
			anInt1301++;
			arg0.next = arg2;
			arg0.prev.next = arg0;
			arg0.next.prev = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("se.I("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public RSFont method1075(int arg0) {
		try {
			RSFont class4 = aClass4_1305;
			anInt1298++;
			if (class4 == aClass4_1286) {
				aClass4_1305 = null;
				return null;
			}
			aClass4_1305 = class4.next;
			if (arg0 != 18485)
				anIntArray1289 = null;
			return class4;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "se.K("
					+ arg0 + ')');
		}
	}

	public void method1077(boolean arg0, RSFont arg1) {
		try {
			anInt1296++;
			if (arg1.prev != null)
				arg1.clear();
			arg1.next = aClass4_1286.next;
			if (arg0 == false) {
				arg1.prev = aClass4_1286;
				arg1.prev.next = arg1;
				arg1.next.prev = arg1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("se.H("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public RSFont method1078(int arg0) {
		try {
			anInt1295++;
			if (arg0 != 0)
				method1077(false, null);
			RSFont class4 = aClass4_1286.prev;
			if (aClass4_1286 == class4) {
				aClass4_1305 = null;
				return null;
			}
			aClass4_1305 = class4.prev;
			return class4;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "se.L("
					+ arg0 + ')');
		}
	}
}
