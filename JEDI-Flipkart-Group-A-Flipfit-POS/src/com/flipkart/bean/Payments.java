package com.flipkart.bean;

/**
 * Represents a payment transaction with details such as card information and payment ID.
 * Contains information about the payment's unique identifier, card number, expiry date, cardholder's name, and CVV.
 *
 * @author Adarsh, Shriya
 */
public class Payments {

    /**
     * Unique identifier for the payment transaction.
     */
    private int paymentsId;

    /**
     * Credit or debit card number used for the payment.
     */
    private String cardNumber;

    /**
     * Expiry date of the card in the format MM/YY.
     */
    private String expiryDate;

    /**
     * Name of the cardholder as printed on the card.
     */
    private String name;

    /**
     * CVV (Card Verification Value) of the card.
     */
    private String cvv;

    /**
     * Gets the unique identifier for the payment transaction.
     *
     * @return the paymentsId, which is the unique identifier for the payment.
     * @author Adarsh, Shriya
     */
    public int getPaymentId() {
        return paymentsId;
    }

    /**
     * Sets the unique identifier for the payment transaction.
     *
     * @param paymentsId the paymentsId to set, which is the unique identifier for the payment.
     * @author Adarsh, Shriya
     */
    public void setPaymentsId(int paymentsId) {
        this.paymentsId = paymentsId;
    }

    /**
     * Gets the credit or debit card number used for the payment.
     *
     * @return the cardNumber, which is the card number used for the payment.
     * @author Adarsh, Shriya
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the credit or debit card number used for the payment.
     *
     * @param cardNumber the cardNumber to set, which is the card number used for the payment.
     * @author Adarsh, Shriya
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Gets the expiry date of the card.
     *
     * @return the expiryDate of the card in the format MM/YY.
     * @author Adarsh, Shriya
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the expiry date of the card.
     *
     * @param expiryDate the expiryDate to set, in the format MM/YY.
     * @author Adarsh, Shriya
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * Gets the name of the cardholder as printed on the card.
     *
     * @return the name of the cardholder.
     * @author Adarsh, Shriya
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the cardholder as printed on the card.
     *
     * @param name the name to set, which is the cardholder's name.
     * @author Adarsh, Shriya
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the CVV (Card Verification Value) of the card.
     *
     * @return the cvv of the card.
     * @author Adarsh, Shriya
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * Sets the CVV (Card Verification Value) of the card.
     *
     * @param cvv the cvv to set, which is the card verification value.
     * @author Adarsh, Shriya
     */
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}



//package com.flipkart.bean;
//
//public class Payments {
//
//    private int paymentsId;
//    private String cardNumber;
//    private String expiryDate;
//    private String name;
//    private String cvv;
//
//    public int getPaymentId() {
//        return paymentsId;
//    }
//
//    public void setPaymentsId(int paymentsId) {
//        this.paymentsId = paymentsId;
//    }
//
//    public String getCardNumber() {
//        return cardNumber;
//    }
//
//    public void setCardNumber(String cardNumber) {
//        this.cardNumber = cardNumber;
//    }
//
//    public String getExpiryDate() {
//        return expiryDate;
//    }
//
//    public void setExpiryDate(String expiryDate) {
//        this.expiryDate = expiryDate;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCvv() {
//        return cvv;
//    }
//
//    public void setCvv(String cvv) {
//        this.cvv = cvv;
//    }
//}


