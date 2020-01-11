package com.jagex.runescape;

import com.jagex.runescape.net.StreamBuffer;

public class Class4_Sub14 extends RSFont {
	public static byte[][][] aByteArrayArrayArray2275;
	public static Class18 aClass18_2272;
	public static JagexString aJagexString_2271;
	public static JagexString aJagexString_2274 = (JagexString.getRs2PreparedString(
			"sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1"));
	public static JagexString aJagexString_2278;
	public static JagexString aJagexString_2285;
	public static JagexString aJagexString_2287;
	public static JagexString aJagexString_2288;
	public static Class66 aClass66_2286;
	public static int anInt2277;
	public static int anInt2279;
	public static int anInt2283;
	public static short[][] aShortArrayArray2284;
	static {
		aJagexString_2271 = JagexString.getRs2PreparedString(" )2> <col=ffff00>");
		aJagexString_2278 = JagexString.getRs2PreparedString("Lade)3)3)3");
		aClass18_2272 = new Class18();
		aJagexString_2285 = JagexString.getRs2PreparedString("<br>(X100(U(Y");
		aClass66_2286 = new Class66(128);
		aJagexString_2287 = JagexString.getRs2PreparedString("Bitte warten Sie)3)3)3"
		);
		aJagexString_2288 = JagexString.getRs2PreparedString("null");
	}

	public static void method295(boolean arg0) {
		if (arg0 == false) {
			anInt2277++;
			if ((Class48.anInt989 ^ 0xffffffff) == -1) {
				Class4_Sub20_Sub7_Sub6.aClass69_3439 = new Class69(4, 104, 104,
						Class4_Sub23.anIntArrayArrayArray2416);
				for (int i = 0; (i ^ 0xffffffff) > -5; i++)
					Class57.regions[i] = new Region(104, 104);
				RS2Font.aClass4_Sub20_Sub12_Sub2_2769 = new Class4_Sub20_Sub12_Sub2(
						512, 512);
				Region.anInt135 = 5;
				Class48.anInt989 = 20;
				StringUtilities.aJagexString_1762 = JagexString.aJagexString_1822;
			} else if ((Class48.anInt989 ^ 0xffffffff) == -21) {
				int[] is = new int[9];
				for (int i = 0; (i ^ 0xffffffff) > -10; i++) {
					int i_0_ = 15 + (128 - -(32 * i));
					int i_1_ = 600 + i_0_ * 3;
					int i_2_ = Class4_Sub20_Sub12_Sub3.anIntArray3524[i_0_];
					is[i] = i_2_ * i_1_ >> -1402489776;
				}
				Class69.method1120(is, 500, 800, 512, 334);
				Class48.anInt989 = 30;
				StringUtilities.aJagexString_1762 = Class74.aJagexString_1521;
				Region.anInt135 = 10;
			} else if ((Class48.anInt989 ^ 0xffffffff) == -31) {
				Class73.aClass19_Sub1_1504 = Class4_Sub20.method317(1, true,
						true, 0, false);
				Class4_Sub1.aClass19_Sub1_1861 = Class4_Sub20.method317(1,
						true, true, 1, false);
				Class4_Sub1.aClass19_Sub1_1863 = Class4_Sub20.method317(1,
						false, true, 2, true);
				Class4_Sub17.aClass19_Sub1_2321 = Class4_Sub20.method317(1,
						true, true, 3, false);
				Class66.aClass19_Sub1_1336 = Class4_Sub20.method317(1, true,
						true, 4, false);
				Class4_Sub20_Sub6.aClass19_Sub1_2911 = Class4_Sub20.method317(
						1, true, true, 5, true);
				Class54.aClass19_Sub1_1107 = Class4_Sub20.method317(1, true,
						false, 6, true);
				Class4_Sub24.aClass19_Sub1_2451 = Class4_Sub20.method317(1,
						true, true, 7, false);
				Game.aClass19_Sub1_1849 = Class4_Sub20.method317(1, true,
						true, 8, false);
				Class18.aClass19_Sub1_482 = Class4_Sub20.method317(1, true,
						true, 9, false);
				Class77.aClass19_Sub1_1589 = Class4_Sub20.method317(1, true,
						true, 10, false);
				Class24.aClass19_Sub1_562 = Class4_Sub20.method317(1, true,
						true, 11, false);
				Class4_Sub20_Sub14.aClass19_Sub1_3146 = Class4_Sub20.method317(
						1, true, true, 12, false);
				Class4_Sub20_Sub6.aClass19_Sub1_2921 = Class4_Sub20.method317(
						1, false, true, 13, true);
				Class4_Sub17.aClass19_Sub1_2327 = Class4_Sub20.method317(1,
						true, false, 14, false);
				Class42.aClass19_Sub1_856 = Class4_Sub20.method317(1, true,
						true, 15, false);
				StringUtilities.aJagexString_1762 = Class4_Sub20_Sub7_Sub1_Sub2.aJagexString_3630;
				Region.anInt135 = 20;
				Class48.anInt989 = 40;
			} else if ((Class48.anInt989 ^ 0xffffffff) == -41) {
				int i = 0;
				i += (Class73.aClass19_Sub1_1504.method767((byte) -31) * 4 / 100);
				i += (Class4_Sub1.aClass19_Sub1_1861.method767((byte) -31) * 4 / 100);
				i += (Class4_Sub1.aClass19_Sub1_1863.method767((byte) -31) * 2 / 100);
				i += (2 * Class4_Sub17.aClass19_Sub1_2321.method767((byte) -31) / 100);
				i += (Class66.aClass19_Sub1_1336.method767((byte) -31) * 6 / 100);
				i += Class4_Sub20_Sub6.aClass19_Sub1_2911.method767((byte) -31) * 4 / 100;
				i += (Class54.aClass19_Sub1_1107.method767((byte) -31) * 2 / 100);
				i += (Class4_Sub24.aClass19_Sub1_2451.method767((byte) -31) * 60 / 100);
				i += Game.aClass19_Sub1_1849.method767((byte) -31) * 2 / 100;
				i += 2 * Class18.aClass19_Sub1_482.method767((byte) -31) / 100;
				i += (Class77.aClass19_Sub1_1589.method767((byte) -31) * 2 / 100);
				i += Class24.aClass19_Sub1_562.method767((byte) -31) * 2 / 100;
				i += 2 * Class4_Sub20_Sub14.aClass19_Sub1_3146
						.method767((byte) -31) / 100;
				i += 2 * Class4_Sub20_Sub6.aClass19_Sub1_2921
						.method767((byte) -31) / 100;
				i += (2 * Class4_Sub17.aClass19_Sub1_2327.method767((byte) -31) / 100);
				i += Class42.aClass19_Sub1_856.method767((byte) -31) * 2 / 100;
				if (i != 100) {
					if ((i ^ 0xffffffff) != -1)
						StringUtilities.aJagexString_1762 = (Class4_Sub24
								.method639(
										(new JagexString[] {
												Class4_Sub20_Sub7_Sub1.aJagexString_3234,
												Class74.method1168(-47, i),
												(Class4_Sub20_Sub7_Sub1_Sub2.aJagexString_3627) }),
										-842));
					Region.anInt135 = 30;
				} else {
					Region.anInt135 = 30;
					StringUtilities.aJagexString_1762 = Class4_Sub23.aJagexString_2433;
					Class48.anInt989 = 45;
				}
			} else if (Class48.anInt989 == 45) {
				Class24.method791(22050, 18834, 2, !Class59.aBoolean1189);
				Class4_Sub2_Sub1 class4_sub2_sub1 = new Class4_Sub2_Sub1();
				class4_sub2_sub1.method85(9, 128, 127);
				JagexException.aClass43_1728 = Class40.method931(-82,
						22050, Class43.aClass75_872,
						Class4_Sub20_Sub7_Sub5.runeCanvas, 0);
				JagexException.aClass43_1728.method952(7,
						class4_sub2_sub1);
				StreamBuffer.method206(Class42.aClass19_Sub1_856, 44,
						Class66.aClass19_Sub1_1336, class4_sub2_sub1,
						Class4_Sub17.aClass19_Sub1_2327);
				Class4_Sub20_Sub6.aClass43_2932 = Class40.method931(-79, 2048,
						Class43.aClass75_872,
						Class4_Sub20_Sub7_Sub5.runeCanvas, 1);
				RSFont.aClass4_Sub2_Sub2_139 = new Class4_Sub2_Sub2();
				Class4_Sub20_Sub6.aClass43_2932.method952(7,
						RSFont.aClass4_Sub2_Sub2_139);
				Class8.aClass8_251 = new Class8(22050, Class67.anInt1354);
				Region.anInt135 = 35;
				StringUtilities.aJagexString_1762 = RS2Font.aJagexString_2762;
				Class48.anInt989 = 50;
			} else if (Class48.anInt989 == 50) {
				int i = 0;
				if (Class33.aClass4_Sub20_Sub12_Sub4_Sub1_717 == null)
					Class33.aClass4_Sub20_Sub12_Sub4_Sub1_717 = Class57
							.method1026(Class4_Sub20_Sub6.aJagexString_2904,
									Game.aClass19_Sub1_1849, -107,
									Class4_Sub3.aJagexString_1895,
									(Class4_Sub20_Sub6.aClass19_Sub1_2921));
				else
					i++;
				if (Class4_Sub15.aClass4_Sub20_Sub12_Sub4_Sub1_2289 != null)
					i++;
				else
					Class4_Sub15.aClass4_Sub20_Sub12_Sub4_Sub1_2289 = Class57
							.method1026(Class78.aJagexString_1606,
									Game.aClass19_Sub1_1849, 105,
									Class4_Sub3.aJagexString_1895,
									(Class4_Sub20_Sub6.aClass19_Sub1_2921));
				if (Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384 != null)
					i++;
				else
					Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384 = Class57
							.method1026(Class4_Sub7.aJagexString_1964,
									Game.aClass19_Sub1_1849, -111,
									Class4_Sub3.aJagexString_1895,
									(Class4_Sub20_Sub6.aClass19_Sub1_2921));
				if ((i ^ 0xffffffff) > -4) {
					StringUtilities.aJagexString_1762 = (Class4_Sub24
							.method639(
									(new JagexString[] {
											Class4_Sub20_Sub5.aJagexString_2884,
											Class74.method1168(-90, i * 100 / 3),
											Class4_Sub20_Sub7_Sub1_Sub2.aJagexString_3627}),
									-842));
					Region.anInt135 = 40;
				} else {
					Region.anInt135 = 40;
					StringUtilities.aJagexString_1762 = Class4_Sub3.aJagexString_1907;
					Class48.anInt989 = 60;
				}
			} else if (Class48.anInt989 == 60) {
				int i = Class28.method854((byte) -95,
						Class77.aClass19_Sub1_1589, Game.aClass19_Sub1_1849);
				int i_3_ = Class4_Sub20_Sub16.method608(6);
				if ((i_3_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
					StringUtilities.aJagexString_1762 = (Class4_Sub24
							.method639(
									(new JagexString[] {
											StringUtilities.aJagexString_662,
											Class74.method1168(-126, i * 100
													/ i_3_),
											Class4_Sub20_Sub7_Sub1_Sub2.aJagexString_3627}),
									-842));
					Region.anInt135 = 50;
				} else {
					StringUtilities.aJagexString_1762 = Class4_Sub20_Sub3.aJagexString_2841;
					Region.anInt135 = 50;
					Region.method50(5, 1);
					Class48.anInt989 = 70;
				}
			} else if ((Class48.anInt989 ^ 0xffffffff) == -71) {
				if (!Class4_Sub1.aClass19_Sub1_1863.method752((byte) -89)) {
					StringUtilities.aJagexString_1762 = (Class4_Sub24
							.method639(
									(new JagexString[] {
											Class6.aJagexString_215,
											Class74.method1168(
													-36,
													Class4_Sub1.aClass19_Sub1_1863
															.method761((byte) 119)),
											Class4_Sub20_Sub7_Sub1_Sub2.aJagexString_3627}),
									-842));
					Region.anInt135 = 60;
				} else {
					Class6.method651(Class4_Sub1.aClass19_Sub1_1863, false);
					Class31.method878((byte) 84, Class4_Sub1.aClass19_Sub1_1863);
					Class31.method875((byte) 105,
							Class4_Sub1.aClass19_Sub1_1863,
							Class4_Sub24.aClass19_Sub1_2451);
					Class27.method852(-1, Class4_Sub24.aClass19_Sub1_2451,
							Class4_Sub1.aClass19_Sub1_1863,
							Class59.aBoolean1189);
					Class4_Sub20_Sub8.method470(true,
							Class4_Sub1.aClass19_Sub1_1863,
							(Class4_Sub24.aClass19_Sub1_2451));
					Class31.method876(
							(Class33.aClass4_Sub20_Sub12_Sub4_Sub1_717),
							Class4_Sub24.aClass19_Sub1_2451, (byte) -55,
							Class4_Sub1.aClass19_Sub1_1863,
							Class77.aBoolean1590);
					RSCanvas.method33(Class73.aClass19_Sub1_1504,
							Class4_Sub1.aClass19_Sub1_1863, (byte) -85,
							Class4_Sub1.aClass19_Sub1_1861);
					Class5.method645(111, Class4_Sub1.aClass19_Sub1_1863,
							Class4_Sub24.aClass19_Sub1_2451);
					Game.method26((byte) 45, Class4_Sub1.aClass19_Sub1_1863);
					Class34.method894(Class4_Sub1.aClass19_Sub1_1863, 73);
					Class4_Sub11_Sub1.method267(77, Game.aClass19_Sub1_1849,
							Class4_Sub20_Sub6.aClass19_Sub1_2921,
							Class4_Sub17.aClass19_Sub1_2321,
							Class4_Sub24.aClass19_Sub1_2451);
					Class4_Sub20_Sub8.method467(Class4_Sub1.aClass19_Sub1_1863,
							14531);
					Class4_Sub20_Sub14.method595((byte) 26,
							Class4_Sub1.aClass19_Sub1_1863);
					Region.anInt135 = 60;
					StringUtilities.aJagexString_1762 = Class50.aJagexString_1015;
					Class48.anInt989 = 80;
				}
			} else if (Class48.anInt989 == 80) {
				int i = 0;
				if (Class37.aClass4_Sub20_Sub12_Sub2_761 == null)
					Class37.aClass4_Sub20_Sub12_Sub2_761 = Class57.method1024(
							26149, Game.aClass19_Sub1_1849,
							Class61.aJagexString_1220, Class4_Sub3.aJagexString_1895);
				else
					i++;
				if (Class4_Sub21.aClass4_Sub20_Sub12_Sub2_2368 == null)
					Class4_Sub21.aClass4_Sub20_Sub12_Sub2_2368 = Class57
							.method1024(26149, Game.aClass19_Sub1_1849,
									Class4_Sub20_Sub10.aJagexString_3056,
									Class4_Sub3.aJagexString_1895);
				else
					i++;
				if (Class1.aClass4_Sub20_Sub12_Sub1Array66 != null)
					i++;
				else
					Class1.aClass4_Sub20_Sub12_Sub1Array66 = Class63
							.method1055(Class4_Sub3.aJagexString_1895,
									Game.aClass19_Sub1_1849, 74,
									StringUtilities.aJagexString_2528);
				if (Class19.aClass4_Sub20_Sub12_Sub2Array504 != null)
					i++;
				else
					Class19.aClass4_Sub20_Sub12_Sub2Array504 = Class4_Sub21
							.method625((Class4_Sub20_Sub7_Sub1.aJagexString_3284),
									Game.aClass19_Sub1_1849,
									Class4_Sub3.aJagexString_1895, true);
				if (Class65.aClass4_Sub20_Sub12_Sub2Array1290 == null)
					Class65.aClass4_Sub20_Sub12_Sub2Array1290 = Class4_Sub21
							.method625(StringUtilities.aJagexString_762,
									Game.aClass19_Sub1_1849,
									Class4_Sub3.aJagexString_1895, true);
				else
					i++;
				if (Class54.aClass4_Sub20_Sub12_Sub2Array1092 == null)
					Class54.aClass4_Sub20_Sub12_Sub2Array1092 = Class4_Sub21
							.method625(Class52.aJagexString_1057,
									Game.aClass19_Sub1_1849,
									Class4_Sub3.aJagexString_1895, !arg0);
				else
					i++;
				if (Class4_Sub21.aClass4_Sub20_Sub12_Sub2Array2378 != null)
					i++;
				else
					Class4_Sub21.aClass4_Sub20_Sub12_Sub2Array2378 = Class4_Sub21
							.method625((Class4_Sub20_Sub5.aJagexString_2868),
									Game.aClass19_Sub1_1849,
									Class4_Sub3.aJagexString_1895, true);
				if (Class14.aClass4_Sub20_Sub12_Sub2Array405 != null)
					i++;
				else
					Class14.aClass4_Sub20_Sub12_Sub2Array405 = Class4_Sub21
							.method625(GameShell.aJagexString_15,
									Game.aClass19_Sub1_1849,
									Class4_Sub3.aJagexString_1895, true);
				if (Class4_Sub10.aClass4_Sub20_Sub12_Sub2Array2022 == null)
					Class4_Sub10.aClass4_Sub20_Sub12_Sub2Array2022 = Class4_Sub21
							.method625(RSFont.aJagexString_151,
									Game.aClass19_Sub1_1849,
									Class4_Sub3.aJagexString_1895, true);
				else
					i++;
				if (Class8.aClass4_Sub20_Sub12_Sub2Array253 != null)
					i++;
				else
					Class8.aClass4_Sub20_Sub12_Sub2Array253 = Class4_Sub21
							.method625((Class4_Sub20_Sub8.aJagexString_3013),
									Game.aClass19_Sub1_1849,
									Class4_Sub3.aJagexString_1895, !arg0);
				if (Class35.aClass4_Sub20_Sub12_Sub2Array749 != null)
					i++;
				else
					Class35.aClass4_Sub20_Sub12_Sub2Array749 = Class4_Sub21
							.method625(Class61.aJagexString_1206,
									Game.aClass19_Sub1_1849,
									Class4_Sub3.aJagexString_1895, true);
				if (Class8.aClass4_Sub20_Sub12_Sub1Array262 != null)
					i++;
				else
					Class8.aClass4_Sub20_Sub12_Sub1Array262 = Class63
							.method1055(Class4_Sub3.aJagexString_1895,
									Game.aClass19_Sub1_1849, 44,
									StringUtilities.aJagexString_772);
				if (Class57.aClass4_Sub20_Sub12_Sub1Array1135 == null)
					Class57.aClass4_Sub20_Sub12_Sub1Array1135 = Class63
							.method1055(Class4_Sub3.aJagexString_1895,
									Game.aClass19_Sub1_1849, 124,
									Class81.aJagexString_1689);
				else
					i++;
				if (Region.aClass4_Sub20_Sub12_Sub1_132 != null)
					i++;
				else
					Region.aClass4_Sub20_Sub12_Sub1_132 = Class2.method44(
							24094, Class4_Sub3.aJagexString_1895,
							RSFont.aJagexString_146, Game.aClass19_Sub1_1849);
				if (i < 14) {
					StringUtilities.aJagexString_1762 = (Class4_Sub24
							.method639(
									(new JagexString[] {
											Class4_Sub20_Sub8.aJagexString_2973,
											Class74.method1168(-14,
													i * 100 / 14),
											Class4_Sub20_Sub7_Sub1_Sub2.aJagexString_3627}),
									-842));
					Region.anInt135 = 70;
				} else {
					Class4_Sub20_Sub12_Sub4.aClass4_Sub20_Sub12_Sub1Array3566 = Class57.aClass4_Sub20_Sub12_Sub1Array1135;
					int i_4_ = -10 + (int) (21.0 * Math.random());
					Class4_Sub21.aClass4_Sub20_Sub12_Sub2_2368.method518();
					int i_5_ = -10 + (int) (Math.random() * 21.0);
					int i_6_ = (int) (Math.random() * 41.0) - 20;
					int i_7_ = -10 + (int) (21.0 * Math.random());
					for (int i_8_ = 0; ((i_8_ ^ 0xffffffff) > (Class19.aClass4_Sub20_Sub12_Sub2Array504.length ^ 0xffffffff)); i_8_++)
						Class19.aClass4_Sub20_Sub12_Sub2Array504[i_8_]
								.method528(i_4_ - -i_6_, i_5_ - -i_6_, i_7_
										+ i_6_);
					Class1.aClass4_Sub20_Sub12_Sub1Array66[0].method508(i_4_
							- -i_6_, i_5_ - -i_6_, i_6_ + i_7_);
					Class19_Sub1.method768(72);
					Class48.anInt989 = 90;
					StringUtilities.aJagexString_1762 = Class52.aJagexString_1061;
					Region.anInt135 = 70;
				}
			} else if (Class48.anInt989 == 90) {
				if (!Class18.aClass19_Sub1_482.method752((byte) 117)) {
					StringUtilities.aJagexString_1762 = (Class4_Sub24
							.method639(
									(new JagexString[] {
											StringUtilities.aJagexString_432,
											Class74.method1168(
													-42,
													Class18.aClass19_Sub1_482
															.method761((byte) 119)),
											Class4_Sub20_Sub7_Sub1_Sub2.aJagexString_3627}),
									-842));
					Region.anInt135 = 90;
				} else {
					Class34 class34 = new Class34(Class18.aClass19_Sub1_482,
							Game.aClass19_Sub1_1849, 20, 0.8,
							Class59.aBoolean1189 ? 64 : 128);
					Class4_Sub20_Sub12_Sub3.method539(class34);
					Class4_Sub20_Sub12_Sub3.method553(0.8);
					StringUtilities.aJagexString_1762 = Class43.aJagexString_864;
					Class48.anInt989 = 110;
					Region.anInt135 = 90;
				}
			} else if (Class48.anInt989 == 110) {
				Class31.aClass53_690 = new Class53();
				Class43.aClass75_872.method1172(Class31.aClass53_690, 10, 119);
				Region.anInt135 = 94;
				Class48.anInt989 = 120;
				StringUtilities.aJagexString_1762 = Class4_Sub20_Sub6.aJagexString_2919;
			} else if (Class48.anInt989 == 120) {
				if (!Class77.aClass19_Sub1_1589.method744((byte) 126,
						Class42.aJagexString_840, (Class4_Sub3.aJagexString_1895))) {
					StringUtilities.aJagexString_1762 = Class4_Sub24.method639(
							(new JagexString[] { (Class4_Sub20_Sub8.aJagexString_2982),
									StringUtilities.aJagexString_558}), -842);
					Region.anInt135 = 96;
				} else {
					Class47 class47 = new Class47(
							Class77.aClass19_Sub1_1589.method753(arg0,
									Class42.aJagexString_840,
									Class4_Sub3.aJagexString_1895));
					Class16.method726(-1, class47);
					Region.anInt135 = 96;
					Class48.anInt989 = 130;
					StringUtilities.aJagexString_1762 = StringUtilities.aJagexString_2514;
				}
			} else if ((Class48.anInt989 ^ 0xffffffff) == -131) {
				if (!Class4_Sub17.aClass19_Sub1_2321.method752((byte) 100)) {
					StringUtilities.aJagexString_1762 = (Class4_Sub24
							.method639(
									(new JagexString[] {
											Class4_Sub20_Sub7_Sub1_Sub1.aJagexString_3610,
											Class74.method1168(
													-47,
													(4 * Class4_Sub17.aClass19_Sub1_2321
															.method761((byte) 119) / 5)),
											Class4_Sub20_Sub7_Sub1_Sub2.aJagexString_3627}),
									-842));
					Region.anInt135 = 100;
				} else if (!Class4_Sub20_Sub14.aClass19_Sub1_3146
						.method752((byte) -46)) {
					StringUtilities.aJagexString_1762 = (Class4_Sub24
							.method639(
									(new JagexString[] {
											Class4_Sub20_Sub7_Sub1_Sub1.aJagexString_3610,
											(Class74.method1168(
													-106,
													80 + Class4_Sub20_Sub14.aClass19_Sub1_3146
															.method761((byte) 119) / 6)),
											Class4_Sub20_Sub7_Sub1_Sub2.aJagexString_3627}),
									-842));
					Region.anInt135 = 100;
				} else if (!Class4_Sub20_Sub6.aClass19_Sub1_2921
						.method752((byte) -92)) {
					StringUtilities.aJagexString_1762 = (Class4_Sub24
							.method639(
									(new JagexString[] {
											Class4_Sub20_Sub7_Sub1_Sub1.aJagexString_3610,
											(Class74.method1168(
													-25,
													96 - -(Class4_Sub20_Sub6.aClass19_Sub1_2921
															.method761((byte) 119) / 20))),
											Class4_Sub20_Sub7_Sub1_Sub2.aJagexString_3627}),
									-842));
					Region.anInt135 = 100;
				} else {
					Class48.anInt989 = 140;
					StringUtilities.aJagexString_1762 = Class6.aJagexString_199;
					Region.anInt135 = 100;
				}
			} else if ((Class48.anInt989 ^ 0xffffffff) == -141)
				Region.method50(10, 1);
		}
	}

	public static void method296(boolean arg0) {
		try {
			aClass66_2286 = null;
			aJagexString_2288 = null;
			aShortArrayArray2284 = null;
			aJagexString_2274 = null;
			aJagexString_2285 = null;
			aJagexString_2287 = null;
			aJagexString_2278 = null;
			if (arg0 != true)
				aClass18_2272 = null;
			aClass18_2272 = null;
			aJagexString_2271 = null;
			aByteArrayArrayArray2275 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "oc.A("
					+ arg0 + ')');
		}
	}

	public static void method297(byte arg0) {
		anInt2279++;
		if (arg0 != 8)
			aJagexString_2274 = null;
		if (Class4_Sub20_Sub9.aClass76_3047 != null)
			Class4_Sub20_Sub9.aClass76_3047.method1181(-31709);
	}

	public JagexString aJagexString_2276;
	public RSInterface aClass4_Sub13_2270;
	public RSInterface aClass4_Sub13_2282;
	public int anInt2268;
	public int anInt2269;

	public int anInt2273;

	public int anInt2280;

	public int anInt2281;

	public Object[] anObjectArray2267;
}
