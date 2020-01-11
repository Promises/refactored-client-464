/* Class4_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;

public class Class4_Sub2_Sub1 extends Class4_Sub2 {
	public static Class19 aClass19_2579;
	public static JagexString aJagexString_2581 = JagexString.getRs2PreparedString(
			"Clientscript error )2 check log for details");
	public static JagexString aJagexString_2595;
	public static JagexString[] aJagexStringArray2574;
	public static Class4_Sub20_Sub12_Sub2[] aClass4_Sub20_Sub12_Sub2Array2600;
	public static long aLong2594;
	public static int anInt2549;
	public static int anInt2550;
	public static int anInt2551;
	public static int anInt2554;
	public static int anInt2555;
	public static int anInt2556;
	public static int anInt2557;
	public static int anInt2558;
	public static int anInt2559;
	public static int anInt2560;
	public static int anInt2562;
	public static int anInt2563;
	public static int anInt2564;
	public static int anInt2565;
	public static int anInt2566;
	public static int anInt2568;
	public static int anInt2569;
	public static int anInt2570;
	public static int anInt2572;
	public static int anInt2575;
	public static int anInt2577;
	public static int anInt2578;
	public static int anInt2580;
	public static int anInt2582;
	public static int anInt2584;
	public static int anInt2587;
	public static int anInt2590;
	public static int anInt2591;
	public static int anInt2592;
	public static int anInt2593;
	public static int anInt2596;
	public static int anInt2597;
	public static int anInt2598;
	public static int anInt2601;
	public static int anInt2602;
	public static int anInt2605;
	public static int anInt2606;
	public static int anInt2609;
	public static int anInt2612;
	public static int anInt2614;
	public static int anInt2615;
	static {
		aJagexStringArray2574 = new JagexString[100];
		anInt2593 = 3353893;
		aJagexString_2595 = JagexString.getRs2PreparedString("<img=0>");
		anInt2590 = 0;
		aClass4_Sub20_Sub12_Sub2Array2600 = new Class4_Sub20_Sub12_Sub2[1000];
	}

	public static void method100(int arg0, int arg1, int arg2, byte arg3,
			int arg4) {
		try {
			anInt2602++;
			RSApplet.anInt6 = 0;
			for (int i_42_ = -1; (i_42_ < Class4_Sub20_Sub7_Sub6.anInt3431
					- -RSApplet.anInt12); i_42_++) {
				Class4_Sub20_Sub7_Sub1 class4_sub20_sub7_sub1;
				if ((i_42_ ^ 0xffffffff) == 0)
					class4_sub20_sub7_sub1 = Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302;
				else if ((i_42_ ^ 0xffffffff) > (Class4_Sub20_Sub7_Sub6.anInt3431 ^ 0xffffffff))
					class4_sub20_sub7_sub1 = (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[Class4_Sub23.anIntArray2432[i_42_]]);
				else
					class4_sub20_sub7_sub1 = (Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[(Class4_Sub11_Sub1.anIntArray2695[-Class4_Sub20_Sub7_Sub6.anInt3431
							+ i_42_])]);
				if (class4_sub20_sub7_sub1 != null
						&& class4_sub20_sub7_sub1.method384(-19456)) {
					if (class4_sub20_sub7_sub1 instanceof Class4_Sub20_Sub7_Sub1_Sub2) {
						Class4_Sub20_Sub3 class4_sub20_sub3 = (((Class4_Sub20_Sub7_Sub1_Sub2) class4_sub20_sub7_sub1).aClass4_Sub20_Sub3_3617);
						if (class4_sub20_sub3.anIntArray2832 != null)
							class4_sub20_sub3 = class4_sub20_sub3
									.method354((byte) 125);
						if (class4_sub20_sub3 == null)
							continue;
					}
					if ((Class4_Sub20_Sub7_Sub6.anInt3431 ^ 0xffffffff) >= (i_42_ ^ 0xffffffff)) {
						Class4_Sub20_Sub3 class4_sub20_sub3 = (((Class4_Sub20_Sub7_Sub1_Sub2) class4_sub20_sub7_sub1).aClass4_Sub20_Sub3_3617);
						if (class4_sub20_sub3.anIntArray2832 != null)
							class4_sub20_sub3 = class4_sub20_sub3
									.method354((byte) 92);
						if ((class4_sub20_sub3.anInt2797 ^ 0xffffffff) <= -1
								&& (((Class4_Sub21.aClass4_Sub20_Sub12_Sub2Array2378).length ^ 0xffffffff) < (class4_sub20_sub3.anInt2797 ^ 0xffffffff))) {
							Class24.method794(
									(class4_sub20_sub7_sub1.anInt3282 - -15),
									class4_sub20_sub7_sub1, -127);
							if ((Class27.anInt604 ^ 0xffffffff) < 0)
								Class4_Sub21.aClass4_Sub20_Sub12_Sub2Array2378[class4_sub20_sub3.anInt2797]
										.method532(
												-12 + (arg0 + Class27.anInt604),
												arg1
														- (-SceneGraph.anInt2502 + 30));
						}
						if ((Class57.anInt1141 ^ 0xffffffff) == -2
								&& (((Class4_Sub11_Sub1.anIntArray2695[i_42_
										+ -Class4_Sub20_Sub7_Sub6.anInt3431]) ^ 0xffffffff) == (Class10.anInt313 ^ 0xffffffff))
								&& (Region.anInt134 % 20 ^ 0xffffffff) > -11) {
							Class24.method794(
									15 + (class4_sub20_sub7_sub1.anInt3282),
									class4_sub20_sub7_sub1, -128);
							if ((Class27.anInt604 ^ 0xffffffff) < 0)
								Class14.aClass4_Sub20_Sub12_Sub2Array405[0]
										.method532(Class27.anInt604 + arg0
												+ -12, -28 + arg1
												- -SceneGraph.anInt2502);
						}
					} else {
						Class4_Sub20_Sub7_Sub1_Sub1 class4_sub20_sub7_sub1_sub1 = ((Class4_Sub20_Sub7_Sub1_Sub1) class4_sub20_sub7_sub1);
						int i_43_ = 30;
						if ((class4_sub20_sub7_sub1_sub1.anInt3597 ^ 0xffffffff) != 0
								|| class4_sub20_sub7_sub1_sub1.anInt3585 != -1) {
							Class24.method794(
									(class4_sub20_sub7_sub1.anInt3282 - -15),
									class4_sub20_sub7_sub1, -126);
							if (Class27.anInt604 > -1) {
								if (class4_sub20_sub7_sub1_sub1.anInt3597 != -1) {
									Class54.aClass4_Sub20_Sub12_Sub2Array1092[class4_sub20_sub7_sub1_sub1.anInt3597]
											.method532(-12 + arg0
													- -Class27.anInt604,
													(SceneGraph.anInt2502
															+ arg1 - i_43_));
									i_43_ += 25;
								}
								if ((class4_sub20_sub7_sub1_sub1.anInt3585 ^ 0xffffffff) != 0) {
									Class4_Sub21.aClass4_Sub20_Sub12_Sub2Array2378[class4_sub20_sub7_sub1_sub1.anInt3585]
											.method532(
													-12 + Class27.anInt604
															+ arg0,
													(-i_43_
															+ SceneGraph.anInt2502 + arg1));
									i_43_ += 25;
								}
							}
						}
						if (i_42_ >= 0
								&& Class57.anInt1141 == 10
								&& (Class4_Sub23.anIntArray2432[i_42_] == Class16.anInt426)) {
							Class24.method794(
									15 + (class4_sub20_sub7_sub1.anInt3282),
									class4_sub20_sub7_sub1, -126);
							if ((Class27.anInt604 ^ 0xffffffff) < 0)
								Class14.aClass4_Sub20_Sub12_Sub2Array405[1]
										.method532(
												arg0 + Class27.anInt604 + -12,
												-i_43_
														+ (arg1 - -SceneGraph.anInt2502));
						}
					}
					if (class4_sub20_sub7_sub1.aJagexString_3271 != null
							&& (((i_42_ ^ 0xffffffff) <= (Class4_Sub20_Sub7_Sub6.anInt3431 ^ 0xffffffff))
									|| (Class27.anInt618 ^ 0xffffffff) == -1
									|| (Class27.anInt618 ^ 0xffffffff) == -4 || (Class27.anInt618 == 1 && (JagexString
									.method830(
											60,
											(((Class4_Sub20_Sub7_Sub1_Sub1) class4_sub20_sub7_sub1).aJagexString_3593)))))) {
						Class24.method794(class4_sub20_sub7_sub1.anInt3282,
								class4_sub20_sub7_sub1, -128);
						if (Class27.anInt604 > -1
								&& RSApplet.anInt6 < Class5.anInt193) {
							Class5.anIntArray181[RSApplet.anInt6] = (Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384
									.method560(class4_sub20_sub7_sub1.aJagexString_3271)) / 2;
							Class5.anIntArray198[RSApplet.anInt6] = (Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384.anInt3546);
							Class5.anIntArray190[RSApplet.anInt6] = Class27.anInt604;
							Class5.anIntArray174[RSApplet.anInt6] = SceneGraph.anInt2502;
							Class5.anIntArray185[RSApplet.anInt6] = class4_sub20_sub7_sub1.anInt3225;
							Class5.anIntArray180[RSApplet.anInt6] = class4_sub20_sub7_sub1.anInt3220;
							Class5.anIntArray184[RSApplet.anInt6] = class4_sub20_sub7_sub1.anInt3253;
							Class5.aJagexStringArray187[RSApplet.anInt6] = class4_sub20_sub7_sub1.aJagexString_3271;
							RSApplet.anInt6++;
						}
					}
					if ((Region.anInt134 ^ 0xffffffff) > (class4_sub20_sub7_sub1.anInt3273 ^ 0xffffffff)) {
						Class24.method794(
								(15 + class4_sub20_sub7_sub1.anInt3282),
								class4_sub20_sub7_sub1, -126);
						if ((Class27.anInt604 ^ 0xffffffff) < 0) {
							int i_44_ = (class4_sub20_sub7_sub1.anInt3259 * 30 / class4_sub20_sub7_sub1.anInt3262);
							if (i_44_ > 30)
								i_44_ = 30;
							Class4_Sub20_Sub12.method488(-15
									+ (arg0 - -Class27.anInt604), -3
									+ (SceneGraph.anInt2502 + arg1), i_44_,
									5, 65280);
							Class4_Sub20_Sub12.method488(-15 + Class27.anInt604
									+ (arg0 + i_44_), -3 + arg1
									+ SceneGraph.anInt2502, -i_44_ + 30, 5,
									16711680);
						}
					}
					for (int i_45_ = 0; i_45_ < 4; i_45_++) {
						if (Region.anInt134 < class4_sub20_sub7_sub1.anIntArray3223[i_45_]) {
							Class24.method794(
									(class4_sub20_sub7_sub1.anInt3282 / 2),
									class4_sub20_sub7_sub1, -128);
							if (Class27.anInt604 > -1) {
								if ((i_45_ ^ 0xffffffff) == -2)
									SceneGraph.anInt2502 -= 20;
								if (i_45_ == 2) {
									SceneGraph.anInt2502 -= 10;
									Class27.anInt604 -= 15;
								}
								if ((i_45_ ^ 0xffffffff) == -4) {
									SceneGraph.anInt2502 -= 10;
									Class27.anInt604 += 15;
								}
								Class65.aClass4_Sub20_Sub12_Sub2Array1290[(class4_sub20_sub7_sub1.anIntArray3275[i_45_])]
										.method532(-12
												+ (arg0 + Class27.anInt604),
												arg1 + SceneGraph.anInt2502
														+ -12);
								Class33.aClass4_Sub20_Sub12_Sub4_Sub1_717
										.method571(
												Class74.method1168(
														-78,
														(class4_sub20_sub7_sub1.anIntArray3264[i_45_])),
												arg0 - (-Class27.anInt604 - -1),
												3 + (arg1 - -SceneGraph.anInt2502),
												16777215, 0);
							}
						}
					}
				}
			}
			for (int i_46_ = 0; i_46_ < RSApplet.anInt6; i_46_++) {
				int i_47_ = Class5.anIntArray190[i_46_];
				int i_48_ = Class5.anIntArray181[i_46_];
				int i_49_ = Class5.anIntArray174[i_46_];
				boolean bool = true;
				int i_50_ = Class5.anIntArray198[i_46_];
				while (bool) {
					bool = false;
					for (int i_51_ = 0; i_46_ > i_51_; i_51_++) {
						if (((2 + i_49_ ^ 0xffffffff) < ((Class5.anIntArray174[i_51_] - Class5.anIntArray198[i_51_]) ^ 0xffffffff))
								&& Class5.anIntArray174[i_51_] + 2 > i_49_
										- i_50_
								&& ((Class5.anIntArray190[i_51_] - -Class5.anIntArray181[i_51_]) > -i_48_
										+ i_47_)
								&& (Class5.anIntArray190[i_51_] + -Class5.anIntArray181[i_51_]) < i_48_
										+ i_47_
								&& i_49_ > (-Class5.anIntArray198[i_51_] + Class5.anIntArray174[i_51_])) {
							i_49_ = (-Class5.anIntArray198[i_51_] + Class5.anIntArray174[i_51_]);
							bool = true;
						}
					}
				}
				Class27.anInt604 = Class5.anIntArray190[i_46_];
				SceneGraph.anInt2502 = Class5.anIntArray174[i_46_] = i_49_;
				JagexString jagexString = Class5.aJagexStringArray187[i_46_];
				if ((Class14.anInt412 ^ 0xffffffff) != -1)
					Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384.method571(
                            jagexString, Class27.anInt604 + arg0, arg1
									+ SceneGraph.anInt2502, 16776960, 0);
				else {
					int i_52_ = 16776960;
					if (Class5.anIntArray185[i_46_] < 6)
						i_52_ = (Class4_Sub20_Sub7_Sub1_Sub2.anIntArray3624[Class5.anIntArray185[i_46_]]);
					if ((Class5.anIntArray185[i_46_] ^ 0xffffffff) == -7)
						i_52_ = ((Class43.anInt860 % 20 ^ 0xffffffff) > -11 ? 16711680
								: 16776960);
					if (Class5.anIntArray185[i_46_] == 7)
						i_52_ = ((Class43.anInt860 % 20 ^ 0xffffffff) > -11 ? 255
								: 65535);
					if (Class5.anIntArray185[i_46_] == 8)
						i_52_ = ((Class43.anInt860 % 20 ^ 0xffffffff) <= -11 ? 8454016
								: 45056);
					if (Class5.anIntArray185[i_46_] == 9) {
						int i_53_ = -Class5.anIntArray184[i_46_] + 150;
						if (i_53_ >= 50) {
							if ((i_53_ ^ 0xffffffff) > -101)
								i_52_ = -(327680 * (-50 + i_53_)) + 16776960;
							else if ((i_53_ ^ 0xffffffff) > -151)
								i_52_ = 64780 + i_53_ * 5;
						} else
							i_52_ = 16711680 + i_53_ * 1280;
					}
					if ((Class5.anIntArray185[i_46_] ^ 0xffffffff) == -11) {
						int i_54_ = 150 + -Class5.anIntArray184[i_46_];
						if ((i_54_ ^ 0xffffffff) <= -51) {
							if ((i_54_ ^ 0xffffffff) > -101)
								i_52_ = -(327680 * (-50 + i_54_)) + 16711935;
							else if ((i_54_ ^ 0xffffffff) > -151)
								i_52_ = (-((i_54_ - 100) * 5) + ((-100 + i_54_) * 327680 + 255));
						} else
							i_52_ = i_54_ * 5 + 16711680;
					}
					if (Class5.anIntArray185[i_46_] == 11) {
						int i_55_ = 150 + -Class5.anIntArray184[i_46_];
						if ((i_55_ ^ 0xffffffff) > -51)
							i_52_ = 16777215 - i_55_ * 327685;
						else if ((i_55_ ^ 0xffffffff) > -101)
							i_52_ = i_55_ * 327685 - 16384250 + 65280;
						else if (i_55_ < 150)
							i_52_ = 32768000 - 327680 * i_55_ + 16777215;
					}
					if (Class5.anIntArray180[i_46_] == 0)
						Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384.method571(
                                jagexString, arg0 + Class27.anInt604,
								SceneGraph.anInt2502 + arg1, i_52_, 0);
					if (Class5.anIntArray180[i_46_] == 1)
						Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384.method563(
                                jagexString, Class27.anInt604 + arg0,
								SceneGraph.anInt2502 + arg1, i_52_, 0,
								Class43.anInt860);
					if ((Class5.anIntArray180[i_46_] ^ 0xffffffff) == -3)
						Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384.method569(
                                jagexString, arg0 + Class27.anInt604,
								SceneGraph.anInt2502 + arg1, i_52_, 0,
								Class43.anInt860);
					if ((Class5.anIntArray180[i_46_] ^ 0xffffffff) == -4)
						Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384.method567(
                                jagexString, arg0 + Class27.anInt604,
								SceneGraph.anInt2502 + arg1, i_52_, 0,
								Class43.anInt860,
								-Class5.anIntArray184[i_46_] + 150);
					if ((Class5.anIntArray180[i_46_] ^ 0xffffffff) == -5) {
						int i_56_ = ((-Class5.anIntArray184[i_46_] + 150)
								* (Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384
										.method560(jagexString) - -100) / 150);
						Class4_Sub20_Sub12.method503(arg0 - -Class27.anInt604
								+ -50, arg1, 50 + (arg0 - -Class27.anInt604),
								arg4 + arg1);
						Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384.method577(
                                jagexString, -i_56_ + 50 + Class27.anInt604 + arg0,
								SceneGraph.anInt2502 + arg1, i_52_, 0);
						Class4_Sub20_Sub12.method492(arg0, arg1, arg0 + arg2,
								arg1 - -arg4);
					}
					if ((Class5.anIntArray180[i_46_] ^ 0xffffffff) == -6) {
						int i_57_ = 150 + -Class5.anIntArray184[i_46_];
						Class4_Sub20_Sub12
								.method503(
										arg0,
										(SceneGraph.anInt2502 + arg1 - ((Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384.anInt3546) - -1)),
										arg0 + arg2,
										arg1 - (-SceneGraph.anInt2502 + -5));
						int i_58_ = 0;
						if ((i_57_ ^ 0xffffffff) > -26)
							i_58_ = i_57_ - 25;
						else if ((i_57_ ^ 0xffffffff) < -126)
							i_58_ = i_57_ - 125;
						Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384.method571(
                                jagexString, arg0 + Class27.anInt604, arg1
										- -SceneGraph.anInt2502 + i_58_,
								i_52_, 0);
						Class4_Sub20_Sub12.method492(arg0, arg1, arg2 + arg0,
								arg4 + arg1);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("bf.AA(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
							+ ',' + arg4 + ')'));
		}
	}

	public static void method92(byte arg0) {
		try {
			aClass19_2579 = null;
			aJagexString_2595 = null;
			aJagexString_2581 = null;
			if (arg0 > -25)
				method92((byte) 59);
			aClass4_Sub20_Sub12_Sub2Array2600 = null;
			aJagexStringArray2574 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "bf.D("
					+ arg0 + ')');
		}
	}

	public static void method93(byte arg0, Class4_Sub20_Sub12_Sub4_Sub1 arg1,
			Class4_Sub20_Sub12_Sub4_Sub1 arg2) {
		try {
			anInt2570++;
			if (JagexException.aClass4_Sub20_Sub12_Sub2Array1732 == null)
				JagexException.aClass4_Sub20_Sub12_Sub2Array1732 = Class4_Sub21
						.method625(Class31.aJagexString_678,
								Client.aClass19_Sub1_1849,
								Class34.aJagexString_1767, true);
			if (Class12.aClass4_Sub20_Sub12_Sub1Array359 == null)
				Class12.aClass4_Sub20_Sub12_Sub1Array359 = Class63.method1055(
						Class34.aJagexString_1767, Client.aClass19_Sub1_1849, 27,
						RSFont.aJagexString_142);
			if (Class28.aClass4_Sub20_Sub12_Sub1Array635 == null)
				Class28.aClass4_Sub20_Sub12_Sub1Array635 = Class63.method1055(
						Class34.aJagexString_1767, Client.aClass19_Sub1_1849, 74,
						Class12.aJagexString_361);
			if (Class59.aClass4_Sub20_Sub12_Sub1Array1174 == null)
				Class59.aClass4_Sub20_Sub12_Sub1Array1174 = Class63.method1055(
						Class34.aJagexString_1767, Client.aClass19_Sub1_1849, 120,
						Class11.aJagexString_324);
			Class4_Sub20_Sub12.method488(0, 23, 765, 480, 0);
			Class4_Sub20_Sub12.method500(0, 0, 125, 23, 12425273, 9135624);
			Class4_Sub20_Sub12.method500(125, 0, 640, 23, 5197647, 2697513);
			if (arg0 < -55) {
				arg2.method571(Class4_Sub8.aJagexString_1974, 62, 15, 0, -1);
				if (Class59.aClass4_Sub20_Sub12_Sub1Array1174 != null) {
					Class59.aClass4_Sub20_Sub12_Sub1Array1174[1].method507(140,
							1);
					arg1.method577(Class27.aJagexString_629, 152, 10, 16777215, -1);
					Class59.aClass4_Sub20_Sub12_Sub1Array1174[0].method507(140,
							12);
					arg1.method577(Class76.aJagexString_1561, 152, 21, 16777215, -1);
				}
				if (Class28.aClass4_Sub20_Sub12_Sub1Array635 != null) {
					int i = 390;
					int i_21_ = 280;
					int i_22_ = 610;
					int i_23_ = 500;
					if (Class4_Sub7.anIntArray1947[0] != 0
							|| Class65.anIntArray1289[0] != 0)
						Class28.aClass4_Sub20_Sub12_Sub1Array635[0].method507(
								i_21_, 4);
					else
						Class28.aClass4_Sub20_Sub12_Sub1Array635[2].method507(
								i_21_, 4);
					if ((Class4_Sub7.anIntArray1947[0] ^ 0xffffffff) != -1
							|| (Class65.anIntArray1289[0] ^ 0xffffffff) != -2)
						Class28.aClass4_Sub20_Sub12_Sub1Array635[1].method507(
								i_21_ + 15, 4);
					else
						Class28.aClass4_Sub20_Sub12_Sub1Array635[3].method507(
								i_21_ - -15, 4);
					arg2.method577(Class4_Sub20_Sub7_Sub4.aJagexString_3362,
							i_21_ + 32, 17, 16777215, -1);
					if ((Class4_Sub7.anIntArray1947[0] ^ 0xffffffff) == -2
							&& Class65.anIntArray1289[0] == 0)
						Class28.aClass4_Sub20_Sub12_Sub1Array635[2].method507(
								i, 4);
					else
						Class28.aClass4_Sub20_Sub12_Sub1Array635[0].method507(
								i, 4);
					if ((Class4_Sub7.anIntArray1947[0] ^ 0xffffffff) == -2
							&& (Class65.anIntArray1289[0] ^ 0xffffffff) == -2)
						Class28.aClass4_Sub20_Sub12_Sub1Array635[3].method507(
								i + 15, 4);
					else
						Class28.aClass4_Sub20_Sub12_Sub1Array635[1].method507(i
								- -15, 4);
					arg2.method577(Class4_Sub20_Sub7_Sub1_Sub2.aJagexString_3626,
							32 + i, 17, 16777215, -1);
					if ((Class4_Sub7.anIntArray1947[0] ^ 0xffffffff) != -3
							|| Class65.anIntArray1289[0] != 0)
						Class28.aClass4_Sub20_Sub12_Sub1Array635[0].method507(
								i_23_, 4);
					else
						Class28.aClass4_Sub20_Sub12_Sub1Array635[2].method507(
								i_23_, 4);
					if (Class4_Sub7.anIntArray1947[0] == 2
							&& Class65.anIntArray1289[0] == 1)
						Class28.aClass4_Sub20_Sub12_Sub1Array635[3].method507(
								15 + i_23_, 4);
					else
						Class28.aClass4_Sub20_Sub12_Sub1Array635[1].method507(
								i_23_ - -15, 4);
					arg2.method577(Class53.aJagexString_1077, i_23_ - -32, 17,
							16777215, -1);
					if (Class4_Sub7.anIntArray1947[0] == 3
							&& (Class65.anIntArray1289[0] ^ 0xffffffff) == -1)
						Class28.aClass4_Sub20_Sub12_Sub1Array635[2].method507(
								i_22_, 4);
					else
						Class28.aClass4_Sub20_Sub12_Sub1Array635[0].method507(
								i_22_, 4);
					if ((Class4_Sub7.anIntArray1947[0] ^ 0xffffffff) == -4
							&& (Class65.anIntArray1289[0] ^ 0xffffffff) == -2)
						Class28.aClass4_Sub20_Sub12_Sub1Array635[3].method507(
								i_22_ + 15, 4);
					else
						Class28.aClass4_Sub20_Sub12_Sub1Array635[1].method507(
								15 + i_22_, 4);
					arg2.method577(Class59.aJagexString_1183, i_22_ + 32, 17,
							16777215, -1);
				}
				Class4_Sub20_Sub12.method488(708, 4, 50, 16, 0);
				arg1.method571(Class82.aJagexString_1713, 733, 16, 16777215, -1);
				Class64.anInt1277 = -1;
				if (JagexException.aClass4_Sub20_Sub12_Sub2Array1732 != null) {
					int i = 88;
					int i_24_ = 19;
					int i_25_ = 765 / (1 + i);
					int i_26_ = 480 / (i_24_ + 1);
					int i_27_;
					int i_28_;
					do {
						i_27_ = i_26_;
						i_28_ = i_25_;
						if (((-1 + i_25_) * i_26_ ^ 0xffffffff) <= (Class37.anInt760 ^ 0xffffffff))
							i_25_--;
						if ((Class37.anInt760 ^ 0xffffffff) >= ((i_26_ - 1)
								* i_25_ ^ 0xffffffff))
							i_26_--;
						if ((Class37.anInt760 ^ 0xffffffff) >= (i_25_
								* (-1 + i_26_) ^ 0xffffffff))
							i_26_--;
					} while (i_27_ != i_26_ || i_25_ != i_28_);
					i_28_ = (480 - i_24_ * i_26_) / (i_26_ - -1);
					if ((i_28_ ^ 0xffffffff) < -6)
						i_28_ = 5;
					i_27_ = (-(i_25_ * i) + 765) / (i_25_ + 1);
					if ((i_27_ ^ 0xffffffff) < -6)
						i_27_ = 5;
					int i_29_ = (-((-1 + i_25_) * i_27_) + (-(i_25_ * i) + 765)) / 2;
					int i_30_ = (-(i_24_ * i_26_) + 480 - (i_26_ - 1) * i_28_) / 2;
					int i_31_ = 23 - -i_30_;
					int i_32_ = i_29_;
					int i_33_ = 0;
					for (int i_34_ = 0; ((i_34_ ^ 0xffffffff) > (Class37.anInt760 ^ 0xffffffff)); i_34_++) {
						boolean bool = true;
						Class9 class9 = (Class4_Sub20_Sub7_Sub1_Sub1.aClass9Array3579[i_34_]);
						JagexString jagexString = Class74.method1168(-70,
								class9.anInt265);
						if ((class9.anInt265 ^ 0xffffffff) != 0) {
							if (class9.anInt265 > 1980) {
								bool = false;
								jagexString = RSCanvas.aJagexString_58;
							}
						} else {
							bool = false;
							jagexString = Class62.aJagexString_1238;
						}
						if ((Class37.anInt767 ^ 0xffffffff) > (i_32_ ^ 0xffffffff)
								|| i_31_ > Class4_Sub1.anInt1859
								|| (i_32_ - -i ^ 0xffffffff) >= (Class37.anInt767 ^ 0xffffffff)
								|| ((Class4_Sub1.anInt1859 ^ 0xffffffff) <= (i_24_
										+ i_31_ ^ 0xffffffff)) || !bool)
							JagexException.aClass4_Sub20_Sub12_Sub2Array1732[!class9.aBoolean267 ? 0
									: 1].method523(i_32_, i_31_);
						else {
							Class64.anInt1277 = i_34_;
							JagexException.aClass4_Sub20_Sub12_Sub2Array1732[!class9.aBoolean267 ? 0
									: 1].method530(i_32_, i_31_, 128, 16777215);
						}
						if (Class12.aClass4_Sub20_Sub12_Sub1Array359 != null)
							Class12.aClass4_Sub20_Sub12_Sub1Array359[class9.anInt271
									+ (!class9.aBoolean267 ? 0 : 8)].method507(
									29 + i_32_, i_31_);
						arg2.method571(
								Class74.method1168(-19, class9.anInt279),
								i_32_ + 15, i_24_ / 2 + (i_31_ - -5), 0, -1);
						arg1.method571(jagexString, i_32_ + 60, i_31_
								- -(i_24_ / 2) + 5, 268435455, -1);
						i_31_ += i_28_ - -i_24_;
						if ((++i_33_ ^ 0xffffffff) <= (i_26_ ^ 0xffffffff)) {
							i_33_ = 0;
							i_32_ += i_27_ + i;
							i_31_ = i_30_ + 23;
						}
					}
				}
				try {
					Graphics graphics = Class4_Sub20_Sub7_Sub5.runeCanvas
							.getGraphics();
					Class62.aClass13_1225.method687(graphics, 0, 0, true);
				} catch (Exception exception) {
					Class4_Sub20_Sub7_Sub5.runeCanvas.repaint();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.S("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method94(Component arg0, int arg1) {
		try {
			anInt2549++;
			arg0.removeKeyListener(Class4_Sub14.aClass18_2272);
			arg0.removeFocusListener(Class4_Sub14.aClass18_2272);
			if (arg1 != 4)
				aClass19_2579 = null;
			Class4_Sub20_Sub11.anInt3093 = -1;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.KA("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public boolean aBoolean2617;
	public Class16 aClass16_2553;
	public Class29 aClass29_2561;
	public Class4_Sub10[][] aClass4_Sub10ArrayArray2585;
	public Class4_Sub10[][] aClass4_Sub10ArrayArray2611;
	public Class4_Sub2_Sub4 aClass4_Sub2_Sub4_2619;
	public long aLong2618;
	public long aLong2621;
	public int anInt2571;
	public int anInt2610;
	public int anInt2620;
	public int anInt2622;
	public int[] anIntArray2552;
	public int[] anIntArray2567;
	public int[] anIntArray2573 = new int[16];
	public int[] anIntArray2576;
	public int[] anIntArray2583;
	public int[] anIntArray2586;
	public int[] anIntArray2588;
	public int[] anIntArray2589;
	public int[] anIntArray2599;
	public int[] anIntArray2603;

	public int[] anIntArray2604;

	public int[] anIntArray2607;

	public int[] anIntArray2608;

	public int[] anIntArray2613;

	public int[] anIntArray2616;

	public Class4_Sub2_Sub1() {
		anIntArray2552 = new int[16];
		anIntArray2583 = new int[16];
		anIntArray2588 = new int[16];
		anIntArray2589 = new int[16];
		anIntArray2567 = new int[16];
		anInt2571 = 1000000;
		anIntArray2603 = new int[16];
		anIntArray2586 = new int[16];
		aClass4_Sub10ArrayArray2585 = new Class4_Sub10[16][128];
		anIntArray2599 = new int[16];
		anIntArray2576 = new int[16];
		aClass4_Sub10ArrayArray2611 = new Class4_Sub10[16][128];
		anIntArray2608 = new int[16];
		anIntArray2613 = new int[16];
		anIntArray2616 = new int[16];
		anIntArray2607 = new int[16];
		anInt2610 = 256;
		anIntArray2604 = new int[16];
		aClass29_2561 = new Class29();
		aClass4_Sub2_Sub4_2619 = new Class4_Sub2_Sub4(this);
		try {
			aClass16_2553 = new Class16(128);
			method116((byte) 33);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"bf.<init>(" + ')');
		}
	}

	public void method101(byte arg0) {
		try {
			int i = anInt2622;
			anInt2563++;
			if (arg0 >= -109)
				method105(123, -119);
			int i_59_ = anInt2620;
			long l = aLong2618;
			while (anInt2620 == i_59_) {
				while ((i_59_ ^ 0xffffffff) == (aClass29_2561.anIntArray647[i] ^ 0xffffffff)) {
					aClass29_2561.method871(i);
					int i_60_ = aClass29_2561.method870(i);
					if ((i_60_ ^ 0xffffffff) == -2) {
						aClass29_2561.method856();
						aClass29_2561.method861(i);
						if (aClass29_2561.method858()) {
							if (aBoolean2617 && i_59_ != 0)
								aClass29_2561.method862(l);
							else {
								method116((byte) 33);
								aClass29_2561.method869();
								return;
							}
						}
						break;
					}
					if ((i_60_ & 0x80 ^ 0xffffffff) != -1)
						method87((byte) -111, i_60_);
					aClass29_2561.method860(i);
					aClass29_2561.method861(i);
				}
				i = aClass29_2561.method867();
				i_59_ = aClass29_2561.anIntArray647[i];
				l = aClass29_2561.method859(i_59_);
			}
			anInt2620 = i_59_;
			anInt2622 = i;
			aLong2618 = l;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "bf.NA("
					+ arg0 + ')');
		}
	}

	public void method102(byte arg0, int arg1, int arg2) {
		try {
			anInt2564++;
			anIntArray2588[arg1] = arg2;
			anIntArray2589[arg1] = Class59.method1035(arg2, -128);
			if (arg0 >= -75)
				anIntArray2616 = null;
			method86(arg2, 126, arg1);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.P("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public synchronized boolean method103(int arg0, Class81 arg1, boolean arg2,
			Class4_Sub18 arg3, Class19 arg4) {
		try {
			anInt2609++;
			arg3.method310();
			boolean bool = true;
			int[] is = null;
			if ((arg0 ^ 0xffffffff) < -1)
				is = new int[] { arg0 };
			if (arg2 != false)
				return true;
			for (Class4_Sub17 class4_sub17 = ((Class4_Sub17) arg3.aClass16_2336
					.method724((byte) -116)); class4_sub17 != null; class4_sub17 = ((Class4_Sub17) arg3.aClass16_2336
					.method723((byte) -25))) {
				int i = (int) class4_sub17.aLong150;
				Class4_Sub23 class4_sub23 = ((Class4_Sub23) aClass16_2553
						.method725((byte) 117, i));
				if (class4_sub23 == null) {
					class4_sub23 = RSInterface.method285(i, (byte) -86, arg4);
					if (class4_sub23 == null) {
						bool = false;
						continue;
					}
					aClass16_2553.method720(class4_sub23, i, false);
				}
				if (!class4_sub23.method632(class4_sub17.aByteArray2332, arg1,
						is, false))
					bool = false;
			}
			if (bool)
				arg3.method309();
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.OA("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ arg2 + ',' + (arg3 != null ? "{...}" : "null") + ','
					+ (arg4 != null ? "{...}" : "null") + ')'));
		}
	}

	public void method104(int arg0, int arg1) {
		for (Class4_Sub10 class4_sub10 = (Class4_Sub10) aClass4_Sub2_Sub4_2619.aClass65_2654
				.method1071(-124); class4_sub10 != null; class4_sub10 = (Class4_Sub10) aClass4_Sub2_Sub4_2619.aClass65_2654
				.method1075(arg1 ^ ~0x4664)) {
			if ((arg0 ^ 0xffffffff) > -1
					|| (class4_sub10.anInt2015 ^ 0xffffffff) == (arg0 ^ 0xffffffff)) {
				if (class4_sub10.aClass4_Sub2_Sub3_2028 != null) {
					class4_sub10.aClass4_Sub2_Sub3_2028
							.method164(Class67.anInt1354 / 100);
					if (class4_sub10.aClass4_Sub2_Sub3_2028.method158())
						aClass4_Sub2_Sub4_2619.aClass4_Sub2_Sub2_2659
								.method120(class4_sub10.aClass4_Sub2_Sub3_2028);
					class4_sub10.method204((byte) 74);
				}
				if ((class4_sub10.anInt2016 ^ 0xffffffff) > -1)
					aClass4_Sub10ArrayArray2611[class4_sub10.anInt2015][class4_sub10.anInt2039] = null;
				class4_sub10.method70(-315);
			}
		}
		anInt2584++;
		if (arg1 != -3666)
			method93((byte) -50, null, null);
	}

	public void method105(int arg0, int arg1) {
		if (arg1 <= 12)
			anIntArray2608 = null;
		anInt2587++;
		if ((anIntArray2573[arg0] & 0x4) != 0) {
			for (Class4_Sub10 class4_sub10 = ((Class4_Sub10) aClass4_Sub2_Sub4_2619.aClass65_2654
					.method1071(-124)); class4_sub10 != null; class4_sub10 = (Class4_Sub10) aClass4_Sub2_Sub4_2619.aClass65_2654
					.method1075(18485)) {
				if (arg0 == class4_sub10.anInt2015)
					class4_sub10.anInt2043 = 0;
			}
		}
	}

	public int method106(boolean arg0) {
		try {
			if (arg0 != true)
				aBoolean2617 = true;
			anInt2557++;
			return anInt2610;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "bf.G("
					+ arg0 + ')');
		}
	}

	public synchronized void method107(boolean arg0) {
		try {
			Class4_Sub23 class4_sub23 = (Class4_Sub23) aClass16_2553
					.method724((byte) 122);
			if (arg0 == false) {
				for (/**/; class4_sub23 != null; class4_sub23 = (Class4_Sub23) aClass16_2553
						.method723((byte) -25))
					class4_sub23.method634(0);
				anInt2601++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "bf.R("
					+ arg0 + ')');
		}
	}

	public boolean method108(Class4_Sub10 arg0, int arg1) {
		try {
			if (arg1 != 0)
				return false;
			anInt2591++;
			if (arg0.aClass4_Sub2_Sub3_2028 == null) {
				if (arg0.anInt2016 >= 0) {
					arg0.method70(-315);
					if (arg0.anInt2030 > 0
							&& (aClass4_Sub10ArrayArray2585[arg0.anInt2015][arg0.anInt2030]) == arg0)
						aClass4_Sub10ArrayArray2585[arg0.anInt2015][arg0.anInt2030] = null;
				}
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.MA("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public synchronized void method109(Class4_Sub18 arg0, int arg1, boolean arg2) {
		try {
			method110((byte) -34);
			aClass29_2561.method857(arg0.aByteArray2335);
			aBoolean2617 = arg2;
			anInt2554++;
			aLong2621 = 0L;
			int i = aClass29_2561.method866();
			if (arg1 <= 119)
				anIntArray2608 = null;
			for (int i_61_ = 0; (i_61_ ^ 0xffffffff) > (i ^ 0xffffffff); i_61_++) {
				aClass29_2561.method871(i_61_);
				aClass29_2561.method860(i_61_);
				aClass29_2561.method861(i_61_);
			}
			anInt2622 = aClass29_2561.method867();
			anInt2620 = aClass29_2561.anIntArray647[anInt2622];
			aLong2618 = aClass29_2561.method859(anInt2620);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.N("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	public synchronized void method110(byte arg0) {
		anInt2582++;
		aClass29_2561.method869();
		method116((byte) 33);
		if (arg0 > -1)
			method88(-20, (byte) 66, -61);
	}

	public void method111(boolean arg0, int arg1, int arg2) {
		try {
			anIntArray2613[arg1] = arg2;
			if (arg0 != true)
				method94(null, 59);
			anInt2577++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.HA("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public synchronized void method112(int arg0, int arg1) {
		try {
			if (arg1 != 98)
				anIntArray2588 = null;
			anInt2568++;
			anInt2610 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.DA("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method113(int arg0, byte arg1, int arg2, int arg3) {
		try {
			anInt2559++;
			method96(arg2, 64, arg0, (byte) 124);
			if ((anIntArray2573[arg0] & 0x2) != 0) {
				for (Class4_Sub10 class4_sub10 = (Class4_Sub10) aClass4_Sub2_Sub4_2619.aClass65_2654
						.method1078(0); class4_sub10 != null; class4_sub10 = (Class4_Sub10) aClass4_Sub2_Sub4_2619.aClass65_2654
						.method1067(false)) {
					if ((class4_sub10.anInt2015 ^ 0xffffffff) == (arg0 ^ 0xffffffff)
							&& class4_sub10.anInt2016 < 0) {
						aClass4_Sub10ArrayArray2611[arg0][(class4_sub10.anInt2039)] = null;
						aClass4_Sub10ArrayArray2611[arg0][arg2] = class4_sub10;
						int i = ((class4_sub10.anInt2037
								* class4_sub10.anInt2040 >> -1851611988) + class4_sub10.anInt2034);
						class4_sub10.anInt2040 = 4096;
						class4_sub10.anInt2034 += -class4_sub10.anInt2039
								+ arg2 << -582811448;
						class4_sub10.anInt2039 = arg2;
						class4_sub10.anInt2037 = -class4_sub10.anInt2034 + i;
						return;
					}
				}
			}
			Class4_Sub23 class4_sub23 = ((Class4_Sub23) aClass16_2553
					.method725((byte) 117, anIntArray2567[arg0]));
			if (class4_sub23 != null) {
				Class4_Sub4_Sub1 class4_sub4_sub1 = class4_sub23.aClass4_Sub4_Sub1Array2434[arg2];
				if (class4_sub4_sub1 != null) {
					Class4_Sub10 class4_sub10 = new Class4_Sub10();
					class4_sub10.aClass4_Sub4_Sub1_2031 = class4_sub4_sub1;
					class4_sub10.aClass4_Sub23_2035 = class4_sub23;
					class4_sub10.anInt2015 = arg0;
					class4_sub10.aClass57_2036 = class4_sub23.aClass57Array2427[arg2];
					class4_sub10.anInt2030 = class4_sub23.aByteArray2420[arg2];
					class4_sub10.anInt2039 = arg2;
					class4_sub10.anInt2018 = (arg3
							* arg3
							* (class4_sub23.anInt2431 * class4_sub23.aByteArray2410[arg2]) + 1024) >> 2031560107;
					class4_sub10.anInt2041 = class4_sub23.aByteArray2424[arg2] & 0xff;
					class4_sub10.anInt2034 = ((arg2 << 1077790152) - (class4_sub23.aShortArray2430[arg2] & 0x7fff));
					class4_sub10.anInt2042 = 0;
					if (arg1 != -99)
						aClass4_Sub10ArrayArray2585 = null;
					class4_sub10.anInt2016 = -1;
					class4_sub10.anInt2044 = 0;
					class4_sub10.anInt2029 = 0;
					class4_sub10.anInt2033 = 0;
					if (anIntArray2599[arg0] != 0) {
						class4_sub10.aClass4_Sub2_Sub3_2028 = (Class4_Sub2_Sub3
								.method139(class4_sub4_sub1,
										method97(class4_sub10, -123), 0,
										method115(class4_sub10, (byte) 44)));
						method114(class4_sub23.aShortArray2430[arg2] < 0,
								(byte) -126, class4_sub10);
					} else
						class4_sub10.aClass4_Sub2_Sub3_2028 = (Class4_Sub2_Sub3
								.method139(class4_sub4_sub1,
										method97(class4_sub10, -85),
										method117(class4_sub10, -4),
										method115(class4_sub10, (byte) 44)));
					if (class4_sub23.aShortArray2430[arg2] < 0)
						class4_sub10.aClass4_Sub2_Sub3_2028.method142(-1);
					if (class4_sub10.anInt2030 >= 0) {
						Class4_Sub10 class4_sub10_62_ = (aClass4_Sub10ArrayArray2585[arg0][class4_sub10.anInt2030]);
						if (class4_sub10_62_ != null
								&& ((class4_sub10_62_.anInt2016 ^ 0xffffffff) > -1)) {
							aClass4_Sub10ArrayArray2611[arg0][(class4_sub10_62_.anInt2039)] = null;
							class4_sub10_62_.anInt2016 = 0;
						}
						aClass4_Sub10ArrayArray2585[arg0][(class4_sub10.anInt2030)] = class4_sub10;
					}
					aClass4_Sub2_Sub4_2619.aClass65_2654.method1068(
							class4_sub10, (byte) -125);
					aClass4_Sub10ArrayArray2611[arg0][arg2] = class4_sub10;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.J("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public void method114(boolean arg0, byte arg1, Class4_Sub10 arg2) {
		try {
			anInt2597++;
			int i = arg2.aClass4_Sub4_Sub1_2031.aByteArray2661.length;
			int i_64_;
			if (arg0 && arg2.aClass4_Sub4_Sub1_2031.aBoolean2664) {
				int i_65_ = -arg2.aClass4_Sub4_Sub1_2031.anInt2663 + i + i;
				i <<= 8;
				i_64_ = (int) (((long) anIntArray2599[arg2.anInt2015] * (long) i_65_) >> 1475278278);
				if ((i_64_ ^ 0xffffffff) <= (i ^ 0xffffffff)) {
					arg2.aClass4_Sub2_Sub3_2028.method155(true);
					i_64_ = i - (-i + 1) + -i_64_;
				}
			} else
				i_64_ = (int) ((long) anIntArray2599[arg2.anInt2015] * (long) i >> -1518679482);
			arg2.aClass4_Sub2_Sub3_2028.method147(i_64_);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.L("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public int method115(Class4_Sub10 arg0, byte arg1) {
		try {
			anInt2575++;
			int i = anIntArray2607[arg0.anInt2015];
			if (arg1 != 44)
				method79();
			if (i >= 8192)
				return (-(32 + (-arg0.anInt2041 + 128) * (-i + 16384) >> -555447258) + 16384);
			return arg0.anInt2041 * i - -32 >> 318929574;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.W("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public void method116(byte arg0) {
		try {
			method104(-1, -3666);
			method89(-1, false);
			anInt2558++;
			for (int i = 0; i < 16; i++)
				anIntArray2567[i] = anIntArray2588[i];
			int i = 0;
			if (arg0 != 33)
				method88(-4, (byte) -46, -67);
			for (/**/; (i ^ 0xffffffff) > -17; i++)
				anIntArray2589[i] = Class59.method1035(anIntArray2588[i], -128);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "bf.E("
					+ arg0 + ')');
		}
	}

	public int method117(Class4_Sub10 arg0, int arg1) {
		try {
			anInt2556++;
			Class57 class57 = arg0.aClass57_2036;
			int i = ((anIntArray2616[arg0.anInt2015] * anIntArray2608[arg0.anInt2015])
					- -4096 >> -1929220947);
			i = i * i - -16384 >> -114291409;
			i = i * arg0.anInt2018 - -16384 >> -2120581649;
			i = anInt2610 * i + 128 >> -257063352;
			if (arg1 != -4)
				method119((byte) -102);
			if ((class57.anInt1149 ^ 0xffffffff) < -1)
				i = (int) (i
						* Math.pow(
								0.5,
								(class57.anInt1149 * (arg0.anInt2029 * 1.953125E-5))) + 0.5);
			if (class57.aByteArray1144 != null) {
				int i_66_ = class57.aByteArray1144[arg0.anInt2033 + 1];
				int i_67_ = arg0.anInt2044;
				if (arg0.anInt2033 < class57.aByteArray1144.length - 2) {
					int i_68_ = 0xff00 & (class57.aByteArray1144[arg0.anInt2033] << -523646104);
					int i_69_ = ((class57.aByteArray1144[2 + arg0.anInt2033] << -326086840) & 0xff00);
					i_66_ += ((i_67_ - i_68_)
							* (class57.aByteArray1144[3 + arg0.anInt2033] - i_66_) / (-i_68_ + i_69_));
				}
				i = i_66_ * i + 32 >> -58525370;
			}
			if ((arg0.anInt2016 ^ 0xffffffff) < -1
					&& class57.aByteArray1143 != null) {
				int i_70_ = arg0.anInt2016;
				int i_71_ = class57.aByteArray1143[arg0.anInt2042 + 1];
				if ((class57.aByteArray1143.length - 2 ^ 0xffffffff) < (arg0.anInt2042 ^ 0xffffffff)) {
					int i_72_ = ((class57.aByteArray1143[2 + arg0.anInt2042] & 0xff) << -1806354104);
					int i_73_ = ((0xff & class57.aByteArray1143[arg0.anInt2042]) << 1880771688);
					i_71_ += ((i_70_ + -i_73_)
							* (-i_71_ + class57.aByteArray1143[3 + arg0.anInt2042]) / (i_72_ + -i_73_));
				}
				i = 32 + i_71_ * i >> -1007843450;
			}
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.U("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public void method118(int arg0, int arg1, int arg2) {
		try {
			if (arg1 != 869414375)
				method85(-105, 24, -92);
			anInt2615++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.B("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public synchronized boolean method119(byte arg0) {
		try {
			if (arg0 != -25)
				anIntArray2616 = null;
			anInt2614++;
			return aClass29_2561.method865();
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "bf.GA("
					+ arg0 + ')');
		}
	}

	@Override
	public synchronized int method78() {
		try {
			anInt2578++;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"bf.QA(" + ')');
		}
	}

	@Override
	public synchronized Class4_Sub2 method79() {
		try {
			anInt2612++;
			return aClass4_Sub2_Sub4_2619;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"bf.BA(" + ')');
		}
	}

	@Override
	public synchronized void method80(int[] arg0, int arg1, int arg2) {
		try {
			anInt2555++;
			if (aClass29_2561.method865()) {
				int i = aClass29_2561.anInt645 * anInt2571 / Class67.anInt1354;
				do {
					long l = (long) arg2 * (long) i + aLong2621;
					if (aLong2618 - l >= 0L) {
						aLong2621 = l;
						break;
					}
					int i_35_ = (int) ((aLong2618 + (-aLong2621 - (-(long) i + 1L))) / i);
					arg2 -= i_35_;
					aLong2621 += (long) i * (long) i_35_;
					aClass4_Sub2_Sub4_2619.method80(arg0, arg1, i_35_);
					method101((byte) -126);
					arg1 += i_35_;
				} while (aClass29_2561.method865());
			}
			aClass4_Sub2_Sub4_2619.method80(arg0, arg1, arg2);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.Q("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	@Override
	public synchronized Class4_Sub2 method81() {
		try {
			anInt2592++;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"bf.TA(" + ')');
		}
	}

	@Override
	public synchronized void method82(int arg0) {
		try {
			anInt2569++;
			if (aClass29_2561.method865()) {
				int i = aClass29_2561.anInt645 * anInt2571 / Class67.anInt1354;
				do {
					long l = (long) i * (long) arg0 + aLong2621;
					if (aLong2618 + -l >= 0L) {
						aLong2621 = l;
						break;
					}
					int i_36_ = (int) ((aLong2618 - (aLong2621 - i) + -1L) / i);
					arg0 -= i_36_;
					aLong2621 += (long) i_36_ * (long) i;
					aClass4_Sub2_Sub4_2619.method82(i_36_);
					method101((byte) -118);
				} while (aClass29_2561.method865());
			}
			aClass4_Sub2_Sub4_2619.method82(arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "bf.T("
					+ arg0 + ')');
		}
	}

	public synchronized void method85(int arg0, int arg1, int arg2) {
		anInt2560++;
		method102((byte) -95, arg0, arg1);
		if (arg2 <= 124)
			anInt2620 = 28;
	}

	public void method86(int arg0, int arg1, int arg2) {
		try {
			if ((anIntArray2567[arg2] ^ 0xffffffff) != (arg0 ^ 0xffffffff)) {
				anIntArray2567[arg2] = arg0;
				for (int i = 0; (i ^ 0xffffffff) > -129; i++)
					aClass4_Sub10ArrayArray2585[arg2][i] = null;
			}
			if (arg1 < 119)
				aClass4_Sub2_Sub4_2619 = null;
			anInt2596++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.O("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public void method87(byte arg0, int arg1) {
		anInt2580++;
		int i = 0xf0 & arg1;
		if ((i ^ 0xffffffff) == -129) {
			int i_0_ = 0xf & arg1;
			int i_1_ = (arg1 & 0x7f8e) >> -1888043352;
			int i_2_ = 0x7f & arg1 >> 66866896;
			method96(i_1_, i_2_, i_0_, (byte) 111);
		} else if ((i ^ 0xffffffff) == -145) {
			int i_3_ = arg1 >> 86783216 & 0x7f;
			int i_4_ = 0xf & arg1;
			int i_5_ = arg1 >> -723955736 & 0x7f;
			if ((i_3_ ^ 0xffffffff) < -1)
				method113(i_4_, (byte) -99, i_5_, i_3_);
			else
				method96(i_5_, 64, i_4_, (byte) 113);
		} else if ((i ^ 0xffffffff) == -161) {
			int i_6_ = 0xf & arg1;
			int i_7_ = (arg1 & 0x7ff3) >> 369950408;
			int i_8_ = arg1 >> 2036033488 & 0x7f;
			method91(i_7_, i_6_, i_8_, (byte) -115);
		} else {
			if (i == 176) {
				int i_10_ = 0xf & arg1;
				int i_11_ = 0x7f & arg1 >> -213706616;
				int i_12_ = arg1 >> 1064096784 & 0x7f;
				if (i_11_ == 0)
					anIntArray2589[i_10_] = ((i_12_ << -2052963090) + Class59
							.method1035(-2080769, anIntArray2589[i_10_]));
				if (i_11_ == 32)
					anIntArray2589[i_10_] = (Class59.method1035(
							anIntArray2589[i_10_], -16257) - -(i_12_ << 508126887));
				if ((i_11_ ^ 0xffffffff) == -2)
					anIntArray2583[i_10_] = (Class59.method1035(-16257,
							anIntArray2583[i_10_]) + (i_12_ << 896400231));
				if (i_11_ == 33)
					anIntArray2583[i_10_] = (Class59.method1035(
							anIntArray2583[i_10_], -128) - -i_12_);
				if ((i_11_ ^ 0xffffffff) == -6)
					anIntArray2586[i_10_] = (Class59.method1035(
							anIntArray2586[i_10_], -16257) + (i_12_ << -1036637177));
				if ((i_11_ ^ 0xffffffff) == -38)
					anIntArray2586[i_10_] = (Class59.method1035(
							anIntArray2586[i_10_], -128) + i_12_);
				if ((i_11_ ^ 0xffffffff) == -8)
					anIntArray2616[i_10_] = ((i_12_ << 150856711) + Class59
							.method1035(-16257, anIntArray2616[i_10_]));
				if ((i_11_ ^ 0xffffffff) == -40)
					anIntArray2616[i_10_] = (Class59.method1035(-128,
							anIntArray2616[i_10_]) - -i_12_);
				if (i_11_ == 10)
					anIntArray2607[i_10_] = ((i_12_ << -424924921) + Class59
							.method1035(-16257, anIntArray2607[i_10_]));
				if (i_11_ == 42)
					anIntArray2607[i_10_] = (Class59.method1035(
							anIntArray2607[i_10_], -128) + i_12_);
				if (i_11_ == 11)
					anIntArray2608[i_10_] = (Class59.method1035(
							anIntArray2608[i_10_], -16257) - -(i_12_ << 682617447));
				if (i_11_ == 43)
					anIntArray2608[i_10_] = (Class59.method1035(-128,
							anIntArray2608[i_10_]) + i_12_);
				if (i_11_ == 64) {
					if (i_12_ >= 64)
						anIntArray2573[i_10_] = Class4_Sub20_Sub7_Sub1
								.method389(anIntArray2573[i_10_], 1);
					else
						anIntArray2573[i_10_] = Class59.method1035(
								anIntArray2573[i_10_], -2);
				}
				if (i_11_ == 65) {
					if (i_12_ < 64) {
						method98(i_10_, (byte) 109);
						anIntArray2573[i_10_] = Class59.method1035(
								anIntArray2573[i_10_], -3);
					} else
						anIntArray2573[i_10_] = Class4_Sub20_Sub7_Sub1
								.method389(anIntArray2573[i_10_], 2);
				}
				if (i_11_ == 99)
					anIntArray2552[i_10_] = (Class59.method1035(
							anIntArray2552[i_10_], 127) + (i_12_ << 2027446343));
				if (i_11_ == 98)
					anIntArray2552[i_10_] = (Class59.method1035(16256,
							anIntArray2552[i_10_]) + i_12_);
				if ((i_11_ ^ 0xffffffff) == -102)
					anIntArray2552[i_10_] = ((i_12_ << 134428487)
							+ Class59.method1035(anIntArray2552[i_10_], 127) + 16384);
				if (i_11_ == 100)
					anIntArray2552[i_10_] = (16384 - -Class59.method1035(16256,
							anIntArray2552[i_10_]) - -i_12_);
				if ((i_11_ ^ 0xffffffff) == -121)
					method104(i_10_, -3666);
				if (i_11_ == 121)
					method89(i_10_, false);
				if ((i_11_ ^ 0xffffffff) == -124)
					method90(-1, i_10_);
				if (i_11_ == 6) {
					int i_13_ = anIntArray2552[i_10_];
					if ((i_13_ ^ 0xffffffff) == -16385)
						anIntArray2576[i_10_] = ((i_12_ << -1736539417) + Class59
								.method1035(anIntArray2576[i_10_], -16257));
				}
				if ((i_11_ ^ 0xffffffff) == -39) {
					int i_14_ = anIntArray2552[i_10_];
					if (i_14_ == 16384)
						anIntArray2576[i_10_] = (Class59.method1035(-128,
								anIntArray2576[i_10_]) - -i_12_);
				}
				if ((i_11_ ^ 0xffffffff) == -17)
					anIntArray2599[i_10_] = (Class59.method1035(-16257,
							anIntArray2599[i_10_]) - -(i_12_ << -1268323545));
				if ((i_11_ ^ 0xffffffff) == -49)
					anIntArray2599[i_10_] = i_12_
							+ Class59.method1035(-128, anIntArray2599[i_10_]);
				if ((i_11_ ^ 0xffffffff) == -82) {
					if (i_12_ >= 64)
						anIntArray2573[i_10_] = Class4_Sub20_Sub7_Sub1
								.method389(anIntArray2573[i_10_], 4);
					else {
						method105(i_10_, 29);
						anIntArray2573[i_10_] = Class59.method1035(
								anIntArray2573[i_10_], -5);
					}
				}
				if ((i_11_ ^ 0xffffffff) == -18)
					method88(
							i_10_,
							(byte) -123,
							((~0x3f80 & anIntArray2603[i_10_]) - -(i_12_ << -1290459033)));
				if ((i_11_ ^ 0xffffffff) == -50)
					method88(i_10_, (byte) -69, (~0x7f & anIntArray2603[i_10_])
							+ i_12_);
			} else if ((i ^ 0xffffffff) == -193) {
				int i_15_ = arg1 & 0xf;
				int i_16_ = (0x7fc3 & arg1) >> 404884552;
				method86(i_16_ + anIntArray2589[i_15_], 126, i_15_);
			} else if (i == 208) {
				int i_17_ = 0x7f & arg1 >> -1871412696;
				int i_18_ = arg1 & 0xf;
				method118(i_17_, 869414375, i_18_);
			} else if ((i ^ 0xffffffff) == -225) {
				int i_19_ = 0xf & arg1;
				int i_20_ = (((0x7f010e & arg1) >> 1110248137) - -(0x7f & arg1 >> 967010536));
				method111(true, i_19_, i_20_);
			} else {
				i = arg1 & 0xff;
				if ((i ^ 0xffffffff) == -256)
					method116((byte) 33);
			}
		}
	}

	public void method88(int arg0, byte arg1, int arg2) {
		try {
			anIntArray2603[arg0] = arg2;
			anIntArray2604[arg0] = (int) (2097152.0 * Math.pow(2.0,
					arg2 * 5.4931640625E-4) + 0.5);
			anInt2605++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.EA("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public void method89(int arg0, boolean arg1) {
		try {
			anInt2551++;
			if (arg0 < 0) {
				for (arg0 = 0; (arg0 ^ 0xffffffff) > -17; arg0++)
					method89(arg0, false);
			} else {
				anIntArray2616[arg0] = 12800;
				anIntArray2607[arg0] = 8192;
				anIntArray2608[arg0] = 16383;
				anIntArray2613[arg0] = 8192;
				anIntArray2583[arg0] = 0;
				anIntArray2586[arg0] = 8192;
				method98(arg0, (byte) 10);
				method105(arg0, 90);
				anIntArray2573[arg0] = 0;
				anIntArray2552[arg0] = 32767;
				if (arg1 == false) {
					anIntArray2576[arg0] = 256;
					anIntArray2599[arg0] = 0;
					method88(arg0, (byte) -4, 8192);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.FA("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method90(int arg0, int arg1) {
		try {
			anInt2598++;
			if (arg0 == -1) {
				for (Class4_Sub10 class4_sub10 = (Class4_Sub10) aClass4_Sub2_Sub4_2619.aClass65_2654
						.method1071(-127); class4_sub10 != null; class4_sub10 = (Class4_Sub10) aClass4_Sub2_Sub4_2619.aClass65_2654
						.method1075(18485)) {
					if ((arg1 < 0 || arg1 == class4_sub10.anInt2015)
							&& (class4_sub10.anInt2016 ^ 0xffffffff) > -1) {
						aClass4_Sub10ArrayArray2611[class4_sub10.anInt2015][class4_sub10.anInt2039] = null;
						class4_sub10.anInt2016 = 0;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.CA("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method91(int arg0, int arg1, int arg2, byte arg3) {
		try {
			if (arg3 == -115)
				anInt2565++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.A("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public synchronized void method95(int arg0) {
		try {
			if (arg0 == 21022) {
				for (Class4_Sub23 class4_sub23 = (Class4_Sub23) aClass16_2553
						.method724((byte) -110); class4_sub23 != null; class4_sub23 = (Class4_Sub23) aClass16_2553
						.method723((byte) -25))
					class4_sub23.method70(-315);
				anInt2606++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "bf.IA("
					+ arg0 + ')');
		}
	}

	public void method96(int arg0, int arg1, int arg2, byte arg3) {
		try {
			if (arg3 <= 105)
				anIntArray2552 = null;
			anInt2562++;
			Class4_Sub10 class4_sub10 = aClass4_Sub10ArrayArray2611[arg2][arg0];
			if (class4_sub10 != null) {
				aClass4_Sub10ArrayArray2611[arg2][arg0] = null;
				if ((anIntArray2573[arg2] & 0x2) != 0) {
					for (Class4_Sub10 class4_sub10_37_ = (Class4_Sub10) aClass4_Sub2_Sub4_2619.aClass65_2654
							.method1071(-120); class4_sub10_37_ != null; class4_sub10_37_ = (Class4_Sub10) aClass4_Sub2_Sub4_2619.aClass65_2654
							.method1075(18485)) {
						if (((class4_sub10_37_.anInt2015 ^ 0xffffffff) == (class4_sub10.anInt2015 ^ 0xffffffff))
								&& (class4_sub10_37_.anInt2016 ^ 0xffffffff) > -1
								&& class4_sub10_37_ != class4_sub10) {
							class4_sub10.anInt2016 = 0;
							break;
						}
					}
				} else
					class4_sub10.anInt2016 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.I("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public int method97(Class4_Sub10 arg0, int arg1) {
		try {
			anInt2572++;
			if (arg1 > -65)
				anIntArray2576 = null;
			Class57 class57 = arg0.aClass57_2036;
			int i = (arg0.anInt2034 - -(arg0.anInt2037 * arg0.anInt2040 >> -817008564));
			i += (anIntArray2576[arg0.anInt2015] * (anIntArray2613[arg0.anInt2015] + -8192)) >> -363318292;
			if (class57.anInt1137 > 0
					&& (class57.anInt1125 > 0 || (anIntArray2583[arg0.anInt2015] ^ 0xffffffff) < -1)) {
				int i_38_ = class57.anInt1125 << -1961014750;
				int i_39_ = class57.anInt1123 << -1857288735;
				if ((arg0.anInt2026 ^ 0xffffffff) > (i_39_ ^ 0xffffffff))
					i_38_ = i_38_ * arg0.anInt2026 / i_39_;
				i_38_ += anIntArray2583[arg0.anInt2015] >> 869414375;
				double d = Math
						.sin((arg0.anInt2019 & 0x1ff) * 0.01227184630308513);
				i += (int) (d * i_38_);
			}
			int i_40_ = (int) (0.5 + ((256 * arg0.aClass4_Sub4_Sub1_2031.anInt2662)
					* Math.pow(2.0, 3.255208333333333E-4 * i) / Class67.anInt1354));
			if (i_40_ >= 1)
				return i_40_;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.C("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public void method98(int arg0, byte arg1) {
		try {
			if ((anIntArray2573[arg0] & 0x2 ^ 0xffffffff) != -1) {
				for (Class4_Sub10 class4_sub10 = (Class4_Sub10) aClass4_Sub2_Sub4_2619.aClass65_2654
						.method1071(-122); class4_sub10 != null; class4_sub10 = (Class4_Sub10) aClass4_Sub2_Sub4_2619.aClass65_2654
						.method1075(18485)) {
					if ((arg0 ^ 0xffffffff) == (class4_sub10.anInt2015 ^ 0xffffffff)
							&& (aClass4_Sub10ArrayArray2611[arg0][class4_sub10.anInt2039]) == null
							&& (class4_sub10.anInt2016 ^ 0xffffffff) > -1)
						class4_sub10.anInt2016 = 0;
				}
			}
			if (arg1 < 4)
				method85(8, -18, -58);
			anInt2566++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.LA("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public boolean method99(int arg0, Class4_Sub10 arg1, int[] arg2, byte arg3,
			int arg4) {
		try {
			arg1.anInt2017 = Class67.anInt1354 / 100;
			anInt2550++;
			if ((arg1.anInt2016 ^ 0xffffffff) <= -1
					&& (arg1.aClass4_Sub2_Sub3_2028 == null || arg1.aClass4_Sub2_Sub3_2028
							.method136())) {
				arg1.method204((byte) 74);
				arg1.method70(-315);
				if (arg1.anInt2030 > 0
						&& (aClass4_Sub10ArrayArray2585[arg1.anInt2015][arg1.anInt2030]) == arg1)
					aClass4_Sub10ArrayArray2585[arg1.anInt2015][arg1.anInt2030] = null;
				return true;
			}
			int i = arg1.anInt2040;
			if ((i ^ 0xffffffff) < -1) {
				i -= (int) (0.5 + 16.0 * Math
						.pow(2.0,
								((anIntArray2586[arg1.anInt2015]) * 4.921259842519685E-4)));
				if (i < 0)
					i = 0;
				arg1.anInt2040 = i;
			}
			arg1.aClass4_Sub2_Sub3_2028.method129(method97(arg1, -72));
			arg1.anInt2026++;
			boolean bool = false;
			Class57 class57 = arg1.aClass57_2036;
			arg1.anInt2019 += class57.anInt1137;
			double d = (((arg1.anInt2039 + -60 << 429257640) + (arg1.anInt2037
					* arg1.anInt2040 >> -162357812)) * 5.086263020833333E-6);
			if ((class57.anInt1149 ^ 0xffffffff) < -1) {
				if ((class57.anInt1140 ^ 0xffffffff) < -1)
					arg1.anInt2029 += (int) ((128.0 * Math.pow(2.0,
							class57.anInt1140 * d)) + 0.5);
				else
					arg1.anInt2029 += 128;
			}
			if (class57.aByteArray1144 != null) {
				if ((class57.anInt1148 ^ 0xffffffff) >= -1)
					arg1.anInt2044 += 128;
				else
					arg1.anInt2044 += (int) (0.5 + (128.0 * Math.pow(2.0, d
							* (class57.anInt1148))));
				for (/**/; (((arg1.anInt2033 ^ 0xffffffff) > (class57.aByteArray1144.length - 2 ^ 0xffffffff)) && ((arg1.anInt2044 ^ 0xffffffff) < ((class57.aByteArray1144[2 + arg1.anInt2033] & 0xff) << -1734896504 ^ 0xffffffff))); arg1.anInt2033 += 2) {
					/* empty */
				}
				if (((arg1.anInt2033 ^ 0xffffffff) == (-2
						+ class57.aByteArray1144.length ^ 0xffffffff))
						&& class57.aByteArray1144[arg1.anInt2033 + 1] == 0)
					bool = true;
			}
			if (arg1.anInt2016 >= 0
					&& class57.aByteArray1143 != null
					&& (0x1 & anIntArray2573[arg1.anInt2015]) == 0
					&& (arg1.anInt2030 < 0 || (aClass4_Sub10ArrayArray2585[arg1.anInt2015][arg1.anInt2030]) != arg1)) {
				if (class57.anInt1129 <= 0)
					arg1.anInt2016 += 128;
				else
					arg1.anInt2016 += (int) ((Math.pow(2.0, class57.anInt1129
							* d) * 128.0) + 0.5);
				for (/**/; (((arg1.anInt2042 ^ 0xffffffff) > (class57.aByteArray1143.length
						+ -2 ^ 0xffffffff)) && ((arg1.anInt2016 ^ 0xffffffff) < ((class57.aByteArray1143[2 + arg1.anInt2042] & 0xff) << 1371745896 ^ 0xffffffff))); arg1.anInt2042 += 2) {
					/* empty */
				}
				if (class57.aByteArray1143.length + -2 == arg1.anInt2042)
					bool = true;
			}
			if (bool) {
				arg1.aClass4_Sub2_Sub3_2028.method164(arg1.anInt2017);
				if (arg2 == null)
					arg1.aClass4_Sub2_Sub3_2028.method82(arg4);
				else
					arg1.aClass4_Sub2_Sub3_2028.method80(arg2, arg0, arg4);
				if (arg1.aClass4_Sub2_Sub3_2028.method158())
					aClass4_Sub2_Sub4_2619.aClass4_Sub2_Sub2_2659
							.method120(arg1.aClass4_Sub2_Sub3_2028);
				arg1.method204((byte) 74);
				if (arg1.anInt2016 >= 0) {
					arg1.method70(-315);
					if (arg1.anInt2030 > 0
							&& arg1 == (aClass4_Sub10ArrayArray2585[arg1.anInt2015][arg1.anInt2030]))
						aClass4_Sub10ArrayArray2585[arg1.anInt2015][arg1.anInt2030] = null;
				}
				return true;
			}
			arg1.aClass4_Sub2_Sub3_2028.method157(arg1.anInt2017,
					method117(arg1, -4), method115(arg1, (byte) 44));
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bf.V("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
					+ arg4 + ')'));
		}
	}
}
