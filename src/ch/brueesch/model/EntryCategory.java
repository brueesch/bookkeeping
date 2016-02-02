package ch.brueesch.model;

/**
 * Created by chris on 01.02.16.
 */
public enum EntryCategory {

    SALARY("Salary"),
    EXPENSES("Expenses"),
    OTHER_INCOME("Other Income"),
    TAX("Taxes"),
    RENT("Rent"),
    INSURANCE("Insurance"),
    ELECTRIC("Electric"),
    MOBILE_PHONE("Mobile Phone"),
    CABLECOM("Cablecom"),
    SBB("SBB"),
    DONATION("Donation"),
    SPOTIFY("Spotify"),
    CLEANING("Cleaning"),
    FOOD("Food"),
    CLOTH("Cloth"),
    LEISURE("Leisure"),
    VACATION("Vacation"),
    RESERVE("Reserve"),
    BACK_PAYMENT("Back Payment");



    private final String description;

    private EntryCategory(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
