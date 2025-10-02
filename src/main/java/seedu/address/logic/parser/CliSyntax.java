package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_ADDRESS = new Prefix("a/");
    public static final Prefix PREFIX_TAG = new Prefix("t/");
    //Prefix for AssignCommand category(Department/Team/Role)
    public static final Prefix PREFIX_ASSIGN_CATEGORY = new Prefix("c/");
    //Prefix for AssignCommand value
    public static final Prefix PREFIX_ASSIGN_CATEGORY_VALUE = new Prefix("v/");
}
