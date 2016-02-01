package ch.brueesch.model;

/**
 * Created by chris on 01.02.16.
 */
public enum EntryCategory {

    SALARY("Salary"),
    EXPENSES("Expenses"),
    OTHER_INCOME("Other Income");



    private final String description;

    private EntryCategory(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
