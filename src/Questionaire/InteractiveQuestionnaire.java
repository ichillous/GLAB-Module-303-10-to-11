//package Questionaire;
//
//import com.googlecode.lanterna.TerminalSize;
//import com.googlecode.lanterna.TextColor;
//import com.googlecode.lanterna.gui2.*;
//import com.googlecode.lanterna.screen.Screen;
//import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
//
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//
//public class InteractiveQuestionnaire {
//    public static void main(String[] args) throws IOException {
//        // Setup terminal and screen layers
//        Screen screen = new DefaultTerminalFactory().createScreen();
//        screen.startScreen();
//
//        // Create panel to hold components
//        Panel panel = new Panel();
//        panel.setLayoutManager(new GridLayout(2));
//
//        // Add a simple label to the panel
//        panel.addComponent(new Label("What is your favorite color?"));
//
//        // Create a list box with color options
//        List<String> colors = Arrays.asList("Red", "Blue", "Green", "Yellow");
//        ActionListBox listBox = new ActionListBox(new TerminalSize(20, 4));
//        for (String color : colors) {
//            listBox.addItem(color, () -> {
//                // This will be called when an item is selected
//                try {
//                    screen.close();
//                    System.out.println("You selected: " + color);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });
//        }
//        panel.addComponent(listBox);
//
//        // Create window to hold the panel
//        BasicWindow window = new BasicWindow();
//        window.setComponent(panel);
//
//        // Create GUI and start interacting with user
//        MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.BLUE));
//        gui.addWindow(window);
//        gui.waitForWindowToClose(window);
//    }
//}
