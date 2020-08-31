package com.youmias.elephant.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import com.youmias.elephant.po.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * @Description Jwt工具类，生成JWT和认证
 * @Author zpw
 */
public class JwtUtil {

	private static final Logger log = LoggerFactory.getLogger(JwtUtil.class);
	/**
	 * 密钥
	 */
	private static final String SECRET = "my_secret"; //自定义secret

	/**
	 * 过期时间
	 **/
	private static final long EXPIRATION = 1800L;//单位为秒

	/**
	 * 生成用户token,设置token超时时间
	 */
	public static String createToken(User user) {
		//过期时间
		Date expireDate = new Date(System.currentTimeMillis() + EXPIRATION * 1000);
		Map<String, Object> map = new HashMap<>();
		map.put("alg", "HS256"); //声明加密的算法 通常直接使用 HMAC SHA256
		map.put("typ", "JWT"); //声明类型，这里是jwt
		String token = JWT.create()
				.withHeader(map)// 添加头部
				//可以将基本信息放到claims中
				.withClaim("id", user.getId()) //userId
				.withExpiresAt(expireDate) //超时设置,设置过期的日期
				.withIssuedAt(new Date()) //签发时间
				.sign(Algorithm.HMAC256(SECRET)); //SECRET加密
		return token;
	}

	/**
	 * 校验token并解析token
	 */
	public static Map<String, Claim> verifyToken(String token) {
		DecodedJWT jwt = null;
		try {
			JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET)).build();
			jwt = verifier.verify(token);
		} catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
		return jwt.getClaims();
	}

}

