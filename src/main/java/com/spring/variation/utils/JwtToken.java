package com.spring.variation.utils;

import java.util.Date;
import java.util.UUID;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtToken {
 
    private static long time = 1000*60*300;
    private static String signature = "admin";
    //创建token的方法
    public static String createToken(String userName, String role){
        JwtBuilder jwtBuilder = Jwts.builder();
        String jwtToken = jwtBuilder
                //header
                .setHeaderParam("typ","JWT")
                .setHeaderParam("alg","HS256")
                //payload
                .claim("username",userName)
                .claim("role",role)
                .setSubject("admin-test")
                .setExpiration(new Date(System.currentTimeMillis()+time))
                .setId(UUID.randomUUID().toString())
                //signature
                .signWith(SignatureAlgorithm.HS256,signature)
                .compact();
        return jwtToken;
    }
    //校验token，布尔类型
    public static boolean checkToken(String token){
        if (token ==null){
            return false;
        }
        try {
            Jws<Claims> claimsJws = Jwts.parser().setSigningKey(signature).parseClaimsJws(token);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}