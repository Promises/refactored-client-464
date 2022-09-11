package com.jagex.runescape;

public class Npc extends Actor {
	public static JagexString aJagexString_3620 = JagexString.getRs2PreparedString("ams"
    );
	public static JagexString aJagexString_3622;
	public static JagexString aJagexString_3623;
	public static JagexString aJagexString_3625;
	public static JagexString aJagexString_3626;
	public static JagexString aJagexString_3627;
	public static JagexString aJagexString_3628;
	public static JagexString aJagexString_3629;
	public static JagexString aJagexString_3630;
	public static Class65 aClass65_3618;
	public static int anInt3614;
	public static int anInt3615;
	public static int anInt3616;
	public static int anInt3619;
	public static int[] anIntArray3624;
	static {
		aClass65_3618 = new Class65();
		anIntArray3624 = new int[] { 16776960, 16711680, 65280, 65535,
				16711935, 16777215 };
		aJagexString_3625 = JagexString.getRs2PreparedString("Players");
		aJagexString_3626 = aJagexString_3625;
		aJagexString_3622 = (JagexString.getRs2PreparedString(
				"Please check your message)2centre for details)3"));
		aJagexString_3623 = aJagexString_3622;
		aJagexString_3628 = JagexString.getRs2PreparedString("W-=hlen Sie eine Welt"
        );
		aJagexString_3627 = JagexString.getRs2PreparedString("(U");
		aJagexString_3629 = JagexString.getRs2PreparedString(
				"Connecting to update server");
		aJagexString_3630 = aJagexString_3629;
	}

	public static void method395(int arg0) {
		try {
			if (arg0 != 2)
				aJagexString_3622 = null;
			aJagexString_3626 = null;
			aJagexString_3629 = null;
			aJagexString_3620 = null;
			anIntArray3624 = null;
			aJagexString_3623 = null;
			aClass65_3618 = null;
			aJagexString_3627 = null;
			aJagexString_3622 = null;
			aJagexString_3625 = null;
			aJagexString_3630 = null;
			aJagexString_3628 = null;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "rb.K("
					+ arg0 + ')');
		}
	}

	public static int method396(int arg0, byte arg1, int arg2) {
		try {
			anInt3615++;
			if ((arg2 ^ 0xffffffff) <= -3) {
				int i = method396(arg0 * arg0, (byte) -31, arg2 >> 184752353);
				if ((arg2 & 0x1) != 0)
					i *= arg0;
				return i;
			}
			if (arg1 != -31)
				aJagexString_3622 = null;
			if (arg2 == 1)
				return arg0;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("rb.J("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public Class4_Sub20_Sub3 npcDefinition;

	@Override
	public Class4_Sub20_Sub7_Sub7 method378(boolean arg0) {
		try {
			anInt3616++;
			if (arg0 != false)
				method395(88);
			if (npcDefinition == null)
				return null;
			Class4_Sub20_Sub17 class4_sub20_sub17 = (anInt3277 == -1
					|| anInt3222 != 0 ? null : Class68.method1093(anInt3277,
					(byte) -111));
			Class4_Sub20_Sub17 class4_sub20_sub17_0_ = (anInt3257 != -1
					&& (anInt3265 != anInt3257 || class4_sub20_sub17 == null) ? Class68
					.method1093(anInt3257, (byte) -127) : null);
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = npcDefinition
					.method347(0, class4_sub20_sub17, class4_sub20_sub17_0_,
							anInt3258, anInt3239);
			if (class4_sub20_sub7_sub7 == null)
				return null;
			class4_sub20_sub7_sub7.method446();
			anInt3282 = class4_sub20_sub7_sub7.anInt2938;
			if ((anInt3226 ^ 0xffffffff) != 0 && anInt3242 != -1) {
				Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7_1_ = Class4_Sub20_Sub14
						.method593(-23222, anInt3226).method371(-89, anInt3242);
				if (class4_sub20_sub7_sub7_1_ != null) {
					class4_sub20_sub7_sub7_1_.method445(0, -anInt3229, 0);
					Class4_Sub20_Sub7_Sub7[] class4_sub20_sub7_sub7s = {
							class4_sub20_sub7_sub7, class4_sub20_sub7_sub7_1_ };
					class4_sub20_sub7_sub7 = new Class4_Sub20_Sub7_Sub7(
							class4_sub20_sub7_sub7s, 2);
				}
			}
			if (npcDefinition.anInt2791 == 1)
				class4_sub20_sub7_sub7.aBoolean3454 = true;
			return class4_sub20_sub7_sub7;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "rb.V("
					+ arg0 + ')');
		}
	}

	@Override
	public boolean method384(int arg0) {
		try {
			anInt3619++;
			if (arg0 != -19456)
				aClass65_3618 = null;
			if (npcDefinition == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "rb.D("
					+ arg0 + ')');
		}
	}
}
