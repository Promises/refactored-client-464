package com.jagex.runescape;

import com.jagex.runescape.net.StreamBuffer;
import com.jagex.runescape.util.Signlink;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class AppletListener implements
        FocusListener {
    public static int anInt1448 = 0;
    public static int anInt1449;
    public static int anInt1452;
    public static int anInt1453;
    public static int anInt1454;
    public static int anInt1455;
    public static int anInt1457;
    public static int anInt1460;
    public static int anInt1462;
    public static int anInt1464 = 0;
    public static int anInt1466;
    public static int[] anIntArray1465 = {4, 10, 4, 0, 0, 2, 0, 0, 4, 6, 0, 0,
            0, 0, 0, 6, 2, 4, 0, 0, 0, 0, 0, -1, 0, 0, 7, 0, 0, 0, 2, 0, 0, 0,
            0, 0, 0, 6, 0, 3, 5, 0, 0, 0, 0, 0, 0, -2, 0, 0, -1, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 5, 0, 6, 0, 0, 0, 0, 0, -2, 0, 0, -1, 0, 0, -2, 0,
            2, 0, -2, 0, 0, 6, 0, 0, 0, 5, 0, 0, -1, -2, 0, -2, 0, 0, 0, 0, 0,
            0, 0, 11, 0, 0, 0, 11, 0, 0, 0, -1, 0, 0, 0, 5, 6, 10, 0, 0, 0, 0,
            0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 4, 0, 0, 4,
            0, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 3, 0, 0, 2, 6, 0, 0,
            1, 0, 0, 6, 0, 2, 0, 0, 0, 0, 4, -2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0,
            0, 6, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 8, 0, 0, 0, 0, 0,
            6, 7, 0, 0, 0, 0, 0, -2, 0, 0, 0, 15, 0, 0, -2, -2, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 8, 0, 0, 0, 3, 7, 14, 0, 0, 0, 0, 6, 3, 0, 0, 0, 0,
            0, 0, -2, 0, 12, 0};


    public static void method1149() {
        try {
            synchronized (GameShell.appletListener) {
                Class4_Sub20_Sub7_Sub1_Sub1.anInt3587 = GameShell.mouseButtonPressed;
                Class37.anInt767 = GameShell.mouseX;
                Class4_Sub1.anInt1859 = GameShell.mouseY;
                Class62.anInt1227 = GameShell.eventMouseButtonPressed;
                Class37.anInt758 = GameShell.eventClickX;
                JagexException.anInt1729 = GameShell.eventClickY;
                GameShell.clickTime = GameShell.lastClick;
                GameShell.eventMouseButtonPressed = 0;
            }
            anInt1449++;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "com.jagex.runescape.AppletListener.method1149("
                    + "72" + ')');
        }
    }

    public static void method1150(byte arg0) {
        try {
            anIntArray1465 = null;
            StringUtilities.aJagexString_1458 = null;
            StringUtilities.aJagexString_1463 = null;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "te.D("
                    + arg0 + ')');
        }
    }

    public static void method1151(int arg0, int arg1, Class19 arg2, int arg3,
                                  int arg4, boolean arg5) {
        try {
            Class4_Sub21.anInt2374 = arg4;
            anInt1452++;
            Class67.aClass19_1363 = arg2;
            Class4_Sub20_Sub6.aBoolean2914 = arg5;
            StreamBuffer.anInt2085 = 1;
            Class25.anInt577 = arg3;
            if (arg1 != -2)
                anIntArray1465 = null;
            Class4_Sub20_Sub9.anInt3050 = arg0;
            Class4_Sub20_Sub5.anInt2888 = 10000;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("te.A("
                    + arg0 + ',' + arg1 + ','
                    + (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
                    + arg4 + ',' + arg5 + ')'));
        }
    }

    public static void method1152(int arg0, Signlink signlink, byte arg2,
                                  StreamBuffer arg3) {
        try {
            anInt1462++;
            Class4_Sub6 class4_sub6 = new Class4_Sub6();
            class4_sub6.anInt1916 = arg3.get();
            class4_sub6.anInt1937 = arg3.method219((byte) 73);
            class4_sub6.aClass22Array1940 = new Class22[class4_sub6.anInt1916];
            class4_sub6.anIntArray1926 = new int[class4_sub6.anInt1916];
            class4_sub6.aClass22Array1927 = new Class22[class4_sub6.anInt1916];
            class4_sub6.anIntArray1929 = new int[class4_sub6.anInt1916];
            class4_sub6.aByteArrayArrayArray1925 = new byte[class4_sub6.anInt1916][][];
            class4_sub6.anIntArray1920 = new int[class4_sub6.anInt1916];
            if (arg2 == 20) {
                for (int i = 0; i < class4_sub6.anInt1916; i++) {
                    try {
                        int i_0_ = arg3.get();
                        if ((i_0_ ^ 0xffffffff) != -1 && i_0_ != 1
                                && (i_0_ ^ 0xffffffff) != -3) {
                            if ((i_0_ ^ 0xffffffff) == -4
                                    || (i_0_ ^ 0xffffffff) == -5) {
                                String string = new String(arg3.method212(
                                ).method836(-10650));
                                String string_1_ = new String(arg3.method212(
                                ).method836(-10650));
                                int i_2_ = arg3.get();
                                String[] strings = new String[i_2_];
                                for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff); i_3_++)
                                    strings[i_3_] = new String(arg3.method212(
                                    ).method836(arg2 + -10670));
                                byte[][] is = new byte[i_2_][];
                                if (i_0_ == 3) {
                                    for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
                                        int i_5_ = arg3.method219((byte) 73);
                                        is[i_4_] = new byte[i_5_];
                                        arg3.method253(0, (byte) -121, i_5_,
                                                is[i_4_]);
                                    }
                                }
                                class4_sub6.anIntArray1920[i] = i_0_;
                                Class<?>[] var_classes = new Class[i_2_];
                                for (int i_6_ = 0; (i_2_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++)
                                    var_classes[i_6_] = Class18.method734(
                                            false, strings[i_6_]);
                                class4_sub6.aClass22Array1927[i] = (signlink
                                        .method1170(var_classes, (byte) 122,
                                                string_1_, Class18.method734(
                                                        false, string)));
                                class4_sub6.aByteArrayArrayArray1925[i] = is;
                            }
                        } else {
                            String string = new String(arg3
                                    .method212().method836(-10650));
                            String string_7_ = new String(arg3.method212()
                                    .method836(arg2 + -10670));
                            int i_8_ = 0;
                            if ((i_0_ ^ 0xffffffff) == -2)
                                i_8_ = arg3.method219((byte) 73);
                            class4_sub6.anIntArray1920[i] = i_0_;
                            class4_sub6.anIntArray1929[i] = i_8_;
                            class4_sub6.aClass22Array1940[i] = signlink
                                    .method1171((byte) -104,
                                            Class18.method734(false, string),
                                            string_7_);
                        }
                    } catch (ClassNotFoundException classnotfoundexception) {
                        class4_sub6.anIntArray1926[i] = -1;
                    } catch (SecurityException securityexception) {
                        class4_sub6.anIntArray1926[i] = -2;
                    } catch (NullPointerException nullpointerexception) {
                        class4_sub6.anIntArray1926[i] = -3;
                    } catch (Exception exception) {
                        class4_sub6.anIntArray1926[i] = -4;
                    } catch (Throwable throwable) {
                        class4_sub6.anIntArray1926[i] = -5;
                    }
                }
                Class8.aClass65_252.method1068(class4_sub6, (byte) -125);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("te.C("
                    + arg0 + ',' + (signlink != null ? "{...}" : "null") + ','
                    + arg2 + ',' + (arg3 != null ? "{...}" : "null") + ')'));
        }
    }

    @Override
    public void focusGained(FocusEvent arg0) {
        try {
            anInt1455++;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4
                    .method423(runtimeexception, ("te.focusGained("
                            + (arg0 != null ? "{...}" : "null") + ')'));
        }
    }

    @Override
    public synchronized void focusLost(FocusEvent arg0) {
        try {
            if (GameShell.appletListener != null)
                GameShell.mouseButtonPressed = 0;
            anInt1466++;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4
                    .method423(runtimeexception, ("te.focusLost("
                            + (arg0 != null ? "{...}" : "null") + ')'));
        }
    }


}
