package seedu.address.storage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.model.tag.Category;

/**
 * Jackson-friendly version of {@link Category}.
 */
class JsonAdaptedCategory {
    //private final String category;
    private final String value;

    /**
     * Constructs a {@code JsonAdaptedCategory} with the given {@code category} and {@code value}.
     */
    @JsonCreator
    public JsonAdaptedCategory(String value) {
        //this.category = category;
        this.value = value;
    }

    /**
     * Converts a given {@code Category} into this class for Jackson use.
     */
    public JsonAdaptedCategory(Category source) {
        //this.category = source.category;
        this.value = source.value;
    }

    /*@JsonValue
    public String getCategory() {
        return this.category;
    }*/

    @JsonValue
    public String getValue() {
        return this.value;
    }

    /**
     * Converts this Jackson-friendly adapted category object into the model's {@code Category} object.
     *
     * @throws IllegalValueException if there were any data constraints violated in the adapted category.
     */
    public Category toModelType() throws IllegalValueException {
        /*if (!Category.isValidTagName(tagName)) {
            throw new IllegalValueException(Category.MESSAGE_CONSTRAINTS);
        }*/
        return new Category(null, value);
    }

}
