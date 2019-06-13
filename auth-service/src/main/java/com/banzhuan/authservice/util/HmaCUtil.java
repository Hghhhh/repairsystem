package com.banzhuan.authservice.util;

import org.apache.shiro.codec.Hex;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class HmaCUtil {


    public static String hmacDigest(String data,String enAlgorithm,String secretkey){
        String checksum = null;
        try{
            Mac mac = Mac.getInstance(enAlgorithm);
            byte[] secretByte = secretkey.getBytes("UTF-8");
            byte[] dataBytes = data.getBytes("UTF-8");
            SecretKey secretKey = new SecretKeySpec(secretByte,enAlgorithm);
            mac.init(secretKey);
            byte[] doFinal = mac.doFinal(dataBytes);
            char[] hexB = Hex.encode(doFinal);
            checksum = new String(hexB);
        }catch (Exception e){
            e.printStackTrace();
        }
        return checksum;
    }

}
