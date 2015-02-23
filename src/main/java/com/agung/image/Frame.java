/*
 * Silahkan digunakan dengan bebas / dimodifikasi
 * Dengan tetap mencantumkan nama @author dan Referensi / Source
 * Terima Kasih atas Kerjasamanya.
 */
package com.agung.image;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Agung Pramono
 * @version 0.1
 * @since November 2014
 */
public class Frame extends JFrame {

    private final JComboBox imagesJComboBox;
    private final JLabel label;
    private final JLabel tittleLabel;

    private final String[] names
            = {
                "/com.agung.img/OOP.jpg",
                "/com.agung.img/JAVA Fundamental.jpg",
                "/com.agung.img/android mobile.jpg",
                "/com.agung.img/sad.jpg",
                "/com.agugn.img/IT_PM.jpg",
                "/com.agung.img/software testing.jpg"
            };

    private final Icon[] icons
            = {
                new ImageIcon(getClass().getResource(names[0])),
                new ImageIcon(getClass().getResource(names[1])),
                new ImageIcon(getClass().getResource(names[2])),
                new ImageIcon(getClass().getResource(names[3])),
                new ImageIcon(getClass().getResource(names[4])),
                new ImageIcon(getClass().getResource(names[5]))
            };

    private final String[] namesComboBox
            = {
                "Objeck Oriented Programming",
                "Java Fundamental",
                "Android Development",
                "System Analysis and Design",
                "IT Project Management",
                "Software Testing"
            };

    public Frame() {
        super("Testing JComboBox");
        setLayout(new FlowLayout());

        tittleLabel = new JLabel("Image Viewer with JComboBox");
        imagesJComboBox = new JComboBox(namesComboBox);
        imagesJComboBox.setMaximumRowCount(4);

        imagesJComboBox.addItemListener(
                new ItemListener() {//anonymous inner class

                    //untuk menghadle aksi JComboBox        
                    @Override
                    public void itemStateChanged(ItemEvent event) {
                        if (event.getStateChange() == ItemEvent.SELECTED) {
                            label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
                        }
                    }
                });
        add(tittleLabel);
        add(imagesJComboBox);
        label = new JLabel(icons[0]);
        add(label);
    }

    static void createAndShowGUI() {
        Frame frame = new Frame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(380, 450);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
