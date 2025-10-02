package seedu.address.model.tag;

import static java.util.Objects.requireNonNull;

/**
 * Represents an Employee's category in the directory.
 * Guarantees: immutable; category and value is always valid
 */
public class Category {
    public final String category;
    public final String value;

    /**
     * Constructs a {@code Category}.
     *
     * @param category A valid category.
     * @param value A valid category value.
     */
    public Category(String category, String value) {
        requireNonNull(category, value);
        //Possibly add a check category and values to see if they comply with what's written in the docs

        this.category = category;
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Category // instanceof handles nulls
                && category.equals(((Category) other).category)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
