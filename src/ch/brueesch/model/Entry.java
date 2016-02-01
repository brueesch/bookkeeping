/**
 * Created by chris on 01.02.16.
 * <p/>
 * This class is an entry. It contains the amount, if it is an incoming or outgoing transaction, a category and date of the transaction.
 */
package ch.brueesch.model;

import java.util.Date;

public class Entry {

    private double amount;

    private EntryCategory entryCategory;

    private Date date;

    private boolean isIncome;

    public Entry(double amount, EntryCategory entryCategory, Date date, boolean isIncome) {
        this.amount = amount;
        this.entryCategory = entryCategory;
        this.date = date;
        this.isIncome = isIncome;
    }

    private Entry(Builder builder) {
        this.amount = builder.amount;
        this.entryCategory = builder.entryCategory;
        this.date = builder.date;
        this.isIncome = builder.isIncome;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public EntryCategory getEntryCategory() {
        return entryCategory;
    }

    public void setEntryCategory(EntryCategory entryCategory) {
        this.entryCategory = entryCategory;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isIncome() {
        return isIncome;
    }

    public void setIncome(boolean income) {
        isIncome = income;
    }

    public static final class Builder {


        private double amount;

        private EntryCategory entryCategory;

        private Date date;

        private boolean isIncome;

        private Builder() {

        }

        public Builder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder entryCategory(EntryCategory entryCategory) {
            this.entryCategory = entryCategory;
            return this;
        }

        public Builder date(Date date) {
            this.date = date;
            return this;
        }

        public Builder isIncome(boolean isIncome) {
            this.isIncome = isIncome;
            return this;
        }

        public Entry build() {
            return new Entry(this);
        }

    }
}
