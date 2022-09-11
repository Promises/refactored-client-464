package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

import java.awt.Graphics;

public class Class72 {
    public static boolean[] aBooleanArray1487;
    public static JagexString aJagexString_1485;
    public static JagexString aJagexString_1489;
    public static JagexString aJagexString_1490 = (JagexString.getRs2PreparedString(
            "Press (Wrecover a locked account(W on front page)3"));
    public static JagexString aJagexString_1491 = JagexString.getRs2PreparedString(
            "Unerwartete Antwort vom Anmelde)2Server");
    public static JagexString aJagexString_1493;
    public static int anInt1482;
    public static int anInt1483;
    public static int anInt1484;
    public static int anInt1486;
    public static int anInt1488;
    public static int anInt1492;
    public static int anInt1494;

    static {
        aJagexString_1485 = aJagexString_1490;
        aJagexString_1493 = JagexString.getRs2PreparedString(
                "Your account has been disabled)3");
        aJagexString_1489 = aJagexString_1493;
        anInt1494 = 0;
    }

    public static void method1159() {
        if (Class4_Sub14.aClass18_2272 != null) {
            synchronized (Class4_Sub14.aClass18_2272) {
                Class4_Sub14.aClass18_2272 = null;
            }
        }
    }

    public static synchronized byte[] method1160(int arg0, int arg1) {
        try {
            anInt1484++;
            if ((arg1 ^ 0xffffffff) == -101 && Class64.anInt1282 > 0) {
                byte[] is = Class76.aByteArrayArray1578[--Class64.anInt1282];
                Class76.aByteArrayArray1578[Class64.anInt1282] = null;
                return is;
            }
            if ((arg1 ^ 0xffffffff) == -5001
                    && (Class46.anInt936 ^ 0xffffffff) < -1) {
                byte[] is = Class8.aByteArrayArray254[--Class46.anInt936];
                Class8.aByteArrayArray254[Class46.anInt936] = null;
                return is;
            }
            if (arg0 != -1)
                return null;
            if (arg1 == 30000 && (Class6.anInt202 ^ 0xffffffff) < -1) {
                byte[] is = Class4_Sub20_Sub7.aByteArrayArray2935[--Class6.anInt202];
                Class4_Sub20_Sub7.aByteArrayArray2935[Class6.anInt202] = null;
                return is;
            }
            return new byte[arg1];
        } catch (RuntimeException runtimeexception) {
            throw JagexException.create(runtimeexception, ("ua.E("
                    + arg0 + ',' + arg1 + ')'));
        }
    }

    public static boolean method1161(int arg0, int arg1) {
        try {
            if (arg0 != 1)
                anInt1494 = -29;
            anInt1482++;
            if ((arg1 >> -1669127811 & 0x1 ^ 0xffffffff) == -1)
                return false;
            return true;
        } catch (RuntimeException runtimeexception) {
            throw JagexException.create(runtimeexception, ("ua.C("
                    + arg0 + ',' + arg1 + ')'));
        }
    }

    public static void method1162(boolean arg0) {
        aJagexString_1485 = null;
        aJagexString_1490 = null;
        aJagexString_1493 = null;
        aJagexString_1491 = null;
        aBooleanArray1487 = null;
        aJagexString_1489 = null;
        if (arg0 != true)
            aJagexString_1490 = null;
    }

    public static void method1163(Class4_Sub20_Sub12_Sub4_Sub1 arg0, int arg1,
                                  Class4_Sub20_Sub12_Sub4_Sub1 arg2) {

        try {
            anInt1483++;
            if (Class49.aBoolean990)
                Class4_Sub2_Sub1.method93((byte) -95, arg2, arg0);
            else {
                if ((Class54.anInt1109 ^ 0xffffffff) == -1
                        || (Class54.anInt1109 ^ 0xffffffff) == -6) {
                    int i = 20;
                    int i_0_ = 253 - i;
                    arg0.method571(RSFont.aJagexString_166, 382, -i + 245,
                            16777215, -1);
                    Class4_Sub20_Sub12.method502(230, i_0_, 304, 34, 9179409);
                    Class4_Sub20_Sub12.method502(231, 1 + i_0_, 302, 32, 0);
                    Class4_Sub20_Sub12.method488(232, i_0_ + 2,
                            Region.anInt135 * 3, 30, 9179409);
                    Class4_Sub20_Sub12.method488(232 + Region.anInt135 * 3,
                            2 + i_0_, -(Region.anInt135 * 3) + 300, 30, 0);
                    arg0.method571(StringUtilities.aJagexString_1762, 382, -i + 276,
                            16777215, -1);
                }
                if ((Class54.anInt1109 ^ 0xffffffff) == -21) {
                    int i = 211;
                    Class24.aClass4_Sub20_Sub12_Sub1_549
                            .method507(
                                    (-(Class24.aClass4_Sub20_Sub12_Sub1_549.anInt3511 / 2) + 382),
                                    (-(Class24.aClass4_Sub20_Sub12_Sub1_549.anInt3514 / 2) + 271));
                    arg0.method571(StringUtilities.aJagexString_1771, 382, i, 16776960, 0);
                    i += 15;
                    arg0.method571(StringUtilities.aJagexString_1766, 382, i, 16776960, 0);
                    i += 15;
                    arg0.method571(StringUtilities.aJagexString_1769, 382, i, 16776960, 0);
                    i += 15;
                    i += 10;
                    arg0.method577(
                            (Class4_Sub24.method639(
                                    (new JagexString[]{
                                            Class4_Sub8.aJagexString_1977,
                                            (Class4_Sub20_Sub12_Sub4
                                                    .method574(StringUtilities.aJagexString_1768))}),
                                    -842)), 272, i, 16777215, 0);
                    i += 15;
                    arg0.method577((Class4_Sub24.method639((new JagexString[]{
                                    Class4_Sub20_Sub9.aJagexString_3042,
                                    StringUtilities.aJagexString_1764.method809(-126)}), -842)),
                            274, i, 16777215, 0);
                    i += 15;
                }
                if ((Class54.anInt1109 ^ 0xffffffff) == -11) {
                    Class24.aClass4_Sub20_Sub12_Sub1_549.method507(202, 171);
                    if (Class4_Sub20_Sub14.anInt3140 == 0) {
                        int i = 251;
                        arg0.method571(StringUtilities.aJagexString_3069, 382,
                                i, 16776960, 0);
                        i += 30;
                        int i_1_ = 302;
                        int i_2_ = 291;
                        Actor.aClass4_Sub20_Sub12_Sub1_3260
                                .method507(-73 + i_1_, i_2_ - 20);
                        arg0.method566(Class63.aJagexString_1242, i_1_ + -73, -20
                                + i_2_, 144, 40, 16777215, 0, 1, 1, 0);
                        i_1_ = 462;
                        Actor.aClass4_Sub20_Sub12_Sub1_3260
                                .method507(-73 + i_1_, i_2_ + -20);
                        arg0.method566(StringUtilities.aJagexString_1463, i_1_ + -73, i_2_
                                + -20, 144, 40, 16777215, 0, 1, 1, 0);
                    } else if (Class4_Sub20_Sub14.anInt3140 == 2) {
                        int i = 211;
                        arg0.method571(StringUtilities.aJagexString_1771, 382, i, 16776960,
                                0);
                        int i_3_ = 302;
                        i += 15;
                        int i_4_ = 321;
                        arg0.method571(StringUtilities.aJagexString_1766, 382, i, 16776960,
                                0);
                        i += 15;
                        arg0.method571(StringUtilities.aJagexString_1769, 382, i, 16776960,
                                0);
                        i += 15;
                        i += 10;
                        arg0.method577(
                                (Class4_Sub24.method639(
                                        (new JagexString[]{
                                                Class4_Sub8.aJagexString_1977,
                                                Class4_Sub20_Sub12_Sub4
                                                        .method574(StringUtilities.aJagexString_1768),
                                                (((Region.pulseCycle % 40 ^ 0xffffffff) > -21 & (Player.anInt3581 ^ 0xffffffff) == -1) ? Class59.aJagexString_1187
                                                        : StringUtilities.aJagexString_1767)}),
                                        -842)), 272, i, 16777215, 0);
                        i += 15;
                        arg0.method577(
                                (Class4_Sub24.method639(
                                        (new JagexString[]{
                                                Class4_Sub20_Sub9.aJagexString_3042,
                                                StringUtilities.aJagexString_1764
                                                        .method809(-127),
                                                (!(Region.pulseCycle % 40 < 20 & ((Player.anInt3581) ^ 0xffffffff) == -2) ? StringUtilities.aJagexString_1767
                                                        : Class59.aJagexString_1187)}),
                                        -842)), 274, i, 16777215, 0);
                        Actor.aClass4_Sub20_Sub12_Sub1_3260
                                .method507(i_3_ - 73, -20 + i_4_);
                        arg0.method571(Class68.aJagexString_1368, i_3_, 5 + i_4_,
                                16777215, 0);
                        i_3_ = 462;
                        Actor.aClass4_Sub20_Sub12_Sub1_3260
                                .method507(i_3_ - 73, -20 + i_4_);
                        i += 15;
                        arg0.method571(Class82.aJagexString_1713, i_3_, i_4_ - -5,
                                16777215, 0);
                    } else if (Class4_Sub20_Sub14.anInt3140 == 3) {
                        int i = 382;
                        arg0.method571(StringUtilities.aJagexString_675, 382, 211,
                                16776960, 0);
                        int i_5_ = 236;
                        arg0.method571(Class4_Sub20_Sub7_Sub4.aJagexString_3369,
                                382, i_5_, 16777215, 0);
                        i_5_ += 15;
                        int i_6_ = 321;
                        arg0.method571(StringUtilities.aJagexString_1869, 382, i_5_,
                                16777215, 0);
                        i_5_ += 15;
                        arg0.method571(Class52.aJagexString_1054, 382, i_5_,
                                16777215, 0);
                        i_5_ += 15;
                        arg0.method571(StringUtilities.aJagexString_2325, 382, i_5_,
                                16777215, 0);
                        Actor.aClass4_Sub20_Sub12_Sub1_3260
                                .method507(-73 + i, -20 + i_6_);
                        arg0.method571(Class82.aJagexString_1713, i, i_6_ - -5,
                                16777215, 0);
                        i_5_ += 15;
                    }
                }
                if ((Class4_Sub7.anInt1944 ^ 0xffffffff) != -2) {
                    if ((Game.anInt1833 ^ 0xffffffff) < -1) {

                        RSInterface.method281(Game.anInt1833, (byte) -5);

                        Game.anInt1833 = 0;
                    }

                    Class7.method655(false);
                }
                GameShell.aClass4_Sub20_Sub12_Sub1Array43[Class34.aBoolean1765 ? 1
                        : 0].method507(725, 463);
                if ((Class54.anInt1109 ^ 0xffffffff) < -6
                        && Class25.anInt583 != 2 && Class19_Sub1.anInt2536 == 0) {
                    if (Actor.aClass4_Sub20_Sub12_Sub1_3288 != null) {
                        int i = 100;
                        int i_7_ = 35;
                        int i_8_ = 5;
                        int i_9_ = 463;
                        Actor.aClass4_Sub20_Sub12_Sub1_3288
                                .method507(i_8_, i_9_);
                        arg0.method571((Class4_Sub24.method639(
                                (new JagexString[]{
                                        Class4_Sub20_Sub7_Sub4.aJagexString_3376,
                                        Class4_Sub22.aJagexString_2403,
                                        Class74.method1168(-12,
                                                Class61.anInt1201)}), -842)),
                                i / 2 + i_8_, i_9_ + (i_7_ / 2 - 2), 16777215,
                                0);
                        if (Buffer.aClass64_2096 == null)
                            arg2.method571(StringUtilities.aJagexString_2899,
                                    i_8_ - -(i / 2), 12 + (i_9_ + i_7_ / 2),
                                    16777215, 0);
                        else
                            arg2.method571(StringUtilities.aJagexString_3074,
                                    i_8_ + i / 2, i_7_ / 2 + i_9_ + 12,
                                    16777215, 0);
                    } else
                        Actor.aClass4_Sub20_Sub12_Sub1_3288 = Class2
                                .method44(24094, StringUtilities.aJagexString_1767,
                                        Class63.aJagexString_1250,
                                        Game.aClass19_Sub1_1849);
                }
                try {
                    if (arg1 < 113)
                        method1162(true);
                    Graphics graphics = Class4_Sub20_Sub7_Sub5.runeCanvas
                            .getGraphics();
                    Class62.aClass13_1225.method687(graphics, 0, 0, true);
                } catch (Exception exception) {
                    Class4_Sub20_Sub7_Sub5.runeCanvas.repaint();
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw JagexException.create(runtimeexception, ("ua.B("
                    + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
                    + (arg2 != null ? "{...}" : "null") + ')'));
        }
    }
}
