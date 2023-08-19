package bg.tu_varna.sit.fn21621513.cmd;

import bg.tu_varna.sit.fn21621513.txt.Close;
import bg.tu_varna.sit.fn21621513.txt.Open;
import bg.tu_varna.sit.fn21621513.txt.Write;

import java.util.ArrayList;

public class SelectCmd
{
    private static boolean openFile = false;
    private static String pathFile;

    public void runCommand(ArrayList<String> commands) throws Exception {
        CommandsEnum command = CommandsEnum.valueOf(commands.get(0).toUpperCase());

        if (command == CommandsEnum.HELP) {
            String[] params = new String[]{"<file>", "", "", "<file>", "", "", "<fn><program><group><name>", "<fn>", "<fn><option><value>", "<fn>", "<fn>", "<fn>", "<fn>", "<program><year>", "<fn><course>", "<fn><course><grade>", "<course>", "<fn>"};
            int i = 0;
            System.out.println("The following commands are supported:");
            for (CommandsEnum cmd : CommandsEnum.values())
                System.out.printf("%-35s %s%n", cmd.name().toLowerCase() + " " + params[i++], cmd.getCommandEnum());
        }

        if (command == CommandsEnum.OPEN) {
            pathFile = commands.get(1);
            new Open().open(pathFile);
            openFile = true;
            for (int i = pathFile.length() - 1; i >= 0; i--)
                if (pathFile.charAt(i) == '\\') {
                    System.out.println("> open " + pathFile.substring(i + 1));
                    break;
                }

        } else if (openFile) {
            System.out.println("> " + command.name().toLowerCase());

            switch (command) {
                case SAVE -> new Write().write(pathFile);

                case SAVEAS -> new Write().write(commands.get(1));

                case CLOSE -> {
                    new Close().close();
                    openFile = false;
                }
                //case PRINT -> ;
                //case EDIT -> ;
                case EXIT -> System.exit(0);
            }
            System.out.println("Successfully " + command.name().toLowerCase());
        }
    }
}
