package com.flipkart.bean;

import java.util.List;

/**
 * Represents a gym owner with details such as personal information, credentials, and associated gyms.
 * Contains information about the owner's ID, email, phone number, and other identification details.
 *
 * @author Nitish, Chahat
 */
public class GymOwner {

    /**
     * Unique identifier for the gym owner.
     */
    private int ownerId;

    /**
     * Email address of the gym owner.
     */
    private String ownerEmail;

    /**
     * Password for the gym owner's account.
     */
    private String password;

    /**
     * Phone number of the gym owner.
     */
    private String phoneNo;

    /**
     * National identification number of the gym owner.
     */
    private String nationalId;

    /**
     * GST (Goods and Services Tax) number for the gym owner.
     */
    private String GST;

    /**
     * List of gyms owned by the gym owner.
     */
    private List<Gym> gyms;

    /**
     * PAN (Permanent Account Number) for the gym owner.
     */
    private String PAN;

    /**
     * Name of the gym owner.
     */
    private String ownerName;

    /**
     * Status of the gym owner's account (e.g., active, inactive).
     * Note: This field is commented out in the provided code. It may be intended for future use or was temporarily removed.
     */
    // private String status; // what is the use?

    /**
     * Verification status of the gym owner's account (e.g., verified, unverified).
     */
    private String verificationStatus;

    /**
     * Gets the unique identifier for the gym owner.
     *
     * @return the ownerId, which is the unique identifier for the gym owner.
     * @author Nitish, Chahat
     */
    public int getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the unique identifier for the gym owner.
     *
     * @param ownerId the ownerId to set, which is the unique identifier for the gym owner.
     * @author Nitish, Chahat
     */
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * Gets the email address of the gym owner.
     *
     * @return the ownerEmail, which is the email address of the gym owner.
     * @author Nitish, Chahat
     */
    public String getOwnerEmail() {
        return ownerEmail;
    }

    /**
     * Sets the email address of the gym owner.
     *
     * @param ownerEmail the ownerEmail to set, which is the email address of the gym owner.
     * @author Nitish, Chahat
     */
    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    /**
     * Gets the password for the gym owner's account.
     *
     * @return the password for the gym owner's account.
     * @author Nitish, Chahat
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password for the gym owner's account.
     *
     * @param password the password to set for the gym owner's account.
     * @author Nitish, Chahat
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the phone number of the gym owner.
     *
     * @return the phoneNo, which is the phone number of the gym owner.
     * @author Nitish, Chahat
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * Sets the phone number of the gym owner.
     *
     * @param phoneNo the phoneNo to set, which is the phone number of the gym owner.
     * @author Nitish, Chahat
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * Gets the national ID of the gym owner.
     *
     * @return the nationalId, which is the national identification number of the gym owner.
     * @author Nitish, Chahat
     */
    public String getNationalId() {
        return nationalId;
    }

    /**
     * Sets the national ID of the gym owner.
     *
     * @param nationalId the nationalId to set, which is the national identification number of the gym owner.
     * @author Nitish, Chahat
     */
    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    /**
     * Gets the GST number of the gym owner.
     *
     * @return the GST number for the gym owner.
     * @author Nitish, Chahat
     */
    public String getGST() {
        return GST;
    }

    /**
     * Sets the GST number of the gym owner.
     *
     * @param GST the GST number to set for the gym owner.
     * @author Nitish, Chahat
     */
    public void setGST(String GST) {
        this.GST = GST;
    }

    /**
     * Gets the list of gyms owned by the gym owner.
     *
     * @return the list of gyms.
     * @author Nitish, Chahat
     */
    public List<Gym> getGyms() {
        return gyms;
    }

    /**
     * Sets the list of gyms owned by the gym owner.
     *
     * @param gyms the list of gyms to set.
     * @author Nitish, Chahat
     */
    public void setGyms(List<Gym> gyms) {
        this.gyms = gyms;
    }

    /**
     * Gets the PAN number of the gym owner.
     *
     * @return the PAN number for the gym owner.
     * @author Nitish, Chahat
     */
    public String getPAN() {
        return PAN;
    }

    /**
     * Sets the PAN number of the gym owner.
     *
     * @param PAN the PAN number to set for the gym owner.
     * @author Nitish, Chahat
     */
    public void setPAN(String PAN) {
        this.PAN = PAN;
    }

    /**
     * Gets the name of the gym owner.
     *
     * @return the ownerName, which is the name of the gym owner.
     * @author Nitish, Chahat
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the name of the gym owner.
     *
     * @param ownerName the ownerName to set, which is the name of the gym owner.
     * @author Nitish, Chahat
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Gets the verification status of the gym owner's account.
     *
     * @return the verification status of the gym owner's account (e.g., "verified", "unverified").
     * @author Nitish, Chahat
     */
    public String getVerificationStatus() {
        return verificationStatus;
    }

    /**
     * Sets the verification status of the gym owner's account.
     *
     * @param verificationStatus the verification status to set (e.g., "verified", "unverified").
     * @author Nitish, Chahat
     */
    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }
}



//package com.flipkart.bean;
//
//import java.util.List;
//
//public class GymOwner {
//    private int ownerId;
//    private String ownerEmail;
//    private String password;
//    private String phoneNo;
//    private String nationalId;
//    private String GST;
//    private List<Gym> gyms;
//    private String PAN;
//    private String ownerName;
//    // private String status; // what is the use?
//    private String verificationStatus;
//    private String status;
//
//    public int getOwnerId() {
//        return ownerId;
//    }
//
//    public void setOwnerId(int ownerId) {
//        this.ownerId = ownerId;
//    }
//
//    public String getOwnerEmail() {
//        return ownerEmail;
//    }
//
//    public void setOwnerEmail(String ownerEmail) {
//        this.ownerEmail = ownerEmail;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getPhoneNo() {
//        return phoneNo;
//    }
//
//    public void setPhoneNo(String phoneNo) {
//        this.phoneNo = phoneNo;
//    }
//
//    public String getNationalId() {
//        return nationalId;
//    }
//
//    public void setNationalId(String nationalId) {
//        this.nationalId = nationalId;
//    }
//
//    public String getGST() {
//        return GST;
//    }
//
//    public void setGST(String GST) {
//        this.GST = GST;
//    }
//
//    public List<Gym> getGyms() {
//        return gyms;
//    }
//
//    public void setGyms(List<Gym> gyms) {
//        this.gyms = gyms;
//    }
//
//    public String getPAN() {
//        return PAN;
//    }
//
//    public void setPAN(String PAN) {
//        this.PAN = PAN;
//    }
//
//    public String getOwnerName() {
//        return ownerName;
//    }
//
//    public void setOwnerName(String ownerName) {
//        this.ownerName = ownerName;
//    }
//
//    public String getStatus() {
//     return status;
//   }
//
//   public void setStatus(String status) {
//       this.status = status;
//    }
//
//    public String getVerificationStatus() {
//        return verificationStatus;
//    }
//
//    public void setVerificationStatus(String verificationStatus) {
//        this.verificationStatus = verificationStatus;
//    }
//
//
//}