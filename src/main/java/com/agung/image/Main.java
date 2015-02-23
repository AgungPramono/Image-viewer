/*
 * Silahkan digunakan dengan bebas / dimodifikasi
 * Dengan tetap mencantumkan nama @author dan Referensi / Source
 * Terima Kasih atas Kerjasamanya.
 */
package com.agung.image;

import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Agung Pramono
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException,
            UnsupportedLookAndFeelException {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }

        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                Frame.createAndShowGUI();
            }
        });
    }
}
