package com.bezkoder.spring.datajpa.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transactionLog")
public class TransactionLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "billNo")
    private String billNo;

    @Column(name = "items")
    private String items;

    @Column(name = "name")
    private String name;

    @Column(name = "mobileNumber")
    private String mobileNumber;

    @Column(name = "total")
    private int total;

    @Column(name = "date")
    private Date date;

    public TransactionLog() {
    }

    public TransactionLog(String billNo, String items, String name, String mobileNumber, int total, Date date) {
        this.billNo = billNo;
        this.items = items;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.total = total;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
