package com.jagex.runescape;
import com.jagex.runescape.io.Buffer;
import tech.henning.client.Configuration;

import java.awt.Graphics;
import java.net.Socket;

public class Game extends GameShell {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9115129202113431404L;
	public static Class19 aClass19_1851;
	public static Class19_Sub1 aClass19_Sub1_1849;
	public static JagexString aJagexString_1838 = JagexString.getRs2PreparedString(
			"auf einer freien Welt zu spielen)3");
	public static JagexString aJagexString_1846;
	public static JagexString aJagexString_1847;
	public static JagexString aJagexString_1848 = JagexString.getRs2PreparedString(
			"Please wait 5 minutes before trying again)3");
	public static JagexString aJagexString_1850;
	public static JagexString aJagexString_1852;
	public static Class66 aClass66_1844 = new Class66(20);
	public static int anInt1831;
	public static int anInt1832;
	public static int anInt1833 = 0;
	public static int anInt1834;
	public static int anInt1835;
	public static int anInt1836;
	public static int anInt1837;
	public static int anInt1839;
	public static int anInt1840;
	public static int anInt1841;
	public static int anInt1842;
	public static int anInt1843;
	public static int anInt1845;
    public static boolean[] keyStatus = new boolean[112];

    static {
		aJagexString_1846 = JagexString.getRs2PreparedString(
				"Your account is already logged in)3");
		aJagexString_1850 = aJagexString_1848;
		aJagexString_1847 = JagexString.getRs2PreparedString("Lade Texturen )2 ");
		aJagexString_1852 = aJagexString_1846;
	}

	public static void main(String[] arg0) {
		try {
			try {
				if (arg0.length != 7)
					Class4_Sub12.method279(1);
				Class61.anInt1201 = Integer.parseInt(arg0[0]);
				if (!arg0[1].equals("live")) {
					if (!arg0[1].equals("office")) {
						if (!arg0[1].equals("local"))
							Class4_Sub12.method279(1);
						else
							Class12.anInt341 = 2;
					} else
						Class12.anInt341 = 1;
				} else
					Class12.anInt341 = 0;
				if (!arg0[2].equals("live")) {
					if (!arg0[2].equals("rc")) {
						if (arg0[2].equals("wip"))
							Class48.anInt981 = 2;
						else
							Class4_Sub12.method279(1);
					} else
						Class48.anInt981 = 1;
				} else
					Class48.anInt981 = 0;
				if (arg0[3].equals("lowmem"))
					Class63.method1054(true);
				else if (arg0[3].equals("highmem"))
					Class71.method1157((byte) 124);
				else
					Class4_Sub12.method279(1);
				if (!arg0[4].equals("free")) {
					if (arg0[4].equals("members"))
						Class77.aBoolean1590 = true;
					else
						Class4_Sub12.method279(1);
				} else
					Class77.aBoolean1590 = false;
				if (arg0[5].equals("english"))
					Class19_Sub1.anInt2536 = 0;
				else if (arg0[5].equals("german")) {
					Class4_Sub20_Sub7.method372(0);
					Class19_Sub1.anInt2536 = 1;
					Class4_Sub3.aJagexString_1903 = JagexException.aJagexString_1734;
				} else
					Class4_Sub12.method279(1);
				if (arg0[6].equals("game0"))
					Class4_Sub7.anInt1944 = 0;
				else if (!arg0[6].equals("game1"))
					Class4_Sub12.method279(1);
				else
					Class4_Sub7.anInt1944 = 1;
				Class4_Sub20_Sub6.aString2900 = Configuration.SERVER_ADDRESS; // ip
				Game game = new Game();
				game.method14(16, 765, 503, 464, "runescape", false,
						Class48.anInt981 + 32);
			} catch (Exception exception) {
				Class4_Sub20_Sub7_Sub4.method422(exception, -65, null);
			}
			anInt1836++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("client.main(" + (arg0 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method26(byte arg0, Class19 arg1) {
		try {
			if (arg0 != 45)
				aClass19_Sub1_1849 = null;
			anInt1834++;
			Class65.aClass19_1312 = arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("client.R(" + arg0 + ','
							+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method30(boolean arg0) {
		try {
			aJagexString_1848 = null;
			aJagexString_1847 = null;
			aJagexString_1846 = null;
			aJagexString_1852 = null;
			if (arg0 != true)
				method26((byte) 47, null);
			aJagexString_1850 = null;
			aClass19_1851 = null;
			aClass19_Sub1_1849 = null;
			aJagexString_1838 = null;
			aClass66_1844 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"client.U(" + arg0 + ')');
		}
	}

	public static void method31(int arg0, int arg1, Actor arg2) {
		try {
			anInt1845++;
			if (Region.pulseCycle >= arg2.anInt3224) {
				if ((Region.pulseCycle ^ 0xffffffff) < (arg2.anInt3281 ^ 0xffffffff))
					Class4_Sub20_Sub14.method596(false, arg2);
				else
					Class7.method654(arg1 ^ 0x6, arg2);
			} else
				Class4_Sub20_Sub7_Sub6.method434(arg2, false);
			if (arg1 != 4)
				aJagexString_1838 = null;
			if (arg2.worldX < 128 || arg2.worldY < 128
					|| (arg2.worldX ^ 0xffffffff) <= -13185
					|| (arg2.worldY ^ 0xffffffff) <= -13185) {
				arg2.anInt3226 = -1;
				arg2.anInt3224 = 0;
				arg2.anInt3281 = 0;
				arg2.worldX = 128 * arg2.anIntArray3248[0]
						- -(64 * arg2.anInt3244);
				arg2.worldY = 64 * arg2.anInt3244 + arg2.anIntArray3247[0]
						* 128;
				arg2.anInt3277 = -1;
				arg2.method382(true);
			}
			if (Class4_Sub15.localPlayer == arg2
					&& (arg2.worldX < 1536
							|| (arg2.worldY ^ 0xffffffff) > -1537
							|| arg2.worldX >= 11776 || (arg2.worldY ^ 0xffffffff) <= -11777)) {
				arg2.worldY = 64 * arg2.anInt3244 + 128
						* arg2.anIntArray3247[0];
				arg2.anInt3224 = 0;
				arg2.anInt3226 = -1;
				arg2.anInt3281 = 0;
				arg2.worldX = arg2.anIntArray3248[0] * 128
						- -(arg2.anInt3244 * 64);
				arg2.anInt3277 = -1;
				arg2.method382(true);
			}
			Class16.method729(arg2, (byte) -109);
			JagexString.method823(arg1 + -42, arg2);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("client.Q(" + arg0 + ',' + arg1 + ','
							+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public void init() {
		try {
			anInt1837++;
			if (this.method24(0)) {
				Class61.anInt1201 = Integer.parseInt(this
						.getParameter("worldid"));
				Class48.anInt981 = Integer.parseInt(this
						.getParameter("modewhat"));
				Class12.anInt341 = Integer.parseInt(this
						.getParameter("modewhere"));
				String string = this.getParameter("lowmem");
				if (string != null && string.equals("1"))
					Class63.method1054(true);
				else
					Class71.method1157((byte) 124);
				String string_4_ = this.getParameter("members");
				if (string_4_ != null && string_4_.equals("1"))
					Class77.aBoolean1590 = true;
				else
					Class77.aBoolean1590 = false;
				String string_5_ = this.getParameter("lang");
				if (string_5_ != null && string_5_.equals("1")) {
					Class4_Sub20_Sub7.method372(0);
					Class19_Sub1.anInt2536 = 1;
					Class4_Sub3.aJagexString_1903 = JagexException.aJagexString_1734;
				}
				String string_6_ = this.getParameter("game");
				if (string_6_ == null || !string_6_.equals("1"))
					Class4_Sub7.anInt1944 = 0;
				else
					Class4_Sub7.anInt1944 = 1;
				try {
					RSInterface.anInt2186 = Integer.parseInt(this
							.getParameter("js"));
					Class25.anInt583 = Integer.parseInt(this
							.getParameter("plug"));
				} catch (Exception exception) {
					/* empty */
				}
				Class4_Sub20_Sub6.aString2900 = this.getCodeBase().getHost();
				this.method23(464, 503, (byte) 33, 765, Class48.anInt981 + 32);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"client.init(" + ')');
		}
	}

	@Override
	public void method13(byte arg0) {
		boolean bool = Class64.method1061((byte) 90);
		if (bool && Class4_Sub20_Sub6.aBoolean2895
				&& JagexException.aClass43_1728 != null)
			JagexException.aClass43_1728.method951((byte) -13);
		anInt1841++;
		if (Class73.aBoolean1495) {
			Class4_Sub2_Sub1.method94(Class4_Sub20_Sub7_Sub5.runeCanvas, 4);
			Class13_Sub2.method690(Class4_Sub20_Sub7_Sub5.runeCanvas, 0);
			if (Region.aClass42_130 != null)
				Region.aClass42_130.method947(3294,
						Class4_Sub20_Sub7_Sub5.runeCanvas);
			this.method11(-56);
			Class4_Sub20_Sub8.method464((byte) 79,
					Class4_Sub20_Sub7_Sub5.runeCanvas);
			GameShell.method380(true,
					Class4_Sub20_Sub7_Sub5.runeCanvas, this);
			if (Region.aClass42_130 != null)
				Region.aClass42_130.method943(127,
						Class4_Sub20_Sub7_Sub5.runeCanvas);
		}
		if (Class54.anInt1109 == 0)
			Class6.method650(StringUtilities.aJagexString_1762, null, false,
					Region.anInt135);
		else if ((Class54.anInt1109 ^ 0xffffffff) != -6) {
			if ((Class54.anInt1109 ^ 0xffffffff) == -11)
				Class72.method1163(Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384,
						121, Class33.aClass4_Sub20_Sub12_Sub4_Sub1_717);
			else if ((Class54.anInt1109 ^ 0xffffffff) == -21)
				Class72.method1163(Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384,
						119, Class33.aClass4_Sub20_Sub12_Sub4_Sub1_717);
			else if ((Class54.anInt1109 ^ 0xffffffff) == -26) {
				if ((Class4_Sub20.anInt2353 ^ 0xffffffff) == -2) {
					if (Class4_Sub23.anInt2415 > Class4_Sub11_Sub1.anInt2677)
						Class4_Sub11_Sub1.anInt2677 = Class4_Sub23.anInt2415;
					int i_0_ = ((-Class4_Sub23.anInt2415 + Class4_Sub11_Sub1.anInt2677) * 50 / Class4_Sub11_Sub1.anInt2677);
					Class19.method735(
							false,
							(Class4_Sub24.method639(
									(new JagexString[] { Class7.aJagexString_228,
											StringUtilities.aJagexString_3081,
											Class74.method1168(-7, i_0_),
											StringUtilities.aJagexString_684}), -842)),
							(byte) -126);
				} else if ((Class4_Sub20.anInt2353 ^ 0xffffffff) != -3)
					Class19.method735(false, Class7.aJagexString_228, (byte) -126);
				else {
					if (Class77.anInt1591 > Class48.anInt976)
						Class48.anInt976 = Class77.anInt1591;
					int i_1_ = ((50 * (-Class77.anInt1591 + Class48.anInt976) / Class48.anInt976) + 50);
					Class19.method735(
							false,
							(Class4_Sub24.method639(
									(new JagexString[] { Class7.aJagexString_228,
											StringUtilities.aJagexString_3081,
											Class74.method1168(-50, i_1_),
											StringUtilities.aJagexString_684}), -842)),
							(byte) -126);
				}
			} else if (Class54.anInt1109 == 30)
				Class24.method787(false);
			else if (Class54.anInt1109 == 40)
				Class19.method735(
						false,
						Class4_Sub24.method639((new JagexString[] {
								Class66.aJagexString_1320, StringUtilities.aJagexString_316,
								Class81.aJagexString_1666}), -842), (byte) -126);
		} else
			Class72.method1163(Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384, 124,
					Class33.aClass4_Sub20_Sub12_Sub4_Sub1_717);
		do {
			if ((Class54.anInt1109 ^ 0xffffffff) != -31
					|| (Class52.anInt1052 ^ 0xffffffff) != -1
					|| Class4_Sub20_Sub4.aBoolean2849) {
				if ((Class54.anInt1109 ^ 0xffffffff) < -1) {
					try {
						Graphics graphics = Class4_Sub20_Sub7_Sub5.runeCanvas
								.getGraphics();
						Class62.aClass13_1225.method687(graphics, 0, 0, true);
						Class4_Sub20_Sub4.aBoolean2849 = false;
						for (int i_2_ = 0; ((i_2_ ^ 0xffffffff) > (SceneGraph.anInt2493 ^ 0xffffffff)); i_2_++)
							Class16.aBooleanArray452[i_2_] = false;
					} catch (Exception exception) {
						Class4_Sub20_Sub7_Sub5.runeCanvas.repaint();
					}
					break;
				}
			} else {
				try {
					Graphics graphics = Class4_Sub20_Sub7_Sub5.runeCanvas
							.getGraphics();
					for (int i_3_ = 0; i_3_ < SceneGraph.anInt2493; i_3_++) {
						if (Class16.aBooleanArray452[i_3_]) {
							Class62.aClass13_1225
									.method680(
											Class77.anIntArray1585[i_3_],
											(byte) 96,
											graphics,
											Class24.anIntArray568[i_3_],
											Actor.anIntArray3268[i_3_],
											Class42.anIntArray852[i_3_]);
							Class16.aBooleanArray452[i_3_] = false;
						}
					}
				} catch (Exception exception) {
					Class4_Sub20_Sub7_Sub5.runeCanvas.repaint();
					break;
				}
				break;
			}
		} while (false);
	}

//	@Override // Disabled because i cannot find a reason this is ran at all
//	public void method16(int arg0) {
//		try {
//			method30(true);
//			JagexString.method810((byte) -124);
//			anInt1832++;
//			GameShell.method15();
//			Class14.method706((byte) 116);
//			Class13.method683((byte) -128);
//			Class53.method1008(0);
//			Buffer.method217(0);
//			Class76.method1180(false);
//			Class19_Sub1.method771((byte) -82);
//			Class27.method850(77);
//			Class10.method667(0);
//			Npc.method395(2);
//			Class4_Sub11_Sub1.method269(1);
//			Class69.method1106();
//			Region.method66(false);
//			RSInterface.method291(123);
//			Player.method393(65535);
//			Class65.method1073(false);
//			Class16.method722(88);
//			Class42.method948(-122);
//			Class4_Sub8.method190(30);
//			Class43.method961(-2948);
//			Class8.method659((byte) -5);
//			Class35.method907(-3);
//			Class4_Sub20_Sub17.method615((byte) -80);
//			Actor.method388(-88);
//			Class4_Sub7.method188(1);
//			Class4_Sub20_Sub3.method351(-23648);
//			Class4_Sub16.method305(true);
//			RSFont.method69((byte) 100);
//			Class33.method888((byte) 123);
//			Class31.method877(98);
//			Class66.method1079((byte) -117);
//			Class4_Sub20_Sub7_Sub7.method454();
//			if (arg0 <= -23) {
//				Class4_Sub20_Sub7_Sub2.method402();
//				Class28.method855(16589);
//				JagexException.method1218(32768);
//				Class71.method1158((byte) 59);
//				Class4_Sub3.method176(true);
//				Class67.method1091(1);
//				Class12.method678(true);
//				Class4_Sub20_Sub7.method377(true);
//				Class68.method1097((byte) -128);
//				Class25.method797(-30004);
//				Class74.method1167((byte) 36);
//				Class5.method643(0);
//				Class51.method999();
//				Class40.method932(14778);
//				Class58.method1029(4);
//				Class18.method731(-95);
//				AppletListener.method1150((byte) -7);
//				Class52.method1004(false);
//				Class49.method989(467836531);
//				Class37.method917((byte) -53);
//				Class19.method757((byte) -98);
//				Class4_Sub2_Sub1.method92((byte) -40);
//				Class81.method1211(false);
//				Class73.method1164(-116);
//				Class64.method1062(77);
//				Class9.method664((byte) 58);
//				Class50.method994(3);
//				Class24.method793(8421);
//				Class6.method652(3);
//				Class1.method39(-98);
//				Class4_Sub20_Sub10.method483((byte) -63);
//				Class62.method1052(true);
//				Class77.method1193((byte) 60);
//				Class80.method1202(128);
//				Class4_Sub20_Sub12.method506();
//				Class4_Sub20.method316(true);
//				Class4_Sub20_Sub12_Sub3.method540();
//				Class4_Sub10.method202(0);
//				Class29.method864();
//				Class4_Sub2_Sub4.method168(-75);
//				Class4_Sub23.method635(false);
//				Class82.method1214((byte) 20);
//				Class4_Sub20_Sub9.method478((byte) 31);
//				RS2Font.method340(false);
//				Class4_Sub20_Sub13.method587((byte) 20);
//				Class4_Sub20_Sub1.method335((byte) 74);
//				Class4_Sub20_Sub8.method462(0);
//				Class4_Sub20_Sub14.method597(115);
//				Class4_Sub20_Sub6.method366(false);
//				Class4_Sub20_Sub4.method360(-121);
//				Class4_Sub20_Sub11.method487(true);
//				Class4_Sub20_Sub5.method362(124);
//				Class4_Sub20_Sub12_Sub4.method564();
//				Class34.method897(16);
//				Class4_Sub19.method312();
//				Class47.method977(0);
//				Class32.method883(1);
//				Class63.method1056(-53);
//				Class48.method986((byte) -113);
//				Class4_Sub1.method76((byte) 95);
//				Class4_Sub22.method631(true);
//				Class4_Sub20_Sub16.method610(120);
//				Class38.method923(60);
//				Class2.method46(4634);
//				Class4_Sub14.method296(true);
//				Class11.method673(126);
//				Class59.method1036((byte) 34);
//				Instrument.initialize();
//				Class4_Sub20_Sub7_Sub5.method427(false);
//				Class4_Sub20_Sub7_Sub3.method417((byte) -65);
//				Class4_Sub15.method299(87);
//				Class4_Sub20_Sub7_Sub4.method420(-2);
//				Class4_Sub20_Sub7_Sub6.method433(3052);
//				Class4_Sub21.method624((byte) 95);
//				Class72.method1162(true);
//				RSCanvas.method35((byte) 7);
//				Class46.resetCache(-116);
//				SceneGraph.method708(256);
//				Class13_Sub2.method694((byte) 88);
//				Class45.method972(-125);
//				Class61.method1042(-106);
//				Class54.method1013(-57);
//				Class7.method656(false);
//				Class43_Sub1.method967();
//				Filter.method1019();
//				Class30.method874(-1);
//				Class44.method969();
//				Class4_Sub24.method640((byte) -126);
//				Class4_Sub12.method280((byte) -89);
//				Class23.method784();
//				Class41.method939((byte) -110);
//				Class4_Sub17.method307(0);
//				Class57.method1027(-10159);
//				Class4_Sub9.method200();
//				Class15.method717();
//				Class78.method1194(-8);
//				Class4_Sub6.method181((byte) -122);
//			}
//		} catch (RuntimeException runtimeexception) {
//			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
//					"client.A(" + arg0 + ')');
//		}
//	}

	@Override
	public void method17(int arg0) {
		Class4_Sub20_Sub7.anInt2934 = ((Class12.anInt341 ^ 0xffffffff) != -1 ? 50000 - -Class61.anInt1201
				: 443);
		if (Class4_Sub7.anInt1944 == 1) {
			Class5.aShortArray177 = Class28.aShortArray639;
			Class13_Sub2.aShortArrayArray2476 = Class42.aShortArrayArray854;
			Class16.aShortArray448 = Class4_Sub20_Sub7_Sub6.aShortArray3434;
			Class4_Sub14.aShortArrayArray2284 = Class4_Sub3.aShortArrayArray1886;
		} else {
			Class4_Sub14.aShortArrayArray2284 = Class76.aShortArrayArray1576;
			Class13_Sub2.aShortArrayArray2476 = Class2.aShortArrayArray83;
			Class5.aShortArray177 = Class9.aShortArray272;
			Class16.aShortArray448 = Class4_Sub20_Sub4.aShortArray2859;
		}
		RSInterface.anInt2139 = ((Class12.anInt341 ^ 0xffffffff) != -1 ? Class61.anInt1201 + 40000
				: 43594);
		anInt1843++;
		Class64.anInt1253 = RSInterface.anInt2139;
		Class52.method1001((byte) -66);
		Class4_Sub20_Sub8.method464((byte) 79,
				Class4_Sub20_Sub7_Sub5.runeCanvas);
		GameShell.method380(true, Class4_Sub20_Sub7_Sub5.runeCanvas, this);
		if (arg0 != 0)
			aJagexString_1850 = null;
		Region.aClass42_130 = Class4_Sub2_Sub4.method172(true);
		if (Region.aClass42_130 != null)
			Region.aClass42_130.method943(117,
					Class4_Sub20_Sub7_Sub5.runeCanvas);
		try {
			if (Class43.aClass75_872.aClass39_1528 != null) {
				Class4_Sub20_Sub13.aClass27_3127 = new Class27(
						Class43.aClass75_872.aClass39_1528, 5200, 0);
				for (int i = 0; i < 16; i++)
					Class24.aClass27Array550[i] = new Class27(
							(Class43.aClass75_872.aClass39Array1541[i]), 6000,
							0);
				Class7.aClass27_222 = new Class27(
						Class43.aClass75_872.aClass39_1527, 6000, 0);
				Class11.aClass10_321 = new Class10(255,
						Class4_Sub20_Sub13.aClass27_3127, Class7.aClass27_222,
						500000);
				Class43.aClass75_872.aClass39_1527 = null;
				Class43.aClass75_872.aClass39_1528 = null;
				Class43.aClass75_872.aClass39Array1541 = null;
			}
		} catch (java.io.IOException ioexception) {
			Class7.aClass27_222 = null;
			Class11.aClass10_321 = null;
			Class4_Sub20_Sub13.aClass27_3127 = null;
		}
		if ((Class12.anInt341 ^ 0xffffffff) != -1)
			Class4_Sub20_Sub9.aBoolean3048 = true;
	}

	@Override
	public void method21() {
		anInt1839++;
		if (Class31.aClass53_690 != null)
			Class31.aClass53_690.aBoolean1071 = false;
			Class31.aClass53_690 = null;
			if (Class4_Sub20_Sub17.aClass76_3189 != null) {
				Class4_Sub20_Sub17.aClass76_3189.method1181(-31709);
				Class4_Sub20_Sub17.aClass76_3189 = null;
			}
			Class72.method1159();
			Class76.method1182(-121);
			Region.aClass42_130 = null;
			if (JagexException.aClass43_1728 != null)
				JagexException.aClass43_1728.method958(71);
			if (Class4_Sub20_Sub6.aClass43_2932 != null)
				Class4_Sub20_Sub6.aClass43_2932.method958(101);
			Class4_Sub14.method297((byte) 8);
			Class4_Sub11_Sub1.method272(-1432215741);
			do {
				try {
					if (Class4_Sub20_Sub13.aClass27_3127 != null)
						Class4_Sub20_Sub13.aClass27_3127.method843((byte) -46);
					if (Class24.aClass27Array550 != null) {
						for (int i = 0; ((Class24.aClass27Array550.length ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
							if (Class24.aClass27Array550[i] != null)
								Class24.aClass27Array550[i]
										.method843((byte) -117);
						}
					}
					if (Class7.aClass27_222 == null)
						break;
					Class7.aClass27_222.method843((byte) -49);
				} catch (java.io.IOException ioexception) {
					break;
				}
				break;
			} while (false);
	}

	@Override
	public void method25(int arg0) {
		try {
			anInt1831++;
			Region.pulseCycle++;
			method28((byte) -97);
			Class4_Sub23.method636(arg0 + 19134);
			Class53.method1010(0);
			if (arg0 == -19134) {
				Class41.method938((byte) 0);
				Class33.method886(-490212280);
				AppletListener.method1149();
				if (Region.aClass42_130 != null) {
					int i = Region.aClass42_130.method944(-28);
					RS2Font.anInt2768 = i;
				}
				if (Class54.anInt1109 == 0) {
					Class4_Sub14.method295(false);
					Region.method51(-1);
				} else if ((Class54.anInt1109 ^ 0xffffffff) != -6) {
					if ((Class54.anInt1109 ^ 0xffffffff) != -11) {
						if ((Class54.anInt1109 ^ 0xffffffff) == -21) {
							Class41.method940(this, 123);
							Class13_Sub2.method693((byte) -95);
						} else if (Class54.anInt1109 == 25)
							Class41.loadGameRegions((byte) -2);
					} else
						Class41.method940(this, 117);
				} else {
					Class41.method940(this, 123);
					Class4_Sub14.method295(false);
					Region.method51(-1);
				}
				if (Class54.anInt1109 != 30) {
					if (Class54.anInt1109 == 40)
						Class13_Sub2.method693((byte) -95);
				} else
					Class61.method1044(1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"client.M(" + -19134 + ')');
		}
	}

	public void method27(boolean arg0) {
		anInt1835++;
		if (Class27.anInt627 >= 4) {
			this.method19((byte) 104, "js5crc");
			Class54.anInt1109 = 1000;
		} else {
			if (Class4_Sub20_Sub16.anInt3164 >= 4) {
				if (Class54.anInt1109 > 5) {
					Class4_Sub20_Sub16.anInt3164 = 3;
					Class4_Sub20_Sub10.anInt3055 = 3000;
				} else {
					this.method19((byte) -54, "js5io");
					Class54.anInt1109 = 1000;
					return;
				}
			}
			if (Class4_Sub20_Sub10.anInt3055-- <= 0) {
				do {
					try {
						if (arg0 != false)
							aJagexString_1838 = null;
						if ((Class4_Sub20_Sub13.anInt3132 ^ 0xffffffff) == -1) {
							Class4_Sub3.aClass22_1896 = (Class43.aClass75_872
									.method1176((byte) 120,
											Class4_Sub20_Sub6.aString2900,
											Class64.anInt1253));
							Class4_Sub20_Sub13.anInt3132++;
						}
						if ((Class4_Sub20_Sub13.anInt3132 ^ 0xffffffff) == -2) {
							if ((Class4_Sub3.aClass22_1896.anInt545 ^ 0xffffffff) == -3) {
								method29(-76, -1);
								break;
							}
							if ((Class4_Sub3.aClass22_1896.anInt545 ^ 0xffffffff) == -2)
								Class4_Sub20_Sub13.anInt3132++;
						}
						if ((Class4_Sub20_Sub13.anInt3132 ^ 0xffffffff) == -3) {
							Class1.aClass76_61 = new Class76(
									(Socket) (Class4_Sub3.aClass22_1896.anObject543),
									Class43.aClass75_872);
							Buffer class4_sub11 = new Buffer(5);
							class4_sub11.method227((byte) -27, 15);
							class4_sub11.method236(181, 464);
							Class1.aClass76_61.method1183(5, 0, 121,
									(class4_sub11.byteBuffer));
							Class4_Sub20_Sub13.anInt3132++;
							Class11.aLong319 = Class52.method1002((byte) -42);
						}
						if (Class4_Sub20_Sub13.anInt3132 == 3) {
							if ((Class54.anInt1109 ^ 0xffffffff) >= -6
									|| Class1.aClass76_61.method1189(true) > 0) {
								int i = Class1.aClass76_61.method1184(-128);
								if ((i ^ 0xffffffff) != -1) {
									method29(-70, i);
									break;
								}
								Class4_Sub20_Sub13.anInt3132++;
							} else if ((-Class11.aLong319 + Class52
									.method1002((byte) -42)) > 30000L) {
								method29(104, -2);
								break;
							}
						}
						if ((Class4_Sub20_Sub13.anInt3132 ^ 0xffffffff) != -5)
							break;
						Class4_Sub20_Sub14.method599(Class54.anInt1109 > 20,
								arg0, Class1.aClass76_61);
						Class1.aClass76_61 = null;
						Class8.anInt261 = 0;
						Class4_Sub20_Sub13.anInt3132 = 0;
						Class4_Sub3.aClass22_1896 = null;
					} catch (java.io.IOException ioexception) {
						method29(108, -3);
						break;
					}
					break;
				} while (false);
			}
		}
	}

	public void method28(byte arg0) {
		try {
			anInt1842++;
			if (Class54.anInt1109 != 1000) {
				boolean bool = Class4_Sub20_Sub17.method618((byte) 126);
				if (!bool)
					method27(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"client.T(" + arg0 + ')');
		}
	}

	public void method29(int arg0, int arg1) {
		anInt1840++;
		if (Class64.anInt1253 != RSInterface.anInt2139)
			Class64.anInt1253 = RSInterface.anInt2139;
		else
			Class64.anInt1253 = Class4_Sub20_Sub7.anInt2934;
		Class1.aClass76_61 = null;
		Class4_Sub20_Sub13.anInt3132 = 0;
		Class4_Sub3.aClass22_1896 = null;
		Class8.anInt261++;
		if ((Class8.anInt261 ^ 0xffffffff) <= -3
				&& (arg1 == 7 || (arg1 ^ 0xffffffff) == -10)) {
			if (Class54.anInt1109 > 5)
				Class4_Sub20_Sub10.anInt3055 = 3000;
			else {
				this.method19((byte) -95, "js5connect_full");
				Class54.anInt1109 = 1000;
			}
		} else if ((Class8.anInt261 ^ 0xffffffff) > -3
				|| (arg1 ^ 0xffffffff) != -7) {
			if ((Class8.anInt261 ^ 0xffffffff) <= -5) {
				if (Class54.anInt1109 > 5)
					Class4_Sub20_Sub10.anInt3055 = 3000;
				else {
					this.method19((byte) 24, "js5connect");
					Class54.anInt1109 = 1000;
				}
			}
		} else {
			this.method19((byte) 36, "js5connect_outofdate");
			Class54.anInt1109 = 1000;
		}
	}

	void mouseWheelDragged(int i, int j) {
		if (!mouseWheelDown)
			return;
		Class78.cameraVelocityHorizontal += i * 3;
		Class4_Sub20_Sub13.cameraVelocityVertical += (j << 1);
	}

}
