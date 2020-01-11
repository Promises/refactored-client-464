package com.jagex.runescape;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.net.Socket;

public class Class13_Sub2 extends Class13 implements ImageProducer,
        ImageObserver {
    public static JagexString aJagexString_2469 = JagexString.getRs2PreparedString("me"
    );
    public static JagexString aJagexString_2474;
    public static JagexString aJagexString_2475;
    public static JagexString aJagexString_2477;
    public static JagexString aJagexString_2479;
    public static JagexString aJagexString_2481;
    public static Class4_Sub8[] aClass4_Sub8Array2482;
    public static Class66 aClass66_2468;
    public static int anInt2454;
    public static int anInt2455;
    public static int anInt2456;
    public static int anInt2457;
    public static int anInt2458;
    public static int anInt2459;
    public static int anInt2460;
    public static int anInt2461;
    public static int anInt2462;
    public static int anInt2463;
    public static int anInt2464;
    public static int anInt2465;
    public static int anInt2466;
    public static int anInt2467;
    public static int anInt2470 = 0;
    public static int anInt2471;
    public static int anInt2472;
    public static int[] anIntArray2480;
    public static short[][] aShortArrayArray2476;

    static {
        aClass66_2468 = new Class66(64);
        RSApplet.mouseX = -1;
        aJagexString_2481 = JagexString.getRs2PreparedString("flash1:");
        aJagexString_2477 = JagexString.getRs2PreparedString(
                "Bitte laden Sie die Seite neu)3");
        aJagexString_2479 = aJagexString_2481;
        aJagexString_2474 = aJagexString_2481;
        aJagexString_2475 = JagexString.getRs2PreparedString("Update)2Liste geladen)3"
        );
    }

    public static void method690(Component arg0, int arg1) {
        try {
//			arg0.removeMouseListener(com.jagex.runescape.RSApplet);
            anInt2466++;
//			arg0.removeMouseMotionListener(com.jagex.runescape.RSApplet);
            arg0.removeFocusListener(RSApplet.appletListener);
            RSApplet.mouseButtonPressed = arg1;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("i.C("
                    + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
        }
    }

    public static void method692(int arg0) {
        RSApplet.idleTime = arg0;
    }

    public static void method693(byte arg0) {
        if (arg0 != -95)
            method693((byte) 79);
        anInt2461++;
        try {
            if ((RSFont.anInt148 ^ 0xffffffff) == -1) {
                if (Class4_Sub20_Sub17.aClass76_3189 != null) {
                    Class4_Sub20_Sub17.aClass76_3189.method1181(-31709);
                    Class4_Sub20_Sub17.aClass76_3189 = null;
                }
                Class4_Sub20_Sub7_Sub5.anInt3419 = 0;
                Region.aBoolean129 = false;
                Class19_Sub1.aClass22_2517 = null;
                RSFont.anInt148 = 1;
            }
            if (RSFont.anInt148 == 1) {
                if (Class19_Sub1.aClass22_2517 == null)
                    Class19_Sub1.aClass22_2517 = Class43.aClass75_872
                            .method1176((byte) 111,
                                    (Class4_Sub20_Sub6.aString2900),
                                    Class64.anInt1253);
                if ((Class19_Sub1.aClass22_2517.anInt545 ^ 0xffffffff) == -3)
                    throw new IOException();
                if (Class19_Sub1.aClass22_2517.anInt545 == 1) {
                    Class4_Sub20_Sub17.aClass76_3189 = new Class76(
                            ((Socket) Class19_Sub1.aClass22_2517.anObject543),
                            Class43.aClass75_872);
                    Class19_Sub1.aClass22_2517 = null;
                    RSFont.anInt148 = 2;
                }
            }
            if (RSFont.anInt148 == 2) {
                long l = (Class25.aLong584 = Class34.aJagexString_1768
                        .method806((byte) -30));
                int i = (int) (l >> 321638480 & 0x1fL);
                Class66.aClass4_Sub11_Sub1_1328.pointion = 0;
                Class66.aClass4_Sub11_Sub1_1328.method227((byte) -27, 14);
                Class66.aClass4_Sub11_Sub1_1328.method227((byte) -27, i);
                Class4_Sub20_Sub17.aClass76_3189.method1183(2, 0, arg0 ^ ~0x24,
                        Class66.aClass4_Sub11_Sub1_1328.byteBuffer);
                Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointion = 0;
                RSFont.anInt148 = 3;
            }
            if (RSFont.anInt148 == 3) {
                if (JagexException.aClass43_1728 != null)
                    JagexException.aClass43_1728.method949(false);
                if (Class4_Sub20_Sub6.aClass43_2932 != null)
                    Class4_Sub20_Sub6.aClass43_2932.method949(false);
                int i = Class4_Sub20_Sub17.aClass76_3189.method1184(-128);
                if (JagexException.aClass43_1728 != null)
                    JagexException.aClass43_1728.method949(false);
                if (Class4_Sub20_Sub6.aClass43_2932 != null)
                    Class4_Sub20_Sub6.aClass43_2932.method949(false);
                if (i != 0) {
                    Class9.method665(arg0 + -27, i);
                    return;
                }
                RSFont.anInt148 = 4;
                Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointion = 0;
            }
            if (RSFont.anInt148 == 4) {
                if ((Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointion ^ 0xffffffff) > -9) {
                    int i = Class4_Sub20_Sub17.aClass76_3189.method1189(true);
                    if (8 + -(Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointion) < i)
                        i = 8 + -(Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointion);
                    if ((i ^ 0xffffffff) < -1) {
                        Class4_Sub20_Sub17.aClass76_3189
                                .method1186(
                                        (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.byteBuffer),
                                        arg0 + 193,
                                        (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointion),
                                        i);
                        Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointion += i;
                    }
                }
                if (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointion == 8) {
                    Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointion = 0;
                    Class19.aLong524 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readLong((byte) 33);
                    RSFont.anInt148 = 5;
                }
            }
            if ((RSFont.anInt148 ^ 0xffffffff) == -6) {
                Class66.aClass4_Sub11_Sub1_1328.pointion = 0;
                int[] is = new int[4];
                is[0] = (int) (Math.random() * 9.9999999E7);
                is[2] = (int) (Class19.aLong524 >> -63538976);
                is[3] = (int) Class19.aLong524;
                is[1] = (int) (Math.random() * 9.9999999E7);
                Class66.aClass4_Sub11_Sub1_1328.method227((byte) -27, 10);
                Class66.aClass4_Sub11_Sub1_1328.method236(arg0 + 276, is[0]);
                Class66.aClass4_Sub11_Sub1_1328.method236(181, is[1]);
                Class66.aClass4_Sub11_Sub1_1328.method236(arg0 + 276, is[2]);
                Class66.aClass4_Sub11_Sub1_1328.method236(arg0 ^ ~0xeb, is[3]);
                Class66.aClass4_Sub11_Sub1_1328.method236(181,
                        Class43.aClass75_872.anInt1542);
                Class66.aClass4_Sub11_Sub1_1328.method255(189354448,
                        Class34.aJagexString_1768.method806((byte) -123));
                Class66.aClass4_Sub11_Sub1_1328.method259(
                        Class34.aJagexString_1764, 18601);
                Class66.aClass4_Sub11_Sub1_1328.method233(
                        (Class12.aBigInteger350), (Class49.aBigInteger994),
                        arg0 ^ 0x63d6);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.pointion = 0;
                if (Class54.anInt1109 == 40)
                    Class4_Sub1.aClass4_Sub11_Sub1_1854.method227((byte) -27,
                            18);
                else
                    Class4_Sub1.aClass4_Sub11_Sub1_1854.method227((byte) -27,
                            16);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method227((byte) -27,
                        Class66.aClass4_Sub11_Sub1_1328.pointion + 69);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method236(arg0 + 276, 464);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method227((byte) -27,
                        !Class59.aBoolean1189 ? 0 : 1);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method236(arg0 ^ ~0xeb,
                        Class73.aClass19_Sub1_1504.anInt492);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method236(arg0 ^ ~0xeb,
                        Class4_Sub1.aClass19_Sub1_1861.anInt492);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method236(arg0 ^ ~0xeb,
                        Class4_Sub1.aClass19_Sub1_1863.anInt492);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method236(181,
                        Class4_Sub17.aClass19_Sub1_2321.anInt492);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method236(181,
                        Class66.aClass19_Sub1_1336.anInt492);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method236(181,
                        Class4_Sub20_Sub6.aClass19_Sub1_2911.anInt492);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method236(arg0 ^ ~0xeb,
                        Class54.aClass19_Sub1_1107.anInt492);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method236(181,
                        Class4_Sub24.aClass19_Sub1_2451.anInt492);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method236(181,
                        Client.aClass19_Sub1_1849.anInt492);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method236(181,
                        Class18.aClass19_Sub1_482.anInt492);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method236(arg0 + 276,
                        Class77.aClass19_Sub1_1589.anInt492);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method236(181,
                        Class24.aClass19_Sub1_562.anInt492);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method236(181,
                        Class4_Sub20_Sub14.aClass19_Sub1_3146.anInt492);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method236(181,
                        Class4_Sub20_Sub6.aClass19_Sub1_2921.anInt492);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method236(181,
                        Class4_Sub17.aClass19_Sub1_2327.anInt492);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method236(arg0 + 276,
                        Class42.aClass19_Sub1_856.anInt492);
                Class4_Sub1.aClass4_Sub11_Sub1_1854.method232(
                        Class66.aClass4_Sub11_Sub1_1328.byteBuffer, 0,
                        (byte) -104, Class66.aClass4_Sub11_Sub1_1328.pointion);
                Class4_Sub20_Sub17.aClass76_3189.method1183(
                        Class4_Sub1.aClass4_Sub11_Sub1_1854.pointion, 0, 125,
                        Class4_Sub1.aClass4_Sub11_Sub1_1854.byteBuffer);
                Class66.aClass4_Sub11_Sub1_1328.method273(is, (byte) -104);
                for (int i = 0; i < 4; i++)
                    is[i] += 50;
                Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method273(is,
                        (byte) -104);
                RSFont.anInt148 = 6;
            }
            if ((RSFont.anInt148 ^ 0xffffffff) == -7
                    && Class4_Sub20_Sub17.aClass76_3189.method1189(true) > 0) {
                int i = Class4_Sub20_Sub17.aClass76_3189.method1184(arg0
                        ^ ~0x4d);
                if (i != 21 || (Class54.anInt1109 ^ 0xffffffff) != -21) {
                    if (i == 2)
                        RSFont.anInt148 = 9;
                    else {
                        if ((i ^ 0xffffffff) == -16 && Class54.anInt1109 == 40) {
                            Class57.method1022((byte) -96);
                            return;
                        }
                        if (i != 23 || Class59.anInt1186 >= 1) {
                            Class9.method665(-124, i);
                            return;
                        }
                        RSFont.anInt148 = 0;
                        Class59.anInt1186++;
                    }
                } else
                    RSFont.anInt148 = 7;
            }
            if (RSFont.anInt148 == 7
                    && (Class4_Sub20_Sub17.aClass76_3189.method1189(true) ^ 0xffffffff) < -1) {
                Class4_Sub2_Sub1.anInt2590 = 60 * (Class4_Sub20_Sub17.aClass76_3189
                        .method1184(-125) - -3);
                RSFont.anInt148 = 8;
            }
            if ((RSFont.anInt148 ^ 0xffffffff) == -9) {
                Class4_Sub20_Sub7_Sub5.anInt3419 = 0;
                Class4_Sub20_Sub9
                        .method477(
                                RSFont.aJagexString_163,
                                106,
                                Class4_Sub16.aJagexString_2317,
                                (Class4_Sub24.method639(
                                        (new JagexString[]{
                                                Class74.method1168(
                                                        -21,
                                                        Class4_Sub2_Sub1.anInt2590 / 60),
                                                Class53.aJagexString_1076}), -842)));
                if (--Class4_Sub2_Sub1.anInt2590 <= 0)
                    RSFont.anInt148 = 0;
            } else {
                if (RSFont.anInt148 == 9
                        && (Class4_Sub20_Sub17.aClass76_3189.method1189(true) >= 8)) {
                    Class14.anInt410 = Class4_Sub20_Sub17.aClass76_3189
                            .method1184(109);
                    Class54.aBoolean1103 = (Class4_Sub20_Sub17.aClass76_3189
                            .method1184(41) ^ 0xffffffff) == -2;
                    Region.anInt127 = Class4_Sub20_Sub17.aClass76_3189
                            .method1184(-115);
                    Region.anInt127 <<= 8;
                    Region.anInt127 += Class4_Sub20_Sub17.aClass76_3189
                            .method1184(-127);
                    RSFont.anInt162 = Class4_Sub20_Sub17.aClass76_3189
                            .method1184(-126);
                    Class4_Sub20_Sub17.aClass76_3189
                            .method1186(
                                    (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.byteBuffer),
                                    arg0 ^ ~0x35, 0, 1);
                    Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointion = 0;
                    Class4_Sub20_Sub11.anInt3092 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method265(true);
                    Class4_Sub20_Sub17.aClass76_3189
                            .method1186(
                                    (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.byteBuffer),
                                    30, 0, 2);
                    Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointion = 0;
                    Class4_Sub20_Sub15.anInt3157 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method209((byte) -108);
                    RSFont.anInt148 = 10;
                }
                if (RSFont.anInt148 == 10) {
                    if (Class4_Sub20_Sub17.aClass76_3189.method1189(true) >= Class4_Sub20_Sub15.anInt3157) {
                        Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointion = 0;
                        Class4_Sub20_Sub17.aClass76_3189
                                .method1186(
                                        (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.byteBuffer),
                                        98, 0, Class4_Sub20_Sub15.anInt3157);
                        Class25.method800(arg0 + 1);
                        Class53.anInt1079 = -1;
                        Class67.method1086(false, (byte) 53);
                        Class4_Sub20_Sub11.anInt3092 = -1;
                    }
                } else {
                    Class4_Sub20_Sub7_Sub5.anInt3419++;
                    if ((Class4_Sub20_Sub7_Sub5.anInt3419 ^ 0xffffffff) < -2001) {
                        if ((Class59.anInt1186 ^ 0xffffffff) > -2) {
                            Class59.anInt1186++;
                            RSFont.anInt148 = 0;
                            if (RSInterface.anInt2139 == Class64.anInt1253)
                                Class64.anInt1253 = Class4_Sub20_Sub7.anInt2934;
                            else
                                Class64.anInt1253 = RSInterface.anInt2139;
                        } else
                            Class9.method665(-125, -3);
                    }
                }
            }
        } catch (IOException ioexception) {
            if ((Class59.anInt1186 ^ 0xffffffff) > -2) {
                if (Class64.anInt1253 == RSInterface.anInt2139)
                    Class64.anInt1253 = Class4_Sub20_Sub7.anInt2934;
                else
                    Class64.anInt1253 = RSInterface.anInt2139;
                RSFont.anInt148 = 0;
                Class59.anInt1186++;
            } else
                Class9.method665(arg0 ^ 0x25, -2);
        }
    }

    public static void method694(byte arg0) {
        try {
            aJagexString_2474 = null;
            aClass66_2468 = null;
            anIntArray2480 = null;
            if (arg0 > 64) {
                aJagexString_2479 = null;
                aJagexString_2481 = null;
                aClass4_Sub8Array2482 = null;
                aJagexString_2475 = null;
                aJagexString_2477 = null;
                aJagexString_2469 = null;
                aShortArrayArray2476 = null;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "i.F("
                    + arg0 + ')');
        }
    }

    public static void method695(byte arg0) {
        anInt2463++;
        Class31.aClass16_671 = new Class16(32);
        if (arg0 >= -34)
            method695((byte) -31);
    }

    public static RS2Font method697(int arg0, int arg1) {
        try {
            anInt2467++;
            RS2Font class4_sub20_sub2 = ((RS2Font) Class4_Sub12.aClass66_2123
                    .method1083(arg0, true));
            if (class4_sub20_sub2 != null)
                return class4_sub20_sub2;
            byte[] is = SceneGraph.aClass19_2483.method746(1, (byte) 107,
                    arg0);
            class4_sub20_sub2 = new RS2Font();
            if (is != null)
                class4_sub20_sub2.method339(arg0, new StreamBuffer(is), -13998);
            class4_sub20_sub2.method346(arg1 ^ ~0x420b);
            Class4_Sub12.aClass66_2123
                    .method1082(true, arg0, class4_sub20_sub2);
            if (arg1 != -7988)
                return null;
            return class4_sub20_sub2;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("i.K("
                    + arg0 + ',' + arg1 + ')'));
        }
    }

    public ColorModel aColorModel2473;

    public ImageConsumer anImageConsumer2453;

    @Override
    public synchronized void addConsumer(ImageConsumer arg0) {
        try {
            anImageConsumer2453 = arg0;
            anInt2464++;
            arg0.setDimensions(anInt376, anInt371);
            arg0.setProperties(null);
            arg0.setColorModel(aColorModel2473);
            arg0.setHints(14);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4
                    .method423(runtimeexception, ("i.addConsumer("
                            + (arg0 != null ? "{...}" : "null") + ')'));
        }
    }

    @Override
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3,
                               int arg4, int arg5) {
        try {
            anInt2456++;
            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
                    ("i.imageUpdate(" + (arg0 != null ? "{...}" : "null") + ','
                            + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ','
                            + arg5 + ')'));
        }
    }

    @Override
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        try {
            anInt2458++;
            if (arg0 != anImageConsumer2453)
                return false;
            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4
                    .method423(runtimeexception, ("i.isConsumer("
                            + (arg0 != null ? "{...}" : "null") + ')'));
        }
    }

    @Override
    public void method680(int arg0, byte arg1, Graphics arg2, int arg3,
                          int arg4, int arg5) {
        try {
            method691(arg5, arg3, (byte) 124, arg4, arg0);
            anInt2472++;
            Shape shape = arg2.getClip();
            arg2.clipRect(arg3, arg5, arg0, arg4);
            arg2.drawImage(anImage378, 0, 0, this);
            arg2.setClip(shape);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("i.D("
                    + arg0 + ',' + arg1 + ','
                    + (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
                    + arg4 + ',' + arg5 + ')'));
        }
    }

    @Override
    public void method686(Component arg0, int arg1, int arg2, int arg3) {
        anInt2457++;
        anInt376 = arg3;
        anIntArray384 = new int[arg3 * arg1 - -1];
        anInt371 = arg1;
        aColorModel2473 = new DirectColorModel(32, 16711680, 65280, 255);
        anImage378 = arg0.createImage(this);
        method696(false);
        arg0.prepareImage(anImage378, this);
        method696(false);
        arg0.prepareImage(anImage378, this);
        method696(false);
        arg0.prepareImage(anImage378, this);
        this.method689(-108);
        if (arg2 > -63)
            RSApplet.mouseX = 64;
    }

    @Override
    public void method687(Graphics arg0, int arg1, int arg2, boolean arg3) {
        try {
            method696(false);
            if (arg3 != true)
                aClass4_Sub8Array2482 = null;
            anInt2454++;
            arg0.drawImage(anImage378, arg1, arg2, this);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("i.I("
                    + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
                    + arg2 + ',' + arg3 + ')'));
        }
    }

    public synchronized void method691(int arg0, int arg1, byte arg2, int arg3,
                                       int arg4) {
        try {
            if (arg2 < 121)
                aJagexString_2475 = null;
            anInt2455++;
            if (anImageConsumer2453 != null) {
                anImageConsumer2453.setPixels(arg1, arg0, arg4, arg3,
                        aColorModel2473, anIntArray384, arg1 + anInt376 * arg0,
                        anInt376);
                anImageConsumer2453.imageComplete(2);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
                    ("i.G(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ','
                            + arg4 + ')'));
        }
    }

    public synchronized void method696(boolean arg0) {
        try {
            anInt2471++;
            if (anImageConsumer2453 != null && arg0 == false) {
                anImageConsumer2453.setPixels(0, 0, anInt376, anInt371,
                        aColorModel2473, anIntArray384, 0, anInt376);
                anImageConsumer2453.imageComplete(2);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "i.E("
                    + arg0 + ')');
        }
    }

    @Override
    public synchronized void removeConsumer(ImageConsumer arg0) {
        try {
            if (anImageConsumer2453 == arg0)
                anImageConsumer2453 = null;
            anInt2465++;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4
                    .method423(runtimeexception, ("i.removeConsumer("
                            + (arg0 != null ? "{...}" : "null") + ')'));
        }
    }

    @Override
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        try {
            anInt2459++;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
                    ("i.requestTopDownLeftRightResend("
                            + (arg0 != null ? "{...}" : "null") + ')'));
        }
    }

    @Override
    public void startProduction(ImageConsumer arg0) {
        try {
            anInt2462++;
            addConsumer(arg0);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4
                    .method423(runtimeexception, ("i.startProduction("
                            + (arg0 != null ? "{...}" : "null") + ')'));
        }
    }
}
