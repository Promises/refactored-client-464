package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

import java.math.BigInteger;

public class Class49 implements Runnable {
    public static BigInteger aBigInteger994 = (new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821"));
    public static boolean aBoolean990 = false;
    public static int anInt1000;
    public static int anInt1002;
    public static int anInt991;
    public static int anInt992;
    public static int anInt993;
    public static int anInt996;
    public static int anInt997;
    public static int anInt998;
    public static int cameraHorizontalPosition = 0;
    public static int[] anIntArray1003 = new int[4000];
    public static int[] anIntArray995;

    public static int method988(byte arg0, int arg1, int arg2) {
        try {
            anInt1000++;
            if (arg0 <= 115) {
                anInt991 = 74;
            }
            Class4_Sub1 class4_sub1 = ((Class4_Sub1) Class31.aClass16_671
                    .method725((byte) 117, arg1));
            if (class4_sub1 == null) {
                return 0;
            }
            if ((arg2 ^ 0xffffffff) == 0) {
                return 0;
            }
            int i = 0;
            for (int i_0_ = 0; ((class4_sub1.anIntArray1858.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
                if (arg2 == class4_sub1.anIntArray1866[i_0_]) {
                    i += class4_sub1.anIntArray1858[i_0_];
                }
            }
            return i;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("na.E("
                    + arg0 + ',' + arg1 + ',' + arg2 + ')'));
        }
    }

    public static void method989(int arg0) {
        try {
            StringUtilities.aJagexString_1001 = null;
            anIntArray1003 = null;
            if (arg0 == 467836531) {
                anIntArray995 = null;
                StringUtilities.aJagexString_1004 = null;
                aBigInteger994 = null;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "na.A("
                    + arg0 + ')');
        }
    }

    public static Class4_Sub20_Sub12_Sub1 method990(Class19 arg0, int arg1,
                                                    int arg2) {
        try {
            if (arg2 != -1) {
                method989(-25);
            }
            anInt1002++;
            if (!Class4_Sub20_Sub16.method607(true, arg0, arg1)) {
                return null;
            }
            return Class4_Sub17.method306(2640);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("na.C("
                    + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
                    + arg2 + ')'));
        }
    }

    public static boolean method991(byte arg0) {
        try {
            anInt997++;

            if (Class4_Sub20_Sub17.aClass76_3189 == null) {
                return false;
            }
            try {
                int i = Class4_Sub20_Sub17.aClass76_3189.method1189(true);
                if ((i ^ 0xffffffff) == -1) {
                    return false;
                }

                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == 0) {
                    Class4_Sub20_Sub17.aClass76_3189
                            .method1186(
                                    (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.byteBuffer),
                                    99, 0, 1);
                    Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.currentPosition = 0;
                    Class4_Sub20_Sub11.incomingPacket = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method265(true);
                    Class4_Sub20_Sub15.packetSize = AppletListener.anIntArray1465[Class4_Sub20_Sub11.incomingPacket];
                    i--;
                }
                if (Class4_Sub20_Sub15.packetSize == -1) {
                    if ((i ^ 0xffffffff) < -1) {
                        i--;
                        Class4_Sub20_Sub17.aClass76_3189
                                .method1186(
                                        (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.byteBuffer),
                                        25, 0, 1);
                        Class4_Sub20_Sub15.packetSize = 0xff & (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.byteBuffer[0]);
                    } else {
                        return false;
                    }
                }
                if ((Class4_Sub20_Sub15.packetSize ^ 0xffffffff) == 1) {
                    if ((i ^ 0xffffffff) < -2) {
                        Class4_Sub20_Sub17.aClass76_3189
                                .method1186(
                                        (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.byteBuffer),
                                        108, 0, 2);
                        i -= 2;
                        Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.currentPosition = 0;
                        Class4_Sub20_Sub15.packetSize = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .readShort();
                    } else {
                        return false;
                    }
                }
                if (i < Class4_Sub20_Sub15.packetSize) {
                    return false;
                }
                Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.currentPosition = 0;
                Class4_Sub20_Sub17.aClass76_3189.method1186(
                        Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.byteBuffer,
                        98, 0, Class4_Sub20_Sub15.packetSize);
                AppletListener.anInt1448 = 0;
                RSCanvas.anInt56 = Class41.anInt822;
                Class41.anInt822 = Class43.anInt874;
                Class43.anInt874 = Class4_Sub20_Sub11.incomingPacket;
                System.out.printf("packet: %d, %d\n", Class4_Sub20_Sub11.incomingPacket, (Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff));
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -31) {
                    Class57.anInt1130 = 30 * Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readShort();
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    Class43.anInt868 = Class4_Sub20_Sub10.anInt3053;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -188) {
                    if ((Class4_Sub6.anInt1932 ^ 0xffffffff) != 0) {
                        Class58.method1032(0, 0, Class4_Sub6.anInt1932);
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 79) {
                    int i_1_ = (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.currentPosition - -Class4_Sub20_Sub15.packetSize);
                    int i_2_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readShort();
                    int i_3_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readShort();
                    if ((Class4_Sub6.anInt1932 ^ 0xffffffff) != (i_2_ ^ 0xffffffff)) {
                        Class4_Sub6.anInt1932 = i_2_;
                        Class66.method1080(Class4_Sub6.anInt1932, 0);
                        Class62.method1048(false, Class4_Sub6.anInt1932);
                        for (int i_4_ = 0; i_4_ < 100; i_4_++) {
                            Class4_Sub20_Sub11.aBooleanArray3083[i_4_] = true;
                        }
                    }
                    while (i_3_-- > 0) {
                        int i_5_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .readInt((byte) 73);
                        int i_6_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .readShort();
                        int i_7_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .get(); // readByte()
                        Class4_Sub16 class4_sub16 = ((Class4_Sub16) Class31.aClass16_677
                                .method725((byte) 117, i_5_));
                        if (class4_sub16 != null
                                && (i_6_ ^ 0xffffffff) != (class4_sub16.anInt2311 ^ 0xffffffff)) {
                            Class4_Sub20_Sub7_Sub3.method418(arg0 ^ 0x48, true,
                                    class4_sub16);
                            class4_sub16 = null;
                        }
                        if (class4_sub16 == null) {
                            class4_sub16 = Class24.method795((byte) 102, i_6_,
                                    i_7_, i_5_);
                        }
                        class4_sub16.aBoolean2310 = true;
                    }
                    for (Class4_Sub16 class4_sub16 = ((Class4_Sub16) Class31.aClass16_677
                            .method724((byte) -117)); class4_sub16 != null; class4_sub16 = ((Class4_Sub16) Class31.aClass16_677
                            .method723((byte) -25))) {
                        if (!class4_sub16.aBoolean2310) {
                            Class4_Sub20_Sub7_Sub3.method418(95, true,
                                    class4_sub16);
                        } else {
                            class4_sub16.aBoolean2310 = false;
                        }
                    }
                    Class64.aClass16_1259 = new Class16(512);
                    while ((Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.currentPosition ^ 0xffffffff) > (i_1_ ^ 0xffffffff)) {
                        int i_8_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .readInt((byte) 73);
                        int i_9_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .readShort();
                        int i_10_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .readShort();
                        int i_11_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .readInt((byte) 73);
                        for (int i_12_ = i_9_; i_10_ >= i_12_; i_12_++) {
                            long l = i_12_ + ((long) i_8_ << -1449009248);
                            Class64.aClass16_1259.method720(new Class4_Sub15(
                                    i_11_), l, false);
                        }
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 61
                        || Class4_Sub20_Sub11.incomingPacket == 208
                        || Class4_Sub20_Sub11.incomingPacket == 239
                        || Class4_Sub20_Sub11.incomingPacket == 26
                        || Class4_Sub20_Sub11.incomingPacket == 186
                        || Class4_Sub20_Sub11.incomingPacket == 218
                        || Class4_Sub20_Sub11.incomingPacket == 39
                        || Class4_Sub20_Sub11.incomingPacket == 112
                        || Class4_Sub20_Sub11.incomingPacket == 140
                        || Class4_Sub20_Sub11.incomingPacket == 16
                        || Class4_Sub20_Sub11.incomingPacket == 17) {
                    Class12.method675(arg0 + -155);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -191) {
                    Class4_Sub20_Sub7.method374();
                    int _skillId = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.readByteSubtracted(32767); // bytes
                    int _skillExperience = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.readLEInt(false); // leint
                    int _skillLevel = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get(); // readByte()
                    // //byte
                    Class46.skillExperience[_skillId] = _skillExperience;
                    Class76.skillLevel[_skillId] = _skillLevel;
                    Class31.skillMaxLevel[_skillId] = 1;
                    for (int level = 0; level < 98; level++) {
                        if (_skillExperience >= Class34.SKILL_EXPERIENCE[level]) {
                            Class31.skillMaxLevel[_skillId] = 2 + level;
                        }
                    }
                    Class42.anIntArray841[Class59.method1035(31, Class73.anInt1502++)] = _skillId;
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -45) { // no
                    // data
                    for (int i_17_ = 0; ((i_17_ ^ 0xffffffff) > (Class82.anInt1715 ^ 0xffffffff)); i_17_++) {
                        Class4_Sub20_Sub15 class4_sub20_sub15 = Class4_Sub10
                                .method203(-102, i_17_);
                        if (class4_sub20_sub15 != null
                                && class4_sub20_sub15.anInt3151 == 0) {
                            Class19.anIntArray514[i_17_] = 0;
                            Class31.anIntArray687[i_17_] = 0;
                        }
                    }
                    Class4_Sub20_Sub7.method374();
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    Class77.anInt1587 += 32;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 221) { // sendMapRegion
                    Class67.method1086(false, (byte) 49);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 50) {
                    long l = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readLong((byte) 33);
                    long l_18_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readShort();
                    long l_19_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method248(false);
                    int i_20_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get(); // readByte()
                    long l_21_ = (l_18_ << -254469856) + l_19_;
                    boolean bool = false;
                    for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > -101; i_22_++) {
                        if ((l_21_ ^ 0xffffffffffffffffL) == (Class18.aLongArray483[i_22_] ^ 0xffffffffffffffffL)) {
                            bool = true;
                            break;
                        }
                    }
                    if ((i_20_ ^ 0xffffffff) >= -2) {
                        for (int i_23_ = 0; i_23_ < JagexString.anInt1827; i_23_++) {
                            if ((Class9.aLongArray284[i_23_] ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
                                bool = true;
                                break;
                            }
                        }
                    }
                    if (!bool && Class81.anInt1695 == 0) {
                        Class18.aLongArray483[RSCanvas.anInt53] = l_21_;
                        RSCanvas.anInt53 = (1 + RSCanvas.anInt53) % 100;
                        JagexString jagexString = (Class4_Sub20_Sub12_Sub4
                                .method574(Class4_Sub22
                                        .method629(
                                                (byte) -83,
                                                Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883)
                                        .method801(false)));
                        if (i_20_ != 2 && i_20_ != 3) {
                            if ((i_20_ ^ 0xffffffff) != -2) {
                                Class43.method955(jagexString,
                                        Class68.method1094(-5, l)
                                                .method839(124), (byte) 119, 3);
                            } else {
                                Class43.method955(
                                        jagexString,
                                        (Class4_Sub24
                                                .method639(
                                                        (new JagexString[]{
                                                                StringUtilities.aJagexString_986,
                                                                Class68.method1094(
                                                                        arg0
                                                                                + -55,
                                                                        l)
                                                                        .method839(
                                                                        106)}),
                                                        -842)), (byte) 122, 7);
                            }
                        } else {
                            Class43.method955(
                                    jagexString,
                                    (Class4_Sub24.method639((new JagexString[]{
                                            Class64.aJagexString_1268,
                                            Class68.method1094(-5, l)
                                                    .method839(104)}), -842)),
                                    (byte) 123, 7);
                        }
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 2) {
                    int i_24_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method241(4);
                    RSInterface class4_sub13 = RSInterface.forId(
                            i_24_);
                    for (int i_25_ = 0; i_25_ < class4_sub13.items.length; i_25_++) {
                        class4_sub13.items[i_25_] = -1;
                        class4_sub13.items[i_25_] = 0;
                    }
                    Class67.method1088(class4_sub13);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -255) {
                    int i_26_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readInt((byte) 73); // int (interface)
                    int i_27_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method213((byte) -14); // leshort (len)
                    if (i_27_ == 65535) {
                        i_27_ = -1;
                    }
                    int i_28_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method237(-86); // int2 (set)
                    int i_29_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method223(arg0 + -50); // shorta (offset)
                    if (i_29_ == 65535) {
                        i_29_ = -1;
                    }
                    for (int i_30_ = i_29_; i_30_ <= i_27_; i_30_++) {
                        long l = i_30_ + ((long) i_26_ << 1124469280);
                        RSFont class4 = Class64.aClass16_1259.method725(
                                (byte) 117, l);
                        if (class4 != null) {
                            class4.clear();
                        }
                        Class64.aClass16_1259.method720(
                                new Class4_Sub15(i_28_), l, false);
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -64) { // animateInterfaceId
                    int i_31_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method237(arg0 ^ ~0x19); // readInt2()
                    int i_32_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method250(0); // readLEShort()
                    RSInterface class4_sub13 = RSInterface.forId(
                            i_31_);
                    if ((i_32_ ^ 0xffffffff) != (class4_sub13.anInt2210 ^ 0xffffffff)
                            || (i_32_ ^ 0xffffffff) == 0) {
                        class4_sub13.anInt2241 = 0;
                        class4_sub13.anInt2210 = i_32_;
                        class4_sub13.anInt2153 = 0;
                        Class67.method1088(class4_sub13);
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 8) {
                    int i_33_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readLEInt(false); // readLEInt()
                    RSInterface class4_sub13 = RSInterface.forId(
                            i_33_);
                    class4_sub13.anInt2137 = 3;
                    class4_sub13.anInt2250 = Class4_Sub15.localPlayer.aClass35_3609
                            .method898(-256);
                    Class67.method1088(class4_sub13);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 1) {
                    int i_34_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method241(4);
                    int i_35_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method223(0);
                    int i_36_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method223(0);
                    int i_37_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readShort();
                    RSInterface class4_sub13 = RSInterface.forId(
                            i_34_);
                    if ((class4_sub13.anInt2213 ^ 0xffffffff) != (i_36_ ^ 0xffffffff)
                            || class4_sub13.anInt2236 != i_37_
                            || class4_sub13.anInt2168 != i_35_) {
                        class4_sub13.anInt2168 = i_35_;
                        class4_sub13.anInt2213 = i_36_;
                        class4_sub13.anInt2236 = i_37_;
                        Class67.method1088(class4_sub13);
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -183) {
                    AppletListener.method1152(Class4_Sub20_Sub15.packetSize,
                            Class43.aClass75_872, (byte) 20,
                            (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883));
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -10) {
                    int i_38_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method241(4); // int1
                    int i_39_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method223(0); // leshort
                    RSInterface class4_sub13 = RSInterface.forId(
                            i_38_);
                    if ((class4_sub13.anInt2137 ^ 0xffffffff) != -2
                            || (i_39_ ^ 0xffffffff) != (class4_sub13.anInt2250 ^ 0xffffffff)) {
                        class4_sub13.anInt2250 = i_39_;
                        class4_sub13.anInt2137 = 1;
                        Class67.method1088(class4_sub13);
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -73) {
                    JagexString jagexString = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method212();// string
                    int i_40_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readByteSubtracted(32767);// bytes
                    int i_41_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .getC(); // readByteC()://bytec
                    if ((i_40_ ^ 0xffffffff) <= -2
                            && (i_40_ ^ 0xffffffff) >= -9) {
                        if (jagexString.method818(Class4_Sub24.aJagexString_2448,
                                (byte) -105)) {
                            jagexString = null;
                        }
                        Class4_Sub22.aJagexStringArray2387[-1 + i_40_] = jagexString;
                        Class4_Sub20_Sub7.aBooleanArray2946[i_40_ - 1] = (i_41_ ^ 0xffffffff) == -1;
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 82) {
                    Class25.aBoolean582 = true;
                    Actor.anInt3255 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .get(); // readByte()
                    Class71.anInt1479 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .get(); // readByte()
                    Class4_Sub12.anInt2127 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readShort();
                    Class1.anInt60 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .get();
                    Class4_Sub20_Sub17.anInt3216 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .get();
                    if (Class4_Sub20_Sub17.anInt3216 >= 100) {
                        Class33.cameraY = 128 * Class71.anInt1479 - -64;
                        Class6.cameraX = 128
                                * Actor.anInt3255 - -64;
                        RSInterface.cameraZ = (Class67.getFloorDrawHeight(
                                Class6.cameraX, Class33.cameraY, Class82.plane
                        ) - Class4_Sub12.anInt2127);
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 47) {
                    int i_42_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method241(4); // int1
                    JagexString jagexString = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method212();
                    RSInterface class4_sub13 = RSInterface.forId(
                            i_42_);
                    if (!jagexString.method802(1, class4_sub13.aJagexString_2150)) {
                        class4_sub13.aJagexString_2150 = jagexString;
                        Class67.method1088(class4_sub13);
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -143) {
                    boolean bool = (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readByteSubtracted(32767) == 1);
                    int i_43_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method241(4);
                    RSInterface class4_sub13 = RSInterface.forId(
                            i_43_);
                    if (!bool == class4_sub13.aBoolean2225) {
                        class4_sub13.aBoolean2225 = bool;
                        Class67.method1088(class4_sub13);
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 40) {
                    int i_44_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readShort();
                    int i_45_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get(); // readByte()
                    int i_46_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readShort();
                    Class35.method900(i_46_, i_44_, i_45_, 12644);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 74) { // no data
                    for (int i_47_ = 0; ((Class4_Sub20_Sub7_Sub4.aPlayerArray3358).length > i_47_); i_47_++) {
                        if ((Class4_Sub20_Sub7_Sub4.aPlayerArray3358[i_47_]) != null) {
                            Class4_Sub20_Sub7_Sub4.aPlayerArray3358[i_47_].anInt3277 = -1;
                        }
                    }
                    for (int i_48_ = 0; ((i_48_ ^ 0xffffffff) > ((Class57.npcs).length ^ 0xffffffff)); i_48_++) {
                        if ((Class57.npcs[i_48_]) != null) {
                            Class57.npcs[i_48_].anInt3277 = -1;
                        }
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 156) { // sendDefaultChatbox
                    Class27.anInt618 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get(); // readByte()
                    Class76.anInt1580 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get(); // readByte()
                    Class4_Sub20_Sub7_Sub4.anInt3357 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get(); // readByte()
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -121) {
                    int i_49_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readInt((byte) 73);
                    int i_50_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readShort();
                    if ((i_49_ ^ 0xffffffff) > 69999) {
                        i_50_ += 32768;
                    }
                    RSInterface class4_sub13;
                    if (i_49_ < 0) {
                        class4_sub13 = null;
                    } else {
                        class4_sub13 = RSInterface.forId(i_49_);
                    }
                    while (Class4_Sub20_Sub15.packetSize > (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.currentPosition)) {
                        int i_51_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .readUnsignedSmart();
                        int i_52_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .readShort();
                        int i_53_ = 0;
                        if (i_52_ != 0) {
                            i_53_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                    .get(); // readByte()
                            if ((i_53_ ^ 0xffffffff) == -256) {
                                i_53_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                        .readInt((byte) 73);
                            }
                        }
                        if (class4_sub13 != null && i_51_ >= 0
                                && i_51_ < class4_sub13.items.length) {
                            class4_sub13.items[i_51_] = i_52_;
                            class4_sub13.itemAmounts[i_51_] = i_53_;
                        }
                        Class4_Sub22.method630(i_53_, -1 + i_52_, i_51_, arg0
                                ^ ~0x7468, i_50_);
                    }
                    if (class4_sub13 != null) {
                        Class67.method1088(class4_sub13);
                    }
                    Class4_Sub20_Sub7.method374();
                    Class2.anIntArray84[Class59.method1035(31,
                            Class10.anInt306++)] = Class59.method1035(i_50_,
                            32767);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 166) {
                    int i_54_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readShort();
                    int i_55_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readLEInt(false);
                    RSInterface class4_sub13 = RSInterface.forId(
                            i_55_);
                    if (class4_sub13 != null && class4_sub13.anInt2258 == 0) {
                        if ((i_54_ ^ 0xffffffff) < (class4_sub13.anInt2206
                                + -class4_sub13.anInt2185 ^ 0xffffffff)) {
                            i_54_ = (-class4_sub13.anInt2185 + class4_sub13.anInt2206);
                        }
                        if ((i_54_ ^ 0xffffffff) > -1) {
                            i_54_ = 0;
                        }
                        if ((i_54_ ^ 0xffffffff) != (class4_sub13.anInt2238 ^ 0xffffffff)) {
                            class4_sub13.anInt2238 = i_54_;
                            Class67.method1088(class4_sub13);
                        }
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 245) { // config?
                    int i_56_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method223(0);
                    int i_57_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method229(-117);
                    Class19.anIntArray514[i_56_] = i_57_;
                    if ((i_57_ ^ 0xffffffff) != (Class31.anIntArray687[i_56_] ^ 0xffffffff)) {
                        Class31.anIntArray687[i_56_] = i_57_;
                        Region.method65(i_56_, 2);
                    }
                    Class4_Sub20_Sub6.anIntArray2902[Class59.method1035(
                            Class77.anInt1587++, 31)] = i_56_;
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == -201) { // component position
                    int i_58_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method252(23580); // leshorta
                    int i_59_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method252(23580); // leshorta
                    int i_60_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method237(118); // int2
                    RSInterface class4_sub13 = RSInterface.forId(
                            i_60_);
                    int i_61_ = class4_sub13.anInt2229 + i_59_;
                    int i_62_ = i_58_ + class4_sub13.anInt2192;
                    if (class4_sub13.anInt2181 != i_62_
                            || ((class4_sub13.anInt2212 ^ 0xffffffff) != (i_61_ ^ 0xffffffff))) {
                        class4_sub13.anInt2212 = i_61_;
                        class4_sub13.anInt2181 = i_62_;
                        Class67.method1088(class4_sub13);
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 113) {
                    Class25.aBoolean582 = true;
                    Class12.anInt348 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .get(); // readByte()
                    Class14.anInt399 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .get(); // readByte()
                    Class8.anInt260 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readShort();
                    Class18.anInt471 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .get();
                    Class52.anInt1058 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .get(); // readByte()
                    if (Class52.anInt1058 >= 100) {
                        int i_63_ = Class12.anInt348 * 128 - -64;
                        int i_64_ = 64 + Class14.anInt399 * 128;
                        int i_65_ = (Class67.getFloorDrawHeight(i_63_, i_64_, Class82.plane
                        ) + -Class8.anInt260);
                        int i_66_ = -Class6.cameraX + i_63_;
                        int i_67_ = i_65_ - RSInterface.cameraZ;
                        int i_68_ = i_64_ - Class33.cameraY;
                        int i_69_ = (int) Math
                                .sqrt((i_66_ * i_66_ - -(i_68_ * i_68_)));
                        Class4_Sub20_Sub13.cameraVerticalRotation = (int) (Math.atan2(i_67_,
                                i_69_) * 325.949) & 0x7ff;
                        Class4_Sub6.cameraHorizontalRotation = 0x7ff & (int) (Math.atan2(
                                i_66_, i_68_) * -325.949);
                        if (Class4_Sub20_Sub13.cameraVerticalRotation < 128) {
                            Class4_Sub20_Sub13.cameraVerticalRotation = 128;
                        }
                        if ((Class4_Sub20_Sub13.cameraVerticalRotation ^ 0xffffffff) < -384) {
                            Class4_Sub20_Sub13.cameraVerticalRotation = 383;
                        }
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -160) {
                    Class4_Sub20_Sub7_Sub4.anInt3367 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method239((byte) 76);
                    Class64.anInt1273 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method239((byte) 60);
                    for (int i_70_ = Class4_Sub20_Sub7_Sub4.anInt3367; Class4_Sub20_Sub7_Sub4.anInt3367
                            - -8 > i_70_; i_70_++) {
                        for (int i_71_ = Class64.anInt1273; i_71_ < 8 + Class64.anInt1273; i_71_++) {
                            if ((Class40.aClass65ArrayArrayArray787[Class82.plane][i_70_][i_71_]) != null) {
                                Class40.aClass65ArrayArrayArray787[Class82.plane][i_70_][i_71_] = null;
                                Class62.method1049(i_71_, i_70_, arg0 ^ 0x72);
                            }
                        }
                    }
                    for (Class4_Sub7 class4_sub7 = (Class4_Sub7) Npc.aClass65_3618
                            .method1071(-125); class4_sub7 != null; class4_sub7 = (Class4_Sub7) Npc.aClass65_3618
                            .method1075(18485)) {
                        if (((Class4_Sub20_Sub7_Sub4.anInt3367 ^ 0xffffffff) >= (class4_sub7.anInt1953 ^ 0xffffffff))
                                && (class4_sub7.anInt1953 < Class4_Sub20_Sub7_Sub4.anInt3367 + 8)
                                && ((Class64.anInt1273 ^ 0xffffffff) >= (class4_sub7.anInt1950 ^ 0xffffffff))
                                && ((Class64.anInt1273 - -8 ^ 0xffffffff) < (class4_sub7.anInt1950 ^ 0xffffffff))
                                && Class82.plane == class4_sub7.anInt1961) {
                            class4_sub7.anInt1954 = 0;
                        }
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 168) {
                    int i_72_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method213((byte) -74);
                    Class16.method727(i_72_, (byte) 58);
                    Class2.anIntArray84[Class59.method1035(Class10.anInt306++,
                            31)] = Class59.method1035(i_72_, 32767);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 99) { // no data
                    Class25.aBoolean582 = false;
                    for (int i_73_ = 0; (i_73_ ^ 0xffffffff) > -6; i_73_++) {
                        RS2Font.aBooleanArray2765[i_73_] = false;
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 174) { // NPC updating?
                    Class53.updateNpcs();
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -153) {
                    Class11.anInt326 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .get(); // readByte()
                    Class4_Sub20_Sub1.anInt2718 = Class4_Sub20_Sub10.anInt3053;
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 237) {
                    int i_74_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .getC(); // readByteC():
                    int i_75_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readByteSubtracted(arg0 + 32717);
                    int i_76_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readByteSubtracted(32767);
                    Class82.plane = i_74_ >> -513969663;
                    Class4_Sub15.localPlayer.method385(
                            i_76_, (0x1 & i_74_) == 1, 128, i_75_);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 0) {
                    int i_77_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method241(4);
                    Class59.aClass22_1185 = Class43.aClass75_872.method1179(
                            i_77_, 121);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -253) {
                    Class4_Sub20_Sub7.anInt2948 = Region.pulseCycle;
                    long l = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readLong((byte) 33);
                    if (l == 0L) {
                        Class4_Sub10.anInt2021 = 0;
                        Class4_Sub20_Sub11.incomingPacket = -1;
                        Class50.aJagexString_1019 = null;
                        Class13_Sub2.aClass4_Sub8Array2482 = null;
                        return true;
                    }
                    Class50.aJagexString_1019 = Class68.method1094(arg0 ^ ~0x36, l);
                    Class4_Sub20_Sub17.aByte3194 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method229(62);
                    int i_78_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get(); // readByte()
                    if (i_78_ == 255) {
                        Class4_Sub20_Sub11.incomingPacket = -1;
                        return true;
                    }
                    Class4_Sub10.anInt2021 = i_78_;
                    Class4_Sub8[] class4_sub8s = new Class4_Sub8[100];
                    for (int i_79_ = 0; i_79_ < Class4_Sub10.anInt2021; i_79_++) {
                        class4_sub8s[i_79_] = new Class4_Sub8();
                        class4_sub8s[i_79_].aLong150 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .readLong((byte) 33);
                        class4_sub8s[i_79_].aJagexString_1975 = Class68.method1094(
                                -5, class4_sub8s[i_79_].aLong150);
                        class4_sub8s[i_79_].anInt1969 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .readShort();
                        class4_sub8s[i_79_].aByte1973 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .method229(79);
                        if ((Class25.aLong584 ^ 0xffffffffffffffffL) == (class4_sub8s[i_79_].aLong150 ^ 0xffffffffffffffffL)) {
                            Class27.aByte613 = class4_sub8s[i_79_].aByte1973;
                        }
                    }
                    boolean bool = false;
                    int i_80_ = Class4_Sub10.anInt2021;
                    while ((i_80_ ^ 0xffffffff) < -1) {
                        i_80_--;
                        bool = true;
                        for (int i_81_ = 0; i_81_ < i_80_; i_81_++) {
                            if (((class4_sub8s[i_81_].aJagexString_1975.method813(
                                    255, class4_sub8s[1 + i_81_].aJagexString_1975)) ^ 0xffffffff) < -1) {
                                Class4_Sub8 class4_sub8 = class4_sub8s[i_81_];
                                class4_sub8s[i_81_] = class4_sub8s[i_81_ + 1];
                                class4_sub8s[1 + i_81_] = class4_sub8;
                                bool = false;
                            }
                        }
                        if (bool) {
                            break;
                        }
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    Class13_Sub2.aClass4_Sub8Array2482 = class4_sub8s;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -215) {
                    Class4_Sub20_Sub7_Sub4.anInt3367 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .get(); // readByte()
                    Class64.anInt1273 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method239((byte) 79);
                    while (Class4_Sub20_Sub15.packetSize > (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.currentPosition)) {
                        Class4_Sub20_Sub11.incomingPacket = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .get(); // readByte()
                        Class12.method675(-105);
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -239) {
                    int i_82_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method241(arg0 + -46); // int1
                    int i_83_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readShort(); // short
                    int i_84_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .getC(); // readByteC()
                    Class4_Sub16 class4_sub16 = ((Class4_Sub16) Class31.aClass16_677
                            .method725((byte) 117, i_82_));
                    if (class4_sub16 != null) {
                        Class4_Sub20_Sub7_Sub3
                                .method418(
                                        107,
                                        (((class4_sub16.anInt2311) ^ 0xffffffff) != (i_83_ ^ 0xffffffff)),
                                        class4_sub16);
                    }
                    Class24.method795((byte) 36, i_83_, i_84_, i_82_);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (arg0 != 50) {
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 173) {
                    int i_85_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get(); // readByte()
                    int i_86_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get(); // readByte()
                    int i_87_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get(); // readByte()
                    int i_88_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get(); // readByte()
                    RS2Font.aBooleanArray2765[i_85_] = true;
                    Class78.anIntArray1607[i_85_] = i_86_;
                    SceneGraph.anIntArray2504[i_85_] = i_87_;
                    Class58.anIntArray1163[i_85_] = i_88_;
                    Class4_Sub15.quakeTimes[i_85_] = 0;
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 132) {
                    Class64.anInt1273 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .get(); // readByte()
                    Class4_Sub20_Sub7_Sub4.anInt3367 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .get(); // readByte()
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 160) {
                    Class57.anInt1141 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .get(); // readByte()
                    if (Class57.anInt1141 == 1) {
                        Class10.anInt313 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .readShort();
                    }
                    if ((Class57.anInt1141 ^ 0xffffffff) <= -3
                            && (Class57.anInt1141 ^ 0xffffffff) >= -7) {
                        if (Class57.anInt1141 == 2) {
                            Class11.anInt320 = 64;
                            Class11.anInt329 = 64;
                        }
                        if (Class57.anInt1141 == 3) {
                            Class11.anInt329 = 0;
                            Class11.anInt320 = 64;
                        }
                        if ((Class57.anInt1141 ^ 0xffffffff) == -5) {
                            Class11.anInt320 = 64;
                            Class11.anInt329 = 128;
                        }
                        if (Class57.anInt1141 == 5) {
                            Class11.anInt320 = 0;
                            Class11.anInt329 = 64;
                        }
                        if (Class57.anInt1141 == 6) {
                            Class11.anInt329 = 64;
                            Class11.anInt320 = 128;
                        }
                        Class57.anInt1141 = 2;
                        Class76.anInt1582 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .readShort();
                        Class76.anInt1550 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .readShort();
                        Class4_Sub17.anInt2329 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .get(); // readByte()
                    }
                    if (Class57.anInt1141 == 10) {
                        Class16.anInt426 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .readShort();
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 77) { // window pane
                    int i_89_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method235((byte) 96);
                    Class4_Sub6.anInt1932 = i_89_;
                    Class66.method1080(i_89_, 0);
                    Class62.method1048(false, Class4_Sub6.anInt1932);
                    for (int i_90_ = 0; (i_90_ ^ 0xffffffff) > -101; i_90_++) {
                        Class4_Sub20_Sub11.aBooleanArray3083[i_90_] = true;
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 233) {
                    int i_91_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method241(4);
                    int i_92_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method223(0);
                    int i_93_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method235((byte) -73);
                    RSInterface class4_sub13 = RSInterface.forId(
                            i_91_);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    class4_sub13.anInt2245 = i_93_ + (i_92_ << -1548736368);
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 100) {
                    long l = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readLong((byte) 33);
                    int i_94_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readShort();
                    int i_95_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get(); // readByte()
                    JagexString jagexString = Class68.method1094(arg0 + -55, l)
                            .method839(95);
                    for (int i_96_ = 0; ((i_96_ ^ 0xffffffff) > (GameShell.anInt23 ^ 0xffffffff)); i_96_++) {
                        if ((Class64.aLongArray1279[i_96_] ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
                            if (Class50.anIntArray1005[i_96_] != i_94_) {
                                Class50.anIntArray1005[i_96_] = i_94_;
                                if ((i_94_ ^ 0xffffffff) < -1) {
                                    Class43.method955(
                                            (Class4_Sub24
                                                    .method639(
                                                            (new JagexString[]{
                                                                    jagexString,
                                                                    (StringUtilities.aJagexString_3343)}),
                                                            arg0 ^ ~0x37b)),
                                            Class4_Sub3.aJagexString_1895,
                                            (byte) 121, 5);
                                }
                                if ((i_94_ ^ 0xffffffff) == -1) {
                                    Class43.method955((Class4_Sub24.method639(
                                            (new JagexString[]{jagexString,
                                                    (Class54.aJagexString_1100)}),
                                            -842)),
                                            (Class4_Sub3.aJagexString_1895),
                                            (byte) 112, 5);
                                }
                            }
                            Class34.anIntArray1743[i_96_] = i_95_;
                            jagexString = null;
                            break;
                        }
                    }
                    boolean bool = false;
                    if (jagexString != null
                            && (GameShell.anInt23 ^ 0xffffffff) > -201) {
                        Class64.aLongArray1279[GameShell.anInt23] = l;
                        StringUtilities.aJagexStringArray2893[(GameShell.anInt23)] = jagexString;
                        Class50.anIntArray1005[GameShell.anInt23] = i_94_;
                        Class34.anIntArray1743[GameShell.anInt23] = i_95_;
                        GameShell.anInt23++;
                    }
                    Class4_Sub20_Sub1.anInt2718 = Class4_Sub20_Sub10.anInt3053;
                    int i_97_ = GameShell.anInt23;
                    while (i_97_ > 0) {
                        bool = true;
                        i_97_--;
                        for (int i_98_ = 0; (i_98_ ^ 0xffffffff) > (i_97_ ^ 0xffffffff); i_98_++) {
                            if ((((Class61.anInt1201 ^ 0xffffffff) != (Class50.anIntArray1005[i_98_] ^ 0xffffffff)) && (Class61.anInt1201 == Class50.anIntArray1005[1 + i_98_]))
                                    || (Class50.anIntArray1005[i_98_] == 0 && (Class50.anIntArray1005[1 + i_98_] != 0))) {
                                int i_99_ = Class50.anIntArray1005[i_98_];
                                Class50.anIntArray1005[i_98_] = Class50.anIntArray1005[1 + i_98_];
                                Class50.anIntArray1005[1 + i_98_] = i_99_;
                                bool = false;
                                JagexString jagexString_100_ = (StringUtilities.aJagexStringArray2893[i_98_]);
                                StringUtilities.aJagexStringArray2893[i_98_] = (StringUtilities.aJagexStringArray2893[i_98_ + 1]);
                                StringUtilities.aJagexStringArray2893[i_98_ + 1] = jagexString_100_;
                                long l_101_ = Class64.aLongArray1279[i_98_];
                                Class64.aLongArray1279[i_98_] = Class64.aLongArray1279[i_98_
                                        - -1];
                                Class64.aLongArray1279[i_98_ - -1] = l_101_;
                                int i_102_ = Class34.anIntArray1743[i_98_];
                                Class34.anIntArray1743[i_98_] = Class34.anIntArray1743[i_98_
                                        - -1];
                                Class34.anIntArray1743[1 + i_98_] = i_102_;
                            }
                        }
                        if (bool) {
                            break;
                        }
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 92) {
                    int interfaceId = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.readInt((byte) 73); // InterfaceId | Child
                    int type = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.readShort(); // Type
                    if ((interfaceId ^ 0xffffffff) > 69999) {
                        type += 32768;
                    }
                    RSInterface rsInterface;
                    if ((interfaceId ^ 0xffffffff) <= -1) {
                        rsInterface = RSInterface.forId(interfaceId);
                    } else {
                        rsInterface = null;
                    }
                    if (rsInterface != null) {
                        for (int i_105_ = 0; i_105_ < rsInterface.items.length; i_105_++) {
                            rsInterface.items[i_105_] = 0;
                            rsInterface.itemAmounts[i_105_] = 0;
                        }
                    }
                    Class76.method1187((byte) 115, type);
                    int itemCount = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.readShort(); // short
                    for (int itemIndex = 0; itemIndex < itemCount; itemIndex++) {
                        int amount = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.getC(); // readByteC(): //bytec
                        if (amount == 255) { // Item amount does not fit in byte if over 255
                            amount = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.readInt((byte) 73); // int
                        }
                        int itemId = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method213((byte) -113); // leshort
                        if (rsInterface != null && ((itemIndex ^ 0xffffffff) > (rsInterface.items.length ^ 0xffffffff))) {
                            rsInterface.items[itemIndex] = itemId;
                            rsInterface.itemAmounts[itemIndex] = amount;
                        }
                        Class4_Sub22.method630(amount, itemId - 1, itemIndex, -29787, type);
                    }
                    if (rsInterface != null) {
                        Class67.method1088(rsInterface);
                    }
                    Class4_Sub20_Sub7.method374();
                    Class2.anIntArray84[Class59.method1035(Class10.anInt306++,
                            31)] = Class59.method1035(32767, type);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 114) { // sendInterfaceModel?
                    int size = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.readLEInt(false);
                    int itemId = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.readShort();
                    if ((itemId ^ 0xffffffff) == -65536) {
                        itemId = -1;
                    }
                    int interfaceId = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.readLEInt(false);
                    RSInterface inter = RSInterface.forId(interfaceId);
                    if (!inter.aBoolean2178) {
                        if (itemId == -1) {
                            inter.anInt2137 = 0;
                            Class4_Sub20_Sub11.incomingPacket = -1;
                            return true;
                        }
                        Class4_Sub20_Sub8 class4_sub20_sub8 = Class4_Sub23
                                .method633(itemId, (byte) -115);
                        inter.anInt2137 = 4;
                        inter.anInt2213 = class4_sub20_sub8.anInt3003;
                        inter.anInt2250 = itemId;
                        inter.anInt2236 = class4_sub20_sub8.anInt2995;
                        inter.anInt2168 = class4_sub20_sub8.anInt2983
                                * 100 / size;
                        Class67.method1088(inter);
                    } else {
                        inter.anInt2143 = size;
                        inter.anInt2226 = itemId;
                        Class4_Sub20_Sub8 class4_sub20_sub8 = Class4_Sub23
                                .method633(itemId, (byte) -117);
                        inter.anInt2151 = class4_sub20_sub8.anInt2976;
                        inter.anInt2236 = class4_sub20_sub8.anInt2995;
                        inter.anInt2168 = class4_sub20_sub8.anInt2983;
                        if ((inter.anInt2156 ^ 0xffffffff) < -1) {
                            inter.anInt2168 = (32 * inter.anInt2168 / inter.anInt2156);
                        }
                        inter.anInt2213 = class4_sub20_sub8.anInt3003;
                        inter.anInt2148 = class4_sub20_sub8.anInt3010;
                        inter.anInt2224 = class4_sub20_sub8.anInt2965;
                        Class67.method1088(inter);
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 163) { // Run Energy sent as byte
                    Class4_Sub20_Sub7.method374();
                    Actor.runEnergy = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .get();
                    Class43.anInt868 = Class4_Sub20_Sub10.anInt3053;
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 108) { // Server message, sendmessage 128 in 317
                    JagexString jagexString = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method212();
                    if (jagexString.method826(StringUtilities.aJagexString_478, (byte) 126)) {
                        JagexString jagexString_113_ = (jagexString
                                .method829((byte) -122, 0, jagexString.method803(
                                        StringUtilities.aJagexString_2101, (byte) 117)));
                        long l = jagexString_113_.method806((byte) -25);
                        boolean bool = false;
                        for (int i_114_ = 0; JagexString.anInt1827 > i_114_; i_114_++) {
                            if ((l ^ 0xffffffffffffffffL) == (Class9.aLongArray284[i_114_] ^ 0xffffffffffffffffL)) {
                                bool = true;
                                break;
                            }
                        }
                        if (!bool && Class81.anInt1695 == 0) {
                            Class43.method955(GameShell.aJagexString_11,
                                    jagexString_113_, (byte) 108, 4);
                        }
                    } else if (jagexString.method826(StringUtilities.aJagexString_962,
                            (byte) 127)) {
                        JagexString jagexString_115_ = (jagexString.method829((byte) 19, 0,
                                jagexString.method803(StringUtilities.aJagexString_2101,
                                        (byte) -89)));
                        long l = jagexString_115_.method806((byte) -117);
                        boolean bool = false;
                        for (int i_116_ = 0; ((i_116_ ^ 0xffffffff) > (JagexString.anInt1827 ^ 0xffffffff)); i_116_++) {
                            if (Class9.aLongArray284[i_116_] == l) {
                                bool = true;
                                break;
                            }
                        }
                        if (!bool && Class81.anInt1695 == 0) {
                            Class43.method955(StringUtilities.aJagexString_2794,
                                    jagexString_115_, (byte) 122, 8);
                        }
                    } else if (jagexString.method826(StringUtilities.aJagexString_2518,
                            (byte) -6)) {
                        JagexString jagexString_117_ = (jagexString.method829((byte) 32, 0,
                                jagexString.method803(StringUtilities.aJagexString_2101,
                                        (byte) 30)));
                        long l = jagexString_117_.method806((byte) -25);
                        boolean bool = false;
                        for (int i_118_ = 0; i_118_ < JagexString.anInt1827; i_118_++) {
                            if (Class9.aLongArray284[i_118_] == l) {
                                bool = true;
                                break;
                            }
                        }
                        if (!bool && (Class81.anInt1695 ^ 0xffffffff) == -1) {
                            JagexString jagexString_119_ = (jagexString.method829(
                                    (byte) -119, jagexString.method803(
                                            (StringUtilities.aJagexString_2101),
                                            (byte) -18) + 1, jagexString
                                            .method825(-117) - 9));
                            Class43.method955(jagexString_119_, jagexString_117_,
                                    (byte) 125, 8);
                        }
                    } else if (!jagexString.method826(StringUtilities.aJagexString_565,
                            (byte) 123)) {
                        Class43.method955(jagexString, Class4_Sub3.aJagexString_1895,
                                (byte) 117, 0);
                    } else {
                        JagexString jagexString_120_ = (jagexString
                                .method829((byte) -128, 0, jagexString.method803(
                                        StringUtilities.aJagexString_2101, (byte) -74)));
                        long l = jagexString_120_.method806((byte) -49);
                        boolean bool = false;
                        for (int i_121_ = 0; ((JagexString.anInt1827 ^ 0xffffffff) < (i_121_ ^ 0xffffffff)); i_121_++) {
                            if ((l ^ 0xffffffffffffffffL) == (Class9.aLongArray284[i_121_] ^ 0xffffffffffffffffL)) {
                                bool = true;
                                break;
                            }
                        }
                        if (!bool && (Class81.anInt1695 ^ 0xffffffff) == -1) {
                            Class43.method955(Class4_Sub3.aJagexString_1895,
                                    jagexString_120_, (byte) 116, 10);
                        }
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 90) { // PLAYER UPDATE
                    Class4_Sub20_Sub7.method379(arg0 ^ 0x6e75);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 101) { // no data
                    for (int i_122_ = 0; Class31.anIntArray687.length > i_122_; i_122_++) {
                        if ((Class31.anIntArray687[i_122_] ^ 0xffffffff) != (Class19.anIntArray514[i_122_] ^ 0xffffffff)) {
                            Class31.anIntArray687[i_122_] = Class19.anIntArray514[i_122_];
                            Region.method65(i_122_, 2);
                            Class4_Sub20_Sub6.anIntArray2902[Class59
                                    .method1035(Class77.anInt1587++, 31)] = i_122_;
                        }
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 68) { // no data
                    Class1.anInt74 = 0;
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 137) { // maybe send player
                    int i_123_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readInt((byte) 73); // readInt()
                    Class4_Sub16 class4_sub16 = ((Class4_Sub16) Class31.aClass16_677
                            .method725((byte) 117, i_123_));
                    if (class4_sub16 != null) {
                        Class4_Sub20_Sub7_Sub3.method418(arg0 ^ ~0x73, true,
                                class4_sub16);
                    }
                    if (RSInterface.aClass4_Sub13_2141 != null) {
                        Class67.method1088(RSInterface.aClass4_Sub13_2141);
                        RSInterface.aClass4_Sub13_2141 = null;
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -90) {
                    long l = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readLong((byte) 33);
                    Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method229(40);
                    long l_124_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readLong((byte) 33);
                    long l_125_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readShort();
                    long l_126_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method248(false);
                    int i_127_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .get(); // readByte()
                    long l_128_ = (l_125_ << -749382304) - -l_126_;
                    boolean bool = false;
                    for (int i_129_ = 0; i_129_ < 100; i_129_++) {
                        if ((l_128_ ^ 0xffffffffffffffffL) == (Class18.aLongArray483[i_129_] ^ 0xffffffffffffffffL)) {
                            bool = true;
                            break;
                        }
                    }
                    if ((i_127_ ^ 0xffffffff) >= -2) {
                        for (int i_130_ = 0; i_130_ < JagexString.anInt1827; i_130_++) {
                            if (Class9.aLongArray284[i_130_] == l) {
                                bool = true;
                                break;
                            }
                        }
                    }
                    if (!bool && Class81.anInt1695 == 0) {
                        Class18.aLongArray483[RSCanvas.anInt53] = l_128_;
                        RSCanvas.anInt53 = (RSCanvas.anInt53 - -1) % 100;
                        JagexString jagexString = (Class4_Sub20_Sub12_Sub4
                                .method574(Class4_Sub22
                                        .method629(
                                                (byte) -83,
                                                Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883)
                                        .method801(false)));
                        if (i_127_ == 2 || (i_127_ ^ 0xffffffff) == -4) {
                            Class61.method1047(
                                    (Class4_Sub24.method639((new JagexString[]{
                                            Class64.aJagexString_1268,
                                            Class68.method1094(arg0 ^ ~0x36, l)
                                                    .method839(113)}), -842)),
                                    false, 9, Class68.method1094(-5, l_124_),
                                    jagexString);
                        } else if (i_127_ == 1) {
                            Class61.method1047(
                                    (Class4_Sub24.method639((new JagexString[]{
                                            StringUtilities.aJagexString_986,
                                            Class68.method1094(-5, l)
                                                    .method839(90)}), arg0
                                            ^ ~0x37b)), false, 9,
                                    Class68.method1094(arg0 + -55, l_124_),
                                    jagexString);
                        } else {
                            Class61.method1047(Class68.method1094(-5, l)
                                    .method839(arg0 + 43), false, 9, Class68
                                    .method1094(arg0 ^ ~0x36, l_124_), jagexString);
                        }
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 5) { // Play Music

                    int i_131_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method213((byte) -93);
                    if (i_131_ == 65535) {
                        i_131_ = -1;
                    }
                    System.out.println(i_131_);
                    Class4_Sub11_Sub1.method275((byte) 106, i_131_);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 86) {
                    int i_132_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method248(false);
                    int i_133_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method223(0);
                    if ((i_133_ ^ 0xffffffff) == -65536) {
                        i_133_ = -1;
                    }
                    Class46.method973(false, i_133_, i_132_);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 69) {
                    JagexString jagexString = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method212();
                    Object[] objects = new Object[jagexString
                            .method825(arg0 + -159) - -1];
                    for (int i_134_ = jagexString.method825(-118) + -1; i_134_ >= 0; i_134_--) {
                        if (jagexString.method834(21340, i_134_) != 115) {
                            objects[i_134_ + 1] = new Integer(
                                    Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                            .readInt((byte) 73));
                        } else {
                            objects[i_134_ + 1] = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                    .method212();
                        }
                    }
                    objects[0] = new Integer(
                            Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                    .readInt((byte) 73));
                    Class4_Sub14 class4_sub14 = new Class4_Sub14();
                    class4_sub14.anObjectArray2267 = objects;
                    Class16.method721(1, class4_sub14);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -144) {
                    Class4_Sub20_Sub9.minimapState = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .get(); // readByte()
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 167) { // Maybe logout
                    Class40.method935(0);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return false;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -200) {
                    Class4_Sub20_Sub7.method374();
                    Class77.anInt1588 = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method238((byte) -80);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    Class43.anInt868 = Class4_Sub20_Sub10.anInt3053;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 244) { // interface child colour
                    int i_135_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readInt((byte) 73);
                    int i_136_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method223(arg0 ^ 0x32);
                    int i_137_ = (i_136_ & 0x7c6d) >> 198761418;
                    int i_138_ = (0x3fe & i_136_) >> -1750503739;
                    int i_139_ = 0x1f & i_136_;
                    int i_140_ = ((i_137_ << 467836531)
                            + (i_138_ << -979714677) - -(i_139_ << 1613932035));
                    RSInterface class4_sub13 = RSInterface.forId(
                            i_135_);
                    if (class4_sub13.anInt2195 != i_140_) {
                        class4_sub13.anInt2195 = i_140_;
                        Class67.method1088(class4_sub13);
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -76) {
                    JagexString.anInt1827 = Class4_Sub20_Sub15.packetSize / 8;
                    for (int i_141_ = 0; ((JagexString.anInt1827 ^ 0xffffffff) < (i_141_ ^ 0xffffffff)); i_141_++) {
                        Class9.aLongArray284[i_141_] = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                                .readLong((byte) 33);
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    Class4_Sub20_Sub1.anInt2718 = Class4_Sub20_Sub10.anInt3053;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -38) {
                    int i_142_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method223(0); // shorta
                    int i_143_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readLEInt(false); // leint
                    Class19.anIntArray514[i_142_] = i_143_;
                    if (i_143_ != Class31.anIntArray687[i_142_]) {
                        Class31.anIntArray687[i_142_] = i_143_;
                        Region.method65(i_142_, 2);
                    }
                    Class4_Sub20_Sub6.anIntArray2902[Class59.method1035(31,
                            Class77.anInt1587++)] = i_142_;
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if (Class4_Sub20_Sub11.incomingPacket == 207) { // npc head
                    int i_144_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method235((byte) -81); // readLEShortA() id
                    int i_145_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readInt((byte) 73); // readInt() inter
                    RSInterface class4_sub13 = RSInterface.forId(
                            i_145_);
                    if ((class4_sub13.anInt2137 ^ 0xffffffff) != -3
                            || (i_144_ ^ 0xffffffff) != (class4_sub13.anInt2250 ^ 0xffffffff)) {
                        class4_sub13.anInt2250 = i_144_;
                        class4_sub13.anInt2137 = 2;
                        Class67.method1088(class4_sub13);
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -24) {
                    long l = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readLong((byte) 33);
                    JagexString jagexString = (Class4_Sub20_Sub12_Sub4
                            .method574(Class4_Sub22.method629((byte) -83,
                                    Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883)
                                    .method801(false)));
                    Class43.method955(jagexString, Class68
                                    .method1094(arg0 + -55, l).method839(119),
                            (byte) 112, 6);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -105) {
                    long l = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readLong((byte) 33);
                    int i_146_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .readShort();
                    boolean bool = false;
                    if ((l & ~0x7fffffffffffffffL ^ 0xffffffffffffffffL) != -1L) {
                        bool = true;
                    }
                    byte i_147_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
                            .method229(30);
                    if (bool) {
                        if (Class4_Sub10.anInt2021 == 0) {
                            Class4_Sub20_Sub11.incomingPacket = -1;
                            return true;
                        }
                        l &= 0x7fffffffffffffffL;
                        int i_149_;
                        for (i_149_ = 0; ((Class4_Sub10.anInt2021 ^ 0xffffffff) < (i_149_ ^ 0xffffffff)); i_149_++) {
                            if ((Class13_Sub2.aClass4_Sub8Array2482[i_149_].aLong150) == l
                                    && i_146_ == (Class13_Sub2.aClass4_Sub8Array2482[i_149_].anInt1969)) {
                                break;
                            }
                        }
                        if ((i_149_ ^ 0xffffffff) > (Class4_Sub10.anInt2021 ^ 0xffffffff)) {
                            for (/**/; Class4_Sub10.anInt2021 - 1 > i_149_; i_149_++) {
                                Class13_Sub2.aClass4_Sub8Array2482[i_149_] = (Class13_Sub2.aClass4_Sub8Array2482[1 + i_149_]);
                            }
                            Class13_Sub2.aClass4_Sub8Array2482[(Class4_Sub10.anInt2021)] = null;
                            Class4_Sub10.anInt2021--;
                        }
                    } else {
                        Class4_Sub8 class4_sub8 = new Class4_Sub8();
                        class4_sub8.aLong150 = l;
                        class4_sub8.aJagexString_1975 = Class68.method1094(-5,
                                class4_sub8.aLong150);
                        class4_sub8.aByte1973 = i_147_;
                        class4_sub8.anInt1969 = i_146_;
                        int i_150_;
                        for (i_150_ = Class4_Sub10.anInt2021 - 1; i_150_ >= 0; i_150_--) {
                            int i_151_ = (Class13_Sub2.aClass4_Sub8Array2482[i_150_].aJagexString_1975
                                    .method813(arg0 ^ 0xcd,
                                            class4_sub8.aJagexString_1975));
                            if ((i_151_ ^ 0xffffffff) == -1) {
                                Class13_Sub2.aClass4_Sub8Array2482[i_150_].anInt1969 = i_146_;
                                Class13_Sub2.aClass4_Sub8Array2482[i_150_].aByte1973 = i_147_;
                                if (Class25.aLong584 == l) {
                                    Class27.aByte613 = i_147_;
                                }
                                Class4_Sub20_Sub11.incomingPacket = -1;
                                Class4_Sub20_Sub7.anInt2948 = Region.pulseCycle;
                                return true;
                            }
                            if ((i_151_ ^ 0xffffffff) > -1) {
                                break;
                            }
                        }
                        if ((Class13_Sub2.aClass4_Sub8Array2482.length ^ 0xffffffff) >= (Class4_Sub10.anInt2021 ^ 0xffffffff)) {
                            Class4_Sub20_Sub11.incomingPacket = -1;
                            return true;
                        }
                        for (int i_152_ = -1 + Class4_Sub10.anInt2021; i_150_ < i_152_; i_152_--) {
                            Class13_Sub2.aClass4_Sub8Array2482[i_152_ - -1] = Class13_Sub2.aClass4_Sub8Array2482[i_152_];
                        }
                        if (Class4_Sub10.anInt2021 == 0) {
                            Class13_Sub2.aClass4_Sub8Array2482 = new Class4_Sub8[100];
                        }
                        Class13_Sub2.aClass4_Sub8Array2482[i_150_ - -1] = class4_sub8;
                        Class4_Sub10.anInt2021++;
                        if (Class25.aLong584 == l) {
                            Class27.aByte613 = i_147_;
                        }
                    }
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    Class4_Sub20_Sub7.anInt2948 = Region.pulseCycle;
                    return true;
                }
                if ((Class4_Sub20_Sub11.incomingPacket ^ 0xffffffff) == -223) {
                    Class67.method1086(true, (byte) 84);
                    Class4_Sub20_Sub11.incomingPacket = -1;
                    return true;
                }
                Class4_Sub20_Sub7_Sub4.method422(null, arg0 ^ ~0x41,
                        ("T1 - " + Class4_Sub20_Sub11.incomingPacket + ","
                                + Class41.anInt822 + "," + RSCanvas.anInt56
                                + " - " + Class4_Sub20_Sub15.packetSize));
                Class40.method935(0);
            } catch (java.io.IOException ioexception) {
                Class11.method674(arg0 + -51);
            } catch (Exception exception) {
                String string = ("T2 - "
                        + Class4_Sub20_Sub11.incomingPacket
                        + ","
                        + Class41.anInt822
                        + ","
                        + RSCanvas.anInt56
                        + " - "
                        + Class4_Sub20_Sub15.packetSize
                        + ","
                        + ((Class4_Sub15.localPlayer.anIntArray3248[0]) + Class6.anInt217)
                        + ","
                        + ((Class4_Sub15.localPlayer.anIntArray3247[0]) + Class4_Sub20_Sub8.anInt2987) + " - ");
                for (int i = 0; (Class4_Sub20_Sub15.packetSize > i && (i ^ 0xffffffff) > -51); i++) {
                    string += (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.byteBuffer[i])
                            + ",";
                }
                Class4_Sub20_Sub7_Sub4.method422(exception, -85, string);
                Class40.method935(arg0 + -50);
            }
            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "na.D("
                    + arg0 + ')');
        }
    }

    public static void method992(byte arg0) {
        try {
            for (Class4_Sub22 class4_sub22 = ((Class4_Sub22) Buffer.aClass65_2073
                    .method1071(-127)); class4_sub22 != null; class4_sub22 = (Class4_Sub22) Buffer.aClass65_2073
                    .method1075(18485)) {
                if (class4_sub22.aClass4_Sub2_Sub3_2393 != null) {
                    RSFont.aClass4_Sub2_Sub2_139
                            .method122(class4_sub22.aClass4_Sub2_Sub3_2393);
                    class4_sub22.aClass4_Sub2_Sub3_2393 = null;
                }
                if (class4_sub22.aClass4_Sub2_Sub3_2390 != null) {
                    RSFont.aClass4_Sub2_Sub2_139
                            .method122(class4_sub22.aClass4_Sub2_Sub3_2390);
                    class4_sub22.aClass4_Sub2_Sub3_2390 = null;
                }
            }
            anInt998++;
            if (arg0 < 85) {
                anIntArray1003 = null;
            }
            Buffer.aClass65_2073.method1070((byte) -97);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "na.B("
                    + arg0 + ')');
        }
    }

    @Override
    public void run() {
        try {
            anInt992++;
            try {
                for (; ; ) {
                    Class4_Sub12 class4_sub12;
                    synchronized (Class37.aClass65_766) {
                        class4_sub12 = ((Class4_Sub12) Class37.aClass65_766
                                .method1071(-122));
                    }
                    if (class4_sub12 != null) {
                        if (class4_sub12.anInt2124 != 0) {
                            if ((class4_sub12.anInt2124 ^ 0xffffffff) == -2) {
                                class4_sub12.aByteArray2122 = (class4_sub12.aClass10_2117
                                        .method670((int) class4_sub12.aLong150,
                                                255));
                                synchronized (Class37.aClass65_766) {
                                    Class13.aClass65_383.method1068(
                                            class4_sub12, (byte) -126);
                                }
                            }
                        } else {
                            class4_sub12.aClass10_2117.method666(
                                    class4_sub12.aByteArray2122.length,
                                    (int) class4_sub12.aLong150, 27463,
                                    class4_sub12.aByteArray2122);
                            synchronized (Class37.aClass65_766) {
                                class4_sub12.clear();
                            }
                        }
                        synchronized (Class12.anObject366) {
                            if (Class10.anInt307 <= 1) {
                                Class10.anInt307 = 0;
                                Class12.anObject366.notifyAll();
                                break;
                            }
                            Class10.anInt307 = 600;
                        }
                    } else {
                        Class25.method799(100L, 10);
                        synchronized (Class12.anObject366) {
                            if (Class10.anInt307 <= 1) {
                                Class10.anInt307 = 0;
                                Class12.anObject366.notifyAll();
                                break;
                            }
                            Class10.anInt307--;
                        }
                    }
                }
            } catch (Exception exception) {
                Class4_Sub20_Sub7_Sub4.method422(exception, -101, null);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
                    "na.run(" + ')');
        }
    }
}
