
package lab2i;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Lab2i {
    private static void createAndShowGUI() {
        final JFrame frame = new JFrame("Menu and Popup Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create File menu with menu items
        JMenu fileMenu = new JMenu("File");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        // Add action listeners to menu items
        openMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Open Menu Item Clicked");
            }
        });

        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add menu items to File menu
        fileMenu.add(openMenuItem);
        fileMenu.addSeparator(); // Add separator line between menu items
        fileMenu.add(exitMenuItem);

        // Add File menu to the menu bar
        menuBar.add(fileMenu);

        // Set the menu bar to the frame
        frame.setJMenuBar(menuBar);

        // Create a popup menu
        final JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem popupMenuItem = new JMenuItem("Popup Option");
        popupMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Popup Option Clicked");
            }
        });
        popupMenu.add(popupMenuItem);

        // Add a mouse listener to show the popup menu on right-click
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Lab2i popup = new Lab2i();
        Lab2i.createAndShowGUI();
    }
}
