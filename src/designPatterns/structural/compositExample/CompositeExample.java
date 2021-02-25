package designPatterns.structural.compositExample;

import designPatterns.DesignPatternExample;

public class CompositeExample extends DesignPatternExample {
    @Override
    protected void run() {
        System.out.println("Here we make a simple menu (like you would see in Microsoft Word, that contains File, Edit, Quit etc");
        System.out.println("Our Menu contains two items - Buttons and SubMenus. Here these are called 'MenuItem' and 'Menu'");
        System.out.println("This is the tree-like structure of the Composite pattern (Nodes and Leaves)");

        System.out.println("\nOur main menu will have submenus: File and Edit. \nIt will also have a MenuItem of 'Quit' (leaf)");
        System.out.println("There will also be more nested Menus because Edit has it's own submenu of 'Paste'");
        System.out.println("Here is the menu structure printed out: \n\n");
        Menu mainMenu = new Menu("Main", "/main");

        Menu fileMenu = new Menu("File", "/file");
        mainMenu.add(fileMenu);
        MenuItem save = new MenuItem("Save", "/save");
        fileMenu.add(save);

        Menu editMenu = new Menu("Edit", "/edit");
        mainMenu.add(editMenu);

        MenuItem undo = new MenuItem("Undo", "/undo");
        editMenu.add(undo);
        MenuItem redo = new MenuItem("Redo", "/redo");
        editMenu.add(redo);

        MenuItem copy = new MenuItem("Copy", "/copy");
        editMenu.add(copy);
        Menu pasteMenu = new Menu("Paste", "/paste");
        editMenu.add(pasteMenu);

        MenuItem pasteNormal = new MenuItem("Paste", "/paste");
        pasteMenu.add(pasteNormal);
        MenuItem pasteSpecial = new MenuItem("Paste Special", "/paste_special");
        pasteMenu.add(pasteSpecial);

        MenuItem help = new MenuItem("Help", "/help");
        mainMenu.add(help);

        MenuItem quit = new MenuItem("Quit", "/quit");
        mainMenu.add(quit);

        System.out.println(mainMenu.toWebString("-"));


        System.out.println("\nWe used the component pattern to make a 'Menu' object (which extends abstract class 'MenuComponent')");
        System.out.println("This Menu object is a collection of other MenuComponents.");
        System.out.println("In this case the only two types of MenuComponent are 'Menu' and 'MenuItem'");
    }
}
