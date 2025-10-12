package com.example.util;

import redis.clients.jedis.Jedis;

public class RedisUtil {

    private static final String HOST = "localhost";
    private static final int PORT = 6379;

    public static Jedis getConnection() {
        return new Jedis(HOST, PORT);
    }

    public static void saveSession(int userId, String sessionId, int expirySec) {
        try(Jedis jedis = getConnection()) {
            jedis.setex("session:" + userId, expirySec, sessionId);
        }
    }

    public static String getSession(int userId) {
        try(Jedis jedis = getConnection()) {
            return jedis.get("session:" + userId);
        }
    }

    public static void deleteSession(int userId) {
        try(Jedis jedis = getConnection()) {
            jedis.del("session:" + userId);
        }
    }

    public static void saveAccessToken(String token, int userId, int expirySec) {
        try(Jedis jedis = getConnection()) {
            jedis.setex("access:" + token, expirySec, String.valueOf(userId));
        }
    }

    public static String getUserIdByAccessToken(String token) {
        try(Jedis jedis = getConnection()) {
            return jedis.get("access:" + token);
        }
    }

    public static void deleteAccessToken(String token) {
        try(Jedis jedis = getConnection()) {
            jedis.del("access:" + token);
        }
    }

    public static void saveRefreshToken(String token, int userId, int expirySec) {
        try(Jedis jedis = getConnection()) {
            jedis.setex("refresh:" + token, expirySec, String.valueOf(userId));
        }
    }

    public static String getUserIdByRefreshToken(String token) {
        try(Jedis jedis = getConnection()) {
            return jedis.get("refresh:" + token);
        }
    }

    public static void deleteRefreshToken(String token) {
        try(Jedis jedis = getConnection()) {
            jedis.del("refresh:" + token);
        }
    }
}
