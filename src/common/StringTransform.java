/*
 *                        .::::.
 *                      .::::::::.
 *                     :::::::::::
 *                  ..:::::::::::'
 *               '::::::::::::'
 *                 .::::::::::
 *            '::::::::::::::..
 *                 ..::::::::::::.
 *               ``::::::::::::::::
 *                ::::``:::::::::'        .:::.
 *               ::::'   ':::::'       .::::::::.
 *             .::::'      ::::     .:::::::'::::.
 *            .:::'       :::::  .:::::::::' ':::::.
 *           .::'        :::::.:::::::::'      ':::::.
 *          .::'         ::::::::::::::'         ``::::.
 *      ...:::           ::::::::::::'              ``::.
 *     ````':.          ':::::::::'                  ::::..
 *                        '.:::::'                    ':'````..
 */

package com;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class StringTransform {


    
//接收来自页面的数据
    public String getInfo(String string, String method) {
        String result = null;
        switch (method) {
            case "base64encode":
                result = stringToBase64(string);
                break;
            case "base64decode":
                result = base64ToString(string);
                break;
            case "md5":
                result = md5Encode(string);
                break;
            case "stringtohex":
                result = stringToHex(string);
                break;
            case "hextostring":
                result = hexToString(string);
                break;
            case "":
                break;
            // 可以添加更多的 case 语句
            default:
                result = new String("勾八说了没开发你看不见吗？？？？？");
                break;
        }


        return result;
    }


//base64编码
    public String stringToBase64(String string){
        String encodedString = Base64.getEncoder().encodeToString(string.getBytes());
        return encodedString;

    }

//base64解码
    public String base64ToString(String string){
        byte[] decodedBytes = Base64.getDecoder().decode(string);
        String decodedText = new String(decodedBytes);
        return decodedText;
    }

//md5加密
    public String md5Encode(String string) {
        String hashedText = null;
        try {
            // 获取 MessageDigest 实例，并指定算法为 MD5
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            // 将要加密的文本转换为字节数组，并进行加密
            byte[] hashedBytes = messageDigest.digest(string.getBytes());
            // 将字节数组转换为十六进制字符串
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : hashedBytes) {
                stringBuilder.append(String.format("%02x", b));
            }
            hashedText = stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hashedText;
    }

//字符串转16进制
    public String stringToHex(String string){
        byte[] bytes = string.getBytes();

        // 将字节数组中的每个字节转换为十六进制字符串
        StringBuilder hexBuilder = new StringBuilder();
        for (byte b : bytes) {
            hexBuilder.append(Integer.toHexString(b & 0xFF));
        }
        String hexString = hexBuilder.toString();
        return hexString;
    }

//16进制转字符串
    public String hexToString(String string){
        byte[] bytes = new byte[string.length() / 2];
        for (int i = 0; i < bytes.length; i++) {
            int index = i * 2;
            int value = Integer.parseInt(string.substring(index, index + 2), 16);
            bytes[i] = (byte) value;
        }
        // 将字节数组转换为字符串
        String text = new String(bytes);
        return text;
    }




}
