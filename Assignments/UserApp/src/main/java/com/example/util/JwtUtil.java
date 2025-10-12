
package com.example.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import com.example.model.User;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Date;

public class JwtUtil {
    private static final String SECRET = generateSecret(32);
    private static final Algorithm alg = Algorithm.HMAC256(SECRET);

    public static String generateAccessToken(User u) {
        return JWT.create()
                .withSubject(String.valueOf(u.getId()))
                .withClaim("name", u.getName())
                .withExpiresAt(new Date(System.currentTimeMillis() + 5*60*1000))
                .sign(alg);
    }

    public static String generateRefreshToken(User u) {
        return JWT.create()
                .withSubject(String.valueOf(u.getId()))
                .withExpiresAt(new Date(System.currentTimeMillis() + 7L*24*60*60*1000))
                .sign(alg);
    }
    public static DecodedJWT verifyToken(String token) {
        JWTVerifier verifier = JWT.require(alg).build();
        return verifier.verify(token);
    }
    public static String generateSecret(int byteLength) {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[byteLength];
        random.nextBytes(bytes);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
    }
}
