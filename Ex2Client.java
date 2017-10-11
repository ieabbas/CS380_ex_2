/* CS 380 - Computer Networks
 * Exercise 2 : CRC Client Checking
 * Ismail Abbas
 */

 import java.util.*;
 import java.io.*;
 import java.util.zip.CRC32;
 
 /*
  * This class will connect to a socket on a specified server. It will then
  * receive 100 bytes at half a byte each. Then it will reconstruct the message
  * , and generate the CRC code as a sequence of four bytes and send it back to
  * the server.
  */
 public class Ex2Client {
	 
	 /*
	  * This is...the main method which performs the general function of the
	  * class.
	  */
	  public static void main(String[]args) {
		  
		 // Like everything that isn't guaranteed in life, you have to try
		 // before giving up
		 try {
			 
		 }
	  }
	  

	/*
	 * This method will read the response from the server to test
	 * if the generated CRC code was correct
	 */
    public static boolean checkResponse(Socket s) {
        try {
            InputStream isStr = s.getInputStream();
            int successCode = is.read();
			// "If the boolean equals 1, return true for the method, else false"
            return (successCode == 1) ? true : false;
        } catch (Exception e) { }
		// This is just to satisfy Java coding conventions for methods
        return false;
    }
 }