package com.spring.variation.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.tomcat.util.codec.binary.Base64;

import cn.hutool.crypto.SecureUtil;

import java.util.UUID;


public class AesUtil {

    /**
     * 加密方法
     * @param data  要加密的数据
     * @param key 加密key
     * @return 加密的结果
     * @throws Exception
     */
    public static String encrypt(String data, String key){
        try {
            String iv = key;
            //"算法/模式/补码方式"NoPadding PkcsPadding
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            int blockSize = cipher.getBlockSize();

            byte[] dataBytes = data.getBytes();
            int plaintextLength = dataBytes.length;
            if (plaintextLength % blockSize != 0) {
                plaintextLength = plaintextLength + (blockSize - (plaintextLength % blockSize));
            }

            byte[] plaintext = new byte[plaintextLength];
            System.arraycopy(dataBytes, 0, plaintext, 0, dataBytes.length);

            SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(), "AES");
            IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());

            cipher.init(Cipher.ENCRYPT_MODE, keyspec, ivspec);
            byte[] encrypted = cipher.doFinal(plaintext);

            return new Base64().encodeToString(encrypted);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 解密方法
     * @param data 要解密的数据
     * @param key  解密key
     * @return 解密的结果
     * @throws Exception
     */
    public static String desEncrypt(String data, String key) {
        try {
            String iv = "4t5dac4nhxz41e6u";
            byte[] encrypted1 = new Base64().decode(data);
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(), "AES");
            IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());

            cipher.init(Cipher.DECRYPT_MODE, keyspec, ivspec);

            byte[] original = cipher.doFinal(encrypted1);
            String originalString = new String(original, "utf-8");
            return originalString;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 生成默认的 key 和 iv,key = iv iv 的长度必须是16位
    **/
    public static String generateKeyAndIv(){
        String uid = SecureUtil.md5(String.valueOf(System.currentTimeMillis()));
        // 盐加密
        String salt = UUID.randomUUID().toString();
        uid = SecureUtil.md5(uid + salt);
        return uid.substring(16);
    }

}
