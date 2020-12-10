/**
 * 
 */
package by.aaproduction.tpt.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import by.aaproduction.tpt.dao.bean.User;
import by.aaproduction.tpt.service.exception.ServiceException;

/**
 * @author Artsemy
 *
 */
public class Hasher {

	public static boolean isEqualPasswordHash(String password, User user) throws ServiceException {
		String hash = getSecurePassword(password, user.getSalt());
		return hash.equals(user.getPasswordHash());
	}
	
	public static String getSecurePassword(String password, String salt) throws ServiceException {
		String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(salt.getBytes());
            byte[] bytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        } catch (NoSuchAlgorithmException ex) {
        	throw new ServiceException(ex);
        }
        return generatedPassword;
    }
	
	public static String getSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return new String(salt);
    }
}
