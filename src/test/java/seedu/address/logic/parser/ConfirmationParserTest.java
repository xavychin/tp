package seedu.address.logic.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.Messages.MESSAGE_UNKNOWN_COMMAND;
import static seedu.address.testutil.Assert.assertThrows;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_PERSON;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.AddCommand;
import seedu.address.logic.commands.ClearCommand;
import seedu.address.logic.commands.ConfirmCancelCommand;
import seedu.address.logic.commands.ConfirmDeleteCommand;
import seedu.address.logic.commands.DeleteCommand;
import seedu.address.logic.commands.EditCommand;
import seedu.address.logic.commands.EditCommand.EditPersonDescriptor;
import seedu.address.logic.commands.ExitCommand;
import seedu.address.logic.commands.FindCommand;
import seedu.address.logic.commands.HelpCommand;
import seedu.address.logic.commands.ListCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.person.NameContainsKeywordsPredicate;
import seedu.address.model.person.Person;
import seedu.address.testutil.EditPersonDescriptorBuilder;
import seedu.address.testutil.PersonBuilder;
import seedu.address.testutil.PersonUtil;

public class ConfirmationParserTest {

    private final ConfirmationParser parser = new ConfirmationParser();

    @Test
    public void parseCommand_confirm() throws Exception {
        ConfirmDeleteCommand command = (ConfirmDeleteCommand) parser.parseCommand(ConfirmDeleteCommand.COMMAND_WORD);
        assertEquals(new ConfirmDeleteCommand(), command);
    }

    @Test
    public void parseCommand_cancel() throws Exception {
        assertTrue(parser.parseCommand("") instanceof ConfirmCancelCommand);
        assertTrue(parser.parseCommand("wq3eqfaew") instanceof ConfirmCancelCommand);
    }
}
