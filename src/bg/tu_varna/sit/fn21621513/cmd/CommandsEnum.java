package bg.tu_varna.sit.fn21621513.cmd;

public enum CommandsEnum
{
    OPEN("opens <file> "),
    CLOSE("closes currently opened file"),
    SAVEAS("saves the currently open file"),
    SAVE("saves the currently open file in <file>"),
    HELP("prints the information"),
    EXIT("exists the program"),
    PRINT("prints the bg.tu_varna.sit.table"),
    EDIT("edits the bg.tu_varna.sit.table");

    private final String commandEnum;

    CommandsEnum(String commandEnum) {
        this.commandEnum = commandEnum;
    }

    public String getCommandEnum() {
        return commandEnum;
    }

}
