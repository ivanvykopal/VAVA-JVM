/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan Vykopal
 */
public class MainController {
    
    private final MainWindow window;
    
    private MainController(MainWindow window) {
        this.window = window;
        
        window.setVisible(true);
        
        initController();
    }
    
    
    public static void createController(MainWindow window) {
        new MainController(window);
    }
    
    private void initController() {
        window.getBtnDiagnostic().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                diagnostic();
            }
        });
        
        window.getMiExit().addActionListener((e) -> System.exit(0));
        
        window.getMiLogout().addActionListener((e) -> {
            ProcessBuilder processBuilder = new ProcessBuilder("shutdown", "/l");
            try {
                processBuilder.start();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(window, "Problém pri odhlasovaní PC!");
            }
        });
        
        window.getMiRestart().addActionListener((e) -> {
            ProcessBuilder processBuilder = new ProcessBuilder("shutdown", "/r");
            try {
                processBuilder.start();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(window, "Problém pri reštartovaní PC!");
            }
        });
        
        window.getMiShutdown().addActionListener((e) -> {
            ProcessBuilder processBuilder = new ProcessBuilder("shutdown", "/s");
            try {
                processBuilder.start();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(window, "Problém pri vypínaní PC!");
            }
        });
    }
    
    private void diagnostic() {
        int mb = 1024*1024;
        window.setLbDirectory(System.getProperty("user.dir"));
        window.setLbUsername(System.getProperty("user.name"));
        window.setLbOSname(System.getProperty("os.name"));
        window.setLbOSarchitecture(System.getProperty("os.arch"));
        window.setLbOSversion(System.getProperty("os.version"));
        window.setLbJava(System.getProperty("java.version"));
        
        Path directory = Paths.get(System.getProperty("user.dir"));
        try {
            long size = Files.walk(directory)
                    .filter(p -> p.toFile().isFile())
                    .mapToLong(p -> p.toFile().length())
                    .sum();
            window.setLbDirectorySize("" + size + " B");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(window, "Problém pri rátaní veľkosti adresára!");
        }
        
        Runtime runtime = Runtime.getRuntime();
        
        window.setLbJVMMemorySize("" + runtime.totalMemory() / mb + " MB");
        window.setLbJVMMemory("" + runtime.freeMemory() / mb + " MB");
        window.setLbJVMFreeMemory("" + runtime.maxMemory() / mb + " MB");
    }
}
